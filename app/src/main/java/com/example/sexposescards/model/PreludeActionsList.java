package com.example.sexposescards.model;

import android.content.Context;

import com.example.sexposescards.R;

import java.util.ArrayList;
import java.util.List;

public class PreludeActionsList {
    private static PreludeActionsList instance = null;
    private List<PreludeAction> preludeActions;
    private Context context;

    private PreludeActionsList(Context context) {
        this.context = context;
        initPosesList();
    }

    public static PreludeActionsList getInstance(Context context) {
        if (instance == null) {
            return instance = new PreludeActionsList(context);
        } else {
            return instance;
        }
    }

    public List<PreludeAction> getPreludeActions() {
        return preludeActions;
    }

    private void initPosesList() {
        preludeActions = new ArrayList<>();
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_1, R.drawable.prelude_1));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_2, R.drawable.prelude_2));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_3, R.drawable.prelude_3));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_4, R.drawable.prelude_4));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_5, R.drawable.prelude_5));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_6, R.drawable.prelude_6));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_7, R.drawable.prelude_7));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_8, R.drawable.prelude_8));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_9, R.drawable.prelude_9));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_10, R.drawable.prelude_10));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_11, R.drawable.prelude_11));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_12, R.drawable.prelude_12));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_13, R.drawable.prelude_13));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_14, R.drawable.prelude_14));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_15, R.drawable.prelude_15));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_16, R.drawable.prelude_16));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_17, R.drawable.prelude_17));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_18, R.drawable.prelude_18));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_19, R.drawable.prelude_19));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_20, R.drawable.prelude_20));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_21, R.drawable.prelude_21));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_22, R.drawable.prelude_22));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_23, R.drawable.prelude_23));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_24, R.drawable.prelude_24));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_25, R.drawable.prelude_25));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_26, R.drawable.prelude_26));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_27, R.drawable.prelude_27));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_28, R.drawable.prelude_28));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_29, R.drawable.prelude_29));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_30, R.drawable.prelude_30));
        preludeActions.add(new PreludeAction(context, R.string.prelude_action_31, R.drawable.prelude_31));
    }
}
