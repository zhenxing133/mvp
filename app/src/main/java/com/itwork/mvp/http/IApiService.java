package com.itwork.mvp.http;


import com.itwork.mvp.login.model.LoginBean;
import com.itwork.mvp.login.model.LoginNoParams;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.GET;
import retrofit2.http.QueryMap;

/**
 * Created by yuanzhenxing on
 *  @date 2018/08/15
 *  网络接口请求服务类
 */

public interface IApiService {

    /** 带参登录 */
    @GET("util/getAllApplicationInfo")
    Observable<LoginBean> login(@QueryMap Map<String, String> map);

    /**无参登录*/
    @GET("util/getAllApplicationInfo")
    Observable<LoginNoParams> plogin();

}
