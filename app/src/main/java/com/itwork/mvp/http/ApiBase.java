package com.itwork.mvp.http;

import com.itwork.mvp.ui.Constant;

import java.util.concurrent.TimeUnit;

import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.converter.scalars.ScalarsConverterFactory;

/**
 * Created by yuanzhenxing on
 * @date 2018/08/15
 *   网络接口请求基类
 *    提供了一个空参的和一个有参的构造方法 特定的接口就可以直接传
 */

public class ApiBase{


    protected static IApiService getService() {  //拿到api接口类
        return getService(null);
    }

    protected static IApiService getService(String ip) {
        return getService(ip, 0, 0);
    }

    protected static IApiService getService(String ip, long readTime, long connectTime) {
          OkHttpClient client = new OkHttpClient.Builder().readTimeout(readTime <= 0 ? 30 : readTime, TimeUnit.SECONDS)
                .connectTimeout(connectTime <= 0 ? 30 : connectTime, TimeUnit.SECONDS)
                .build();
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(ip == null ? Constant.BASE_IP : ip)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())//添加RxJava
                .addConverterFactory(ScalarsConverterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())//添加数据解析ConverterFactory
                .build();

        return retrofit.create(IApiService.class);
    }
}
