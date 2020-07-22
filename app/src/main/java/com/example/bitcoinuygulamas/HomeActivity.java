package com.example.bitcoinuygulamas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bitcoinuygulamas.Adapter.CoinsAdapter;
import com.example.bitcoinuygulamas.Models.Response2;
import com.example.bitcoinuygulamas.RestApi.ManagerAll;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends AppCompatActivity {
    CoinsAdapter coinsAdapter;
    RecyclerView recyclerView;
    LinearLayoutManager linearLayoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        tanimla();
        istek();


    }


    public void tanimla() {
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);
        linearLayoutManager = new LinearLayoutManager(this);
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(linearLayoutManager);

    }

    public void istek() {
        Call<Response2> bilgiList = ManagerAll.getInstance().getirBilgileri();
        bilgiList.enqueue((new Callback<Response2>() {
            @Override
            public void onResponse(Call<Response2> call, Response<Response2> response) {
                if (response.isSuccessful()) {
                    coinsAdapter = new CoinsAdapter(getApplicationContext(), HomeActivity.this);
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
}
