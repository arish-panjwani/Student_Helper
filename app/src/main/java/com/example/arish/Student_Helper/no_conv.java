package com.example.arish.Student_Helper;

import java.util.Stack;
import android.app.Activity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;
import android.text.Editable;
import android.text.TextWatcher;

public class no_conv extends Activity implements TextWatcher{
    EditText txtDecimal;
    TextView txtBinary, txtOctal, txtHexadecimal;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_no_conv);
        txtDecimal = (EditText) findViewById(R.id.txtDecimal);
        txtBinary = (TextView) findViewById(R.id.txtBinary);
        txtOctal = (TextView) findViewById(R.id.txtOctal);
        txtHexadecimal = (TextView) findViewById(R.id.txtHexadecimal);
        txtDecimal.addTextChangedListener(this);
    }

    public void beforeTextChanged(CharSequence sequence, int start, int count, int after) {
    }

    public void afterTextChanged(Editable editable) {
    }

    public void onTextChanged(CharSequence sequence, int start, int before, int count) {
        calculate(2, txtBinary);        // for base 2 (binary)
        calculate(8, txtOctal);        // for base 8 (octal)
        calculate(16, txtHexadecimal);    // for base 16 (hexadecimal)
    }

    public void calculate(int base, TextView txtView) {
        if (txtDecimal.getText().toString().trim().length() == 0) {
            txtView.setText("");
            return;
        }
        try {
            Stack<Object> stack = new Stack<Object>();
            int number = Integer.parseInt(txtDecimal.getText().toString());
            while (number > 0) {
                int remainder = number % base; // find remainder
                if (remainder < 10)
                // for remainder smaller than 10
                {
                    stack.push(remainder);
                    // push remainder in stack
                } else {
                    switch (remainder)
                    // for remainder larger than 9 (for hexadecimal values)
                    {
                        case 10:
                            stack.push("A");
                            break;
                        case 11:
                            stack.push("B");
                            break;
                        case 12:
                            stack.push("C");
                            break;
                        case 13:
                            stack.push("D");
                            break;
                        case 14:
                            stack.push("E");
                            break;
                        case 15:
                            stack.push("F");
                            break;
                    }
                }
                number /= base;
            }
            StringBuffer buffer = new StringBuffer();
            while (!stack.isEmpty()) {
                buffer.append(stack.pop().toString());
            }
            txtView.setText(buffer.toString());
        } catch (Exception e) {
            txtView.setText(e.getMessage());
        }
    }

}