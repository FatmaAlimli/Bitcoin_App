package com.example.bitcoinuygulamas;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.bitcoinuygulamas.Adapter.ViewPagerAdapter;
import com.example.bitcoinuygulamas.Models.Response2;
import com.example.bitcoinuygulamas.RestApi.ManagerAll;
import com.google.android.material.tabs.TabLayout;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class DetailActivity extends AppCompatActivity {

    String id;
    Response2 liste;
    private TabLayout tabLayout;
    private ViewPager viewPager;
    private String[] pageTitle = {"Profil", "Sosyal", "Geçmiş Değerler"};
    ViewPagerAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.detail_activity);

        al();
        istek();

        tabLayout = (TabLayout)findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
        for (int i = 0; i < 3; i++) {
            tabLayout.addTab(tabLayout.newTab().setText(pageTitle[i]));
    }

        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager = findViewById(R.id.viewPager);
        //Adapterimize Fragmentlerimizi yerleştiriyoruz

        adapter = new ViewPagerAdapter(this,getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager.setAdapter(adapter);  //viewPager'e adapteri baplıyoruz

        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
               ((CoinProfilFragment) adapter.getItem(0) ).update(liste, id);
                ((CoinSocialFragment) adapter.getItem(1)).update(liste, id);
                ((CoinHistoryFragment) adapter.getItem(2)).update(liste, id );
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });

     /*   viewPager.post(new Runnable() {
            @Override
            public void run() {
                tanimla();
            }
        });*/


    }


    public void al() {
        Bundle bundle = getIntent().getExtras();
        id = bundle.getString("id");

    }

    public void istek() {
        Call<Response2> call = ManagerAll.getInstance().managerGetResult(id);
        call.enqueue(new Callback<Response2>() {
                @Override
                public void onResponse(Call<Response2> call, Response<Response2> response) {
                if (response.isSuccessful()) {
                    liste = response.body();

                    ((CoinProfilFragment) adapter.getItem(0) ).update(liste,id);
                    ((CoinSocialFragment) adapter.getItem(1)).update(liste,id);
                    ((CoinHistoryFragment) adapter.getItem(2)).update(liste,id );
                   // FirstFragment firstFragmentt = new ((FirstFragment) adapter.getItem(0) ).update(liste);FirstFragment();
                   //firstFragment.update(response.body());
                    //adapter.update(0, liste);

                    //int a = liste.getData().getCoins().size();
                    //nameTV.setText(liste.getData().getCoins().get(0).getName());
                    //atama(liste);
                    //descriptionTextView = (TextView) findViewById(R.id.description);
                    //descriptionTextView.setText(liste.getData().getCoins().get(0).getDescription());
                }
            }

            @Override
            public void onFailure(Call<Response2> call, Throwable t) {

            }
        });
    }



}
