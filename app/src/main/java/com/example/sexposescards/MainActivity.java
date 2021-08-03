package com.example.sexposescards;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sexposescards.model.Pose;
import com.example.sexposescards.model.PosesList;
import com.example.sexposescards.model.Style;
import com.example.sexposescards.model.StylesList;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView styleCardFront;
    private TextView styleCardBack;
    private TextView posesCardFront;
    private TextView posesCardBack;
    private Button flipButton;

    private AnimatorSet styleFrontAnim;
    private AnimatorSet styleBackAnim;
    private AnimatorSet posesFrontAnim;
    private AnimatorSet posesBackAnim;

    private List<Style> stylesList;
    private List<Pose> posesList;
    private Random styleNumber;
    private Random poseNumber;

    private boolean isFront;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

        flipButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (isFront)
                {
                    startFrontToBackAnim(styleFrontAnim, styleBackAnim, styleCardFront, styleCardBack);
                    startFrontToBackAnim(posesFrontAnim, posesBackAnim, posesCardFront, posesCardBack);
                    isFront = false;
                }
                else
                {
                    startBackToFrontAnim(styleFrontAnim, styleBackAnim, styleCardFront, styleCardBack);
                    startBackToFrontAnim(posesFrontAnim, posesBackAnim, posesCardFront, posesCardBack);

                    styleCardFront.setText(stylesList.get(styleNumber.nextInt(stylesList.size())).getText());
                    posesCardFront.setText(posesList.get(poseNumber.nextInt(posesList.size())).getText());
                    isFront = true;
                }
            }
        });
    }

    private void init()
    {
        setContentView(R.layout.activity_main);

        styleCardFront = findViewById(R.id.style_card_front);
        styleCardBack = findViewById(R.id.style_card_back);
        posesCardFront = findViewById(R.id.poses_card_front);
        posesCardBack = findViewById(R.id.poses_card_back);
        flipButton = findViewById(R.id.flip_button);
        isFront = false;
        stylesList = StylesList.getInstance(this).getStyles();
        posesList = PosesList.getInstance(this).getPoses();
        styleNumber = new Random();
        poseNumber = new Random();

        float scale = this.getResources().getDisplayMetrics().density;
        styleCardFront.setCameraDistance(8000 * scale);
        styleCardBack.setCameraDistance(8000 * scale);
        posesCardFront.setCameraDistance(8000 * scale);
        posesCardBack.setCameraDistance(8000 * scale);

        styleFrontAnim = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.front_animator);
        styleBackAnim = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.back_animator);
        posesFrontAnim = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.front_animator);
        posesBackAnim = (AnimatorSet) AnimatorInflater.loadAnimator(this, R.animator.back_animator);

        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animator) {
                flipButton.setEnabled(false);
            }

            @Override
            public void onAnimationEnd(Animator animator) {
                flipButton.setEnabled(true);
            }

            @Override
            public void onAnimationCancel(Animator animator) {

            }

            @Override
            public void onAnimationRepeat(Animator animator) {

            }
        };
        styleFrontAnim.addListener(animatorListener);
        styleBackAnim.addListener(animatorListener);
        posesFrontAnim.addListener(animatorListener);
        posesBackAnim.addListener(animatorListener);
    }

    private void startFrontToBackAnim(AnimatorSet frontAnimator, AnimatorSet backAnimator, TextView frontCardSide, TextView backCardSide)
    {
        frontAnimator.setTarget(frontCardSide);
        backAnimator.setTarget(backCardSide);
        frontAnimator.start();
        backAnimator.start();
    }

    private void startBackToFrontAnim(AnimatorSet frontAnimator, AnimatorSet backAnimator, TextView frontCardSide, TextView backCardSide)
    {
        frontAnimator.setTarget(backCardSide);
        backAnimator.setTarget(frontCardSide);
        frontAnimator.start();
        backAnimator.start();
    }
}
