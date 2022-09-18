package com.krevolorio.poemas;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button buttonP, buttonR, buttonT;

    public MainActivity() {
    }


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        buttonP = findViewById(R.id.btnPatrios);
        buttonR = findViewById(R.id.btnRomanticos);
        buttonT = findViewById(R.id.btnTristeza);
        this.click();
        this.clickR();
        this.clickT();
    }

    private void clickT() {
        buttonT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aperturaTristeza();
            }
        });
    }
    private void clickR() {
        buttonR.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                aperturaRomanticos();

            }
        });
    }
    private void click() {
        buttonP.setOnClickListener(new View.OnClickListener() {
            @Override
            //crea el evento onClick, en el que recibe la pulsacion del boton
            public void onClick(View view) {
                //funcion final llamada por el evento onclick
                aperturaPatrios();
            }
        });
    }
    private void aperturaPatrios(){
        //el intent proporciona vinculacion en tiempo de ejecucion entre componentes separados
        Intent intent = new Intent(this, MainActivityPatrios.class);
        startActivity(intent);
    }
    private void aperturaRomanticos(){
        Intent intent= new Intent(this,MainActivityRomanticos.class);
        startActivity(intent);
    }
    private void aperturaTristeza(){
        Intent intent = new Intent(this,MainActivityTristeza.class);
        startActivity(intent);
    }
}