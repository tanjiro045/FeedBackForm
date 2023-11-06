package com.example.mcprac2;

import android.content.Intent;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class FeedbackDetailsActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_feedback_details);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String gender = intent.getStringExtra("gender");
        String subjects = intent.getStringExtra("subjects");
        float rating = intent.getFloatExtra("rating", 0.0f);
        TextView textViewDetails = findViewById(R.id.textView7);
        String details = "Name: " + name + "\nGender: " + gender +
                "\nSubjects: " + subjects +
                "\nRating: " + rating;
        textViewDetails.setText(details);

    }
}
