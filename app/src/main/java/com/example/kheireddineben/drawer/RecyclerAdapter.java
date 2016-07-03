package com.example.kheireddineben.drawer;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by KheireddineBen on 30/06/2016
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder>{

    private String[] titles = {
            "Setif",
            "Constantine",
            "Alger",
            "Oran"};
    private String[] details = {
            "Detail: \n Some Description... ",
            "Detail: \n Some Description",
            "Detail: \n Algiers is a great city...",
            "Detail: \n Oran is a great city..."};
    private int[] images = {R.drawable.setif, R.drawable.cons,R.drawable.algiers , R.drawable.oran };

class ViewHolder extends RecyclerView.ViewHolder{

    public ImageView itemImage;
    public TextView itemTitle;
    public TextView itemDetail;

    public ViewHolder(View itemView) {
        super(itemView);
        itemImage = (ImageView)itemView.findViewById(R.id.item_image);
        itemTitle = (TextView)itemView.findViewById(R.id.item_title);
        itemDetail = (TextView)itemView.findViewById(R.id.item_detail);

    }
}


    @Override
    public ViewHolder onCreateViewHolder(ViewGroup viewGroup, int i ){
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.card_layout, viewGroup, false);
        ViewHolder viewHolder = new ViewHolder(v);
        return  viewHolder;

    }

    @Override
    public void onBindViewHolder(ViewHolder viewHolder, int i){
        viewHolder.itemTitle.setText(titles[i]);
        viewHolder.itemDetail.setText(details[i]);
        viewHolder.itemImage.setImageResource(images[i]);
    }
    @Override
    public int getItemCount(){return  titles.length;}
}

