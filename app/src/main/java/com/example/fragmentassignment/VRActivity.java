package com.example.fragmentassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class VRActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vr);

        TextView textView = (TextView) findViewById(R.id.textViewVR1);
        textView.setTextColor(Color.CYAN);
    }

    @Override
    public void onStart()
    {
        super.onStart();
        TextView textView = (TextView) findViewById(R.id.textViewVR2);
        textView.setTextColor(Color.BLUE);
    }

    /*
    Note:
    - Once onStop is executed, the textView color set in onStop() and onDestroy will not apply.
    - the onStop color only applies when the app is put in a pause/resume state
    */

    @Override
    public void onStop()
    {
        super.onStop();
        TextView textView = (TextView) findViewById(R.id.textViewVR3);
        textView.setTextColor(Color.RED);
    }

    @Override
    public void onDestroy()
    {
        super.onDestroy();
        TextView textView = (TextView) findViewById(R.id.textViewVR4);
        textView.setTextColor(Color.RED);
    }
}