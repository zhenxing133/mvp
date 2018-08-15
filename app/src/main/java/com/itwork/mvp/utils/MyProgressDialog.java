package com.itwork.mvp.utils;


import android.app.Dialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.Window;
import android.widget.TextView;

import com.itwork.mvp.R;


/**
 * @author yuanzhenxing
 * Created by ZJHL on 2016/11/11.
 * 登录的dialog
 */

public class MyProgressDialog {

     Dialog mDialog;
     TextView mProcessDesc;

    public MyProgressDialog(Context context, String msg) {
        if (mDialog == null) {
            mDialog = new Dialog(context);
            mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
            mDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
            mDialog.setContentView(R.layout.process_bar_big);
            mDialog.setCancelable(false);
            mProcessDesc = (TextView) mDialog.findViewById(R.id.dialog_process_desc);
            mProcessDesc.setText(msg);
        }
    }

     public void show(){
         mDialog.show();
    }

    /**
     * 此处用了hide，没用dismiss是因为
     * 如果用户在取消后再进行请求操作的话当前页面没从新创建progressDialog是不会再转的，使用hide则不会出现这个现象
     */
    public void dismiss(){
        mDialog.dismiss();
    }
}
