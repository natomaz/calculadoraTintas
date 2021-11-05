package com.example.calculadoratintas;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.text.DecimalFormat;


public class MainActivity extends AppCompatActivity {
    private EditText edtLargura, edtAltura, edtValorMedio, edtNumero;
    private Button btnCalcular;
    private TextView txtResultado;
    public double valorAltura, valorLargura, valorNumero,ValorMedio, area, rendimento, numeroLatas;
    DecimalFormat f = new DecimalFormat("0.00");

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        iniciarComponentes();
        btnCalcular.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                valorAltura = Double.parseDouble(edtAltura.getText().toString());
                valorLargura = Double.parseDouble(edtLargura.getText().toString());
                valorNumero = Double.parseDouble(edtNumero.getText().toString());
                ValorMedio = Double.parseDouble(edtValorMedio.getText().toString());
                area = valorAltura * valorLargura;
                rendimento = ValorMedio / valorNumero;
                numeroLatas = area / rendimento;
                txtResultado.setText("TINTAS NECESSÁRIAS:"+f.format(numeroLatas));
            }
        });

    }

    private void iniciarComponentes() {
        edtAltura = findViewById(R.id.edtaltura);
        edtLargura = findViewById(R.id.edtlargura);
        edtNumero = findViewById(R.id.edtnumero);
        edtValorMedio = findViewById(R.id.edtvalormedio);
        btnCalcular = findViewById(R.id.btncalcular);
        txtResultado = findViewById(R.id.txtresultado);
    }
}