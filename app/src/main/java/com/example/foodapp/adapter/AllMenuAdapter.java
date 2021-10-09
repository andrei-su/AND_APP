package com.example.foodapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodapp.R;
import com.example.foodapp.model.Allmenu;

import java.util.List;

public class AllMenuAdapter extends RecyclerView.Adapter<AllMenuAdapter.AllMenuViewHolder> {

    Context context;
    List<Allmenu> allMenusList;

    public AllMenuAdapter(Context context, List<Allmenu> allMenusList) {
        this.context = context;
        this.allMenusList = allMenusList;
    }

    @NonNull
    @Override
    public AllMenuViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context)
                .inflate(R.layout.allmenu_recycler_items, parent, false);

        return new AllMenuViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AllMenuViewHolder holder, int position) {

    }

    @Override
    public int getItemCount() {
        return allMenusList.size();
    }

    public static class AllMenuViewHolder extends RecyclerView.ViewHolder{

        TextView allMenuName, allMenuNote, allMenuRating, allMenuTime, allMenuCharges, allMenuPrice;
        ImageView allMenuImage;

        public AllMenuViewHolder(@NonNull View itemView) {
            super(itemView);

            allMenuName = itemView.findViewById(R.id.allmenu_name);
            allMenuName = itemView.findViewById(R.id.allmenu_name);
            allMenuName = itemView.findViewById(R.id.allmenu_name);
            allMenuName = itemView.findViewById(R.id.allmenu_name);
            allMenuName = itemView.findViewById(R.id.allmenu_name);
            allMenuName = itemView.findViewById(R.id.allmenu_name);
        }
    }
}
