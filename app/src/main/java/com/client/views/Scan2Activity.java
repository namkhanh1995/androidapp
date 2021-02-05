package com.client.views;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.SeekBar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class Scan2Activity extends Dialog implements View.OnClickListener{
    public Activity c;
    public Scan2Activity(Activity a) {
        super(a);
        this.c = a;
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan2);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        Button backSet = findViewById(R.id.backSet);

//        no = (Button) findViewById(R.id.btn_no);
        backSet.setOnClickListener(this);
//        no.setOnClickListener(this);

    }
    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.backSet:
                Log.d("test","test");
                dismiss();
                break;
//            case R.id.btn_no:
//                dismiss();
//                break;
            default:
                break;
        }
        dismiss();
    }
//    private SeekBar seekBar;
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_scan2);
//        seekBar = findViewById(R.id.seekBar);
//        // set in intent
//        Intent intent = new Intent(this, Scan1Activity.class);
//        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//                // get value of SeekBar
//                String seekBarValue = String.valueOf(progress);
////                Bundle bundle = new Bundle();
////                bundle.putString("seekBarValue", seekBarValue);
////                intent.putExtras(bundle);
////                startActivity(intent);
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });
//
//
//
//    }
//    @Override
//    public void onClick(View v) {
//
//    }
}
