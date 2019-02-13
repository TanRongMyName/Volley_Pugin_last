package com.coffe.shentao.pluginapp;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.Log;

import com.coffe.shentao.paystand.PayInterface;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ProxyActivity extends Activity {
    //com.coffe.shentao.volly.MainActivity
    private String classesName;
    PayInterface payInterface;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        classesName=getIntent().getStringExtra("className");
        try {
            Class activityClass=getClassLoader().loadClass(classesName);
            Constructor constructor=activityClass.getConstructor(new Class[]{});
            Object instance=constructor.newInstance(new Object[]{});
            //标准
            payInterface= (PayInterface) instance;
            payInterface.attach(this);
            //传递参数
            Bundle bundle=new Bundle();
            payInterface.onCreate(bundle);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }

    @Override
    protected void onStart() {
        super.onStart();
        payInterface.onStart();
    }

    @Override
    protected void onPause() {
        super.onPause();
        payInterface.onPause();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        payInterface.onDestory();
    }

    @Override
    public void startActivity(Intent intent) {
       // super.startActivity(intent);
        //接收冲插件传递过来的  Activity  全类名
        String classesName1=intent.getStringExtra("className");
        Intent intent1=new Intent(this,ProxyActivity.class);
        intent1.putExtra("className",classesName1);
        //下面调用super
        Log.v("TanRong","className==="+classesName1);
        super.startActivity(intent1);
    }

    @Override
    public ClassLoader getClassLoader() {
        return PluginManager.getInstance().getDexClassLoader();
    }

    @Override
    public Resources getResources() {
        return PluginManager.getInstance().getResources();
    }
}
