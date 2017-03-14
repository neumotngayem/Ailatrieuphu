package com.example.administrator.trieuphu;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Window;
import android.view.WindowManager;

public class HomeActivity extends Activity {
    Intent svc;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_home);
        svc = new Intent(this, BackgroundSoundService.class);

    }

    @Override
    protected void onResume() {
        startService(svc);
        super.onResume();
    }

    @Override
    protected void onPause() {
        stopService(svc);
        super.onPause();
    }


}
