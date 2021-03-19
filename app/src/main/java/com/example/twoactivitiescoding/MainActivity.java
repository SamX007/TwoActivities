package com.example.twoactivitiescoding;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    public static final String EXTRA_MESSAGE =
            "com.example.android.twoactivities.extra.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void StartActivity(View view) {
        Intent intent = new Intent(this,SecondActivity.class);
        if(view.getId()==R.id.button_one){
            intent.putExtra(EXTRA_MESSAGE, 1);
        }
        else if(view.getId()==R.id.button_two){
            intent.putExtra(EXTRA_MESSAGE, 2);
        }
        else if(view.getId()==R.id.button_three){
            intent.putExtra(EXTRA_MESSAGE, 3);
        }
        startActivity(intent);
    }
}