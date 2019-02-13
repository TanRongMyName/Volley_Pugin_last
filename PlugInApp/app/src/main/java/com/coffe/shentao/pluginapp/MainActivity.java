package com.coffe.shentao.pluginapp;

import android.Manifest;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import java.io.File;

public class MainActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        PluginManager.getInstance().setContext(this);
    }


    public void onLoadPlugin(View view) {
         File file=new File(Environment.getExternalStorageDirectory(),"plugin.apk");
         PluginManager.getInstance().loadApk(file.getAbsolutePath());
         //多个插件
    }

    public void onJump(View view) {
             Intent intent=new Intent(this,ProxyActivity.class);
             intent.putExtra("className",PluginManager.getInstance().getPackageInfo().activities[0].name);
             startActivity(intent);
    }
    private String[] cameraPermissions = {
            Manifest.permission.READ_EXTERNAL_STORAGE,Manifest.permission.WRITE_EXTERNAL_STORAGE,Manifest.permission.INTERNET
    };
    private boolean hasRequestPermission=false;
    @Override
    protected void onResume() {
        super.onResume();
        if (checkDangerousPermissions(this, cameraPermissions)){

        }else {
            if (!hasRequestPermission){
                showScanCodeTip();
            }
        }
    }
    private void showScanCodeTip() {
        ScanCodeTipDialog dialog = new ScanCodeTipDialog();
        dialog.setOnDismissListener(new DialogInterface.OnDismissListener() {
            @Override
            public void onDismiss(DialogInterface dialog) {
                hasRequestPermission = true;
                requestDangerousPermissions(cameraPermissions, REQUEST_CODE_CAMERA);
            }
        });
        dialog.show(getSupportFragmentManager(), MainActivity.class.getSimpleName());
    }

    @Override
    public boolean handlePermissionResult(int requestCode, boolean granted) {
        if (requestCode == REQUEST_CODE_CAMERA){
            if (!granted){
                finish();
            }
            return true;
        }
        return super.handlePermissionResult(requestCode, granted);
    }
}
