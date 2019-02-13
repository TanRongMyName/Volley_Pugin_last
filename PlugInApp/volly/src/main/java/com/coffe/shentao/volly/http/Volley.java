package com.coffe.shentao.volly.http;


public class Volley {
    public static <T,M> void sendJSONRequest(T requesetInof,String url,Class<M> response,IDataListener<M> dataListener){
           IHttpService httpService=new JsonHttpService();
           IHttpListener httpListener=new JsonHTTPListener<>(response,dataListener);
           HttpTask<T> httpTask=new HttpTask<T>(requesetInof,url,httpListener,httpService);
           ThreadPoolManager.getOurInstance().execute(httpTask);
    }
}
