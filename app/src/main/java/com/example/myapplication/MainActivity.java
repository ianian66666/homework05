package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;


import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
//import java.text.NumberFormat;

public class MainActivity extends AppCompatActivity {
    EditText year;                //宣告全域變數
    EditText month;                //宣告全域變數
    EditText day;
    EditText hour;                //宣告全域變數
    EditText minute;                //宣告全域變數
    EditText second;
    TextView output;
    TextView output2;
    TextView output3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        year = (EditText) findViewById(R.id.year);
        month = (EditText) findViewById(R.id.month);
        day = (EditText) findViewById(R.id.day);
        hour = (EditText) findViewById(R.id.hour);
        minute = (EditText) findViewById(R.id.minute);
        second = (EditText) findViewById(R.id.second);
        output = (TextView) findViewById(R.id.displayoutput);
        output2 = (TextView) findViewById(R.id.displayoutput2);
        output3 = (TextView) findViewById(R.id.displayoutput3);

        Button submit = (Button) findViewById(R.id.output);             // 取得按鈕物件
        submit.setOnClickListener(new Button.OnClickListener() {
            public void onClick(View arg0) {

                float h3 = Float.parseFloat(year.getEditableText().toString());      // 取得 輸入值

                //tv.setText((h1) +" / "+(w1)+" / "+(a1));
                output.setText(year.getText() + " / "+month.getText() + " / "+day.getText());
                // tv1.setText((h3) +" : "+(w3)+" : "+(a3));
                output2.setText(hour.getText() + " : "+minute.getText() + " : "+second.getText());
                float year=h3;
                if(year>0){
                    if((year%4==0)&&(year%100!=0)||(year%400==0)){
                        output3.setText("年份是閏年！");
                    }else{
                        output3.setText("年份不是閏年！");
                    }
                }
            }




        });
    }

}