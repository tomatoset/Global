package com.tomatoset.app.adapters;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

import tomatoset.com.global.R;

public class RVAdapter extends RecyclerView.Adapter<RVAdapter.MenuViewHolder> {
    List<MenuFood> menuFoods;
    public RVAdapter(List<MenuFood> menuFoods){
        this.menuFoods = menuFoods;
    }
    @Override
    public MenuViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.card_layout,parent, false);
        return new MenuViewHolder(v);
    }

    @Override
    public void onBindViewHolder(MenuViewHolder holder, int position) {
        holder.foodName.setText(menuFoods.get(position).name);
        holder.foodSum.setText(menuFoods.get(position).sum);
        holder.foodPhoto.setImageResource(menuFoods.get(position).photoId);
    }

    @Override
    public int getItemCount() {
        return menuFoods.size();
    }

    @Override
    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
    }

    public static class MenuViewHolder extends RecyclerView.ViewHolder{
        CardView cv;
        TextView foodName;
        TextView foodSum;
        ImageView foodPhoto;
        MenuViewHolder(View itemView){
            super(itemView);
            cv = (CardView) itemView.findViewById(R.id.cardView);
            foodName = (TextView) itemView.findViewById(R.id.food_name);
            foodSum = (TextView) itemView.findViewById(R.id.food_sum);
            foodPhoto = (ImageView) itemView.findViewById(R.id.food_photo);
        }
    }



}
