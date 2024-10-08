package ru.apps.e1em.sexlottery;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import ru.apps.e1em.sexlottery.R;

import ru.apps.e1em.sexlottery.interfaces.OnFemaleFemaleFButtonClickListener;
import ru.apps.e1em.sexlottery.interfaces.OnMaleFemaleButtonClickListener;
import ru.apps.e1em.sexlottery.interfaces.OnMaleMaleButtonClickListener;

public class MenuFragment extends Fragment {

    private ImageButton fFButton;
    private ImageButton mFButton;
    private ImageButton mMButton;

    private OnFemaleFemaleFButtonClickListener callbackActivityFromFFButtonClicked;
    private OnMaleFemaleButtonClickListener callbackActivityFromMFButtonClicked;
    private OnMaleMaleButtonClickListener callbackActivityFromMMButtonClicked;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        callbackActivityFromFFButtonClicked = (OnFemaleFemaleFButtonClickListener) context;
        callbackActivityFromMFButtonClicked = (OnMaleFemaleButtonClickListener) context;
        callbackActivityFromMMButtonClicked = (OnMaleMaleButtonClickListener) context;
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_menu, container, false);

        initViews(root);
        fFButton.setOnClickListener(view -> callbackActivityFromFFButtonClicked.onFemaleFemaleButtonClicked());
        mFButton.setOnClickListener(view -> callbackActivityFromMFButtonClicked.onMaleFemaleButtonClicked());
        mMButton.setOnClickListener(view -> callbackActivityFromMMButtonClicked.onMaleMaleButtonClicked());

        return root;
    }

    private void initViews(View root) {
        fFButton = root.findViewById(R.id.ff_button);
        mFButton = root.findViewById(R.id.mf_button);
        mMButton = root.findViewById(R.id.mm_button);
    }
}
