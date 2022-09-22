package actividad.brigith.aplicacionbrigith;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageButton;

public class ArticUnoo extends AppCompatActivity {

    ImageButton play_pause, prev, next;
    MediaPlayer music;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_artic_unoo);

        play_pause= (ImageButton) findViewById(R.id.imgPlay);
        prev= (ImageButton) findViewById(R.id.imgPrev);
        next= (ImageButton) findViewById(R.id.imgNext);
    }



}