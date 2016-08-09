package com.example.lds.taller1bernardoherrera;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Bienvenido extends AppCompatActivity {
    TextView textoCiclo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bienvenido);
        Button btn = (Button)findViewById(R.id.buttonAumentar);
        textoCiclo = (TextView)findViewById(R.id.textCiclo);

    }

    public void aumentar(View v){
        String texto = textoCiclo.getText().toString();
        Integer numero = Integer.parseInt(texto);
        textoCiclo.setText(++numero);
    }
}
