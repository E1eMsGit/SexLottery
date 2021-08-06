package com.example.sexposescards.model;

import android.content.Context;

import com.example.sexposescards.R;

import java.util.ArrayList;
import java.util.List;

public class StylesList {
    private static StylesList instance = null;
    private List<Style> styles;
    private Context context;

    private StylesList(Context context) {
        this.context = context;
        initStylesList();
    }

    public static StylesList getInstance(Context context) {
        if (instance == null) {
            return instance = new StylesList(context);
        } else {
            return instance;
        }
    }

    public List<Style> getStyles() {
        return styles;
    }

    private void initStylesList() {
        styles = new ArrayList<>();
        styles.add(new Style(R.string.style_1, R.drawable.affectionately_pic));
        styles.add(new Style(R.string.style_2, R.drawable.rough_pic));
        styles.add(new Style(R.string.style_3,R.drawable.playfully_pic));
        styles.add(new Style(R.string.style_4, R.drawable.passionately_pic));
        styles.add(new Style(R.string.style_5, R.drawable.fast_pic));
        styles.add(new Style(R.string.style_6, R.drawable.slowly_pic));
    }
}
