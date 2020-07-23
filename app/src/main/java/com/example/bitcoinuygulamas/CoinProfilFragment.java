package com.example.bitcoinuygulamas;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.example.bitcoinuygulamas.Models.CoinsItem;
import com.example.bitcoinuygulamas.Models.Response2;

public class CoinProfilFragment extends Fragment {

    public Response2 list;
    String id;
    View view;
    TextView descriptionTextView, nameTextView, priceTextView;
    ImageView iconImageView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.first_fragment, container, false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        this.view = view;

        descriptionTextView = (TextView) view.findViewById(R.id.description);
        nameTextView = (TextView) view.findViewById(R.id.name);
        priceTextView = (TextView) view.findViewById(R.id.price);
        iconImageView = (ImageView) view.findViewById(R.id.iconUrl);
        System.out.println();

    }

    public void update(Response2 list, String id) {
        this.list = list;
        this.id = id ;
        for (CoinsItem item : list.getData().getCoins()) {
            if (item.getId() == Integer.parseInt(id)) {
                descriptionTextView.setText(""+item.getDescription());
                nameTextView.setText(""+item.getName());
                priceTextView.setText(String.format("%.2f",item.getPrice()));
                Utils.fetchSvg(getActivity(), item.getIconUrl(), iconImageView);
                System.out.println();
            }
        }
    }


}
