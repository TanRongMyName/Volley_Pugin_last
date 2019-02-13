package com.coffe.shentao.volly.http;

import android.util.Log;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;

public class JsonHttpService implements IHttpService{
    private String url;
    private byte[] requestData;
    private IHttpListener iHttpListener;



    @Override
    public void setUrl(String url) {
        this.url=url;
    }

    @Override
    public void setRequestData(byte[] requestData) {
           this.requestData=requestData;
    }
    @Override
    public void setHttpCallBack(IHttpListener listener) {
          this.iHttpListener=listener;
    }
    //真实的网络炒作
    @Override
    public void execute() {
        new Thread(new Runnable() {
            @Override
            public void run() {
                //postDownloadJson(JsonHttpService.this.url,null);
                httpUrlconnPost();
            }
        }).start();

    }
    private HttpURLConnection urlConnection=null;

    public void httpUrlconnPost(){
        URL url=null;
        Log.v("TanRong","Url==="+this.url);
        try{
            //"http://v.juhe.cn/weather/index?cityname=南京&dtype=json&format=1&key=a9ebf1d910df3aba91e18f7e4f0c8b3d"
            //                                cityname=南京&format=1&dtype=json&key=a9ebf1d910df3aba91e18f7e4f0c8b3d
            url=new URL(this.url+"?"+new String(requestData));
            //url=new URL(this.url);
            urlConnection=(HttpURLConnection)url.openConnection();//打开http连接
            urlConnection.setConnectTimeout(6000);//连接的超时时间
            urlConnection.setUseCaches(false);//bush不适用缓存
            urlConnection.setInstanceFollowRedirects(true);//成员函数仅作为当前函数
            urlConnection.setRequestMethod("POST");
            //urlConnection.setRequestMethod("GET");
            urlConnection.setRequestProperty("Content-Type", "application/x-www-form-urlencoded;charset=utf-8");
            urlConnection.setReadTimeout(6000);
            urlConnection.setDoInput(true);
            urlConnection.setDoOutput(true);
            urlConnection.connect();
            OutputStream out=urlConnection.getOutputStream();
            BufferedOutputStream bos=new BufferedOutputStream(out);
            if(requestData!=null){
                bos.write(requestData);
                Log.v("TanRong","requestData===="+new String(requestData));
            }
            bos.flush();
            out.close();
            bos.close();
            if(urlConnection.getResponseCode()==HttpURLConnection.HTTP_OK){
                InputStream in=urlConnection.getInputStream();
                iHttpListener.onSuccess(in);
                Log.v("TanRong","httpUrlconnPost---- 网络请求 ----"+urlConnection.getResponseCode());
            }
            Log.v("TanRong","httpUrlconnPost---- 网络请求 ----"+urlConnection.getResponseCode());
        } catch (Exception e) {
            e.printStackTrace();
            iHttpListener.onFailure();
        } finally {
            urlConnection.disconnect();
        }
    }


    /**
     * POST请求获取数据
     */
    public  String postDownloadJson(String path,String post){
        URL url = null;
        try {
            url = new URL(path);
            urlConnection= (HttpURLConnection) url.openConnection();
            urlConnection.setRequestMethod("GET");// 提交模式
            urlConnection.setConnectTimeout(10000);//连接超时 单位毫秒
            urlConnection.setReadTimeout(2000);//读取超时 单位毫秒
            // 发送POST请求必须设置如下两行
            urlConnection.setDoOutput(true);
            urlConnection.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            PrintWriter printWriter = new PrintWriter(urlConnection.getOutputStream());
            // 发送请求参数
            if(post!=null) {
                printWriter.write(post);//post的参数 xx=xx&yy=yy
                // flush输出流的缓冲
                printWriter.flush();
            }
            //开始获取数据
            BufferedInputStream bis = new BufferedInputStream(urlConnection.getInputStream());
            ByteArrayOutputStream bos = new ByteArrayOutputStream();
            int len;
            byte[] arr = new byte[1024];
            while((len=bis.read(arr))!= -1){
                bos.write(arr,0,len);
                bos.flush();
            }
            bos.close();
            Log.v("TanRong",bos.toString("utf-8"));
            return bos.toString("utf-8");
        } catch (Exception e) {
            e.printStackTrace();
        }finally {
            urlConnection.disconnect();
        }
        return null;
    }




}
