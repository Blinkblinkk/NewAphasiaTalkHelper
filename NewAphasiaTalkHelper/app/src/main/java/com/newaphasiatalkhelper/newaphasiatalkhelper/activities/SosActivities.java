package com.newaphasiatalkhelper.newaphasiatalkhelper.activities;

import android.media.MediaPlayer;
import android.net.Uri;
import android.preference.PreferenceManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

import com.newaphasiatalkhelper.newaphasiatalkhelper.R;

public class SosActivities extends AppCompatActivity {

    View btnStop;
    VideoView vv;
    MediaPlayer mediaPlayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sos_activities);
        mediaPlayer = MediaPlayer.create(this,R.raw.sirensound);
        mediaPlayer.start();



        btnStop = findViewById(R.id.btn_stop);

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();


            }
        });

    }

    @Override
    protected void onStart() {
        super.onStart();
        vv = (VideoView) findViewById(R.id.video_view);
        vv.setVideoPath("android.resource://"+getPackageName()+"/"+R.raw.giphy);
        vv.setMediaController(new MediaController(this));
        vv.start();

        vv.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {

            @Override
            public void onCompletion(MediaPlayer mp) {

                vv.start();

            }
        });
    }

    @Override
    protected void onStop() {
        super.onStop();
        mediaPlayer.stop();
    }
}
