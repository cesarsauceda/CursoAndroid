package com.example.sauceda.cursoandroid.actividades;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.sauceda.cursoandroid.R;

public class SegundaActivity extends AppCompatActivity {

    TextView resultado;
    int resultadoActivity;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segunda);

        resultadoActivity = getIntent().getIntExtra("resultado",-1);

        resultado = findViewById(R.id.txtResultado);
        resultado.setText("El resultado es: " + resultadoActivity);
    }
}
