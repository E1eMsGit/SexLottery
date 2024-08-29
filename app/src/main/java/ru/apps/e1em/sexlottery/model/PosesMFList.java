package ru.apps.e1em.sexlottery.model;

import android.content.Context;

import ru.apps.e1em.sexlottery.R;

import java.util.ArrayList;
import java.util.List;

public class PosesMFList {
    private static PosesMFList instance = null;
    private List<Pose> poses;
    private Context context;

    private PosesMFList(Context context) {
        this.context = context;
        initPosesList();
    }

    public static PosesMFList getInstance(Context context) {
        if (instance == null) {
            return instance = new PosesMFList(context);
        } else {
            return instance;
        }
    }

    public List<Pose> getPoses() {
        return poses;
    }

    private void initPosesList() {
        poses = new ArrayList<>();
        poses.add(new Pose(context, R.drawable.mf_pose_1));
        poses.add(new Pose(context, R.drawable.mf_pose_2));
        poses.add(new Pose(context, R.drawable.mf_pose_3));
        poses.add(new Pose(context, R.drawable.mf_pose_4));
        poses.add(new Pose(context, R.drawable.mf_pose_5));
        poses.add(new Pose(context, R.drawable.mf_pose_6));
        poses.add(new Pose(context, R.drawable.mf_pose_7));
        poses.add(new Pose(context, R.drawable.mf_pose_8));
        poses.add(new Pose(context, R.drawable.mf_pose_9));
        poses.add(new Pose(context, R.drawable.mf_pose_10));
        poses.add(new Pose(context, R.drawable.mf_pose_11));
        poses.add(new Pose(context, R.drawable.mf_pose_13));
        poses.add(new Pose(context, R.drawable.mf_pose_14));
        poses.add(new Pose(context, R.drawable.mf_pose_12));
        poses.add(new Pose(context, R.drawable.mf_pose_15));
        poses.add(new Pose(context, R.drawable.mf_pose_16));
        poses.add(new Pose(context, R.drawable.mf_pose_17));
        poses.add(new Pose(context, R.drawable.mf_pose_18));
        poses.add(new Pose(context, R.drawable.mf_pose_19));
        poses.add(new Pose(context, R.drawable.mf_pose_20));
        poses.add(new Pose(context, R.drawable.mf_pose_21));
        poses.add(new Pose(context, R.drawable.mf_pose_22));
        poses.add(new Pose(context, R.drawable.mf_pose_23));
        poses.add(new Pose(context, R.drawable.mf_pose_24));
        poses.add(new Pose(context, R.drawable.mf_pose_25));
        poses.add(new Pose(context, R.drawable.mf_pose_26));
        poses.add(new Pose(context, R.drawable.mf_pose_27));
        poses.add(new Pose(context, R.drawable.mf_pose_28));
        poses.add(new Pose(context, R.drawable.mf_pose_29));
        poses.add(new Pose(context, R.drawable.mf_pose_30));
        poses.add(new Pose(context, R.drawable.mf_pose_31));
        poses.add(new Pose(context, R.drawable.mf_pose_32));
        poses.add(new Pose(context, R.drawable.mf_pose_33));
        poses.add(new Pose(context, R.drawable.mf_pose_34));
    }
}
