package com.example.bitcoinuygulamas;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bitcoinuygulamas.Models.CoinsItem;
import com.example.bitcoinuygulamas.Models.Response2;

import java.util.ArrayList;

public class CoinSocialFragment extends Fragment {
    public Response2 list;
    String id;
    View view;
    ListView listView;
    LinearLayout layoutList;

    TextView socialsTextView;
    ImageView imageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.second_fragment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.view = view;

        listView = (ListView) view.findViewById(R.id.list_view_second);
        layoutList = view.findViewById(R.id.layoutList2);
       // socialsTextView = (TextView) view.findViewById(R.id.socials);
        imageView = (ImageView) view.findViewById(R.id.iconLink);


    }


    public void update(Response2 list, String id) {
        this.list = list;
        this.id = id;
        System.out.println();
        for (CoinsItem item : list.getData().getCoins()) {
            if (item.getId() == Integer.parseInt(id)) {

                ArrayList<String> listItem = new ArrayList<String>();

                listItem.add(item.getLinks().get(0).getName());
                listItem.add(item.getLinks().get(1).getName());
                listItem.add(item.getLinks().get(2).getName());
                listItem.add(item.getLinks().get(3).getName());

                final ArrayAdapter<String> adapter = new ArrayAdapter<String>(getContext(),
                        android.R.layout.simple_list_item_1, android.R.id.text1, listItem);
                listView.setAdapter(adapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                        Uri uri = Uri.parse(item.getLinks().get(position).getUrl());
                        Intent intent = new Intent(Intent.ACTION_VIEW, uri);
                        startActivity(intent);
                    }
                });

                System.out.println();
            }
        }
    }

}
