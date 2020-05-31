package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class QuestionActivity2 extends AppCompatActivity {

    private TextView mScoreView2, mQuestion2;
    private Button mTrueButton2, mFalseButton2;

    private boolean mAnswer2;
    private int mScore2 = 0;
    private int mQuestionNumber2 = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question2);

        mScoreView2 = (TextView)findViewById(R.id.points2);
        mQuestion2 = (TextView)findViewById(R.id.question2);
        mTrueButton2 = (Button)findViewById(R.id.trueButton2);
        mFalseButton2 = (Button)findViewById(R.id.falseButton2);

        updateQuestion();

        mTrueButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mAnswer2 == true) {
                    if(mQuestionNumber2 == 1){
                        mScore2= mScore2+88;
                    }if(mQuestionNumber2 == 2){
                        mScore2= mScore2+68;
                    }if(mQuestionNumber2 == 3){
                        mScore2= mScore2+38;
                    }if(mQuestionNumber2 == 4){
                        mScore2= mScore2+33;
                    }if(mQuestionNumber2 == 5){
                        mScore2= mScore2+18;
                    }if(mQuestionNumber2 == 6){
                        mScore2= mScore2+14;
                    }if(mQuestionNumber2 == 7){
                        mScore2= mScore2+14;
                    }if(mQuestionNumber2 == 8){
                        mScore2= mScore2+14;
                    }if(mQuestionNumber2 == 9){
                        mScore2= mScore2+11;
                    }
                    updateScore(mScore2);

                    //perform check before you update the question
                    if (mQuestionNumber2 == QuestionLibrary_2.mQuestion2.length) {
                        Intent i = new Intent(QuestionActivity2.this, ResultsActivity2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore2", mScore2);
                        i.putExtras(bundle);
                        QuestionActivity2.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
                else {
                    if (mQuestionNumber2 == QuestionLibrary_2.mQuestion2.length) {
                        Intent i = new Intent(QuestionActivity2.this, ResultsActivity2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore2", mScore2);
                        i.putExtras(bundle);
                        QuestionActivity2.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });
        //Logic for false button
        mFalseButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(mAnswer2 == false) {
                    mScore2++;
                    updateScore(mScore2);

                    //perform check before you update the question
                    if (mQuestionNumber2 == QuestionLibrary_2.mQuestion2.length) {
                        Intent i = new Intent(QuestionActivity2.this, ResultsActivity2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore2", mScore2);
                        i.putExtras(bundle);
                        QuestionActivity2.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
                else {
                    if (mQuestionNumber2 == QuestionLibrary_2.mQuestion2.length) {
                        Intent i = new Intent(QuestionActivity2.this, ResultsActivity2.class);
                        Bundle bundle = new Bundle();
                        bundle.putInt("finalScore2", mScore2);
                        i.putExtras(bundle);
                        QuestionActivity2.this.finish();
                        startActivity(i);
                    } else {
                        updateQuestion();
                    }
                }
            }
        });

    }

    private void updateScore(int point) {
        mScoreView2.setText("" + mScore2);
    }

    private void updateQuestion() {
        mQuestion2.setText(QuestionLibrary_2.mQuestion2[mQuestionNumber2]);
        mAnswer2 = QuestionLibrary_2.answers2[mQuestionNumber2];
        mQuestionNumber2++;
    }
}
