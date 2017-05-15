package com.example.android.quizapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.RatingBar;
import android.widget.TextView;

import java.util.ArrayList;


public class ResultsActivity extends AppCompatActivity {

    ArrayList<String> answers = new ArrayList<>();
    TextView answersTextView = (TextView) findViewById(R.id.answers_text_view);

    int count = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);

        TextView resultTextView = (TextView) findViewById(R.id.result_text_view);
        RatingBar ratingBar = (RatingBar) findViewById(R.id.ratingBar);

        Bundle data = this.getIntent().getExtras();
        int correctAnswers = data.getInt("correct");

        switch (correctAnswers) {
            case 0:
                ratingBar.setRating(0.0f);
                resultTextView.setText(getString(R.string.zero_outOf_ten));
                break;
            case 1:
                ratingBar.setRating(0.5f);
                resultTextView.setText(getString(R.string.one_outOf_ten));
                break;
            case 2:
                ratingBar.setRating(1.0f);
                resultTextView.setText(getString(R.string.two_outOf_ten));
                break;
            case 3:
                ratingBar.setRating(1.5f);
                resultTextView.setText(getString(R.string.three_outOf_ten));
                break;
            case 4:
                ratingBar.setRating(2.0f);
                resultTextView.setText(getString(R.string.four_outOf_ten));
                break;
            case 5:
                ratingBar.setRating(2.5f);
                resultTextView.setText(getString(R.string.five_outOf_ten));
                break;
            case 6:
                ratingBar.setRating(3.0f);
                resultTextView.setText(getString(R.string.six_outOf_ten));
                break;
            case 7:
                ratingBar.setRating(3.5f);
                resultTextView.setText(getString(R.string.seven_outOf_ten));
                break;
            case 8:
                ratingBar.setRating(4.0f);
                resultTextView.setText(getString(R.string.eight_outOf_ten));
                break;
            case 9:
                ratingBar.setRating(4.5f);
                resultTextView.setText(getString(R.string.nine_outOf_ten));
                break;
            case 10:
                ratingBar.setRating(5.0f);
                resultTextView.setText(getString(R.string.ten_outOf_ten));
                break;
        }

        answers.add("Question No.1:\n\n" + getResources().getString(R.string.answer_1_1));
        answers.add("Question No.2:\n\n" + getResources().getString(R.string.answer_2_2));
        answers.add("Question No.3:\n\n -1");
        answers.add("Question No.4:\n\n 4");
        answers.add("Question No.5:\n\n" + getResources().getString(R.string.answer_5_1));
        answers.add("Question No.6:\n\n" + getResources().getString(R.string.answer_6_3));
        answers.add("Question No.7:\n\n" + getResources().getString(R.string.answer_7_1));
        answers.add("Question No.8:\n\n" + getResources().getString(R.string.answer_8_2));
        answers.add("Question No.9:\n\n" + getResources().getString(R.string.answer_9_4));
        answers.add("Question No.10:\n\n" + getResources().getString(R.string.answer_10_1));

        answersTextView.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {

                    answersTextView.setText(answers.get(count));
                    count++;
                    if(count == answers.size()) {
                        count = 0;
                    }
                //answersTextView.setText(answers.get((int) (Math.random() *answers.size())));
            }
        });
    }
}
