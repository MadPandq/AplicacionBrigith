package actividad.brigith.aplicacionbrigith;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {
    TextView text;
    Button sesion;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        text= (TextView) findViewById(R.id.textoRegistrarse);
        sesion = (Button) findViewById(R.id.btniniciarSesion);

        sesion.setOnClickListener(view -> {
            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);

        });

        text.setOnClickListener(view -> {
            Intent i = new Intent(LoginActivity.this, RegistrarActivity.class);
            startActivity(i);
        });
    }

}