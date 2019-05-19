package com.example.myapplication;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.myapplication.presenter.Presenter;

public class MainActivity extends AppCompatActivity implements IContract.IView{

    public static Context mContext;
      private Presenter presenter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mContext=MainActivity.this;
        presenter=new Presenter(this);
        presenter.startRequest(null);
    }

    @Override
    public void getData(String json) {
        
    }
}
