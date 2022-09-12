package com.tamanna.practicetask2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //hide action bar

        getSupportActionBar().hide();

        //Defining the widgets

        EditText editText = findViewById(R.id.editText);
        Button button = findViewById(R.id.button);
        TextView textView = findViewById(R.id.textView1);
        TextView textView2 = findViewById(R.id.textView2);
        //Get kilogram values
        String kilograms =  editText.getText().toString();

        //Convert Kg to pounds
        //OnClickListner is used to make the button functional

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //get kilogram value
                String kilograms = editText.getText().toString();

                //String to float
                float kilos = Float.parseFloat(kilograms);

                //Casting as float
                float pounds = (float) (kilos * 2.20462);

                //Displaying Results
                textView.setText(""+pounds);

            }
        });
    }
}
