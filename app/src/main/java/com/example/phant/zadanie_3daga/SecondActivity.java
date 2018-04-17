package com.example.phant.zadanie_3daga;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class SecondActivity extends Activity {

    TextView txt5,txt7;
    EditText edt4;
    Button btn2;


    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.second_activity);

        txt5 = (TextView) findViewById(R.id.textView5);
        txt7 = (TextView) findViewById(R.id.textView7);

        edt4 = (EditText) findViewById(R.id.editText4);

        btn2 = (Button) findViewById(R.id.button2);

        Intent intent2 = getIntent();


        Bundle bundle = intent2.getExtras();
        String first = bundle.getString("Imię");
        String last = bundle.getString("Miejsce");
        String dob = bundle.getString("Data");

        txt5.setText(":  "+first.toString());
        txt7.setText(":  "+last.toString());

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent();
                intent2.putExtra("confirmation", edt4.getText().toString());
                setResult(1, intent2);

                finish();
            }
        });

    }
}