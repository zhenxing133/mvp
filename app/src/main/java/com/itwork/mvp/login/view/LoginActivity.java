package com.itwork.mvp.login.view;


import android.os.Bundle;
import android.support.annotation.Nullable;

import com.itwork.mvp.R;
import com.itwork.mvp.base.BaseMVPActivity;
import com.itwork.mvp.login.presenter.LoginPresenter;

/**
 * Created by yuan.zhen.xing on 2018-08-14.
 */

public class LoginActivity extends BaseMVPActivity<LoginView,LoginPresenter> implements LoginView {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_main);

    }

    @Override
    public void showLoading() {

    }

    @Override
    public void dismiss() {

    }

    @Override
    public void showResult() {

    }

    @Override
    public void showEmpty() {

    }
}
