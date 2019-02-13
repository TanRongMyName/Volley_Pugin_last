package com.coffe.shentao.volly.http;
//回调调用成的结果
public interface  IDataListener<M> {
    void onSuccess(M m);
    void onFailuer();
}
