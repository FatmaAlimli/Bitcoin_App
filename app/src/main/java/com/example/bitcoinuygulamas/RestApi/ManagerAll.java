package com.example.bitcoinuygulamas.RestApi;

import com.example.bitcoinuygulamas.HomeActivity;
import com.example.bitcoinuygulamas.Models.Response2;

import retrofit2.Call;

public class ManagerAll extends BaseManager {
    private static ManagerAll ourInstance = new ManagerAll();

    public static synchronized ManagerAll getInstance() {
        return ourInstance;
    }
    public Call<Response2> getirBilgileri()
    {
        Call<Response2> call = getRestApiClient().bilgiGetir(HomeActivity.class.getPackage().getName());
        return call;
    }
    public Call<Response2> managerGetResult(String id)
    {
        Call<Response2> call2 = getRestApiClient().ozellikGetir(HomeActivity.class.getPackage().getName(), id);
        return call2;
    }


}
