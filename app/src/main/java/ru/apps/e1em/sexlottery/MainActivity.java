package ru.apps.e1em.sexlottery;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;

import ru.apps.e1em.sexlottery.interfaces.OnFemaleFemaleFButtonClickListener;
import ru.apps.e1em.sexlottery.interfaces.OnMaleFemaleButtonClickListener;
import ru.apps.e1em.sexlottery.interfaces.OnMaleMaleButtonClickListener;

public class MainActivity extends AppCompatActivity implements OnFemaleFemaleFButtonClickListener, OnMaleFemaleButtonClickListener, OnMaleMaleButtonClickListener {

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
    public void onMaleFemaleButtonClicked() {
        CardFragment cardFragment = CardFragment.newInstance(1);
        fragmentManager.beginTransaction().replace(R.id.container, cardFragment).addToBackStack(null).commit();
    }

    @Override
    public void onFemaleFemaleButtonClicked() {
        CardFragment cardFragment = CardFragment.newInstance(2);
        fragmentManager.beginTransaction().replace(R.id.container, cardFragment).addToBackStack(null).commit();
    }

    @Override
    public void onMaleMaleButtonClicked() {
        CardFragment cardFragment = CardFragment.newInstance(3);
        fragmentManager.beginTransaction().replace(R.id.container, cardFragment).addToBackStack(null).commit();
    }
}
