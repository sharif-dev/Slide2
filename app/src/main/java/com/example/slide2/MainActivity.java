package com.example.slide2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_custom_button_example);
    }


    //For activity_custom_button_example
    public void sendMessage(View view)
    {
        Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_LONG).show();
    }
}
