package com.example.bitcoinuygulamas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class NavigationFragment extends Fragment {
    View views;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        views= inflater.inflate(R.layout.navigation_main_fragment,container,false);

        return  views;
    }
}
