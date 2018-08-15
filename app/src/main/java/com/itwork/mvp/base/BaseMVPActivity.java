package com.itwork.mvp.base;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;

import com.itwork.mvp.factory.PresenterMvpFactory;
import com.itwork.mvp.factory.PresenterMvpFactoryImpl;
import com.itwork.mvp.proxy.BaseMvpProxy;
import com.itwork.mvp.proxy.PresenterProxyInterface;

/**
 * @date 2018/05/22
 *   mvp activity基类 声明一个创建Presenter的方法 因为要帮子类去绑定和解绑那么就需要拿到子类的Presenter才行
 *
 */

public abstract class BaseMVPActivity<V extends BaseMvpView,P extends BaseMvpPresenter<V>> extends
    BaseActivity implements PresenterProxyInterface<V,P> {

    private static final String PRESENTER_SAVE_KEY = "presenter_save_key";
    /**
     * 创建被代理对象,传入默认Presenter的工厂
     */
    private BaseMvpProxy<V,P> mProxy = new BaseMvpProxy<>(PresenterMvpFactoryImpl.<V,P>createFactory(getClass()));

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (savedInstanceState != null){
            mProxy.onRestoreInstanceState(savedInstanceState);
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState, PersistableBundle outPersistentState) {
        super.onSaveInstanceState(outState, outPersistentState);
        outState.putBundle(PRESENTER_SAVE_KEY,mProxy.onSaveInstanceState());
    }

    @Override
    public PresenterMvpFactory<V, P> getPresenterFactory() {
        return mProxy.getPresenterFactory();
    }

    @Override
    public void setPresenterFactory(PresenterMvpFactory<V, P> presenterFactory) {
        mProxy.setPresenterFactory(presenterFactory);
    }

    @Override
    public P getMvpPresenter() {
        return mProxy.getMvpPresenter();
    }

    @Override
    protected void onResume() {
        super.onResume();
        mProxy.onResume((V) this);  //绑定Presenter和view
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        mProxy.onDestroy();
    }
}
