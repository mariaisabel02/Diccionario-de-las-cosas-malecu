package ucr.ecci.diccionariocosasmalecu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class paginaPrincipal extends AppCompatActivity {
    GridView menu;

    String[] nombreCosa = {"Quijilha","Chiqui","Chiu","Ojonh","Pupa",
                            "Afafufu mausunca", "Jafara","Tufictufinh","Majoca","Curu",
                            "Mapuca quirra", "Jerro","Cuji","Caru","Mapuru", "Checacheca",
                            "Quirri","Quirrilenh", "Tali", "Arafufu"};
    int[] cosas = {
            R.drawable.item1
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pagina_principal);

        menu = (GridView) findViewById(R.id.menu);

        menu.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                //Intent actividad = new Intent(paginaPrincipal.this, paginaPrincipal.class);
                //startActivity(actividad);
                //finish();
            }
        });
    }
}
