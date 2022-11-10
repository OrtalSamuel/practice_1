package com.example.practice_1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;

import com.google.android.material.button.MaterialButton;
import com.google.android.material.textview.MaterialTextView;

public class Activity_Main extends AppCompatActivity {
    private MaterialTextView main_LBL_name;
    private MaterialButton main_BTN_clickMe;
    private EditText main_EDT_name;
    private String input;
    private ImageView main_IMG_help;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         main_LBL_name = findViewById(R.id.main_LBL_name);
         main_BTN_clickMe=findViewById(R.id.main_BTN_clickMe);
        main_EDT_name=findViewById(R.id.main_EDT_name);
        main_IMG_help=findViewById(R.id.main_IMG_help);



        main_BTN_clickMe.setOnClickListener(new View.OnClickListener() { //to change the bottom
            @Override
            public void onClick(View view) {
                changeName();

            }
        });

    }
    private void changeName() {
        String input = main_EDT_name.getText().toString();
        main_LBL_name.setText("Hello " +  input);
        main_LBL_name.setTextColor(Color.RED);

        if (input.equalsIgnoreCase("help")) {
            main_IMG_help.setImageResource(R.drawable.ic_help);
        }
    }
}