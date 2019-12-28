package ucr.ecci.diccionariocosasmalecu;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.content.Context;

public class paginaPrincipal extends AppCompatActivity {
MediaPlayer raw_arafufu;
MediaPlayer raw_arafufu_mausunca;
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
        CardView btn_quirri = findViewById(R.id.btn_quirri);
        CardView btn_tali = findViewById(R.id.btn_tali);
        CardView btn_arafufu_mausunca = findViewById(R.id.btn_arafufumausunca);
        CardView btn_tufictufinh = findViewById(R.id.btn_tuficturinh);
        CardView btn_curu = findViewById(R.id.btn_curu);
        CardView btn_majoca = findViewById(R.id.btn_majoca);
        CardView btn_quijilha = findViewById(R.id.btn_quijilha);
        CardView btn_acerca = findViewById(R.id.btn_acerca);

        //inicializamos los audios del menu principal

        raw_arafufu = MediaPlayer.create(paginaPrincipal.this, R.raw.arafufu);
        raw_arafufu_mausunca = MediaPlayer.create(paginaPrincipal.this, R.raw.arafufu_mausunca);

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
                Intent intent = new Intent(context, caru.class);
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

        btn_quirri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, quirri.class);
                startActivity(intent);
            }
        });


        btn_tali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, tali.class);
                startActivity(intent);
            }
        });


        btn_arafufu_mausunca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, arafufu_mausunca.class);
                raw_arafufu_mausunca.start();
                startActivity(intent);
            }
        });

        btn_tufictufinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, tufictufinh.class);
                startActivity(intent);
            }
        });

        btn_majoca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, majoca.class);
                startActivity(intent);
            }
        });

        btn_quijilha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, quijilha.class);
                startActivity(intent);
            }
        });

        btn_curu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, curu.class);
                startActivity(intent);
            }
        });

        btn_acerca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, acerca.class);
                startActivity(intent);
            }
        });
    }
}
