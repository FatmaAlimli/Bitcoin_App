package com.example.bitcoinuygulamas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bitcoinuygulamas.Adapter.ThirdFragmentAdapter;
import com.example.bitcoinuygulamas.Models.Response2;

public class CoinHistoryFragment extends Fragment {

    public Response2 list;
    String id;
    View view;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;
    ThirdFragmentAdapter thirdFragmentAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.third_fragment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.view = view;
        recyclerView = (RecyclerView) view.findViewById(R.id.recyclerViewThree);
        linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);
        thirdFragmentAdapter = new ThirdFragmentAdapter(getContext(), CoinHistoryFragment.this);
        recyclerView.setAdapter(thirdFragmentAdapter);
        thirdFragmentAdapter.setList(list.getData().getCoins(), id);
        System.out.println();

    }

    public void update(Response2 list, String id) {
        this.list = list;
        this.id = id;
        System.out.println();

    }


}
