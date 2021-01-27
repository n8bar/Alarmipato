package com.natetheprogrammer.alarmipator;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.widget.Toast;

public class AlertBroadcastReceiver extends BroadcastReceiver {
    MediaPlayer mediaPlayer;

    @Override
    public void onReceive(Context context, Intent intent) {
        mediaPlayer = MediaPlayer.create(context, R.raw.knock);
        mediaPlayer.start();
        Toast.makeText(context, " Alarm Ringing..", Toast.LENGTH_LONG).show();
    }
}
