package ucr.ecci.diccionariocosasmalecu;
import android.media.MediaPlayer;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class Splash extends AppCompatActivity {
    private static int TIEMPO = 4000;
    MediaPlayer sonido;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sonido = MediaPlayer.create(this, R.raw.titulo_splash);
        sonido.start();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent actividad = new Intent(Splash.this, paginaPrincipal.class);
                startActivity(actividad);
                sonido.release();
                finish();
            }
        }, TIEMPO);
    }
}

//basado en tutorial de geeksforgeeks.org/android-creating-a-splash-screen/