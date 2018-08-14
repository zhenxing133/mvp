package com.itwork.mvp.factory;


import com.itwork.mvp.base.BaseMvpPresenter;
import com.itwork.mvp.base.BaseMvpView;

/**
 * @date 2018/05/22
 * @description Presenter工厂接口
 */
public interface PresenterMvpFactory<V extends BaseMvpView,P extends BaseMvpPresenter<V>> {

    /**
     * 创建Presenter的接口方法
     * @return 需要创建的Presenter
     */
    P createMvpPresenter();
}
