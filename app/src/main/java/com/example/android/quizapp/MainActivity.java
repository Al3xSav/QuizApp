package com.example.android.quizapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity {

    private static final String STATE_SCORE = "stateOfScore";
    private int score = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void onSaveInstanceState(Bundle savedInstanceState) {
        savedInstanceState.putInt(STATE_SCORE, score);
        super.onSaveInstanceState(savedInstanceState);
    }

    @Override
    public void onRestoreInstanceState(Bundle savedInstanceState) {
        super.onRestoreInstanceState(savedInstanceState);
        savedInstanceState.getInt(STATE_SCORE);
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

    }

    /* Question Number 1 */
    public int questionNo1() {
        RadioGroup questionOne = (RadioGroup) findViewById(R.id.questions_1);
        RadioButton answer_1 = (RadioButton) findViewById(R.id.answer_1_1);

        /* Answer No. 1 */
        if (questionOne.getCheckedRadioButtonId() == -1) {
            return 0;
        } else {
            if (answer_1.isChecked()) {
                return 1;
            }
        }
        return 0;
    }

    /* Question Number 2 */
    public int questionNo2() {
        RadioGroup questionTwo = (RadioGroup) findViewById(R.id.questions_2);
        RadioButton answer_2 = (RadioButton) findViewById(R.id.answer_2_2);

        /* Answer No. 3 */
        if (questionTwo.getCheckedRadioButtonId() == -1) {
            return 0;
        } else {
            if (answer_2.isChecked()) {
                return 1;
            }
        }
        return 0;
    }

    /* Question Number 3 */
    public int questionNo3() {
        EditText answer_3 = (EditText) findViewById(R.id.answer_3);

        /* Answer No. 2 */
        if (answer_3.getText().toString().equals("")) {
            return 0;
        } else {
            if (answer_3.getText().toString().equals("-1")) {
                return 1;
            }
        }
        return 0;
    }

    /* Question Number 4 */
    public int questionNo4 () {
        EditText answer_4 = (EditText) findViewById(R.id.answer_4);

        /* Answer No. 4 */
        if (answer_4.getText().toString().equals("")) {
            return 0;
        } else {
            if (answer_4.getText().toString().equals("4")) {
                return 1;
            }
        }
        return 0;
    }

    /* Question Number 5 */
    public int questionNo5() {
        RadioGroup questionFive = (RadioGroup) findViewById(R.id.questions_5);
        RadioButton answer_5 = (RadioButton) findViewById(R.id.answer_5_1);

        /* Answer No. 5 */
        if (questionFive.getCheckedRadioButtonId() == -1) {
            return 0;
        } else {
            if (answer_5.isChecked()) {
                return 1;
            }
        }
        return 0;
    }

    /* Question Number 6 */
    public int questionNo6() {
        RadioGroup questionSix = (RadioGroup) findViewById(R.id.questions_6);
        RadioButton answer_6 = (RadioButton) findViewById(R.id.answer_6_3);

        /* Answer No. 6 */
        if (questionSix.getCheckedRadioButtonId() == -1) {
            return 0;
        } else {
            if (answer_6.isChecked()) {
                return 1;
            }
        }
        return 0;
    }

    /* Question Number 7 */
    public int questionNo7() {
        RadioGroup questionSeven = (RadioGroup) findViewById(R.id.questions_7);
        RadioButton answer_7 = (RadioButton) findViewById(R.id.answer_7_1);

        /* Answer No. 7 */
        if (questionSeven.getCheckedRadioButtonId() == -1) {
            return 0;
        } else {
            if (answer_7.isChecked()) {
                return 1;
            }
        }
        return 0;
    }

    /* Question Number 8 */
    public int questionNo8() {
        RadioGroup questionEight = (RadioGroup) findViewById(R.id.questions_8);
        RadioButton answer_8 = (RadioButton) findViewById(R.id.answer_8_2);

        /* Answer No. 8 */
        if (questionEight.getCheckedRadioButtonId() == -1) {
            return 0;
        } else {
            if (answer_8.isChecked()) {
                return 1;
            }
        }
        return 0;
    }

    /* Question Number 9 */
    public int questionNo9() {
        RadioGroup questionNine = (RadioGroup) findViewById(R.id.questions_9);
        RadioButton answer_9 = (RadioButton) findViewById(R.id.answer_9_4);

        /* Answer No. 9 */
        if (questionNine.getCheckedRadioButtonId() == -1) {
            return 0;
        } else {
            if (answer_9.isChecked()) {
                return 1;
            }
        }
        return 0;
    }

    /* Question Number 10 */
    public int questionNo10() {
        RadioGroup questionTen = (RadioGroup) findViewById(R.id.questions_10);
        RadioButton answer_10 = (RadioButton) findViewById(R.id.answer_10_1);

        /* Answer No. 10 */
        if (questionTen.getCheckedRadioButtonId() == -1) {
            return 0;
        } else {
            if (answer_10.isChecked()) {
                return 1;
            }
        }
        return 0;
    }
}
