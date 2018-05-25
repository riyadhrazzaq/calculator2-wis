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
    private String result = "";


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
    }

    @Override
    public void onClick(View v) {
        int id = v.getId();
        if (id == R.id.oneBT) {
            Log.e(TAG, "one passed");
            Toast.makeText(getApplicationContext(), "one passed", Toast.LENGTH_LONG).show();
        } else if (id == R.id.twoBT) {
            Log.e(TAG, "two passed");
            Toast.makeText(getApplicationContext(), "two passed", Toast.LENGTH_LONG).show();
        } else if (id == R.id.threeBT) {
            Log.e(TAG, "three passed");
            Toast.makeText(getApplicationContext(), "three passed", Toast.LENGTH_LONG).show();
        } else if (id == R.id.fourBT) {
            Log.e(TAG, "four passed");
            Toast.makeText(getApplicationContext(), "four passed", Toast.LENGTH_LONG).show();
        } else if (id == R.id.fiveBT) {
            Log.e(TAG, "five passed");
            Toast.makeText(getApplicationContext(), "five passed", Toast.LENGTH_LONG).show();
        } else if (id == R.id.sixBT) {
            Log.e(TAG, "six passed");
            Toast.makeText(getApplicationContext(), "six passed", Toast.LENGTH_LONG).show();
        } else if (id == R.id.sevenBT) {
            Log.e(TAG, "seven passed");
            Toast.makeText(getApplicationContext(), "seven passed", Toast.LENGTH_LONG).show();
        } else if (id == R.id.eightBT) {
            Log.e(TAG, "eight passed");
            Toast.makeText(getApplicationContext(), "eight passed", Toast.LENGTH_LONG).show();
        } else if (id == R.id.nineBT) {
            Log.e(TAG, "nine passed");
            Toast.makeText(getApplicationContext(), "nine passed", Toast.LENGTH_LONG).show();
        } else if (id == R.id.zeroBT) {
            Log.e(TAG, "zero passed");
            Toast.makeText(getApplicationContext(), "one passed", Toast.LENGTH_LONG).show();
        }
    }
}
