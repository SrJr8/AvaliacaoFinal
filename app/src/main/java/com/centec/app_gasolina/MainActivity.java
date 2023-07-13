package com.centec.app_gasolina;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText prcAlcool;
    EditText prcGasolina;
    Button btCalcular;
    TextView Resultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        prcAlcool = findViewById(R.id.prcAlcool);
        prcGasolina = findViewById(R.id.prcGasolina);
        btCalcular = findViewById(R.id.btCalcular);
        Resultado = findViewById(R.id.Resultado);

        btCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                cularMelhorCombustivel();
            }
        });
    }

    public void cularMelhorCombustivel() {

        String pAlcool = prcAlcool.getText().toString();
        String pGasolina = prcGasolina.getText().toString();

        if (!pAlcool.isEmpty() && !pGasolina.isEmpty()) {
            float etanol = Float.parseFloat(pAlcool);
            float gasolina = Float.parseFloat(pGasolina);

            double indice = etanol / gasolina;
        if (indice <= 0.7) {
            Resultado.setText("Alcool é Melhor");
        } else {
            Resultado.setText("Gasolina é Melhor");
        }

            Resultado.setVisibility(View.VISIBLE);
        }
    }
}