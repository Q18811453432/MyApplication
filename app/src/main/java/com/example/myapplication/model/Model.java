package com.example.myapplication.model;

import com.example.myapplication.IContract;
import com.example.myapplication.MainActivity;
import com.example.myapplication.VolleyUtil;

public class Model implements IContract.IModel{
    @Override
    public void getData(String url, final IContract.Callback callback) {
        VolleyUtil.getInstance().getUrl(url, MainActivity.mContext, new VolleyUtil.VolleyCallback() {
            @Override
            public void setResult(String jsonstr) {
               callback.saveData(jsonstr);
            }
        });
    }
}
