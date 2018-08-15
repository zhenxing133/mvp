package com.itwork.mvp.http;


import com.itwork.mvp.login.model.LoginBean;
import com.itwork.mvp.login.model.LoginNoParams;

import java.util.HashMap;
import java.util.Map;

import io.reactivex.Observable;

/**
 * Created by yuanzhenxing on
 *  @date 2018/08/15
 *   网络接口请求工具类
 *
 *     数据源有两个类，一个Observable，一个是Flowable 一个是Flowable能处理背压 用法基本一致 返回对应类型即可
 */

public class ApiUtils extends ApiBase{
    /**
     * 登录带参
     * @param pwd
     * @return
     */
    public static Observable<LoginBean> login(String pwd) {
        Map<String, String> map = new HashMap<>();
        map.put("tel", pwd);
        return getService().login(map);
    }

    /**
     * 登录不带参
     * @return
     */
    public static Observable<LoginNoParams> plogin() {
        return getService().plogin();
    }



}
