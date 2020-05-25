package com.example.slide2;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Spinner;
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

        //For activity_spinner_example
        /*setContentView(R.layout.activity_spinner_example);
        Spinner spinner = findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this, R.array.planets_array, android.R.layout.simple_spinner_dropdown_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setAdapter(adapter);*/

        //For activity_picker_example
        setContentView(R.layout.activity_picker_example);
    }


    //For activity_custom_button_example
    public void sendMessage(View view)
    {
        Toast.makeText(MainActivity.this, "Button Clicked", Toast.LENGTH_LONG).show();
    }

    //For activity_picker_example
    public void showDatePickerDialog(View v)
    {
        DialogFragment newFragment = new DatePickerFragment();
        newFragment.show(getSupportFragmentManager(), "datePicker");
    }

    public void showTimePickerDialog(View v)
    {
        DialogFragment newFragment = new TimePickerFragment();
        newFragment.show(getSupportFragmentManager(), "timePicker");
    }

}
