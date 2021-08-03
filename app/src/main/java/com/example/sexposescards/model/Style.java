package com.example.sexposescards.model;

import android.content.Context;

public class Style {
    private String text;

    public Style(Context context, String text)
    {
        this.text = text;
    }

    public String getText()
    {
        return text;
    }
}
