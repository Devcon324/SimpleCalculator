package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private enum Operator {none, add, minus, multiply, divide}
    private double data1 = 0;
    protected double data2 = 0;
    private Operator operator = Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    // onClick method for 0 button
    public void btn00Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(String.format("%s0", eText.getText()));
    }
    // onClick method for 1 button
    public void btn01Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(String.format("%s1", eText.getText()));
    }
    // onClick method for 2 button
    public void btn02Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(String.format("%s2", eText.getText()));
    }
    // onClick method for 3 button
    public void btn03Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(String.format("%s3", eText.getText()));
    }
    // onClick method for 4 button
    public void btn04Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(String.format("%s4", eText.getText()));
    }
    // onClick method for 5 button
    public void btn05Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(String.format("%s5", eText.getText()));
    }
    // onClick method for 6 button
    public void btn06Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(String.format("%s6", eText.getText()));
    }
    // onClick method for 7 button
    public void btn07Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(String.format("%s7", eText.getText()));
    }
    // onClick method for 8 button
    public void btn08Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(String.format("%s8", eText.getText()));
    }
    // onClick method for 9 button
    public void btn09Click(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(String.format("%s9", eText.getText()));
    }
    // onClick method for add button
    public void btnAddClick(View view) {
        operator = Operator.add;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    // onClick method for minus button
    public void btnMinusClick(View view) {
        operator = Operator.minus;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    // onClick method for multiply button
    public void btnMultiplyClick(View view) {
        operator = Operator.multiply;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    // onClick method for divide button
    public void btnDivideClick(View view) {
        operator = Operator.divide;
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        data1 = Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }
    // onClick method for clear button
    public void btnClearClick(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText("");
    }
    // onClick method for dot button
    public void btnDotClick(View view) {
        EditText eText = (EditText)findViewById(R.id.resultEdit);
        eText.setText(String.format("%s.", eText.getText()));
    }
    // onClick method for result button
    public void btnResultClick(View view) {
        if (operator != Operator.none) {
            EditText eText = (EditText) findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(eText.getText().toString());
            double result = 0;
            if (operator == Operator.add) {
                result = data1 + data2;
            } else if (operator == Operator.minus) {
                result = data1 - data2;
            } else if (operator == Operator.multiply) {
                result = data1 * data2;
            } else if (operator == Operator.divide) {
                result = data1 / data2;
            }
            eText.setText(String.valueOf(result));
        }
    }
}
