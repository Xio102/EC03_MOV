package com.example.examen03;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FoodAdapter extends RecyclerView.Adapter<FoodAdapter.ViewHolder> {

    private ArrayList<FoodModel> foodModel;

    public FoodAdapter(ArrayList<FoodModel> foodModel) {
        this.foodModel = foodModel;
    }

    @NonNull
    @Override
    public FoodAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.food_item, parent, false);
        ViewHolder vh = new ViewHolder(view);
        return vh;
    }

    @Override
    public void onBindViewHolder(@NonNull FoodAdapter.ViewHolder holder, int position) {
        holder.foodName.setText(foodModel.get(position).getFoodName());
        holder.foodPhoto.setImageResource(foodModel.get(position).getFoodPhoto());
    }

    @Override
    public int getItemCount() {
        return foodModel.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {

        TextView foodName;
        ImageView foodPhoto;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            foodName = itemView.findViewById(R.id.food_name);
            foodPhoto = itemView.findViewById(R.id.food_photo);
        }
    }
}
