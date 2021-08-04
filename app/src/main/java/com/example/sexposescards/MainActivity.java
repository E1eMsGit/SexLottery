package com.example.sexposescards;

import android.os.Bundle;
import android.util.Log;
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

    private TextView styleCardFront;
    private TextView posesCardFront;
    private Button flipButton;

    private List<Style> stylesList;
    private List<Pose> posesList;
    private Random styleNumber;
    private Random poseNumber;

    private boolean isFront;

    private EasyFlipView easyFlipView1;
    private EasyFlipView easyFlipView2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

        flipButton.setOnClickListener(view -> {
            flipButton.setEnabled(false);
            if (isFront)
            {
                easyFlipView1.flipTheView();
                easyFlipView2.flipTheView();
                isFront = false;
            }
            else
            {
                easyFlipView1.flipTheView();
                easyFlipView2.flipTheView();

                styleCardFront.setText(stylesList.get(styleNumber.nextInt(stylesList.size())).getDescription());
                posesCardFront.setText(posesList.get(poseNumber.nextInt(posesList.size())).getText());
                isFront = true;
            }


        });
    }

    private void init()
    {
        setContentView(R.layout.activity_main);

        styleCardFront = findViewById(R.id.style_card_front);
        posesCardFront = findViewById(R.id.poses_card_front);
        flipButton = findViewById(R.id.flip_button);
        isFront = false;
        stylesList = StylesList.getInstance(this).getStyles();
        posesList = PosesList.getInstance(this).getPoses();
        styleNumber = new Random();
        poseNumber = new Random();

        easyFlipView1 = findViewById(R.id.easyFlipView1);
        easyFlipView2 = findViewById(R.id.easyFlipView2);

        EasyFlipView.OnFlipAnimationListener onFlipAnimationListener = (easyFlipView, newCurrentSide) ->
        {
            flipButton.setEnabled(true);
        };

        easyFlipView1.setOnFlipListener(onFlipAnimationListener);
        easyFlipView2.setOnFlipListener(onFlipAnimationListener);

    }
}
