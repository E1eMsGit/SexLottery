package com.example.sexposescards.model;

import android.content.Context;

import com.example.sexposescards.R;

import java.util.ArrayList;
import java.util.List;

public class PosesList {
    private static PosesList instance = null;
    private List<Pose> poses;
    private Context context;

    private PosesList(Context context) {
        this.context = context;
        initPosesList();
    }

    public static PosesList getInstance(Context context) {
        if (instance == null) {
            return instance = new PosesList(context);
        } else {
            return instance;
        }
    }

    public List<Pose> getPoses() {
        return poses;
    }

    private void initPosesList() {
        poses = new ArrayList<>();
        poses.add(new Pose(context, "10", R.drawable.mf_pose_1));
        poses.add(new Pose(context, "51", R.drawable.mf_pose_2));
        poses.add(new Pose(context, "69", R.drawable.mf_pose_3));
        poses.add(new Pose(context, "71", R.drawable.mf_pose_4));
        poses.add(new Pose(context, "45", R.drawable.mf_pose_5));
        poses.add(new Pose(context, "8", R.drawable.mf_pose_6));
        poses.add(new Pose(context, "82", R.drawable.mf_pose_7));
        poses.add(new Pose(context, "18", R.drawable.mf_pose_8));
        poses.add(new Pose(context, "43", R.drawable.mf_pose_9));
        poses.add(new Pose(context, "2", R.drawable.mf_pose_10));
        poses.add(new Pose(context, "21", R.drawable.mf_pose_11));
        poses.add(new Pose(context, "32", R.drawable.mf_pose_12));
        poses.add(new Pose(context, "62", R.drawable.mf_pose_13));
        poses.add(new Pose(context, "22", R.drawable.mf_pose_14));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_15));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_16));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_17));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_18));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_19));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_20));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_21));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_22));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_23));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_24));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_25));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_26));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_27));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_28));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_29));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_30));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_31));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_32));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_33));
        poses.add(new Pose(context, "42", R.drawable.mf_pose_34));
    }
}
