package com.example.asd.first1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //根据作业修改意见进行的修改：原算法中有6个按钮，每一个按钮的点击都会产生一个Toast消息，这样会有一些麻烦。
    //修改日期：2016-06-29
    public void showToastMessage(String text) {
        Toast toast = Toast.makeText(getApplicationContext(), text, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void showToastPopularMovie(View view) {
        showToastMessage("Popular Movie Message");
    }

    public void showStockHawk(View view) {
        showToastMessage("Stock Hawk Message");
    }

    public void showBuildItBigger(View view) {
        showToastMessage("Build It Bigger Message");
    }

    public void showMakeYourAppMaterial(View view) {
        showToastMessage("Make Your App Material Message");
    }

    public void showGoUbiquitous(View view) {
        showToastMessage("Go Ubiquitous Message");
    }

    public void showCapston(View view) {
        showToastMessage("Capston Message");
    }
}
