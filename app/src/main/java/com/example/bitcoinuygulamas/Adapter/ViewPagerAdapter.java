package com.example.bitcoinuygulamas.Adapter;

import android.content.Context;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.bitcoinuygulamas.CoinProfilFragment;
import com.example.bitcoinuygulamas.CoinSocialFragment;
import com.example.bitcoinuygulamas.CoinHistoryFragment;

import java.util.ArrayList;
import java.util.List;

public class ViewPagerAdapter extends FragmentPagerAdapter {
    int totalTabs;
    private Context myContext;
    List<Fragment> fragments = new ArrayList<>();;


    public ViewPagerAdapter(Context context, FragmentManager fm, int totalTabs) {
        super(fm);
        this.totalTabs = totalTabs;
        myContext = context;
        fragments.add(new CoinProfilFragment());
        fragments.add(new CoinSocialFragment());
        fragments.add(new CoinHistoryFragment());

    }

    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }
   /* public void update(int index, Response2 list){
       FirstFragment fragment = (FirstFragment) fragments.get(index);
       fragment.update(list);
    }*/

    @Override
    public int getCount() {
        return totalTabs;
    }

}