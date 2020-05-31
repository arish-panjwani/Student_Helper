package com.example.arish.Student_Helper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class about extends AppCompatActivity {

    private Button feat_button;
    private Button di_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        feat_button =(Button) findViewById(R.id.feat_button);
        feat_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_feat();

            }
        });
        di_button =(Button) findViewById(R.id.di_button);
        di_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_dev_info();

            }
        });
    }

    public void  openActivity_feat() {
        Intent intent_feat = new Intent(this, feat.class);
        startActivity(intent_feat);
    }
    public void openActivity_dev_info() {
        Intent intent_di = new Intent(this, dev_info.class);
        startActivity(intent_di);
    }
}
