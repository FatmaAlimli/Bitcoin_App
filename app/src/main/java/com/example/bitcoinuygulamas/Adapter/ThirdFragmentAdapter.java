package com.example.bitcoinuygulamas.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.bitcoinuygulamas.Models.CoinsItem;
import com.example.bitcoinuygulamas.R;
import com.example.bitcoinuygulamas.CoinHistoryFragment;

import java.util.ArrayList;
import java.util.List;

public class ThirdFragmentAdapter extends RecyclerView.Adapter<ThirdFragmentAdapter.ViewHolder> {
    List<CoinsItem> list = new ArrayList<>();
    Context context;
    CoinHistoryFragment activity;
    CoinHistoryFragment fragment;
    String id;


    public ThirdFragmentAdapter(Context context, CoinHistoryFragment activity) {
        this.activity = activity;
        this.context = context;
        // this.fragment = fragment;
    }

    public void setList(List<CoinsItem> list, String id) {
        this.list = list;
        this.id = id;
        notifyDataSetChanged();
    }

    @NonNull
    @Override
    public ThirdFragmentAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.third_fragment_layout, parent, false);
        ViewHolder holder = new ViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull ThirdFragmentAdapter.ViewHolder holder, int position) {
        for (CoinsItem item : list) {
            if (item.getId() == Integer.parseInt(id)) {
                holder.textView.setText(item.getHistory().get(position));
                System.out.println();
            }
        }

        //holder.setData(list.get(position));
    }

    @Override
    public int getItemCount() {
        for (CoinsItem item : list) {
            if (item.getId() == Integer.parseInt(id)) {
                return item.getHistory().size();

            }
        }
      return 0;

    }

    class ViewHolder extends RecyclerView.ViewHolder {

        TextView textView;
        LinearLayout layout;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            layout = itemView.findViewById(R.id.layoutListThird);
            textView = (TextView) itemView.findViewById(R.id.history);
        }

        /* public void setData(CoinsItem list){
             this.textView.setText(list.getHistory().get(0));
         }*/
    }

}
