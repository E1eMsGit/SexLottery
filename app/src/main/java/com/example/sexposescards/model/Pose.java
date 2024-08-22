package com.example.sexposescards.model;

import android.content.Context;

public class Pose {
    private int imageId;

    public Pose(Context context, int imageId)
    {
        this.imageId = imageId;
    }

    public int getImageId() { return imageId; }
}
