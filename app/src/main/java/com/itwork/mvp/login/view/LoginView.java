package com.itwork.mvp.login.view;

import com.itwork.mvp.base.BaseMvpView;

/**
 * Created by yuan.zhen.xing on 2018-08-14.
 */

public interface LoginView extends BaseMvpView {

    //有数据显示数据
    void showResult();

    //无数据
    void showEmpty();
}
