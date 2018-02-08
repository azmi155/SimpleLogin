package com.kodeanlab.simplelogin.view.login;

import com.kodeanlab.simplelogin.models.User;
import com.kodeanlab.simplelogin.view.login.LoginContract.View;

/**
 * Created by yan1435 on 06/02/18.
 */

public class LoginPresenter implements LoginContract.Presenter<View> {

    private View view;

    @Override
    public void attachView(View view) {
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
    public void doLogin(String username, String password) {
        if (isViewAttached()){
                if (username != null && password != null){
                    if (username.equalsIgnoreCase("yan") && password.equalsIgnoreCase("123456")){
                        view.onSuccess(new User(username));
                        view.goHomeActivity();
                    }else {
                        view.onFailed("Error Login !");
                    }
                }else {
                    view.onFailed("Please Fill Field !");
                }

            }


    }
}
