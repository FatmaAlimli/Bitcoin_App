package com.example.bitcoinuygulamas.Adapter;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.bitcoinuygulamas.Main2Activity;
import com.example.bitcoinuygulamas.Models.CoinsItem;
import com.example.bitcoinuygulamas.R;
import com.example.bitcoinuygulamas.Utils;

import java.util.ArrayList;
import java.util.List;


public class CoinsAdapter extends RecyclerView.Adapter<CoinsAdapter.MyViewHolder> {
    List<CoinsItem> list = new ArrayList<>();
    Context context;
    ActivityOwner activity;

    public CoinsAdapter(Context context, ActivityOwner activity) {
        this.context = context;
        this.activity = activity;
    }

    public void setList(List<CoinsItem> list) {
        this.list = list;
        notifyDataSetChanged();
    }

    @Override
    public CoinsAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.layout, parent, false);
        MyViewHolder holder = new MyViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(CoinsAdapter.MyViewHolder holder, int position) {
        holder.setData(list.get(position));
        holder.layoutList.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(activity.getActivityOwner(), Main2Activity.class);
                String Id = String.valueOf(list.get(position).getId());
                intent.putExtra("id", Id);
                activity.getActivityOwner().startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    class MyViewHolder extends RecyclerView.ViewHolder {

        TextView id, symbol, price;
        ImageView imageView;
        LinearLayout layoutList;

        public MyViewHolder(View itemView) {
            super(itemView);
            layoutList = itemView.findViewById(R.id.layoutList);

            imageView = (ImageView) itemView.findViewById(R.id.iconUrl);
           // id = itemView.findViewById(R.id.id);
            symbol = (TextView) itemView.findViewById(R.id.symbol);
            price = (TextView) itemView.findViewById(R.id.price);

        }

        public void setData(CoinsItem list) {
          //  this.id.setText(String.valueOf(list.getId()));
            this.symbol.setText(list.getSymbol());
            this.price.setText(String.format("%.2f", list.getPrice()));

            if (list.getColor() != null) {
                try {
                    symbol.setTextColor(Color.parseColor(list.getColor()));
                    price.setTextColor(Color.parseColor(list.getColor()));
                } catch (Exception e) {
                    symbol.setTextColor(Color.rgb(0, 0, 0));
                    price.setTextColor(Color.rgb(0, 0, 0));
                }
            }

            Utils.fetchSvg(activity.getActivityOwner(), list.getIconUrl(), imageView);

        }
    }


}
