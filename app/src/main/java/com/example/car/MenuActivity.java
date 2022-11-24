package com.example.car;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ImageButton;

public class MenuActivity extends AppCompatActivity implements View.OnTouchListener{

    ImageButton ibStart, ibMultiplayer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        //LINK EACH BUTTON TO A JAVA OBJECT
        ibStart = findViewById(R.id.ibStart);
        ibStart.setOnTouchListener(this);
        ibMultiplayer = findViewById(R.id.ibMultiplayer);
        ibMultiplayer.setOnTouchListener(this);

    }

    //WITH ONTOUCH LISTENER WE CAN CHECK IF THE BUTTON IS PRESSED AND WHEN IT IS RELEASED
    @Override
    public boolean onTouch(View view, MotionEvent motionEvent) {
        switch (view.getId()){
            case R.id.ibStart:
                switch(motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // PRESSED
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        Intent i = new Intent(this, MainActivity.class);
                        startActivity(i);
                        return true; // if you want to handle the touch event
                }
                break;
            case R.id.ibMultiplayer:
                switch(motionEvent.getAction()) {
                    case MotionEvent.ACTION_DOWN:
                        // PRESSED
                        return true; // if you want to handle the touch event
                    case MotionEvent.ACTION_UP:
                        Intent i = new Intent(this, MainActivity.class);
                        startActivity(i);
                        return true; // if you want to handle the touch event
                }
                break;
        }
        return false;
    }
}