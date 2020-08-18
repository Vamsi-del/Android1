package com.example.myrecycler;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class MyAdaptar extends RecyclerView.Adapter<MyAdaptar.Viewholder> {
    Context ct;
    String names[];
    int images[];

    public MyAdaptar(Context ct,String[] names,int[] images){
        this.ct=ct;
        this.names=names;
        this.images=images;
    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new Viewholder(LayoutInflater.from(ct).inflate(R.layout.row,parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        holder.iv.setImageResource(images[position]);
        holder.tv.setText(names[position]);

    }

    @Override
    public int getItemCount() {
        return images.length;
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        ImageView iv;
        TextView tv;
        public Viewholder(@NonNull View itemView) {
            super(itemView);
            iv=itemView.findViewById(R.id.iv);
            tv=itemView.findViewById(R.id.tv);
        }
    }
}
