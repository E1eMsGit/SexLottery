package com.example.sexposescards.model;

import android.content.Context;

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
        poses.add(new Pose(context, "10"));
        poses.add(new Pose(context, "51"));
        poses.add(new Pose(context, "69"));
        poses.add(new Pose(context, "71"));
        poses.add(new Pose(context, "45"));
        poses.add(new Pose(context, "8"));
        poses.add(new Pose(context, "82"));
        poses.add(new Pose(context, "18"));
        poses.add(new Pose(context, "43"));
        poses.add(new Pose(context, "2"));
    }
}
