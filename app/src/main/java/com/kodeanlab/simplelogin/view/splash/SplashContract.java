package com.kodeanlab.simplelogin.view.splash;

import com.kodeanlab.simplelogin.utils.BasePresenter;
import com.kodeanlab.simplelogin.utils.BaseView;

/**
 * Created by yan1435 on 08/02/18.
 */

public interface SplashContract {

    interface View extends BaseView {

        void goLoginActivity();

    }

    interface Presenter<V extends BaseView> extends BasePresenter<View> {

        void doSplash(Integer delay);

    }
}
