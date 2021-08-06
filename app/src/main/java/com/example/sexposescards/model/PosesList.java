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
        poses.add(new Pose(context, "10", R.drawable.test_pic1));
        poses.add(new Pose(context, "51", R.drawable.test_pic2));
        poses.add(new Pose(context, "69", R.drawable.test_pic3));
        poses.add(new Pose(context, "71", R.drawable.test_pic4));
        poses.add(new Pose(context, "45", R.drawable.test_pic5));
        poses.add(new Pose(context, "8", R.drawable.test_pic6));
        poses.add(new Pose(context, "82", R.drawable.test_pic7));
        poses.add(new Pose(context, "18", R.drawable.test_pic8));
        poses.add(new Pose(context, "43", R.drawable.test_pic9));
        poses.add(new Pose(context, "2", R.drawable.test_pic10));
        poses.add(new Pose(context, "21", R.drawable.test_pic11));
        poses.add(new Pose(context, "32", R.drawable.test_pic12));
        poses.add(new Pose(context, "62", R.drawable.test_pic13));
        poses.add(new Pose(context, "22", R.drawable.test_pic14));
        poses.add(new Pose(context, "42", R.drawable.test_pic15));
    }
}
