package com.example.myapplication7;

import android.os.Bundle;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TimePicker;
import android.widget.CheckBox;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private EditText feedbackNameEditText;
    private DatePicker datePicker;
    private TimePicker timePicker;
    private RadioGroup ratingGroup;
    private EditText feedbackCommentsEditText;
    private CheckBox subscribeCheckBox;
    private Button submitFeedbackButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        feedbackNameEditText = findViewById(R.id.feedback_name);
        datePicker = findViewById(R.id.date_picker);
        timePicker = findViewById(R.id.time_picker);
        ratingGroup = findViewById(R.id.rating_group);
        feedbackCommentsEditText = findViewById(R.id.feedback_comments);
        subscribeCheckBox = findViewById(R.id.subscribe_checkbox);
        submitFeedbackButton = findViewById(R.id.submit_feedback_button);

        submitFeedbackButton.setOnClickListener(v -> {
            String name = feedbackNameEditText.getText().toString();
            int selectedRatingId = ratingGroup.getCheckedRadioButtonId();
            RadioButton selectedRating = findViewById(selectedRatingId);
            String rating = selectedRating != null ? selectedRating.getText().toString() : "No rating";
            String comments = feedbackCommentsEditText.getText().toString();
            boolean isSubscribed = subscribeCheckBox.isChecked();

            int day = datePicker.getDayOfMonth();
            int month = datePicker.getMonth();
            int year = datePicker.getYear();

            int hour = timePicker.getCurrentHour();
            int minute = timePicker.getCurrentMinute();

            // Handle the form submission (e.g., save data, show confirmation, etc.)
            // Example: Show collected data in a log or Toast for demonstration
            // Here, you can use a Toast or send the data to a backend or display it as needed
        });
    }
}
