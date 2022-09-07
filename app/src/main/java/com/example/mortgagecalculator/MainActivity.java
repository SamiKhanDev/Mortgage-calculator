package com.example.mortgagecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView textView;
    TextView textView2;
    TextView textView3;
    TextView textView4;
    TextView textView5;
    TextView textView6;
    TextView textView7;
    TextView textView8;
    TextView textView9;
    EditText etintrest;
    EditText etdownpayment;
    EditText etrepayment;
    EditText etprice;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView.findViewById(R.id.tvdown);
        textView2.findViewById(R.id.tvestimated);
        textView3.findViewById(R.id.tvintrest);
        textView4.findViewById(R.id.tvloan);
        textView5.findViewById(R.id.tvloanpay);
        textView6.findViewById(R.id.tvprice);
        textView7.findViewById(R.id.tvrepay);
        textView8.findViewById(R.id.tvmortgage);
        textView9.findViewById(R.id.tvpermonth);
        etintrest.findViewById(R.id.etintrest);
        etprice.findViewById(R.id.etprice);
        etdownpayment.findViewById(R.id.etdownpayment);
        etrepayment.findViewById(R.id.etrepaymenttime);



    }
}