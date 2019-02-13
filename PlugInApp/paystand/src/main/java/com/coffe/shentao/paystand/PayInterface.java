package com.coffe.shentao.paystand;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;

//标注  实现 接口 才能接入插件化
public interface PayInterface {
    /**
     * 注入上下文
     * @param proxyActivity
     */
    public void attach(Activity proxyActivity);

    /**
     * 关联生命周期
     * @param savedInstanceState
     */
    public void onCreate(Bundle savedInstanceState);
    public void onStart();
    public void onResume();
    public void onPause();
    public void onStop();
    public void onDestory();
    public void onSaveInstanceState(Bundle outState);
    public boolean onTouchEvent(MotionEvent event);
    public void onBackPressed();
}
