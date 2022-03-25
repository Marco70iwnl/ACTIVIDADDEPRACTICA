package com.example.pantallainicial;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


class promedifinal extends AppCompatActivity {
    private EditText m1;
    private EditText m2;
    private EditText m3;
    private EditText m4;
    private EditText m5;
    private TextView result;

    @Override
    protected  void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promediofinal);
        m1=(EditText)findViewById(R.id.m1);
        m2=(EditText)findViewById(R.id.m2);
        m3=(EditText)findViewById(R.id.m3);
        m4=(EditText)findViewById(R.id.m4);
        m5=(EditText)findViewById(R.id.m5);
        result= (TextView) findViewById(R.id.resultado);
    }

    public void calcular (View view){
        String primeramateria_String = m1.getText().toString();
        String segundaMateria_String = m2.getText().toString();
        String terceraMateria_String = m3.getText().toString();
        String cuartaMateria_String = m4.getText().toString();
        String quintaMateria_String = m5.getText().toString();

        double Materia1_double = Double.parseDouble(primeramateria_String);
        double Materia2_double = Double.parseDouble(segundaMateria_String);
        double Materia3_double = Double.parseDouble(terceraMateria_String);
        double Materia4_double = Double.parseDouble(cuartaMateria_String);
        double Materia5_double = Double.parseDouble(quintaMateria_String);

        double promedio = (Materia1_double+Materia2_double+Materia3_double+Materia4_double+Materia5_double)/5;

        if (promedio>6){
            result.setText("APROBADO!!!!" +promedio);
        } else if(promedio<5){
            result.setText("REPROBADO!!!" +promedio);
        }

    }

}