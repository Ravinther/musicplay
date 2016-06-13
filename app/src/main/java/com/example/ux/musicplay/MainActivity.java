package com.example.ux.musicplay;

import android.app.Activity;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {
    Button button1,button2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music);
        MediaPlayer mediaPlayer;
        final MediaPlayer mplayer=MediaPlayer.create(this,R.raw.kalam);
        button1=(Button)findViewById(R.id.play);
        button2=(Button)findViewById(R.id.stop);
        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mplayer.start();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (mplayer != null && mplayer.isPlaying()) {
                    mplayer.stop();
                }
            }
        });
    }
}
