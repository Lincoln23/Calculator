package com.example.lincoln.mutiusecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void Buttonclick(View v){
        Button button= (Button) v;
        startActivity(new Intent(getApplicationContext(),Main2Activity.class));
    }
    public void RightButton(View v){
        Button button= (Button) v;
        startActivity(new Intent(getApplicationContext(),Main3Activity.class));
    }
}