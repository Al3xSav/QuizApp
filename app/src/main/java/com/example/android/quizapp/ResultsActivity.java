package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.util.ArrayList;


public class ResultsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        TextView resultTextView = (TextView) findViewById(R.id.result_text_view);
        TextView answersTextView = (TextView) findViewById(R.id.answers_text_view);

        Bundle data = this.getIntent().getExtras();
        int correctAnswers = data.getInt("correct");

        switch (correctAnswers) {
            case 0:
                resultTextView.setText(getString(R.string.zero_outOf_ten));
                break;
            case 1:
                resultTextView.setText(getString(R.string.one_outOf_ten));
                break;
            case 2:
                resultTextView.setText(getString(R.string.two_outOf_ten));
                break;
            case 3:
                resultTextView.setText(getString(R.string.three_outOf_ten));
                break;
            case 4:
                resultTextView.setText(getString(R.string.four_outOf_ten));
                break;
            case 5:
                resultTextView.setText(getString(R.string.five_outOf_ten));
                break;
            case 6:
                resultTextView.setText(getString(R.string.six_outOf_ten));
                break;
            case 7:
                resultTextView.setText(getString(R.string.seven_outOf_ten));
                break;
            case 8:
                resultTextView.setText(getString(R.string.eight_outOf_ten));
                break;
            case 9:
                resultTextView.setText(getString(R.string.nine_outOf_ten));
                break;
            case 10:
                resultTextView.setText(getString(R.string.ten_outOf_ten));
                break;
        }


        answersTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                ArrayList<String> answers = new ArrayList<>();

                answers.add("Question No.1: " + getResources().getString(R.string.answer_1_1));
                answers.add("Question No.2: " + getResources().getString(R.string.answer_2_4));
                answers.add("Question No.3: " + getResources().getString(R.string.answer_3_2));
                answers.add("Question No.4: " + getResources().getString(R.string.answer_4_3));
                answers.add("Question No.5: " + getResources().getString(R.string.answer_5_1));
                answers.add("Question No.6: " + getResources().getString(R.string.answer_6_3));
                answers.add("Question No.7: " + getResources().getString(R.string.answer_7_1));
                answers.add("Question No.8: " + getResources().getString(R.string.answer_8_2));
                answers.add("Question No.9: " + getResources().getString(R.string.answer_9_4));
                answers.add("Question No.10: " + getResources().getString(R.string.answer_10_1));



                TextView answersTextView = (TextView) findViewById(R.id.answers_text_view);
                answersTextView.setText(answers.get((int) (Math.random() *answers.size())));
            }
        });
    }
}
