package com.example.arish.Student_Helper;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class gpa extends Activity implements TextWatcher {


    EditText txt_gpa;
    TextView txt_per;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gpa);

        txt_gpa = (EditText) findViewById(R.id.txt_per211);
        txt_per = (TextView) findViewById(R.id.txt_per);

        txt_gpa.addTextChangedListener(this);
    }

    public void beforeTextChanged(CharSequence sequence, int start, int count, int after) {
    }

    public void afterTextChanged(Editable editable) {
    }

    public void onTextChanged(CharSequence sequence, int start, int before, int count) {
        calculate(8.8f, txt_per);
    }

    public void calculate(float multi, TextView txtView) {
        if (txt_gpa.getText().toString().trim().length() == 0) {
            txtView.setText("");
            return;
        }
        try {
            Stack<Object> stack = new Stack<Object>();
            float number = Float.parseFloat(txt_gpa.getText().toString());
                float perc = number * multi;
                stack.push(perc);
            StringBuffer buffer = new StringBuffer();
            while (!stack.isEmpty()) {
                buffer.append(stack.pop().toString());
            }
            txtView.setText(buffer.toString()+" %");
        } catch (Exception e) {
            txtView.setText(e.getMessage());
        }
        }
}
