package com.coffe.shentao.volly.http;

import java.io.InputStream;

/**
 * 封装响应
 */
public interface IHttpListener {
    //接收上一个接口的结果
    void onSuccess(InputStream inputStream);
    void onFailure();
}
