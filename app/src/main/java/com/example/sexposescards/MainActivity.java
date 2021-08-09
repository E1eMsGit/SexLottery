package com.example.sexposescards;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
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

    private EasyFlipView styleEasyFlipView;
    private ImageView styleImageView;
    private TextView styleTextView;

    private EasyFlipView poseEasyFlipView;
    private ImageView poseImageView;
    private TextView poseTextView;

    private Button startButton;

    private List<Style> stylesList;
    private List<Pose> posesList;
    private Random rnd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        init();

        startButton.setOnClickListener(view -> {
            startButton.setEnabled(false);
            styleEasyFlipView.flipTheView();
            poseEasyFlipView.flipTheView();
        });
    }

    private void init() {
        setContentView(R.layout.fragment_game);

        styleEasyFlipView = findViewById(R.id.style_easy_flip_view);
        styleImageView = findViewById(R.id.style_image_view);
        styleTextView = findViewById(R.id.style_text_view);

        poseEasyFlipView = findViewById(R.id.pose_easy_flip_view);
        poseImageView = findViewById(R.id.pose_image_view);
        poseTextView = findViewById(R.id.pose_text_view);

        startButton = findViewById(R.id.start_button);

        stylesList = StylesList.getInstance(this).getStyles();
        posesList = PosesList.getInstance(this).getPoses();
        rnd = new Random();

        styleEasyFlipView.setOnFlipListener((easyFlipView, newCurrentSide) -> {
            if (newCurrentSide == EasyFlipView.FlipState.BACK_SIDE) {
                Style style = stylesList.get(rnd.nextInt(stylesList.size()));
                styleImageView.setImageResource(style.getImageId());
                styleTextView.setText(style.getDescription());
            } else {
                startButton.setEnabled(true);
            }
        });
        poseEasyFlipView.setOnFlipListener((easyFlipView, newCurrentSide) -> {
            if (newCurrentSide == EasyFlipView.FlipState.BACK_SIDE) {
                Pose pose = posesList.get(rnd.nextInt(posesList.size()));
                poseImageView.setImageResource(pose.getImageId());
                poseTextView.setText(pose.getTitle());
            } else {
                startButton.setEnabled(true);
            }
        });
    }
}
