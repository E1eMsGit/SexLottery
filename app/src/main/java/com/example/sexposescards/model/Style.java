package com.example.sexposescards.model;

public class Style {
    private int descriptionId;
    private int imageId;

    public Style(int descriptionId, int imageId)
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
