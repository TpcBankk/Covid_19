package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ResultsActivity extends AppCompatActivity {

    TextView mGrade, mFinalScore;
    Button mRetryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        mGrade = (TextView)findViewById(R.id.grade);
        mRetryButton = (Button)findViewById(R.id.retry);

        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore");

        if (score == 1|| score == 2){
            mGrade.setText("ควรเฝ้าระวัง");

        }else if (score == 3|| score == 4){
            mGrade.setText("อยู่ในกลุ่มเสี่ยง");

        }else {
            mGrade.setText("ไม่มีความเสี่ยง");
        }


        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultsActivity.this, QuestionActivity2.class));
                ResultsActivity.this.finish();
            }
        });


    }
}
