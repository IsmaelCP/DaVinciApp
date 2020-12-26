package es.studium.davinciapp.ui.cientifico;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import es.studium.davinciapp.R;

public class CientificoFragment extends Fragment {

    private CientificoViewModel cientificoViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        cientificoViewModel =
                new ViewModelProvider(this).get(CientificoViewModel.class);
        View root = inflater.inflate(R.layout.fragment_cientifico, container, false);
        final TextView textView = root.findViewById(R.id.titulo_inventor);
        cientificoViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }
}