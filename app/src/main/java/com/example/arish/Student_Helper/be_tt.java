package com.example.arish.Student_Helper;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class be_tt extends AppCompatActivity {
    private Button be1_button;
    private Button be2_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_be_tt);

        be1_button = (Button) findViewById(R.id.be1_button);
        be1_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_be1_tt();
            }
        });
        be2_button = (Button) findViewById(R.id.be2_button);
        be2_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity_be2_tt();
            }
        });
    }
    public void openActivity_be1_tt() {
        Intent intent_be1 = new Intent(this, be1_tt.class);
        startActivity(intent_be1);
    }
    public void openActivity_be2_tt() {
        Intent intent_be2 = new Intent(this, be2_tt.class);
        startActivity(intent_be2);
    }
}
