package actividad.brigith.aplicacionbrigith;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

public class InicioPantallaActivity extends AppCompatActivity{

    Button registrar;
    Button iniciar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio_pantalla);

        registrar = (Button) findViewById(R.id.btnSign);
        iniciar = (Button) findViewById(R.id.btnLogin);

        registrar.setOnClickListener(view -> {
            Intent intent = new Intent(InicioPantallaActivity.this,RegistrarActivity.class);
            startActivity(intent);

        });

                iniciar.setOnClickListener(view -> {
                    Intent i = new Intent(InicioPantallaActivity.this, LoginActivity.class);
                    startActivity(i);
                });
    }

}