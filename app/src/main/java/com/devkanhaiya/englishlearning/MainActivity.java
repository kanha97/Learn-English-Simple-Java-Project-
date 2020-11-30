package com.devkanhaiya.englishlearning;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void SayTheWord(View view) {
        TextView textView=(TextView) view;
        
MediaPlayer mediaPlayer=MediaPlayer.create(this,getResources().getIdentifier(textView.getTag().toString(),"raw",getPackageName()));
        mediaPlayer.start();
    }
}