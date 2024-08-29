package ru.apps.e1em.sexlottery.model;

import android.content.Context;

import ru.apps.e1em.sexlottery.R;

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
        styles.add(new Style(R.string.style_1));
        styles.add(new Style(R.string.style_2));
        styles.add(new Style(R.string.style_3));
        styles.add(new Style(R.string.style_4));
        styles.add(new Style(R.string.style_5));
        styles.add(new Style(R.string.style_6));
    }
}
