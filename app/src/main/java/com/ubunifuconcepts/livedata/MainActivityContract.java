package com.ubunifuconcepts.livedata;

import java.util.List;

import androidx.lifecycle.MutableLiveData;

/**
 * Created by Brian on 03/04/2019
 */
public interface MainActivityContract {
    interface View {
        void initPresenter();

        void bindViews();

        void observeList();
    }

    interface Presenter {
        void onViewInit();

        MutableLiveData<List<ListData>> getDataList();
    }
}
