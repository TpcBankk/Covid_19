package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class QuizActivity extends AppCompatActivity {

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView,mScoreView2;
    private  TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;

    private String mAnswer;
    private int mScore = 0;
    private int mScore2 = 0;
    private int mQuestionNumber = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);

        mScoreView = (TextView)findViewById(R.id.score);
        mScoreView2 = (TextView)findViewById(R.id.score2);
        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button) findViewById(R.id.choicel_1);
        mButtonChoice2 = (Button) findViewById(R.id.choicel_2);

        updateQuestion();



        //Start of button1
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mButtonChoice1.getText() == mAnswer){
                    if(mQuestionNumber <= 4 ){
                        mScore = mScore + 1;
                        updateScore(mScore);

                    }if (mQuestionNumber > 4) {
                        mScore2 = mScore2 + 1;
                        updateScore(mScore2);
                    }
                    updateScore(mScore);
                    updateQuestion();
                }else {
                    updateQuestion();
                }
            }
        });
        //END of button1
        //Start of button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                if(mButtonChoice2.getText() == mAnswer){
                    if(mQuestionNumber <= 4 ){
                        mScore = mScore + 1;
                        updateScore(mScore);

                    }if (mQuestionNumber > 4){
                        mScore2 = mScore2 + 1;
                        updateScore(mScore2);
                    }
                    updateScore(mScore);
                    updateQuestion();
                }else {
                    updateQuestion();
                }
            }
        });
        //END of button2

    }

    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrentAnswer(mQuestionNumber);
        mQuestionNumber++;
        if(mQuestionNumber>10)
        {
            Intent resultIntent = new Intent (this, ResultActivity.class);
            resultIntent.putExtra("Score",mScore);
            resultIntent.putExtra("Score2",mScore2);
            startActivity(resultIntent);
        }
    }

    private void updateScore(int point){
        mScoreView.setText("" + mScore);
        mScoreView2.setText("" + mScore2);
    }

}
