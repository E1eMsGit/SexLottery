package com.example.sexposescards;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.sexposescards.model.Pose;
import com.example.sexposescards.model.PosesList;
import com.example.sexposescards.model.Style;
import com.example.sexposescards.model.StylesList;
import com.wajahatkarim3.easyflipview.EasyFlipView;

import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView styleCardText;
    private TextView posesCardText;
    private Button startButton;

    private List<Style> stylesList;
    private List<Pose> posesList;
    private Random styleNumber;
    private Random poseNumber;

    private boolean isAnimationEnd;

    private EasyFlipView stylesEasyFlipView;
    private EasyFlipView posesEasyFlipView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

        startButton.setOnClickListener(view -> {
            startButton.setEnabled(false);

            stylesEasyFlipView.flipTheView();
            posesEasyFlipView.flipTheView();
        });
    }

    private void init()
    {
        setContentView(R.layout.activity_main);

        styleCardText = findViewById(R.id.style_card_text);
        posesCardText = findViewById(R.id.poses_card_text);
        startButton = findViewById(R.id.start_button);
        stylesEasyFlipView = findViewById(R.id.styles_easy_flip_view);
        posesEasyFlipView = findViewById(R.id.poses_easy_flip_view);

        stylesList = StylesList.getInstance(this).getStyles();
        posesList = PosesList.getInstance(this).getPoses();
        styleNumber = new Random();
        poseNumber = new Random();

        EasyFlipView.OnFlipAnimationListener onStylesFlipAnimationListener = (easyFlipView, newCurrentSide) ->
        {
            if (newCurrentSide == EasyFlipView.FlipState.BACK_SIDE)
            {
                easyFlipView.setAutoFlipBack(true);
                easyFlipView.setAutoFlipBackTime(50);
                styleCardText.setText(stylesList.get(styleNumber.nextInt(stylesList.size())).getDescription());

            } else {
                startButton.setEnabled(true);
            }

        };

        EasyFlipView.OnFlipAnimationListener onPosesFlipAnimationListener = (easyFlipView, newCurrentSide) ->
        {
            if (newCurrentSide == EasyFlipView.FlipState.BACK_SIDE)
            {
                easyFlipView.setAutoFlipBack(true);
                easyFlipView.setAutoFlipBackTime(60);
                posesCardText.setText(posesList.get(poseNumber.nextInt(posesList.size())).getDescription());

            } else {
                startButton.setEnabled(true);
            }
        };

        stylesEasyFlipView.setOnFlipListener(onStylesFlipAnimationListener);
        posesEasyFlipView.setOnFlipListener(onPosesFlipAnimationListener);
    }
}
