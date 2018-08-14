package com.itwork.mvp;

/**
 * @author wwt
 * @date 2018/5/24
 */
public class RegisterBean {

    /**
     * msg : string
     * returnCode : string
     * t : {}
     */

    private String msg;
    private String returnCode;

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setReturnCode(String returnCode) {
        this.returnCode = returnCode;
    }

    public String getMsg() {
        return msg;
    }

    public String getReturnCode() {
        return returnCode;
    }
}
