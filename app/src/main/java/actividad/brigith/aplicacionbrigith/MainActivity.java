package actividad.brigith.aplicacionbrigith;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



    }

    public void dirigirRaiden(View r){

        Toast.makeText(this, "Escogiste a la Arconte Electro", Toast.LENGTH_SHORT).show();

    }

    public void dirigirZhongli(View z){

        Toast.makeText(this, "Escogiste al Arconte Geo", Toast.LENGTH_SHORT).show();

    }

    public void dirigirVenti(View v){

        Toast.makeText(this, "Escogiste al Arconte Anemo", Toast.LENGTH_SHORT).show();

    }

}