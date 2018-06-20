package com.example.android.quiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void submitAnswers(View view) {
        CharSequence resultsDisplay;

        int score = 0;

        RadioButton question1_answer = (RadioButton) findViewById(R.id.question_1_option_3);

        if (question1_answer.isChecked()) {
            score += 1;
        }

        EditText question2_answer = (EditText) findViewById(R.id.question_2_answer);
        if (question2_answer.getText().toString().toLowerCase().equals(getString(R.string.question_2_answer))) {
            score += 1;
        }

        CheckBox checkBox1 = (CheckBox) findViewById(R.id.question_3_option_1);
        CheckBox checkBox2 = (CheckBox) findViewById(R.id.question_3_option_2);
        CheckBox checkBox3 = (CheckBox) findViewById(R.id.question_3_option_3);
        CheckBox checkBox4 = (CheckBox) findViewById(R.id.question_3_option_4);

        if (checkBox1.isChecked() && !checkBox2.isChecked() && checkBox3.isChecked() && !checkBox4.isChecked()) {
            score += 1;
        }

        EditText question3_answer = (EditText) findViewById(R.id.question_4_answer);
        if (question3_answer.getText().toString().toLowerCase().equals(getString(R.string.question_4_answer))) {
            score += 1;
        }

        if (score == 4) {
            resultsDisplay = getString(R.string.all_answers_correct);
        } else {
            resultsDisplay = "Try again. You scored " + score + " out of 4";
        }

        Toast.makeText(this, resultsDisplay, Toast.LENGTH_LONG).show();
    }
}
