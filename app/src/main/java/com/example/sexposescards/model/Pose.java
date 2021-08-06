package com.example.sexposescards.model;

import android.content.Context;

public class Pose {
    private String title;
    private int imageId;

    public Pose(Context context, String title, int imageId)
    {
        this.title = title;
        this.imageId = imageId;
    }

    public String getTitle()
    {
        return title;
    }

    public int getImageId() { return imageId; }
}
