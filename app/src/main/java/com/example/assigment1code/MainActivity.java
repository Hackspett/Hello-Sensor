package com.example.assigment1code;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import static android.provider.AlarmClock.EXTRA_MESSAGE;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user taps the Compass button */
    public void compass(View view) {
        Intent intent = new Intent(this, DisplayCompass.class);
        startActivity(intent);
    }

    public void accelerometer(View view) {
        Intent intent = new Intent(this, DisplayAccelerometerActivity.class);
        startActivity(intent);
    }
}