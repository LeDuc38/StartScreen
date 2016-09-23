package com.example.dell.startscreen;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btnPlay,btnHelp,btnOptions;
    private TextView tvname,tvHighScore;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tvname=(TextView) findViewById(R.id.appName);
        tvHighScore=(TextView) findViewById(R.id.tvHighScore);
        btnPlay=(Button) findViewById(R.id.btnPlay);
        btnHelp=(Button) findViewById(R.id.btnHelp);
        btnOptions=(Button) findViewById(R.id.btnOptions);
        Typeface myCustomFont=Typeface.createFromAsset(getAssets(),"fonts/orange juice 2.0.ttf");
        Typeface myCustomFont2=Typeface.createFromAsset(getAssets(),"fonts/Doodle Digit.ttf");
        btnPlay.setTypeface(myCustomFont);
        btnHelp.setTypeface(myCustomFont);
        btnOptions.setTypeface(myCustomFont);
        tvname.setTypeface(myCustomFont2);

        tvHighScore.setText("  "+"30");
    }
}
