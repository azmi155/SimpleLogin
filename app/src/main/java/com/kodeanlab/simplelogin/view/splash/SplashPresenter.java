package com.kodeanlab.simplelogin.view.splash;

import android.os.Handler;

import com.kodeanlab.simplelogin.view.login.LoginContract;

/**
 * Created by yan1435 on 08/02/18.
 */

public class SplashPresenter implements SplashContract.Presenter<SplashContract.View> {

    SplashContract.View view;

    @Override
    public void attachView(SplashContract.View view) {
        this.view = view;
    }

    @Override
    public void detachView() {
        this.view = null;
    }

    @Override
    public boolean isViewAttached() {
        return this.view != null;
    }

    @Override
    public void doSplash(Integer delay) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                view.goLoginActivity();
            }
        };
        new Handler().postDelayed(r,delay);
    }
}
