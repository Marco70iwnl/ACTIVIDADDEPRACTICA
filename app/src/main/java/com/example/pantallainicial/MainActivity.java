package com.example.pantallainicial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void irASeraBisiestoEsteAño (View view) {
        Intent i = new Intent(this, Anobisiesto.class);
        startActivity(i);
    }
    public void irATablasDeMultiplicar (View view) {
        Intent i = new Intent(this, tablasmultiplicar.class);
        startActivity(i);
    }

    public void irAPromedioFinal (View view) {
        Intent i = new Intent(this, promedifinal.class);
        startActivity(i);
    }

}