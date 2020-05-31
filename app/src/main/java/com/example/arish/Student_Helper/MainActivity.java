package com.example.arish.Student_Helper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button calc_button;
    private Button gpa1_button;
    private Button no_sys_button;
    private Button per_button;
    private Button tt_button;
    private Button about_button;
    private Button db_button2;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        calc_button =(Button) findViewById(R.id.calc_button);
        calc_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_calculator();

            }
        });
        gpa1_button =(Button) findViewById(R.id.gpa1_button);
        gpa1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_gpa1();

            }
        });
        per_button =(Button) findViewById(R.id.per_button);
        per_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_per();

            }
        });
        no_sys_button =(Button) findViewById(R.id.no_sys_button);
        no_sys_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_noconv();
            }
        });
        tt_button =(Button) findViewById(R.id.tt_button);
        tt_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_timetable();

            }
        });
        about_button =(Button) findViewById(R.id.about_button);
        about_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_about();

            }
        });
        db_button2 =(Button) findViewById(R.id.db_button2);
        db_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_db2();

            }
        });

    }
    public void openActivity_calculator() {
        Intent intent1 = new Intent(this, Calculator.class);
        startActivity(intent1);
    }
    public void openActivity_gpa1() {
        Intent intent2 = new Intent(this, gpa.class);
        startActivity(intent2);
    }
    public void openActivity_per() {
        Intent intent3 = new Intent(this, per.class);
        startActivity(intent3);
    }
    public void openActivity_noconv() {
        Intent intent4 = new Intent(this, no_conv.class);
        startActivity(intent4);
    }
    public void openActivity_timetable() {
        Intent intent5 = new Intent(this, timetable.class);
        startActivity(intent5);
    }
    public void openActivity_about() {
        Intent intent_about = new Intent(this, about.class);
        startActivity(intent_about);
    }
    public void openActivity_db2() {
        Intent intent_db2 = new Intent(this, db2.class);
        startActivity(intent_db2);
    }
}
