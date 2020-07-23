package com.example.bitcoinuygulamas;

import android.app.Activity;
import android.os.Bundle;
import android.view.MenuItem;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import com.example.bitcoinuygulamas.Adapter.ActivityOwner;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity implements ActivityOwner {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);


        BottomNavigationView navigation = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        navigation.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener);
        loadFragment(new StartFragment(this));

    }

    private BottomNavigationView.OnNavigationItemSelectedListener mOnNavigationItemSelectedListener
            = new BottomNavigationView.OnNavigationItemSelectedListener() {

        @Override
        public boolean onNavigationItemSelected(@NonNull MenuItem item) {
            Fragment selectedFragment = null;
            switch (item.getItemId()) {
                case R.id.page_1:
                    selectedFragment = new StartFragment(HomeActivity.this);
                    break;
                case R.id.page_2:
                    selectedFragment = new ProfilFragment();
                    break;

            }
            loadFragment(selectedFragment);
            return true;
        }
    };

    private void loadFragment(Fragment fragment) { //fragmentlarımızı çağırdığımız fonksiyon

        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.mainFrameLayout, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }


    @Override
    public Activity getActivityOwner() {
        return this;
    }
}
