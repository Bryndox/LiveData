package com.ubunifuconcepts.livedata;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * Created by Brian on 04/04/2019
 */
public class ListAdapter extends RecyclerView.Adapter<ListDataViewHolder> {
    List<ListData> dataList;

    public ListAdapter(List<ListData> dataList) {
        this.dataList = dataList;
    }

    @NonNull
    @Override
    public ListDataViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View listItem = inflater.inflate(R.layout.list_item, parent, false);
        return new ListDataViewHolder(listItem);
    }

    @Override
    public void onBindViewHolder(@NonNull ListDataViewHolder holder, int position) {
        ListData listData = dataList.get(position);
        holder.tvContent.setText(listData.getContent());
        holder.tvCount.setText(String.valueOf(position + 1));
    }

    @Override
    public int getItemCount() {
        return dataList == null ? 0 : dataList.size();
    }
}
