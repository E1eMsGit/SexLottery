package com.example.sexposescards.model;

import android.content.Context;

public class Style {
    private int description;
    private int imageId;

    public Style(int description, int imageId)
    {
        this.description = description;
        this.imageId = imageId;
    }

    public int getDescription()
    {
        return description;
    }

    public int getImageId() { return imageId; }
}
