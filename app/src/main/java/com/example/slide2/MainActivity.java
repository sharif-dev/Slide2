package com.example.slide2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        //For activity_custom_button_example
        //setContentView(R.layout.activity_custom_button_example);
        //For activity_autocomplete_example
        /*setContentView(R.layout.activity_autocomplete_example);
        AutoCompleteTextView autoCompleteTextView = findViewById(R.id.autocomplete_continents);
        String[] continents = getResources().getStringArray(R.array.continents_array);
        ArrayAdapter<String> adapter = new
                ArrayAdapter<>(this, android.R.layout.simple_list_item_1, continents);
        autoCompleteTextView.setAdapter(adapter);*/
    }


    //For activity_custom_button_example
    public void sendMessage(View view)
    {
        Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_LONG).show();
    }
}
