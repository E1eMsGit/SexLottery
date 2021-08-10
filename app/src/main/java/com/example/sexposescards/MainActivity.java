package com.example.sexposescards;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import com.example.sexposescards.interfaces.OnGameButtonClickListener;
import com.example.sexposescards.interfaces.OnPreludeButtonClickListener;

public class MainActivity extends AppCompatActivity implements OnPreludeButtonClickListener, OnGameButtonClickListener {

    private FragmentManager fragmentManager;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fragmentManager = getSupportFragmentManager();

        if (savedInstanceState == null) {
            fragmentManager.beginTransaction().add(R.id.container, new MenuFragment()).commit();
        }
    }

    @Override
    public void onPreludeButtonClicked() {
        PreludeFragment preludeFragment = PreludeFragment.newInstance();
        fragmentManager.beginTransaction().replace(R.id.container, preludeFragment).addToBackStack(null).commit();
    }

    @Override
    public void onGameButtonClicked() {
        GameFragment gameFragment = GameFragment.newInstance();
        fragmentManager.beginTransaction().replace(R.id.container, gameFragment).addToBackStack(null).commit();
    }
}
