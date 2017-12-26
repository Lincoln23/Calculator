package com.example.lincoln.mutiusecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main2Activity extends AppCompatActivity {
    int GCD (int a, int b){
        int c;
        while(b!=0){
            c=a%b;
            a=b;
            b=c;
        }
        return a;
    }
    EditText FirstNumber;
    EditText SecondNumber;
    TextView ResultGcd;
    TextView ResultLcm;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


        FirstNumber = (EditText)findViewById(R.id.FirstTextBox);
        SecondNumber = (EditText)findViewById(R.id.SecondTextBox);
        ResultGcd = (TextView)findViewById(R.id.resultGcd);
        ResultLcm = (TextView)findViewById(R.id.resultLcm);
        Button calcBtn = (Button) findViewById(R.id.button1);

        calcBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int firstNum = Integer.parseInt(FirstNumber.getText().toString());
                int secondNum = Integer.parseInt(SecondNumber.getText().toString());
                if(firstNum*secondNum >= Integer.MAX_VALUE){
                    Toast toast = Toast.makeText(getApplicationContext(),"Error: Value too large", Toast.LENGTH_LONG);
                    toast.show();
                }
                else{
                    int result = GCD(firstNum,secondNum);
                    int lcm = (firstNum/result)*secondNum;
                    ResultGcd.setText(Integer.toString(result));
                    ResultLcm.setText(Integer.toString(lcm));

                }
            }
        });
    }
}
