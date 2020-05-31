package com.example.arish.Student_Helper;

import android.app.Activity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Stack;

public class per extends Activity implements TextWatcher {


    EditText txt_gpa11;
    TextView txt_per11;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_per);

        txt_gpa11 = (EditText) findViewById(R.id.txt_per211);
        txt_per11 = (TextView) findViewById(R.id.txt_gpa211);

        txt_gpa11.addTextChangedListener(this);
    }

    public void beforeTextChanged(CharSequence sequence, int start, int count, int after) {
    }

    public void afterTextChanged(Editable editable) {
    }

    public void onTextChanged(CharSequence sequence, int start, int before, int count) {
        calculate(8.8f, txt_per11);
    }

    public void calculate(float divi, TextView txtView) {
        if (txt_gpa11.getText().toString().trim().length() == 0) {
            txtView.setText("");
            return;
        }
        try {
            Stack<Object> stack = new Stack<Object>();
            float number = Float.parseFloat(txt_gpa11.getText().toString());
            float gpaa = number / divi;
            stack.push(gpaa);
            StringBuffer buffer = new StringBuffer();
            while (!stack.isEmpty()) {
                buffer.append(stack.pop().toString());
            }
            txtView.setText(buffer.toString()+" GPA");
        } catch (Exception e) {
            txtView.setText(e.getMessage());
        }
    }
}
