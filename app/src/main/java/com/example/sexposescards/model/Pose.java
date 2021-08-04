package com.example.sexposescards.model;

import android.content.Context;

public class Pose {
    private String description;

    public Pose(Context context, String description)
    {
        this.description = description;
    }

    public String getDescription()
    {
        return description;
    }
}
