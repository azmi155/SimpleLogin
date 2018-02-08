package com.kodeanlab.simplelogin.view.splash;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.WindowManager;
import android.widget.ProgressBar;

import com.kodeanlab.simplelogin.R;
import com.kodeanlab.simplelogin.view.login.LoginActivity;

public class SplashActivity extends AppCompatActivity implements SplashContract.View {

    private ProgressBar progressDialog;
    private SplashPresenter splashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        progressDialog = findViewById(R.id.progressBarSplash);

        splashPresenter = new SplashPresenter();
        splashPresenter.attachView(this);
        splashPresenter.doSplash(2000);

    }

    @Override
    public Context getContext() {
        return this;
    }

    @Override
    public void goLoginActivity() {
        Intent inten = new Intent(SplashActivity.this, LoginActivity.class);
        startActivity(inten);
        finish();
    }

}
