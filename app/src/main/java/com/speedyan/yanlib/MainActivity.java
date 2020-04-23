package com.speedyan.yanlib;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.zxing.client.android.CaptureActivity;

public class MainActivity extends AppCompatActivity {
    private Button mQrCode;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mQrCode =findViewById(R.id.qrcode);
        mQrCode.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this, CaptureActivity.class);
                startActivityForResult(intent,0);
            }
        });
    }
}
