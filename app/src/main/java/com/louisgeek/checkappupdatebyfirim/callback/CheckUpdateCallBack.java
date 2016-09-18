package com.louisgeek.checkappupdatebyfirim.callback;

/**
 * Created by louisgeek on 2016/9/18.
 */
public abstract class CheckUpdateCallBack {
    public  abstract void OnSuccess(String result,int statusCode);

    public  abstract void OnSuccessNotifyUI(String result,int statusCode);

    public  abstract void OnError(String errorMsg,int statusCode);

    public  abstract void OnErrorNotifyUI(String errorMsg,int statusCode);
}
