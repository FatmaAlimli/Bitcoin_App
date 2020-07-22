package com.example.bitcoinuygulamas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

import com.example.bitcoinuygulamas.Models.Response2;

public class StartFragment extends Fragment {

    public Response2 list;
    View view;
    TextView textView;

        @Override
    public  View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState){
            View view = inflater.inflate(R.layout.start_fragment, container,false);
            return view;
        }
}
