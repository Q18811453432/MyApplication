package com.example.myapplication;

public interface IContract {
    interface IModel{
        void getData(String url,Callback callback);
    }
    interface IPresenter{
        void startRequest(String url);
        void onDetach();
    }
    interface IView{
        void getData(String json);
    }
    interface Callback{
        void saveData(String json);
    }
}
