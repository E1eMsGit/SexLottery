package com.example.sexposescards.model;

import android.content.Context;

import com.example.sexposescards.R;

import java.util.ArrayList;
import java.util.List;

public class PosesFFList {
    private static PosesFFList instance = null;
    private List<Pose> poses;
    private Context context;

    private PosesFFList(Context context) {
        this.context = context;
        initPosesList();
    }

    public static PosesFFList getInstance(Context context) {
        if (instance == null) {
            return instance = new PosesFFList(context);
        } else {
            return instance;
        }
    }

    public List<Pose> getPoses() {
        return poses;
    }

    private void initPosesList() {
        poses = new ArrayList<>();
        poses.add(new Pose(context, R.drawable.ff_pose_1));
        poses.add(new Pose(context, R.drawable.ff_pose_2));
        poses.add(new Pose(context, R.drawable.ff_pose_3));
        poses.add(new Pose(context, R.drawable.ff_pose_4));
        poses.add(new Pose(context, R.drawable.ff_pose_5));
        poses.add(new Pose(context, R.drawable.ff_pose_6));
        poses.add(new Pose(context, R.drawable.ff_pose_7));
        poses.add(new Pose(context, R.drawable.ff_pose_8));
        poses.add(new Pose(context, R.drawable.ff_pose_9));
        poses.add(new Pose(context, R.drawable.ff_pose_10));
        poses.add(new Pose(context, R.drawable.ff_pose_11));
        poses.add(new Pose(context, R.drawable.ff_pose_13));
        poses.add(new Pose(context, R.drawable.ff_pose_14));
        poses.add(new Pose(context, R.drawable.ff_pose_12));
        poses.add(new Pose(context, R.drawable.ff_pose_15));
        poses.add(new Pose(context, R.drawable.ff_pose_16));
        poses.add(new Pose(context, R.drawable.ff_pose_17));
        poses.add(new Pose(context, R.drawable.ff_pose_18));
        poses.add(new Pose(context, R.drawable.ff_pose_19));
    }
}
