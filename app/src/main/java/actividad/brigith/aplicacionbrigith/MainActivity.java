package actividad.brigith.aplicacionbrigith;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;


import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    TextView text, text2, text3, text4, text5, text6;
    private PendingIntent pendingIntent;
    private final static String CHANNEL_ID = "NOTIFICACION";
    private final static int NOTIFICACION_ID=0;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        text= (TextView) findViewById(R.id.txtArticUno);
        text2= (TextView) findViewById(R.id.txtArticDos);
        text3= (TextView) findViewById(R.id.txtTheUno);
        text4= (TextView) findViewById(R.id.txtThe2);
        text5= (TextView) findViewById(R.id.txtChaseUno);
        text6= (TextView) findViewById(R.id.txtChaseDos);



        text.setOnClickListener(view -> {
            Intent e = new Intent(MainActivity.this, ArticUnoo.class);
            startActivity(e);
        });



        text2.setOnClickListener(view -> {
            Intent d = new Intent(MainActivity.this, ArticDoos.class);
            startActivity(d);
        });

        text3.setOnClickListener(view -> {
            Intent c = new Intent(MainActivity.this, TheUnoo.class);
            startActivity(c);
        });

        text4.setOnClickListener(view -> {
            Intent b = new Intent(MainActivity.this, TheDoos.class);
            startActivity(b);
        });

        text5.setOnClickListener(view -> {
            Intent a = new Intent(MainActivity.this, ChaseUnoo.class);
            startActivity(a);
        });

        text6.setOnClickListener(view -> {
            Intent i = new Intent(MainActivity.this, ChaseDoos.class);
            startActivity(i);
        });
    }

}










