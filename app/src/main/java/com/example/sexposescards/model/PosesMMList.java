package com.example.sexposescards.model;

import android.content.Context;

import com.example.sexposescards.R;

import java.util.ArrayList;
import java.util.List;

public class PosesMMList {
    private static PosesMMList instance = null;
    private List<Pose> poses;
    private Context context;

    private PosesMMList(Context context) {
        this.context = context;
        initPosesList();
    }

    public static PosesMMList getInstance(Context context) {
        if (instance == null) {
            return instance = new PosesMMList(context);
        } else {
            return instance;
        }
    }

    public List<Pose> getPoses() {
        return poses;
    }

    private void initPosesList() {
        poses = new ArrayList<>();
        poses.add(new Pose(context, R.drawable.mm_pose_1));
        poses.add(new Pose(context, R.drawable.mm_pose_2));
        poses.add(new Pose(context, R.drawable.mm_pose_3));
        poses.add(new Pose(context, R.drawable.mm_pose_4));
        poses.add(new Pose(context, R.drawable.mm_pose_5));
        poses.add(new Pose(context, R.drawable.mm_pose_6));
        poses.add(new Pose(context, R.drawable.mm_pose_7));
        poses.add(new Pose(context, R.drawable.mm_pose_8));
        poses.add(new Pose(context, R.drawable.mm_pose_9));
        poses.add(new Pose(context, R.drawable.mm_pose_10));
        poses.add(new Pose(context, R.drawable.mm_pose_11));
        poses.add(new Pose(context, R.drawable.mm_pose_13));
        poses.add(new Pose(context, R.drawable.mm_pose_14));
        poses.add(new Pose(context, R.drawable.mm_pose_12));
        poses.add(new Pose(context, R.drawable.mm_pose_15));
        poses.add(new Pose(context, R.drawable.mm_pose_16));
        poses.add(new Pose(context, R.drawable.mm_pose_17));
        poses.add(new Pose(context, R.drawable.mm_pose_18));
        poses.add(new Pose(context, R.drawable.mm_pose_19));
        poses.add(new Pose(context, R.drawable.mm_pose_20));
        poses.add(new Pose(context, R.drawable.mm_pose_21));
        poses.add(new Pose(context, R.drawable.mm_pose_22));
        poses.add(new Pose(context, R.drawable.mm_pose_23));
        poses.add(new Pose(context, R.drawable.mm_pose_24));
        poses.add(new Pose(context, R.drawable.mm_pose_25));
        poses.add(new Pose(context, R.drawable.mm_pose_26));
        poses.add(new Pose(context, R.drawable.mm_pose_27));
        poses.add(new Pose(context, R.drawable.mm_pose_28));
        poses.add(new Pose(context, R.drawable.mm_pose_29));
        poses.add(new Pose(context, R.drawable.mm_pose_30));
        poses.add(new Pose(context, R.drawable.mm_pose_31));
        poses.add(new Pose(context, R.drawable.mm_pose_32));
        poses.add(new Pose(context, R.drawable.mm_pose_33));
    }
}
