package ucr.ecci.diccionariocosasmalecu;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.DialogInterface;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.content.Context;

public class paginaPrincipal extends AppCompatActivity {
    MediaPlayer raw_mapuca_quirra;
    MediaPlayer raw_jerro;
    MediaPlayer raw_cuji;
    MediaPlayer raw_caru;
    MediaPlayer raw_mapuru;
    MediaPlayer raw_quijilha;
    MediaPlayer raw_chiqui;
    MediaPlayer raw_chiu;
    MediaPlayer raw_pupa;
    MediaPlayer raw_checacheca;
    MediaPlayer raw_quirri;
    MediaPlayer raw_quirrilenh;
    MediaPlayer raw_tali;
    MediaPlayer raw_arafufu;
    MediaPlayer raw_arafufu_mausunca;
    MediaPlayer raw_jafara;
    MediaPlayer raw_tufictufinh;
    MediaPlayer raw_majoca;
    MediaPlayer raw_curu;
    MediaPlayer raw_ojonh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);
        final Context context = this;

        //para guardar si es la primera vez que se uso el app o no
        SharedPreferences primer_launch = getSharedPreferences("primer_launch", MODE_PRIVATE);
        boolean primer_uso = primer_launch.getBoolean("primer_uso",true);

        if(primer_uso) {
            mostrar_tutorial();
        }

        //inicializamos los cardview del menú
        CardView btn_mapuca = findViewById(R.id.btn_mapuca);
        CardView btn_jerro = findViewById(R.id.btn_jerro);
        CardView btn_caru =  findViewById(R.id.btn_caru);
        CardView btn_cuji =  findViewById(R.id.btn_cuji);
        CardView btn_mapuru =  findViewById(R.id.btn_mapuru);
        CardView btn_quijilha = findViewById(R.id.btn_quijilha);
        CardView btn_chiqui = findViewById(R.id.btn_chiqui);
        CardView btn_chiu = findViewById(R.id.btn_chiu);
        CardView btn_pupa = findViewById(R.id.btn_pupa);
        CardView btn_checacheca = findViewById(R.id.btn_chechacheca);
        CardView btn_quirri = findViewById(R.id.btn_quirri);
        CardView btn_quirrilenh = findViewById(R.id.btn_quirrilenh);
        CardView btn_tali = findViewById(R.id.btn_tali);
        CardView btn_arafufu = findViewById(R.id.btn_arafufu);
        CardView btn_arafufu_mausunca = findViewById(R.id.btn_arafufumausunca);
        CardView btn_jafara = findViewById(R.id.btn_jafara);
        CardView btn_tufictufinh = findViewById(R.id.btn_tuficturinh);
        CardView btn_majoca = findViewById(R.id.btn_majoca);
        CardView btn_curu = findViewById(R.id.btn_curu);
        CardView btn_ojonh = findViewById(R.id.btn_ojonh);
        CardView btn_acerca = findViewById(R.id.btn_acerca);

        //inicializamos los audios del opciones principal
        raw_mapuca_quirra = MediaPlayer.create(paginaPrincipal.this, R.raw.mapuca_quirra);
        raw_jerro = MediaPlayer.create(paginaPrincipal.this, R.raw.jerro);
        raw_cuji = MediaPlayer.create(paginaPrincipal.this, R.raw.cuji);
        raw_caru = MediaPlayer.create(paginaPrincipal.this, R.raw.caru);
        raw_mapuru = MediaPlayer.create(paginaPrincipal.this, R.raw.mapuru);
        raw_quijilha = MediaPlayer.create(paginaPrincipal.this, R.raw.quijilha);
        raw_chiqui = MediaPlayer.create(paginaPrincipal.this, R.raw.chiqui);
        raw_chiu = MediaPlayer.create(paginaPrincipal.this, R.raw.chiu);
        raw_pupa = MediaPlayer.create(paginaPrincipal.this, R.raw.pupa);
        raw_checacheca = MediaPlayer.create(paginaPrincipal.this, R.raw.checacheca);
        raw_quirri = MediaPlayer.create(paginaPrincipal.this, R.raw.quirri);
        raw_quirrilenh = MediaPlayer.create(paginaPrincipal.this, R.raw.quirrilenh);
        raw_tali = MediaPlayer.create(paginaPrincipal.this, R.raw.tali);
        raw_arafufu = MediaPlayer.create(paginaPrincipal.this, R.raw.arafufu);
        raw_arafufu_mausunca = MediaPlayer.create(paginaPrincipal.this, R.raw.arafufu_mausunca);
        raw_jafara = MediaPlayer.create(paginaPrincipal.this, R.raw.jafara);
        raw_tufictufinh = MediaPlayer.create(paginaPrincipal.this, R.raw.tufictufinh);
        raw_majoca = MediaPlayer.create(paginaPrincipal.this, R.raw.majoca);
        raw_curu = MediaPlayer.create(paginaPrincipal.this, R.raw.curu);
        raw_ojonh = MediaPlayer.create(paginaPrincipal.this, R.raw.ojonh);

        //para cada botón (cardview) indicamos hacia cuál actividad va al hacer click

        btn_mapuca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, mapuca1.class);
                raw_mapuca_quirra.start();
                startActivity(intent);
            }
        });

        btn_jerro.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, jerro.class);
                raw_jerro.start();
                startActivity(intent);
            }
        });

        btn_cuji.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, cuji.class);
                raw_cuji.start();
                startActivity(intent);
            }
        });

        btn_caru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, caru.class);
                raw_caru.start();
                startActivity(intent);
            }
        });

        btn_mapuru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, mapuru.class);
                raw_mapuru.start();
                startActivity(intent);
            }
        });

        btn_quijilha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, quijilha.class);
                raw_quijilha.start();
                startActivity(intent);
            }
        });

        btn_chiqui.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, chiqui.class);
                raw_chiqui.start();
                startActivity(intent);
            }
        });

        btn_chiu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, chiu.class);
                raw_chiu.start();
                startActivity(intent);
            }
        });

        btn_pupa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, pupa.class);
                raw_pupa.start();
                startActivity(intent);
            }
        });

        btn_checacheca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, checacheca.class);
                raw_checacheca.start();
                startActivity(intent);
            }
        });

        btn_quirri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, quirri.class);
                raw_quirri.start();
                startActivity(intent);
            }
        });

        btn_quirrilenh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, quirrilenh.class);
                raw_quirrilenh.start();
                startActivity(intent);
            }
        });

        btn_tali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, tali.class);
                raw_tali.start();
                startActivity(intent);
            }
        });

        btn_arafufu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, arafufu.class);
                raw_arafufu.start();
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

        btn_jafara.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, jafara.class);
                raw_jafara.start();
                startActivity(intent);
            }
        });

        btn_tufictufinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, tufictufinh.class);
                raw_tufictufinh.start();
                startActivity(intent);
            }
        });

        btn_majoca.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, majoca.class);
                raw_majoca.start();
                startActivity(intent);
            }
        });

        btn_curu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, curu.class);
                raw_curu.start();
                startActivity(intent);
            }
        });

        btn_ojonh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, ojonh.class);
                raw_ojonh.start();
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

    private void mostrar_tutorial(){
        //mostrar dialogo de explicacion
        LayoutInflater inflater = getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.dialogo_inicio,null);

        AlertDialog.Builder builder = new AlertDialog.Builder(this)
                .setTitle("¡Bienvenido!")
                .setView(dialogView)
                .setPositiveButton("Continuar", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick (DialogInterface dialog, int which) {
                        dialog.dismiss();
                    }
                });
        builder.create().show();
        SharedPreferences primer_launch = getSharedPreferences("primer_launch",MODE_PRIVATE);
        SharedPreferences.Editor editor = primer_launch.edit();
        editor.putBoolean("primer_uso", false);
        editor.apply();
    }
}


// tutorial para desplegar mensaje la primera vez que se abre el app :
//https://www.youtube.com/watch?v=2I1n6A6JJzw&list=LLaQ-P4qVvvTc1EPxakbKCuw&index=3&t=0s
//https://www.android-examples.com/create-alertdialog-with-custom-xml-view-layout-file-in-android/

