package com.example.quadraticformula;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etAMain,etBMain,etCMain;
    Button btnCalculateMain;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        connectComponents();
    }
    private void connectComponents(){
        etAMain = findViewById(R.id.etAMain);
        etBMain = findViewById(R.id.etBMain);
        etCMain = findViewById(R.id.etCMain);
        btnCalculateMain = findViewById(R.id.btnCalculateMain);

    }

    public void calculate(View view) {
        String a = etAMain.getText().toString();
        String b = etBMain.getText().toString();
        String c = etCMain.getText().toString();
        double a1,b1,c1,delta,x1,x2;
        a1 = Double.parseDouble(a);
        b1 = Double.parseDouble(b);
        c1 = Double.parseDouble(c);

        delta = Math.pow(b1,2) - (4*a1*c1);
        if (delta < 0) {
            Toast.makeText(this, "no roots", Toast.LENGTH_SHORT).show();
            return;
        }
        x1 = (-b1 + Math.sqrt(delta))/(2*a1);
        x2 = (-b1 - Math.sqrt(delta))/(2*a1);

        if (x1 != x2) {
            Toast.makeText(this, "x1 = " + x1 + "x2 = " + x2, Toast.LENGTH_LONG).show();
            return;
        }
        Toast.makeText(this, "x = "+x1, Toast.LENGTH_LONG).show();
    }
}