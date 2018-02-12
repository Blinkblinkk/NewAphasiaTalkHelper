package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;

public class SosActivities extends AppCompatActivity {

    View btnStop;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos_activities);
        final MediaPlayer mediaPlayer = MediaPlayer.create(this,R.raw.perfect);
        mediaPlayer.start();

        btnStop = findViewById(R.id.btn_stop);

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                finish();
            }
        });
    }
}
