package com.example.laundryui;


import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView tx1;
    TextView tx2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);
        tx1=(ImageView)findViewById(R.id.icon);
        tx2=(TextView)findViewById(R.id.textView);
        tx1.setVisibility(View.VISIBLE);
        tx2.setVisibility(View.VISIBLE);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent =new Intent(MainActivity.this,MainActivity2.class);
                startActivity(intent);
                onBackPressed();
            }
        },2000);
    }
}