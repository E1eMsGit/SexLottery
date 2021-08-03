package com.example.sexposescards.model;

import android.content.Context;

public class Pose {
    private String text;

    public Pose(Context context, String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }
}
