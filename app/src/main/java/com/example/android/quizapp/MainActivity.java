package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import static com.example.android.quizapp.R.id.answer_3;
import static com.example.android.quizapp.R.id.answer_4;

public class MainActivity extends AppCompatActivity {

    private static final String STATE_SCORE = "stateOfScore";
    private int score;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        if(savedInstanceState != null) {
            savedInstanceState.putInt(STATE_SCORE, score);
            super.onSaveInstanceState(savedInstanceState);
        }
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        if(savedInstanceState != null) {
            super.onRestoreInstanceState(savedInstanceState);
            savedInstanceState.getInt(STATE_SCORE);
        }
    }

    public void submitAnswers(View view) {

        score += questionNo1();
        score += questionNo2();
        score += questionNo3();
        score += questionNo4();
        score += questionNo5();
        score += questionNo6();
        score += questionNo7();
        score += questionNo8();
        score += questionNo9();
        score += questionNo10();

        Intent mainToResultsIntent = new Intent(MainActivity.this, ResultsActivity.class);
        mainToResultsIntent.putExtra("correct", score);
        startActivity(mainToResultsIntent);

        score = 0;

    }

    /* Question Number 1 */
    public int questionNo1() {
        RadioGroup questionOne = (RadioGroup) findViewById(R.id.questions_1);
        RadioButton answer1 = (RadioButton) findViewById(R.id.answer_1_1);

        /* Answer No. 1 */
        if (questionOne.getCheckedRadioButtonId() == -1) {
            return 0;
        } else {
            if (answer1.isChecked()) {
                return 1;
            }
        }
        return 0;
    }

    /* Question Number 2 */
    public int questionNo2() {
        RadioGroup questionTwo = (RadioGroup) findViewById(R.id.questions_2);
        RadioButton answer2 = (RadioButton) findViewById(R.id.answer_2_2);

        /* Answer No. 3 */
        if (questionTwo.getCheckedRadioButtonId() == -1) {
            return 0;
        } else {
            if (answer2.isChecked()) {
                return 1;
            }
        }
        return 0;
    }

    /* Question Number 3 */
    public int questionNo3() {
        EditText answer3 = (EditText) findViewById(answer_3);

        /* Answer No. 2 */
        if (answer3.getText().toString().equals("")) {
            return 0;
        } else {
            if (answer3.getText().toString().equals("-1")) {
                return 1;
            }
        }
        return 0;
    }

    /* Question Number 4 */
    public int questionNo4 () {
        EditText answer4 = (EditText) findViewById(answer_4);

        /* Answer No. 4 */
        if (answer4.getText().toString().equals("")) {
            return 0;
        } else {
            if (answer4.getText().toString().equals("4")) {
                return 1;
            }
        }
        return 0;
    }

    /* Question Number 5 */
    public int questionNo5() {
        RadioGroup questionFive = (RadioGroup) findViewById(R.id.questions_5);
        RadioButton answer5 = (RadioButton) findViewById(R.id.answer_5_1);

        /* Answer No. 5 */
        if (questionFive.getCheckedRadioButtonId() == -1) {
            return 0;
        } else {
            if (answer5.isChecked()) {
                return 1;
            }
        }
        return 0;
    }

    /* Question Number 6 */
    public int questionNo6() {
        RadioGroup questionSix = (RadioGroup) findViewById(R.id.questions_6);
        RadioButton answer6 = (RadioButton) findViewById(R.id.answer_6_3);

        /* Answer No. 6 */
        if (questionSix.getCheckedRadioButtonId() == -1) {
            return 0;
        } else {
            if (answer6.isChecked()) {
                return 1;
            }
        }
        return 0;
    }

    /* Question Number 7 */
    public int questionNo7() {
        RadioGroup questionSeven = (RadioGroup) findViewById(R.id.questions_7);
        RadioButton answer7 = (RadioButton) findViewById(R.id.answer_7_1);

        /* Answer No. 7 */
        if (questionSeven.getCheckedRadioButtonId() == -1) {
            return 0;
        } else {
            if (answer7.isChecked()) {
                return 1;
            }
        }
        return 0;
    }

    /* Question Number 8 */
    public int questionNo8() {
        CheckBox answer81 = (CheckBox) findViewById(R.id.answer_8_1);
        CheckBox answer82 = (CheckBox) findViewById(R.id.answer_8_2);
        CheckBox answer83 = (CheckBox) findViewById(R.id.answer_8_3);
        CheckBox answer84 = (CheckBox) findViewById(R.id.answer_8_4);

        /* Answer No. 8 */
        if (answer81.isChecked() && !answer82.isChecked() && answer83.isChecked()
                && answer84.isChecked()) {
            return 1;
        } else {
            return 0;
        }
    }

    /* Question Number 9 */
    public int questionNo9() {
        RadioGroup questionNine = (RadioGroup) findViewById(R.id.questions_9);
        RadioButton answer9 = (RadioButton) findViewById(R.id.answer_9_4);

        /* Answer No. 9 */
        if (questionNine.getCheckedRadioButtonId() == -1) {
            return 0;
        } else {
            if (answer9.isChecked()) {
                return 1;
            }
        }
        return 0;
    }

    /* Question Number 10 */
    public int questionNo10() {
        RadioGroup questionTen = (RadioGroup) findViewById(R.id.questions_10);
        RadioButton answer10 = (RadioButton) findViewById(R.id.answer_10_1);

        /* Answer No. 10 */
        if (questionTen.getCheckedRadioButtonId() == -1) {
            return 0;
        } else {
            if (answer10.isChecked()) {
                return 1;
            }
        }
        return 0;
    }
}
