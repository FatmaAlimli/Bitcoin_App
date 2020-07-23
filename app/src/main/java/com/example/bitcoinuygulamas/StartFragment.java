package com.example.bitcoinuygulamas;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bitcoinuygulamas.Adapter.ActivityOwner;
import com.example.bitcoinuygulamas.Adapter.CoinsAdapter;
import com.example.bitcoinuygulamas.Models.Response2;
import com.example.bitcoinuygulamas.RestApi.ManagerAll;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class StartFragment extends Fragment implements ActivityOwner {

    public Response2 list;
    View view;
    TextView textView;
    CoinsAdapter coinsAdapter;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;

    ActivityOwner activity;

    public StartFragment(ActivityOwner activity){
        super();
        this.activity = activity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.start_fragment, container, false);

        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.view = view;

        tanimla(view);
        istek();
    }

    public void tanimla(View view) {
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view);
        linearLayoutManager = new LinearLayoutManager(getContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    public void istek() {
        Call<Response2> bilgiList = ManagerAll.getInstance().getirBilgileri();
        bilgiList.enqueue((new Callback<Response2>() {
            @Override
            public void onResponse(Call<Response2> call, Response<Response2> response) {
                if (response.isSuccessful()) {
                    coinsAdapter = new CoinsAdapter(getContext(), activity);

                    recyclerView.setAdapter(coinsAdapter);
                    coinsAdapter.setList(response.body().getData().getCoins());
                }


            }

            @Override
            public void onFailure(Call<Response2> call, Throwable t) {
                if (true) return;
            }
        }));
    }


    @Override
    public Activity getActivityOwner() {
        return activity.getActivityOwner();
    }
}
