package com.example.sexposescards;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.sexposescards.model.Pose;
import com.example.sexposescards.model.PosesList;
import com.example.sexposescards.model.Style;
import com.example.sexposescards.model.StylesList;
import com.wajahatkarim3.easyflipview.EasyFlipView;

import java.util.List;
import java.util.Random;

public class GameFragment extends Fragment {

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
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_game, container, false);
        stylesList = StylesList.getInstance(getContext()).getStyles();
        posesList = PosesList.getInstance(getContext()).getPoses();
        rnd = new Random();

        initViews(root);
        initListeners();

        return root;
    }

    // Связь фрагмента с менеджером фрагментов в активности.
    @NonNull
    public static GameFragment newInstance() {
        return new GameFragment();
    }

    private void initViews(View root) {
        styleEasyFlipView = root.findViewById(R.id.style_easy_flip_view);
        styleImageView = root.findViewById(R.id.style_image_view);
        styleTextView = root.findViewById(R.id.style_text_view);
        poseEasyFlipView = root.findViewById(R.id.pose_easy_flip_view);
        poseImageView = root.findViewById(R.id.pose_image_view);
        poseTextView = root.findViewById(R.id.pose_text_view);
        startButton = root.findViewById(R.id.start_button);
    }

    private void initListeners() {
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

        startButton.setOnClickListener(view -> {
            startButton.setEnabled(false);
            styleEasyFlipView.flipTheView();
            poseEasyFlipView.flipTheView();
        });
    }
}
