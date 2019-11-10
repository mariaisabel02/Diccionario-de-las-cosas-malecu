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

        ImageButton boton1 = (ImageButton)findViewById(R.id.imageButton5);
        final Context context = this;

        ImageButton boton2 = (ImageButton)findViewById(R.id.imageButton6);

        //para cada botón poner hacia cuál actividad va
        boton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, mapuca1.class);
                startActivity(intent);
            }
        });
    }
}
