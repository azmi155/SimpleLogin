package com.kodeanlab.simplelogin.utils;

/**
 * Created by yan1435 on 06/02/18.
 */

public interface BasePresenter<V> {

    void attachView(V view);
    void detachView();
    boolean isViewAttached();

}
