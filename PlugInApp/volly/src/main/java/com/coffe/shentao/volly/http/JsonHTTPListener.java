package com.coffe.shentao.volly.http;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import com.alibaba.fastjson.JSON;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class JsonHTTPListener<M> implements IHttpListener {
    Class<M> responseClass;
    IDataListener<M> dataListener;

    public void setDataListener(IDataListener<M> dataListener) {
        this.dataListener = dataListener;
    }

    //用于切换线程
    Handler handler=new Handler(Looper.getMainLooper());

    public JsonHTTPListener(Class<M> responseClass, IDataListener dataListener) {
        this.responseClass = responseClass;
        this.dataListener = dataListener;
    }

    @Override
    public void onSuccess(InputStream inputStream) {
       //获取响应结果 ，把byte 数据转为string数据
        String content =getContent(inputStream);
        //结果（json 字符串 转换成对象）
        final M response = JSON.parseObject(content,responseClass);
        handler.post(new Runnable() {
            @Override
            public void run() {
                if(dataListener!=null) {
                    dataListener.onSuccess(response);
                }
            }
        });

    }

    private String getContent(InputStream inputStream) {
         String content=null;
         try {
             BufferedReader reader = new BufferedReader(new InputStreamReader(inputStream));
             StringBuilder sb = new StringBuilder();
             String line = null;
             try {
                 while ((line = reader.readLine()) != null) {
                     sb.append(line + "\n");
                 }
             } catch (IOException e) {
                 System.out.println("Error=" + e.toString());
             } finally {
                 try {
                     inputStream.close();
                 } catch (IOException e) {
                     System.out.println("Error=" + e.toString());
                 }
             }
             Log.v("TanRong","JsonHTTPListener content===="+sb.toString());
             return sb.toString();
         }catch (Exception e){
             e.printStackTrace();
         }

         return content;
    }

    @Override
    public void onFailure() {
          //把结果传输到调用层
        handler.post(new Runnable() {
            @Override
            public void run() {
                if(dataListener!=null) {
                    dataListener.onFailuer();
                }
            }
        });

    }
}
