package com.ubunifuconcepts.livedata;

/**
 * Created by Brian on 03/04/2019
 */
public interface MainActivityContract {
    interface View {
        void initPresenter();

        void bindViews();

        void registerEventListeners();

        void initListAdapter();
    }

    interface Presenter {
        void onViewInit();
    }
}
