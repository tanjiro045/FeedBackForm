package com.example.mcprac2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import java.util.*;

public class MainActivity extends AppCompatActivity {
    EditText editTextTextPersonName2;
    RadioButton radioButton;
    RadioButton radioButton2;
    CheckBox checkBox, checkBox2,checkBox3;
    RatingBar ratingBar;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editTextTextPersonName2 = findViewById(R.id.editTextTextPersonName2);
        radioButton = findViewById(R.id.radioButton);
        radioButton2 = findViewById(R.id.radioButton2);
        checkBox = findViewById(R.id.checkBox);
        checkBox2 = findViewById(R.id.checkBox2);
        checkBox3 = findViewById(R.id.checkBox3);
        ratingBar = findViewById(R.id.ratingBar);
        button = findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                String name = editTextTextPersonName2.getText().toString();
                String gender = radioButton.isChecked() ? "Male" : "Female";
                List<String> selectedSubjects = new ArrayList<>();
                if (checkBox.isChecked()) {
                    selectedSubjects.add("Blockchain");
                }
                if (checkBox2.isChecked()) {
                    selectedSubjects.add("Green Computing");
                }
                if (checkBox3.isChecked()) {
                    selectedSubjects.add("IOT");
                }
                float rating = ratingBar.getRating();

// Pass the details to the next activity
                Intent intent = new Intent(MainActivity.this, FeedbackDetailsActivity.class);
                intent.putExtra("name", name);
                intent.putExtra("gender", gender);
                intent.putExtra("subjects", String.join(", ", selectedSubjects));
                intent.putExtra("rating", rating);
                startActivity(intent);
            }
        });
    }
}