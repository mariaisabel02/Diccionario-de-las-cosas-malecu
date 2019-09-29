package ucr.ecci.diccionariocosasmalecu;
import android.view.WindowManager;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static int TIEMPO = 4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        setContentView(R.layout.activity_main);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent actividad = new Intent(MainActivity.this, paginaPrincipal.class);
                startActivity(actividad);
                finish();
            }
        }, TIEMPO);
    }
}

//basado en tutorial de geeksforgeeks.org/android-creating-a-splash-screen/