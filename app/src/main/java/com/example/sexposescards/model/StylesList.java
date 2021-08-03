package com.example.sexposescards.model;

import android.content.Context;

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
        styles.add(new Style(context, "soft1"));
        styles.add(new Style(context, "soft2"));
        styles.add(new Style(context, "middle1"));
        styles.add(new Style(context, "middle2"));
        styles.add(new Style(context, "hard1"));
        styles.add(new Style(context, "hard2"));
    }
}
