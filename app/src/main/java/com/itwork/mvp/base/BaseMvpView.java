package com.itwork.mvp.base;

/**
 * Created by yuanzhenxing on
 * @date 2018/05/22
 *   基类的view 所有view接口都必须实现
 */

public interface BaseMvpView {
    /**
     * 显示加载
     */
    void showLoading();

    /**
     * 完成加载后隐藏
     */
    void dismiss();
}
