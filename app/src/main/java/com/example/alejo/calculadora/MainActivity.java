package com.example.alejo.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    Button btnSumar;
    EditText txtNumeroUno;
    EditText txtNumeroDos;
    TextView tvResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnSumar = (Button) findViewById(R.id.btnSumar);
        txtNumeroUno = (EditText) findViewById(R.id.txtNumeroUno);
        txtNumeroDos = (EditText) findViewById(R.id.txtNumeroDos);
        tvResultado = (TextView) findViewById(R.id.tvResultado);

        btnSumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {



               int numeroUno = Integer.parseInt(txtNumeroUno.getText().toString());
               int numeroDos = Integer.parseInt(String.valueOf(txtNumeroDos.getText().toString()));

               int Resultado = numeroUno+numeroDos;

                   tvResultado.setText("Resultado: " + Resultado);
            }
        });
    }
}
