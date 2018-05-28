package com.example.riyadh.calculator2;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = MainActivity.class.getSimpleName();
    private TextView inputTV, resultTV;
    private Button oneBT, twoBT, threeBT, fourBT, fiveBT, sixBT, sevenBT, eightBT, nineBT, zeroBT, plusBT, mulBT,
            minusBT, divBT, eqBT, delBT, clearBT, dotBT, ansBT;
    private String input = "";

    private Double result = 0.0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialization();
    }

    private void initialization() {
        inputTV = findViewById(R.id.inputTV);
        resultTV = findViewById(R.id.resultTV);
        oneBT = findViewById(R.id.oneBT);
        twoBT = findViewById(R.id.twoBT);
        threeBT = findViewById(R.id.threeBT);
        fourBT = findViewById(R.id.fourBT);
        fiveBT = findViewById(R.id.fiveBT);
        sixBT = findViewById(R.id.sixBT);
        sevenBT = findViewById(R.id.sevenBT);
        eightBT = findViewById(R.id.eightBT);
        nineBT = findViewById(R.id.nineBT);
        zeroBT = findViewById(R.id.zeroBT);
        plusBT = findViewById(R.id.plusBT);
        minusBT = findViewById(R.id.minusBT);
        mulBT = findViewById(R.id.mulBT);
        divBT = findViewById(R.id.divBT);
        dotBT = findViewById(R.id.dotBT);
        eqBT = findViewById(R.id.eqBT);
        ansBT = findViewById(R.id.ansBT);
        delBT = findViewById(R.id.delBT);
        clearBT = findViewById(R.id.clearBT);

        oneBT.setOnClickListener(this);
        twoBT.setOnClickListener(this);
        threeBT.setOnClickListener(this);
        fourBT.setOnClickListener(this);
        fiveBT.setOnClickListener(this);
        sixBT.setOnClickListener(this);
        sevenBT.setOnClickListener(this);
        eightBT.setOnClickListener(this);
        nineBT.setOnClickListener(this);
        zeroBT.setOnClickListener(this);
        plusBT.setOnClickListener(this);
        mulBT.setOnClickListener(this);
        divBT.setOnClickListener(this);
        minusBT.setOnClickListener(this);
        delBT.setOnClickListener(this);
        eqBT.setOnClickListener(this);
        clearBT.setOnClickListener(this);
        dotBT.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();

        if (id == R.id.oneBT) {
            setInput("1");
        } else if (id == R.id.twoBT) {
            setInput("2");
        } else if (id == R.id.threeBT) {
            setInput("3");
        } else if (id == R.id.fourBT) {
            setInput("4");
        } else if (id == R.id.fiveBT) {
            setInput("5");
        } else if (id == R.id.sixBT) {
            setInput("6");
        } else if (id == R.id.sevenBT) {
            setInput("7");
        } else if (id == R.id.eightBT) {
            setInput("8");
        } else if (id == R.id.nineBT) {
            setInput("9");
        } else if (id == R.id.zeroBT) {
            setInput("0");
        } else if (id == R.id.plusBT) {
            setInput("+");
        } else if (id == R.id.minusBT) {
            setInput("-");
        } else if (id == R.id.mulBT) {
            setInput("x");
        } else if (id == R.id.divBT) {
            setInput("÷");
        } else if (id == R.id.dotBT) {
            setInput(".");
        } else if (id == R.id.clearBT) {
            inputTV.setText("");
        } else if (id == R.id.delBT) {
            del();
        } else if (id == R.id.eqBT) {
            Log.e(TAG, "= pressed");
            math();
        }else if (id == R.id.ansBT) {
            makeAns();
        }
    }
    private void makeAns(){
        input =String.valueOf(result);
        inputTV.setText(input);

    }
    private void math() {
        char[] chars = input.toCharArray();
        if (Character.isDigit(chars[0]) && Character.isDigit(chars[input.length() - 1])) {
            for (int i = 0; i < chars.length; i++) {

                if (chars[i] == '+' || chars[i] == '-' || chars[i] == 'x' || chars[i] == '÷') {
                    String firstOne = input.substring(0, i);
                    String secOne = input.substring(i + 1, chars.length);

                    Double firstNum= Double.parseDouble(firstOne);
                    Double secNum= Double.parseDouble(secOne);
                    makeResult(firstNum,secNum,chars[i]);

                    Log.e(TAG, firstOne+" "+secOne);
                }
            }
        }
        else Toast.makeText(getApplicationContext(), "Invalid", Toast.LENGTH_SHORT).show();
    }

    private void makeResult(Double firstNum, Double secNum,char op) {
        if(op=='+'){
            result= firstNum + secNum;
        }else if(op=='-'){
            result= firstNum - secNum;
        }else if(op=='x'){
            result= firstNum * secNum;
        }else if(op=='÷'){
            result= firstNum / secNum;
        }
        Log.e(TAG, String.valueOf(result));

        resultTV.setText(String.valueOf(result));
    }

    private void del() {

        if (input != null && input.length() > 0) {
            input = input.substring(0, (input.length() - 1));
            inputTV.setText(input);
        }
    }

    private void setInput(String s) {
        input += s;
        inputTV.setText(input);
        Log.e(TAG, s + "pressed");
    }
}
