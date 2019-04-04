package com.ubunifuconcepts.livedata;

import android.os.Bundle;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

import java.util.ArrayList;
import java.util.List;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

public class MainActivity extends AppCompatActivity implements MainActivityContract.View {
    MainActivityContract.Presenter presenter;
    TextInputEditText editText;
    RecyclerView rvList;
    //MaterialButton btnSubmit;
    ListAdapter listAdapter;
    List<ListData> list;

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
        //btnSubmit = findViewById(R.id.btnSubmit);
    }

    @Override
    public void registerEventListeners() {

    }

    @Override
    public void initListAdapter() {
        list = new ArrayList<ListData>();
        list.add(new ListData("The monkey ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The donkey ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The mule ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The hare ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The other guy ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The lion ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The tired android developer ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The prince of wales ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The famous soccer star ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The amazing spiderman ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The monkey ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The donkey ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The mule ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The hare ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The other guy ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The lion ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The tired android developer ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The prince of wales ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The famous soccer star ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The amazing spiderman ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The monkey ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The donkey ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The mule ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The hare ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The other guy ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The lion ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The tired android developer ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The prince of wales ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The famous soccer star ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The amazing spiderman ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The monkey ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The donkey ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The mule ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The hare ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The other guy ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The lion ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The tired android developer ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The prince of wales ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The famous soccer star ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The amazing spiderman ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The monkey ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The donkey ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The mule ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The hare ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The other guy ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The lion ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The tired android developer ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The prince of wales ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The famous soccer star ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The amazing spiderman ran up the wall to meet the fine young prince!"));
        list.add(new ListData("The amazing spiderman ran up the wall to meet the fine young prince!"));
        listAdapter = new ListAdapter(list);
        rvList.setAdapter(listAdapter);
    }
}
