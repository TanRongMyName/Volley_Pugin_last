package com.coffe.shentao.pluginapp;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;

import java.io.File;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

import dalvik.system.DexClassLoader;

public class PluginManager {
    private Resources resources;
    private DexClassLoader dexClassLoader;
    private PackageInfo packageInfo;

    public PackageInfo getPackageInfo() {
        return packageInfo;
    }

    public Resources getResources() {
        return resources;
    }

    public void setResources(Resources resources) {
        this.resources = resources;
    }

    public DexClassLoader getDexClassLoader() {
        return dexClassLoader;
    }

    public void setDexClassLoader(DexClassLoader dexClassLoader) {
        this.dexClassLoader = dexClassLoader;
    }

    private static final PluginManager ourInstance = new PluginManager();

    public static PluginManager getInstance() {
        return ourInstance;
    }

    private PluginManager() {
    }
    private Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public void loadApk(String path){
        File dexOutFile=context.getDir("dex",Context.MODE_PRIVATE);
        PackageManager packageManager=context.getPackageManager();
        packageInfo=packageManager.getPackageArchiveInfo(path,PackageManager.GET_ACTIVITIES);
        //
        dexClassLoader=new DexClassLoader(path,dexOutFile.getAbsolutePath(),null,context.getClassLoader());
        try {
            AssetManager assetManager=AssetManager.class.newInstance();
            Method addAssetpath=AssetManager.class.getMethod("addAssetPath",String.class);
            addAssetpath.invoke(assetManager,path);
            resources=new Resources(assetManager,
                    context.getResources().getDisplayMetrics(),context.getResources().getConfiguration());
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }

    }
}
