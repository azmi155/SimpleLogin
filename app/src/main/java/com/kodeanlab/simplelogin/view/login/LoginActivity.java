package com.kodeanlab.simplelogin.view.login;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.kodeanlab.simplelogin.R;
import com.kodeanlab.simplelogin.models.User;
import com.kodeanlab.simplelogin.view.main.MainActivity;

import es.dmoral.toasty.Toasty;

public class LoginActivity extends AppCompatActivity implements LoginContract.View {

    private EditText username;
    private EditText password;
    private ProgressDialog progressDialog;

    private LoginPresenter loginPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username = findViewById(R.id.usernameId);
        password = findViewById(R.id.passwordId);

        progressDialog = new ProgressDialog(this);
        progressDialog.setMessage("Loading ...");
    }

    public void loginAction(View view){
        loginPresenter = new LoginPresenter();
        loginPresenter.attachView(this);
        loginPresenter.doLogin(username.getText().toString(),
                password.getText().toString());
    }

    public void showToastSuccess(Context context, String msg){
        Toasty.success(context,msg, Toast.LENGTH_SHORT, true).show();
    }

    public void showToastError(Context context, String msg){
        Toasty.error(context,msg, Toast.LENGTH_SHORT, true).show();
    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void goHomeActivity() {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }

    @Override
    public void onSuccess(User user) {
        showToastSuccess(this, "Success Login "+user.getUsername());
    }

    @Override
    public void onFailed(String msg) {
        showToastError(this, msg);
    }

    @Override
    public void showLoading() {
        progressDialog.show();
    }

    @Override
    public void hideLoading() {
        progressDialog.dismiss();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        loginPresenter.detachView();
    }

}
