package com.example.sexposescards;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.sexposescards.model.Pose;
import com.example.sexposescards.model.PosesFFList;
import com.example.sexposescards.model.PosesMFList;
import com.example.sexposescards.model.PosesMMList;
import com.example.sexposescards.model.Style;
import com.example.sexposescards.model.StylesList;
import com.wajahatkarim3.easyflipview.EasyFlipView;

import java.util.List;
import java.util.Random;

public class CardFragment extends Fragment {
    private EasyFlipView poseEasyFlipView;
    private ImageView poseImageView;
    private TextView poseTextView;
    private ImageView poseBackImageView;
    private LinearLayout poseBackLinearLayout;

    private List<Style> stylesList;
    private List<Pose> posesList;
    private Random rnd;

    private int fragmentId;

    public CardFragment(int i) {
        fragmentId = i;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_card, container, false);
        rnd = new Random();
        stylesList = StylesList.getInstance(getContext()).getStyles();
        switch (fragmentId) {
            case 1:
                posesList = PosesMFList.getInstance(getContext()).getPoses();
                break;
            case 2:
                posesList = PosesFFList.getInstance(getContext()).getPoses();
                break;
            case 3:
                posesList = PosesMMList.getInstance(getContext()).getPoses();
                break;
            default:
                break;
        }

        initViews(root);
        initListeners();

        return root;
    }

    // Связь фрагмента с менеджером фрагментов в активности.
    @NonNull
    public static CardFragment newInstance(int i) {
        return new CardFragment(i);
    }

    private void initViews(View root) {
        poseEasyFlipView = root.findViewById(R.id.pose_easy_flip_view);
        poseImageView = root.findViewById(R.id.pose_image_view);
        poseTextView = root.findViewById(R.id.pose_text_view);
        poseBackImageView = root.findViewById(R.id.pose_back_image_view);
        poseBackLinearLayout = root.findViewById(R.id.pose_back_linear_layout);

        switch (fragmentId) {
            case 1:
                poseBackImageView.setImageResource(R.drawable.mf_logo);
                poseBackLinearLayout.setBackgroundResource(R.color.purple_200);
                poseImageView.setBackgroundResource(R.color.purple_200);
                break;
            case 2:
                poseBackImageView.setImageResource(R.drawable.ff_logo);
                poseBackLinearLayout.setBackgroundResource(R.color.purple_a100);
                poseImageView.setBackgroundResource(R.color.purple_a100);
                break;
            case 3:
                poseBackImageView.setImageResource(R.drawable.mm_logo);
                poseBackLinearLayout.setBackgroundResource(R.color.blue_200);
                poseImageView.setBackgroundResource(R.color.blue_200);
                break;
            default:
                break;
        }
    }

    private void initListeners() {
        poseEasyFlipView.setOnFlipListener((easyFlipView, newCurrentSide) -> {
            if (newCurrentSide == EasyFlipView.FlipState.BACK_SIDE) {
                Pose pose = posesList.get(rnd.nextInt(posesList.size()));
                Style style = stylesList.get(rnd.nextInt(stylesList.size()));
                poseImageView.setImageResource(pose.getImageId());
                poseTextView.setText(style.getDescriptionId());
            }
        });
    }
}
