package com.itwork.mvp.login.presenter;

import android.os.Handler;
import android.util.Log;

import com.itwork.mvp.base.BaseMvpPresenter;
import com.itwork.mvp.http.ApiUtils;
import com.itwork.mvp.login.model.LoginBean;
import com.itwork.mvp.login.model.LoginNoParams;
import com.itwork.mvp.login.view.LoginView;

import io.reactivex.Observer;
import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.schedulers.Schedulers;


/**
 * 持有M层和V层的引用 用来处理M层和V层之间的通信，也就是P层
 */

public class LoginPresenter extends BaseMvpPresenter<LoginView> {

    //登录的必要业务逻辑
    public void startLogin(final String username,final String password) {
        if (password.isEmpty()|| username.isEmpty()) {
            getMvpView().showToast("账号密码不能为空");
        } else {
            //这里进行网络请求
            getMvpView().showLoading();
            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    /**
                     *  带参数的请求
                     */
                    ApiUtils.login(password)//通过Observable来发送事件 通过Observer来观察 接受事件
                            .subscribeOn(Schedulers.io())//访问网络切换异步线程
                    .observeOn(AndroidSchedulers.mainThread())//接收在主线程中
                    .subscribe(new Observer<LoginBean>() {
                        @Override
                        public void onSubscribe(Disposable d) {

                        }

                        @Override
                        public void onNext(LoginBean loginBean) {
                            if (loginBean.getCode() == 200) {
                                getMvpView().startPage();
                                getMvpView().showResult(loginBean);
                            } else {
                                getMvpView().showToast("请求失败");
                            }
                        }

                        @Override
                        public void onError(Throwable e) {
                            getMvpView().dismiss();
                            getMvpView().showToast("网络异常");
                        }

                        @Override
                        public void onComplete() {

                        }
                    });
                    /**
                     *  不带参数的请求
                     */
//                    ApiUtils.plogin()
//                            .subscribeOn(Schedulers.io())
//                            .observeOn(AndroidSchedulers.mainThread())
//                            .subscribe(new Observer<LoginNoParams>() {
//                                @Override
//                                public void onSubscribe(Disposable d) {
//
//                                }
//
//                                @Override
//                                public void onNext(LoginNoParams loginNoParams) {
//                                    if (loginNoParams.getCode() == 404) {
//                                        //这里表示请求无参接口成功
//                                        getMvpView().dismiss();
//                                    }
//                                }
//
//                                @Override
//                                public void onError(Throwable e) {
//                                    getMvpView().dismiss();
//                                    getMvpView().showToast("网络异常");
//                                    Log.e("yzx", "exception+" + e);
//                                }
//
//                                @Override
//                                public void onComplete() {
//
//                                }
//                            });
                }
            }, 300);
        }
    }

}
