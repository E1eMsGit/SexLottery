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
        poses.add(new Pose(context, "10", R.drawable.poses_pic1));
        poses.add(new Pose(context, "51", R.drawable.poses_pic2));
        poses.add(new Pose(context, "69", R.drawable.poses_pic3));
        poses.add(new Pose(context, "71", R.drawable.poses_pic4));
        poses.add(new Pose(context, "45", R.drawable.poses_pic5));
        poses.add(new Pose(context, "8", R.drawable.poses_pic6));
        poses.add(new Pose(context, "82", R.drawable.poses_pic7));
        poses.add(new Pose(context, "18", R.drawable.poses_pic8));
        poses.add(new Pose(context, "43", R.drawable.poses_pic9));
        poses.add(new Pose(context, "2", R.drawable.poses_pic10));
        poses.add(new Pose(context, "21", R.drawable.poses_pic11));
        poses.add(new Pose(context, "32", R.drawable.poses_pic12));
        poses.add(new Pose(context, "62", R.drawable.poses_pic13));
        poses.add(new Pose(context, "22", R.drawable.poses_pic14));
        poses.add(new Pose(context, "42", R.drawable.poses_pic15));
        poses.add(new Pose(context, "42", R.drawable.poses_pic15));
        poses.add(new Pose(context, "42", R.drawable.poses_pic16));
        poses.add(new Pose(context, "42", R.drawable.poses_pic17));
        poses.add(new Pose(context, "42", R.drawable.poses_pic18));
        poses.add(new Pose(context, "42", R.drawable.poses_pic19));
        poses.add(new Pose(context, "42", R.drawable.poses_pic20));
        poses.add(new Pose(context, "42", R.drawable.poses_pic21));
        poses.add(new Pose(context, "42", R.drawable.poses_pic22));
        poses.add(new Pose(context, "42", R.drawable.poses_pic23));
        poses.add(new Pose(context, "42", R.drawable.poses_pic24));
        poses.add(new Pose(context, "42", R.drawable.poses_pic25));
        poses.add(new Pose(context, "42", R.drawable.poses_pic26));
        poses.add(new Pose(context, "42", R.drawable.poses_pic27));
    }
}
