package com.ubunifuconcepts.livedata;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

/**
 * Created by Brian on 03/04/2019
 */
class MainActivityPresenter extends ViewModel implements MainActivityContract.Presenter {
    MainActivityContract.View view;
    MutableLiveData<List<ListData>> dataList;
    List<ListData> list;
    Timer timer;


    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
        initDataList();
    }

    private void initDataList() {
        list = new ArrayList<>();
        dataList = new MutableLiveData<>();
        dataList.setValue(list);
    }

    private void updateList() {
        if(list.size() >= 10){
            list.clear();
        }
        list.add(new ListData("The " + getRandomAnimal() + " jumped over the " + getRandomObject()));
        dataList.postValue(list);
    }

    private String getRandomObject() {
        String[] objects = {"chair", "table", "wall", "car", "tv", "gate"};
        return objects[new Random().nextInt(objects.length)];
    }

    private String getRandomAnimal() {
        String[] animals = {"Cat", "Dog", "Mule", "Panther"};
        return animals[new Random().nextInt(animals.length)];
    }

    @Override
    public void onViewInit() {
        view.bindViews();
        view.observeList();
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                updateList();
            }
        },0, 1000);
    }

    @Override
    public MutableLiveData<List<ListData>> getDataList() {
        return dataList;
    }
}
