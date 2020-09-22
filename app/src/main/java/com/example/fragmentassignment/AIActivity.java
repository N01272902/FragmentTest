package com.example.fragmentassignment;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.TextView;

public class AIActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ai);

        TextView textView = (TextView) findViewById(R.id.textViewAI1);
        textView.setTextColor(Color.BLUE);

    }

    @Override
    public void onStart()
    {
        super.onStart();
        TextView textView = (TextView) findViewById(R.id.textViewAI2);
        textView.setTextColor(Color.GREEN);
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
        TextView textView = (TextView) findViewById(R.id.textViewAI3);
        textView.setTextColor(Color.YELLOW);
    }

   @Override
    public void onDestroy()
    {
        super.onDestroy();
        TextView textView = (TextView) findViewById(R.id.textViewAI4);
        textView.setTextColor(Color.RED);
    }

}