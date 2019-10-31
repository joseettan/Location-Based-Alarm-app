package com.example.majidm.googlemapapp;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;

public class Splashactivity extends AppCompatActivity {
   /* private static int SPLASH_TIME_OUT=4000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splashactivity);
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run(){
                Intent homeIntent = new Intent(Splashactivity.this,Homeactivity.class);
                startActivity(homeIntent);
                finish();
                Intent home = new Intent(Splashactivity.this,MapsActivity.class);
                startActivity(home);
           //     finish();
            }
        },SPLASH_TIME_OUT);
    }*/
    /** Duration of wait **/
    private final int SPLASH_DISPLAY_LENGTH = 4000;

    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle icicle) {
        super.onCreate(icicle);
        setContentView(R.layout.activity_homeactivity);

        /* New Handler to start the Menu-Activity
         * and close this Splash-Screen after some seconds.*/
        new Handler().postDelayed(new Runnable(){
            @Override
            public void run() {
                /* Create an Intent that will start the Menu-Activity. */
                Intent mainIntent = new Intent(Splashactivity.this,MapsActivity.class);
                Splashactivity.this.startActivity(mainIntent);
                Splashactivity.this.finish();
            }
        }, SPLASH_DISPLAY_LENGTH);
    }
}
