package com.kodeanlab.simplelogin.view.login;

import android.support.v7.app.AppCompatActivity;

import com.kodeanlab.simplelogin.models.User;
import com.kodeanlab.simplelogin.utils.BasePresenter;
import com.kodeanlab.simplelogin.utils.BaseView;

/**
 * Created by yan1435 on 06/02/18.
 */

public interface LoginContract {

    interface View extends BaseView {

        void goHomeActivity();

        void onSuccess(User user);
        void onFailed(String msg);

        void showLoading();
        void hideLoading();

    }

    interface Presenter<V extends BaseView> extends BasePresenter<View>{

        void doLogin(String username, String password);

    }

}
