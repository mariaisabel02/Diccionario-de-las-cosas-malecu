package ucr.ecci.diccionariocosasmalecu;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class mapuca2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mapuca2);

        ImageButton boton_atras = (ImageButton)findViewById(R.id.btn_atras);
        ImageButton boton_adelante = (ImageButton)findViewById(R.id.btn_adelante);
        ImageButton boton_principal = (ImageButton)findViewById(R.id.btn_principal);
        final Context context = this;

        //para cada botón poner hacia cuál actividad va
        boton_atras.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, mapuca1.class);
                startActivity(intent);
                overridePendingTransition(R.anim.izq_der, R.anim.der_izq);
            }
        });


        boton_principal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v){
                Intent intent = new Intent(context, paginaPrincipal.class);
                startActivity(intent);
                overridePendingTransition(R.anim.izq_der, R.anim.der_izq);
            }
        });
    }
}
