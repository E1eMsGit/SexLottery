package com.example.sexposescards.model;

import android.content.Context;

public class PreludeAction {
    private int descriptionId;
    private int imageId;

    public PreludeAction(Context context, int descriptionId, int imageId)
    {
        this.descriptionId = descriptionId;
        this.imageId = imageId;
    }

    public int getDescriptionId()
    {
        return descriptionId;
    }

    public int getImageId() { return imageId; }
}
