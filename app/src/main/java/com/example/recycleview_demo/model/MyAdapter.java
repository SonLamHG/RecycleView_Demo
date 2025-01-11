package com.example.recycleview_demo.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recycleview_demo.R;

import java.util.List;

public class MyAdapter extends RecyclerView.Adapter<MyAdapter.MyViewHolder> {

    private List<Cat> list_cat;

    public MyAdapter(List<Cat> list_cat) {
        this.list_cat = list_cat;
    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {
        Cat cat = list_cat.get(position);
        holder.img.setImageResource(cat.getImg());
        holder.name.setText(cat.getName());
        holder.time.setText(cat.getTime());
    }

    @Override
    public int getItemCount() {
        return list_cat.size();
    }

    class MyViewHolder extends RecyclerView.ViewHolder {

        //private CardView cardview;
        private ImageView img;
        private TextView name;
        private TextView time;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            //cardview = itemView.findViewById(R.id.cardview);
            img = itemView.findViewById(R.id.img);
            name = itemView.findViewById(R.id.txt);
            time = itemView.findViewById(R.id.time);
        }


    }
}
