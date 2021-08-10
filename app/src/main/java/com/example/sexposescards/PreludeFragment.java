package com.example.sexposescards;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.sexposescards.model.PreludeAction;
import com.example.sexposescards.model.PreludeActionsList;
import com.example.sexposescards.model.Style;
import com.example.sexposescards.model.StylesList;
import com.wajahatkarim3.easyflipview.EasyFlipView;

import java.util.List;
import java.util.Random;

public class PreludeFragment extends Fragment {

    private EasyFlipView styleEasyFlipView;
    private ImageView styleImageView;
    private TextView styleTextView;

    private EasyFlipView preludeActionEasyFlipView;
    private ImageView preludeActionImageView;
    private TextView preludeActionTextView;

    private Button startButton;

    private List<Style> stylesList;
    private List<PreludeAction> preludeActionsList;
    private Random rnd;

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_prelude, container, false);
        stylesList = StylesList.getInstance(getContext()).getStyles();
        preludeActionsList = PreludeActionsList.getInstance(getContext()).getPreludeActions();
        rnd = new Random();

        initViews(root);
        initListeners();

        return root;
    }

    // Связь фрагмента с менеджером фрагментов в активности.
    @NonNull
    public static PreludeFragment newInstance() {
        return new PreludeFragment();
    }

    private void initViews(View root) {
        styleEasyFlipView = root.findViewById(R.id.style_easy_flip_view);
        styleImageView = root.findViewById(R.id.style_image_view);
        styleTextView = root.findViewById(R.id.style_text_view);
        preludeActionEasyFlipView = root.findViewById(R.id.prelude_action_easy_flip_view);
        preludeActionImageView = root.findViewById(R.id.prelude_action_image_view);
        preludeActionTextView = root.findViewById(R.id.prelude_action_text_view);
        startButton = root.findViewById(R.id.start_button);
    }

    private void initListeners() {
        styleEasyFlipView.setOnFlipListener((easyFlipView, newCurrentSide) -> {
            if (newCurrentSide == EasyFlipView.FlipState.BACK_SIDE) {
                Style style = stylesList.get(rnd.nextInt(stylesList.size()));
                styleImageView.setImageResource(style.getImageId());
                styleTextView.setText(style.getDescriptionId());
            } else {
                startButton.setEnabled(true);
            }
        });

        preludeActionEasyFlipView.setOnFlipListener((easyFlipView, newCurrentSide) -> {
            if (newCurrentSide == EasyFlipView.FlipState.BACK_SIDE) {
                PreludeAction preludeAction = preludeActionsList.get(rnd.nextInt(preludeActionsList.size()));
                preludeActionImageView.setImageResource(preludeAction.getImageId());
                preludeActionTextView.setText(preludeAction.getDescriptionId());
            } else {
                startButton.setEnabled(true);
            }
        });

        startButton.setOnClickListener(view -> {
            startButton.setEnabled(false);
            styleEasyFlipView.flipTheView();
            preludeActionEasyFlipView.flipTheView();
        });
    }
}
