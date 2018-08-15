package com.itwork.mvp.login.model;

/**
 * Created by yuan.zhen.xing on 2018-08-15.
 */

public class LoginNoParams {

    /**
     * msg : 用户不存在!!!
     * code : 404
     */

    private String msg;
    private int code;

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }
}
