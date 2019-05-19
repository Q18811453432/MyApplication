package com.example.myapplication.presenter;

import com.example.myapplication.IContract;
import com.example.myapplication.model.Model;

import java.lang.ref.SoftReference;

public class Presenter implements IContract.IPresenter {
    private Model model;
    private IContract.IView iView;
    private SoftReference<IContract.IView> softReference;
    public Presenter(IContract.IView view){
        model=new Model();
        this.iView=view;
          softReference=new SoftReference<>(iView);
    }
    @Override
    public void startRequest(String url) {
        model.getData(url, new IContract.Callback() {
            @Override
            public void saveData(String json) {
                iView.getData(json);
            }
        });
    }

    @Override
    public void onDetach() {
     if (softReference!=null){
         softReference.clear();
     }
     if (model!=null){
         model=null;
     }
    }
}
