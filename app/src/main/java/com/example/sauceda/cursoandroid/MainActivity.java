package com.example.sauceda.cursoandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.sauceda.cursoandroid.actividades.SegundaActivity;

public class MainActivity extends AppCompatActivity {

    EditText et1;
    EditText et2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnSuma = findViewById(R.id.btnSuma);
        Button btnResta = findViewById(R.id.btnResta);
        Button btnMultiplicar = findViewById(R.id.btnMultiplica);
        Button btnDividir = findViewById(R.id.btnDivide);

        et1 = findViewById(R.id.etNum1);
        et2 = findViewById(R.id.etNum2);


        btnSuma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(et1.getText().toString());
                int valor2 = Integer.parseInt(et2.getText().toString());
                int resultado=valor1+valor2;



                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("resultado",resultado);
                startActivity(intent);
            }
        });
        btnResta.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(et1.getText().toString());
                int valor2 = Integer.parseInt(et2.getText().toString());
                int resultado=valor1-valor2;



                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("resultado",resultado);
                startActivity(intent);
            }
        });
        btnMultiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int valor1 = Integer.parseInt(et1.getText().toString());
                int valor2 = Integer.parseInt(et2.getText().toString());
                int resultado=valor1*valor2;



                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("resultado",resultado);
                startActivity(intent);
            }
        });
        btnDividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double valor1 = Integer.parseInt(et1.getText().toString());
                double valor2 = Integer.parseInt(et2.getText().toString());
                double resultado=valor1/valor2;



                Intent intent = new Intent(MainActivity.this, SegundaActivity.class);
                intent.putExtra("resultado",resultado);
                startActivity(intent);
            }
        });

    }
}
