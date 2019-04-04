package com.ubunifuconcepts.livedata;

/**
 * Created by Brian on 03/04/2019
 */
class MainActivityPresenter implements MainActivityContract.Presenter {
    MainActivityContract.View view;


    public MainActivityPresenter(MainActivityContract.View view) {
        this.view = view;
    }

    @Override
    public void onViewInit() {
        view.bindViews();
        view.registerEventListeners();
        view.initListAdapter();
    }
}
