package com.coffe.shentao.volly.http.bean;

import android.util.Log;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class RequestInfo {
    String cityname;
    String dtype;
    int format;
    String key;

    public RequestInfo(String cityname, String dtype, int format, String key) {
        try {
            this.cityname = URLEncoder.encode(cityname,"utf-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
            Log.v("TanRong","cityname==="+cityname);
        }
        //this.cityname =cityname;
        this.dtype = dtype;
        this.format = format;
        this.key = key;
    }

    public String getCityname() {
        return cityname;
    }

    public void setCityname(String cityname) {
        this.cityname = cityname;
    }

    public String getDtype() {
        return dtype;
    }

    public void setDtype(String dtype) {
        this.dtype = dtype;
    }

    public int getFormat() {
        return format;
    }

    public void setFormat(int format) {
        this.format = format;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }
}
