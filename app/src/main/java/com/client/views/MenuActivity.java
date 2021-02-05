package com.client.views;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


import androidx.appcompat.app.AppCompatActivity;


public class MenuActivity extends AppCompatActivity implements View.OnClickListener {
    private Button mButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        mButton = findViewById(R.id.startScan);
        mButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.startScan:
                Intent intent = new Intent(this, Scan1Activity.class);
                MenuActivity.this.startActivity(intent);
        }
    }
}