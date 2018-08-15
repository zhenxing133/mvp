package com.itwork.mvp.login.view;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.google.gson.Gson;
import com.itwork.mvp.R;
import com.itwork.mvp.base.BaseMVPActivity;
import com.itwork.mvp.factory.CreatePresenter;
import com.itwork.mvp.login.model.LoginBean;
import com.itwork.mvp.login.presenter.LoginPresenter;
import com.itwork.mvp.ui.MainActivity;
import com.itwork.mvp.utils.MyProgressDialog;

/**
 * Created by yuan.zhen.xing on 2018-08-14.
 */
@CreatePresenter(LoginPresenter.class)
public class LoginActivity extends BaseMVPActivity<LoginView,LoginPresenter> implements LoginView {

    private EditText username;
    private EditText password;
    private MyProgressDialog dialog ;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }
        setContentView(R.layout.activity_login);
        initView();

    }

    private void initView() {
        username = findViewById(R.id.et_user_name);
        password = findViewById(R.id.et_password);
        dialog = new MyProgressDialog(this, "正在登录...");
        findViewById(R.id.btn_login).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //调用登录方法
                getMvpPresenter().startLogin(username.getText().toString().trim(),password.getText().toString().trim());
            }
        });

    }

    @Override
    public void showLoading() {
        dialog.show();
    }

    @Override
    public void dismiss() {
        dialog.dismiss();
    }

    @Override
    public void showResult(LoginBean loginBean) {
        //将请求后的bean转为string
        Gson gson = new Gson();
        String json = gson.toJson(loginBean);
        Log.e("yzx", "json==" + json);
    }


    @Override
    public void showToast(String msg) {
        Toast.makeText(this,msg,Toast.LENGTH_SHORT).show();
    }

    @Override
    public void startPage() {
        Intent intent = new Intent(LoginActivity.this,MainActivity.class);
        startActivity(intent);
        finish();
    }
}
