package com.coffe.shentao.volly.http;

import android.util.Log;

import com.alibaba.fastjson.JSON;

import java.io.UnsupportedEncodingException;
import java.util.Map;

public class HttpTask <T> implements Runnable {
    private IHttpListener iHttpListener;
    private IHttpService iHttpService;

    public <T>HttpTask( T requestInfo,String url,IHttpListener iHttpListener,IHttpService iHttpService){
         this.iHttpListener=iHttpListener;
         this.iHttpService=iHttpService;
         iHttpService.setUrl(url);
         iHttpService.setHttpCallBack(iHttpListener);
         if(requestInfo!=null){//将对象转换为字符串
             String requestContent= JSON.toJSONString(requestInfo);
             requestContent=getParamter(requestContent);
             Log.v("TanRong","requestContent=="+requestContent);
             //将 JSON 数据转为 HashMap --- 组合成 String 对象
             try {

                 iHttpService.setRequestData(requestContent.getBytes("utf-8"));
             } catch (UnsupportedEncodingException e) {
                 e.printStackTrace();
             }

         }
    }
    @Override
    public void run() {
         iHttpService.execute();
    }
    public String getParamter(String Json){
        //第一种方式
        Map maps = (Map)JSON.parse(Json);
        System.out.println("这个是用JSON类来解析JSON字符串!!!");
        StringBuilder sb=new StringBuilder();
        for (Object map : maps.entrySet()){
            sb.append(((Map.Entry)map).getKey()).append("=").append(((Map.Entry)map).getValue()).append("&");
        }
        return sb.substring(0,sb.length()-1).toString();
    }
}

