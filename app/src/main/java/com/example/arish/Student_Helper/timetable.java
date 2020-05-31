package com.example.arish.Student_Helper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class timetable extends AppCompatActivity {
    private Button fe_button;
    private Button se_button;
    private Button te_button;
    private Button be_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timetable);

        fe_button =(Button) findViewById(R.id.fe_button);
        fe_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_fe_tt();

            }
        });
        se_button =(Button) findViewById(R.id.se_button);
        se_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_se_tt();

            }
        });
        te_button =(Button) findViewById(R.id.te_button);
        te_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_te_tt();

            }
        });
        be_button =(Button) findViewById(R.id.be_button);
        be_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_be_tt();

            }
        });
    }
    public void openActivity_fe_tt() {
        Intent intent_fe = new Intent(this, fe_tt.class);
        startActivity(intent_fe);
    }
    public void openActivity_se_tt() {
        Intent intent_se = new Intent(this, se_tt.class);
        startActivity(intent_se);
    }
    public void openActivity_te_tt() {
        Intent intent_te = new Intent(this, te_tt.class);
        startActivity(intent_te);
    }
    public void openActivity_be_tt() {
        Intent intent_be = new Intent(this, be_tt.class);
        startActivity(intent_be);
    }
}
