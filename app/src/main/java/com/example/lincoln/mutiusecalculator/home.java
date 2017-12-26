package com.example.lincoln.mutiusecalculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home_page);
    }
    public void Buttonclick(View v){
        Button button= (Button) v;
        startActivity(new Intent(getApplicationContext(),GcdLcm.class));
    }
    public void RightButton(View v){
        Button button= (Button) v;
        startActivity(new Intent(getApplicationContext(),NthRoot.class));
    }
}
