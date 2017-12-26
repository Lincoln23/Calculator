package com.example.lincoln.mutiusecalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Main3Activity extends AppCompatActivity {

    float power( float base, int ex){
        int i = 1;
        float result = base;
        while ( i < ex){
            result *= base;
            i++;
        }
        return result;
    }

    float NthRoot(float S, int N, float precision) {
        float guess = 1;
        float guessPrecision;
        int k =0;
        do {
            guess = (((N-1)*guess)/N)+(S/(N*power(guess,N-1)));
            guessPrecision = ((S - power(guess,N))/S);
            if(guessPrecision<0){
                guessPrecision *= -1;
            }
        }
        while(guessPrecision > precision && k < 10000);
        return guess;
    }

    EditText nthRoot;
    EditText enterNumber;
    EditText enterPrecision;
    TextView result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        nthRoot = (EditText)findViewById(R.id.nthRoot);
        enterNumber = (EditText)findViewById(R.id.enterNumber);
        enterPrecision = (EditText)findViewById(R.id.enterPrecision);
        result = (TextView)findViewById(R.id.result);
        Button calc = (Button) findViewById(R.id.calc);

        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int nth = Integer.parseInt(nthRoot.getText().toString());
                Float number = Float.parseFloat(enterNumber.getText().toString());
                Float preceision = Float.parseFloat(enterPrecision.getText().toString());

                float resultIs = NthRoot(number,nth,preceision);
                result.setText(Float.toString(resultIs));
            }
        });
    }
}


