package ucr.ecci.diccionariocosasmalecu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.widget.GridLayout;
import android.widget.ImageButton;
import android.view.View;

public class paginaPrincipal extends AppCompatActivity {
    GridLayout menu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);

        menu = (GridLayout) findViewById(R.id.menu);
        final Context context = this;

        ImageButton btn_mapuca = (ImageButton)findViewById(R.id.btn_mapuca);
        ImageButton btn_jerro = (ImageButton)findViewById(R.id.btn_jerro);
        ImageButton btn_caru = (ImageButton) findViewById(R.id.btn_caru);
        ImageButton btn_cuji = (ImageButton) findViewById(R.id.btn_cuji);
        ImageButton btn_mapuru = (ImageButton) findViewById(R.id.btn_mapuru);
        ImageButton btn_chiqui = (ImageButton) findViewById(R.id.btn_chiqui);

        //para cada botón poner hacia cuál actividad va
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
    }
}
