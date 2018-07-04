package com.example.ale_j.calculadora;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    EditText num1 , num2;
    Button suma, restar, multiplicar, dividir;
    TextView resultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_main );

        num1 = (EditText) findViewById( R.id.num1 );
        num2 = (EditText) findViewById( R.id.num2 );

        suma = (Button) findViewById( R.id.suma );
        restar = (Button) findViewById( R.id.restar );
        multiplicar = (Button) findViewById( R.id.multiplicar );
        dividir = (Button) findViewById( R.id.dividir );

        resultado = (TextView) findViewById( R.id.resultado );

        suma.setOnClickListener(this);
        restar.setOnClickListener(this);
        multiplicar.setOnClickListener(this);
        dividir.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {

        String n1 = num1.getText().toString();
        String n2 = num2.getText().toString();

        float entero1 = Float.parseFloat( n1 );
        float entero2 = Float.parseFloat( n2 );

        float num= 0;
        switch (v.getId()){
            case R.id.suma:
                num = entero1 + entero2;
                resultado.setText(""+num);

                break;
            case R.id.restar:
                num = entero1 - entero2;
                resultado.setText(""+num);
                break;
            case R.id.multiplicar:
                num = entero1 * entero2;
                resultado.setText(""+num);
                break;
            case R.id.dividir:
                num = entero1 / entero2;
                if(entero2==0){
                    resultado.setText( "No se puede dividir entre 0" );

                }else {
                    resultado.setText(""+num);
                }
                break;
        }


    }
}
