package actividad.brigith.aplicacionbrigith;

import androidx.appcompat.app.AppCompatActivity;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text= (TextView) findViewById(R.id.txtArticUno);
        text= (TextView) findViewById(R.id.txtArticDos);
        text= (TextView) findViewById(R.id.txtTheUno);
        text= (TextView) findViewById(R.id.txtThe2);
        text= (TextView) findViewById(R.id.txtChaseUno);
        text= (TextView) findViewById(R.id.txtChaseDos);



        text.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, ArticUnoo.class);
            startActivity(i);
        });

        text.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, ArticDoos.class);
            startActivity(i);
        });

        text.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, TheUnoo.class);
            startActivity(i);
        });

        text.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, TheDoos.class);
            startActivity(i);
        });

        text.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, ChaseUnoo.class);
            startActivity(i);
        });

        text.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, ChaseDoos.class);
            startActivity(i);
        });
    }



}










