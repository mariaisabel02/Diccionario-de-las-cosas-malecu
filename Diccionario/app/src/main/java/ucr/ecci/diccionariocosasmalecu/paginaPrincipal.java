package ucr.ecci.diccionariocosasmalecu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.content.Context;

public class paginaPrincipal extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);
        final Context context = this;

        //inicializamos los cardview del menú
        CardView btn_mapuca = findViewById(R.id.btn_mapuca);
        CardView btn_jerro = findViewById(R.id.btn_jerro);
        CardView btn_caru =  findViewById(R.id.btn_caru);
        CardView btn_cuji =  findViewById(R.id.btn_cuji);
        CardView btn_mapuru =  findViewById(R.id.btn_mapuru);
        CardView btn_chiqui = findViewById(R.id.btn_chiqui);
        CardView btn_pupa = findViewById(R.id.btn_pupa);


        //para cada botón (cardview) indicamos hacia cuál actividad va al hacer click

        btn_mapuca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, mapuca1.class);
                startActivity(intent);
            }
        });

        btn_jerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, jerro.class);
                startActivity(intent);
            }
        });

        btn_caru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, caru1.class);
                startActivity(intent);
            }
        });

        btn_cuji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, cuji.class);
                startActivity(intent);
            }
        });

        btn_mapuru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, mapuru.class);
                startActivity(intent);
            }
        });

        btn_chiqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, chiqui.class);
                startActivity(intent);
            }
        });

        btn_pupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, pupa.class);
                startActivity(intent);
            }
        });

    }
}
