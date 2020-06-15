package com.example.musicapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class PlayingActivty extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.musicplayer);
        playing();
    }

    public void playing() {
        // Get extras from Intent.
        Intent MusiccIntent = getIntent();

        // Set the name of Musicc for playing.
        TextView MusiccTextView = findViewById(R.id.player_Musicc);
        String MusiccForPlaying = MusiccIntent.getStringExtra("Musicc");
        MusiccTextView.setText(MusiccForPlaying);

        // Set the name of composer for playing.
        TextView composerTextView = findViewById(R.id.player_composer);
        String composerForPlaying = MusiccIntent.getStringExtra("composer");
        composerTextView.setText(composerForPlaying);
    }
}
