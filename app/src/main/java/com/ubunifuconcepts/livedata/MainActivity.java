package com.ubunifuconcepts.livedata;

import android.os.Bundle;

import com.google.android.material.textfield.TextInputEditText;

import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProviders;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {
    MainActivityContract.Presenter presenter;
    TextInputEditText editText;
    RecyclerView rvList;
    ListAdapter listAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initPresenter();
    }


    @Override
    public void initPresenter() {
        presenter = new MainActivityPresenter(this);
        presenter.onViewInit();
    }

    @Override
    public void bindViews() {
        editText = findViewById(R.id.etListInput);
        rvList = findViewById(R.id.rvList);
        rvList.setLayoutManager(new LinearLayoutManager(this));
        listAdapter = new ListAdapter();
        rvList.setAdapter(listAdapter);
    }

    @Override
    public void observeList() {
        presenter.getDataList().observe(this, dataList -> listAdapter.setData(dataList));
    }
}
