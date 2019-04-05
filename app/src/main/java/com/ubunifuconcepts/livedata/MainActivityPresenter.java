package com.ubunifuconcepts.livedata;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

import androidx.lifecycle.MutableLiveData;

/**
 * Created by Brian on 03/04/2019
 */
class MainActivityPresenter implements MainActivityContract.Presenter {
    MainActivityContract.View view;
    MutableLiveData<List<ListData>> dataList;
    List<ListData> list;
    Timer timer;


    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
        initDataList();
    }

    @Override
    public void onViewInit() {
        view.bindViews();
        view.observeList();
        startUpdatingListWithDummyData();
    }

    @Override
    public MutableLiveData<List<ListData>> getDataList() {
        return dataList;
    }

    //Initialize the MutableLiveData object
    private void initDataList() {
        list = new ArrayList<>();
        dataList = new MutableLiveData<>();
        dataList.setValue(list);
    }

    //Adds dummy data to the list every second and resets the list after a number of list entries
    private void startUpdatingListWithDummyData() {
        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                if (list.size() >= 10) {
                    list.clear();
                }
                list.add(new ListData("The " + getRandomAnimal() + " jumped over the " + getRandomObject()));
                dataList.postValue(list);
            }
        }, 0, 1000);
    }

    //Returns a random string
    private String getRandomObject() {
        String[] objects = {"chair", "table", "wall", "car", "tv", "gate"};
        return objects[new Random().nextInt(objects.length)];
    }

    //Returns a random string
    private String getRandomAnimal() {
        String[] animals = {"Cat", "Dog", "Mule", "Panther"};
        return animals[new Random().nextInt(animals.length)];
    }
}
