package com.client.views;

import android.app.AlertDialog;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.SeekBar;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class Scan1Activity extends AppCompatActivity implements View.OnClickListener{
    private Button menu,reScan,setWareStrength;
    private EditText palletID;
    private AlertDialog.Builder builder;
    private int seekBarValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scan1);
        palletID = (EditText) findViewById(R.id.palletID);
        menu = findViewById(R.id.menu);
        reScan = findViewById(R.id.reScan);
        setWareStrength = findViewById(R.id.setWareStrength);
        menu.setOnClickListener(this);
        reScan.setOnClickListener(this);
        setWareStrength.setOnClickListener(this);
        Log.d("value radio", String.valueOf(seekBarValue));
        builder = new AlertDialog.Builder(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.menu:
                Intent intentMenu = new Intent(this, MenuActivity.class);
                Scan1Activity.this.startActivity(intentMenu);
                break;
            case R.id.reScan:
                palletID.setText("1234567");
                break;
            case R.id.setWareStrength:
                setRadioWaveStrength();
                break;
        }
    }

    private void setRadioWaveStrength(){
        // Custom Title Area.
        LayoutInflater inflater = this.getLayoutInflater();
        View view = inflater.inflate(R.layout.activity_scan2, null);

        // create text view
        TextView textView = new TextView(this);
        textView.setText("Set Radio Wave Strength");
        textView.setPadding(20, 30, 20, 30);
        textView.setTextSize(30F);
        textView.setBackgroundColor(Color.rgb(0, 153, 255));
        textView.setTextColor(Color.WHITE);
        builder.setCustomTitle(textView);

        builder.setView(view);
//        builder.setCustomTitle(view);
        builder.setCancelable(true);
        // Create AlertDialog:
        AlertDialog alert = builder.create();
        alert.show();

        // process dialog
        // get id button Set
        Button backSet = view.findViewById(R.id.backSet);
        backSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                alert.hide();
            }
        });

        // get id Seekbar
        SeekBar seekBar = view.findViewById(R.id.seekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
                seekBarValue = progress;
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });

        Button backNoSet = view.findViewById(R.id.backNoSet);
        backNoSet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                seekBarValue = 0;
                alert.hide();
            }
        });


    }

}
