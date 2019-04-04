package com.ubunifuconcepts.livedata;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Brian on 04/04/2019
 */
public class ListDataViewHolder extends RecyclerView.ViewHolder {
    TextView tvCount;
    TextView tvContent;


    public ListDataViewHolder(@NonNull View itemView) {
        super(itemView);
        tvCount = itemView.findViewById(R.id.tvCount);
        tvContent = itemView.findViewById(R.id.tvContent);
    }

    public TextView getTvCount() {
        return tvCount;
    }

    public TextView getTvContent() {
        return tvContent;
    }
}
