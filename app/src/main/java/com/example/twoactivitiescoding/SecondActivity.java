package com.example.twoactivitiescoding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView article;
    private TextView heading;
    private String paragraph;
    private String headline;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        article = findViewById(R.id.paragraph);
        heading = findViewById(R.id.heading);
        Intent intent = getIntent();
        int button_value = intent.getIntExtra(MainActivity.EXTRA_MESSAGE,0);
        if(button_value==1) {
            paragraph = getResources().getString(R.string.paragraph1);
            headline = getResources().getString(R.string.heading1);
        }
        else if(button_value==2){
            paragraph = getResources().getString(R.string.paragraph2);
            headline = getResources().getString(R.string.heading2);
        }
        else if(button_value==3){
            paragraph = getResources().getString(R.string.paragraph3);
            headline = getResources().getString(R.string.heading3);
        }
        article.setText(paragraph);
        heading.setText(headline);

    }
}