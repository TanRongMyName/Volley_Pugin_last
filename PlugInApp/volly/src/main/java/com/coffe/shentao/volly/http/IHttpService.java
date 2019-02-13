package com.coffe.shentao.volly.http;

public interface IHttpService {
    void setUrl(String url);//设置URL
    void setRequestData(byte[] requestData); //返回参数
    void execute();//执行网络请求

    //需要设置两个接口之间的关系
    void setHttpCallBack(IHttpListener listener);
}
