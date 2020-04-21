package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ResultsActivity2 extends AppCompatActivity {

    TextView mGrade, mFinalScore;
    Button mRetryButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results2);

        mGrade = (TextView)findViewById(R.id.grade2);
        mRetryButton = (Button)findViewById(R.id.retry2);


        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore2");

        if (score >7 && score <=14){
            mGrade.setText("ควรเฝ้าระวัง");
        }else if (score > 14){
            mGrade.setText("อยู่ในกลุ่มเสี่ยง");
        }else {
            mGrade.setText("ไม่มีความเสี่ยง");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultsActivity2.this, MainActivity.class));
                ResultsActivity2.this.finish();
            }
        });
    }
}
