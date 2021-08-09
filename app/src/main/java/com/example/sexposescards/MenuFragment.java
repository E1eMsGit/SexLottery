package com.example.sexposescards;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.example.sexposescards.interfaces.OnGameButtonClickListener;
import com.example.sexposescards.interfaces.OnPreludeButtonClickListener;

public class MenuFragment extends Fragment {

    private Button preludeButton;
    private Button gameButton;

    private OnPreludeButtonClickListener callbackActivityFromPreludeButtonClicked;
    private OnGameButtonClickListener callbackActivityFromGameButtonClicked;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        callbackActivityFromPreludeButtonClicked = (OnPreludeButtonClickListener) context;
        callbackActivityFromGameButtonClicked = (OnGameButtonClickListener) context;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_menu, container, false);

        initViews(root);
        preludeButton.setOnClickListener(view -> callbackActivityFromPreludeButtonClicked.onPreludeButtonClicked());
        gameButton.setOnClickListener(view -> callbackActivityFromGameButtonClicked.onGameButtonClicked());

        return root;
    }

    private void initViews(View root) {
        preludeButton = root.findViewById(R.id.prelude_button);
        gameButton = root.findViewById(R.id.game_button);
    }
}
