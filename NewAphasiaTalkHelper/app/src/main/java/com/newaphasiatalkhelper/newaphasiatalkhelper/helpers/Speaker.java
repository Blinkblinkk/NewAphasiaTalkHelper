package com.newaphasiatalkhelper.newaphasiatalkhelper.helpers;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.net.Uri;
import android.speech.tts.TextToSpeech;

import java.util.Locale;

/**
 * Created by Tum on 12/24/2017 AD.
 */

//Text to Speech
public class Speaker {

    static TextToSpeech tts;

    public static void speak(final String msg, final Context context){
        tts = new TextToSpeech(context, new TextToSpeech.OnInitListener() {
            @Override
            public void onInit(int status) {
                if (status == TextToSpeech.SUCCESS){
                    tts.setLanguage(new Locale("th"));
                    tts.speak(msg, TextToSpeech.QUEUE_ADD,null);
                    //tts.shutdown();
                }
                else if(context instanceof Activity) {
                    new AlertDialog.Builder(context)
                            .setTitle("TextToSpeech Engine Not Found")
                            .setMessage("Dowload At Play Sotre")
                            .setPositiveButton("ไปติดตั้งตอนนี้", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    Activity a = (Activity) context;
                                    Intent intent = new Intent(Intent.ACTION_VIEW);
                                    intent.setData(Uri.parse("market://details?id=com.google.android.tss"));
                                    a.startActivity(intent);
                                }
                            })
                            .setNegativeButton("ยังก่อน",null)
                            .show();
                }
            }
        });

    }

}
