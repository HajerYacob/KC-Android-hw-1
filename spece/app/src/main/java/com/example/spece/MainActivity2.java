package com.example.spece;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);


// FIND VIWE BY
        TextView calcultor = findViewById(R.id.calcultor);
        EditText num1 = findViewById(R.id.num1);
        EditText num2 = findViewById(R.id.num2);
        EditText num3 = findViewById(R.id.num3);
        EditText num4 = findViewById(R.id.num4);
        Button calculate = findViewById(R.id.calculate);
        Button reset = findViewById(R.id.Reset);
        TextView fin = findViewById(R.id.fin);


// set on click
        reset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1.setText("");
                num2.setText("");
                num3.setText("");
                num4.setText("");
                fin.setText("");

            }
        });

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int a = Integer.parseInt(num1.getText().toString());
                int b = Integer.parseInt(num2.getText().toString());
                int c = Integer.parseInt(num3.getText().toString());
                int d = Integer.parseInt(num4.getText().toString());
                int x = a + b + c + d;
                fin.setText(String.valueOf(x + "%"));

                if (x < 90) {
                    Toast.makeText(MainActivity2.this, " its okey dear ", Toast.LENGTH_SHORT).show();
                } else if (x > 90) {
                    Toast.makeText(MainActivity2.this, " good job ", Toast.LENGTH_SHORT).show();

                }
            }
        });






    }
}