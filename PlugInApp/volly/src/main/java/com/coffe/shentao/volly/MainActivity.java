package com.coffe.shentao.volly;


import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Toast;

import com.coffe.shentao.volly.http.IDataListener;
import com.coffe.shentao.volly.http.Volley;
import com.coffe.shentao.volly.http.bean.RequestInfo;
import com.coffe.shentao.volly.http.bean.Weather;

/**
 * 手写Volly 网络框架
 * https://www.juhe.cn/docs/api/id/39  聚合网站 获取Json数据 用户名：TanRongMyName  password:177266aa22aa
 */
public class MainActivity extends BaseActivity {
    String url="http://v.juhe.cn/weather/index";
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(that,"点击了APP",Toast.LENGTH_LONG).show();

                Volley.sendJSONRequest(new RequestInfo("南京","json",1,"a9ebf1d910df3aba91e18f7e4f0c8b3d"), url, Weather.class, new IDataListener<Weather>() {
                    @Override
                    public void onSuccess(Weather weather) {
                        Log.i("jett",weather.toString());
                        Toast.makeText(that,"city:=="+weather.getResult().getToday().getCity()+"" +
                                " 今天的温度是："+weather.getResult().getToday().getTemperature(),Toast.LENGTH_SHORT).show();
                    }

                    @Override
                    public void onFailuer() {
                        Log.i("jett","failure");
                    }
                });
                //跳转到 其他的Activity
                startActivity(new Intent(that,SecondActivity.class));
            }
        });
    }
    public void onPull(View view){
        Log.v("TanRong","点击了俺奶奶");

//        Volley.sendJSONRequest(null, url, Weather.class, new IDataListener<Weather>() {
//            @Override
//            public void onSuccess(Weather weather) {
//                Log.i("jett",weather.toString());
//                Toast.makeText(MainActivity.this,"city:=="+weather.getResult().getToday().getCity()+"" +
//                        " 今天的温度是："+weather.getResult().getToday().getTemperature(),Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onFailuer() {
//                Log.i("jett","failure");
//            }
//        });


//        Volley.sendJSONRequest(new RequestInfo("南京","json",1,"a9ebf1d910df3aba91e18f7e4f0c8b3d"), url, Weather.class, new IDataListener<Weather>() {
//            @Override
//            public void onSuccess(Weather weather) {
//                Log.i("jett",weather.toString());
//                Toast.makeText(MainActivity.this,"city:=="+weather.getResult().getToday().getCity()+"" +
//                        " 今天的温度是："+weather.getResult().getToday().getTemperature(),Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onFailuer() {
//                Log.i("jett","failure");
//            }
//        });
        Toast.makeText(that,"点击了APP",Toast.LENGTH_LONG).show();
    }
}
