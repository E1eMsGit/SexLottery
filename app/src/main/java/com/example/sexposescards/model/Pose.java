package com.example.sexposescards.model;

import android.content.Context;

public class Pose {
    private String title;

    public Pose(Context context, String title)
    {
        this.title = title;
    }

    public String getTitle()
    {
        return title;
    }
}
