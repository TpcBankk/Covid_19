package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ResultsActivity2 extends AppCompatActivity {

    TextView mGrade, mFinalScore,mDetail;
    Button mRetryButton;
    ImageView mImageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results2);

        mGrade = (TextView)findViewById(R.id.grade2);
        mRetryButton = (Button)findViewById(R.id.retry2);
        mImageView = (ImageView)findViewById(R.id.imageResult);
        mDetail = (TextView)findViewById(R.id.detail);


        Bundle bundle = getIntent().getExtras();
        int score = bundle.getInt("finalScore2");

        if (score >7 && score <=14){
            mGrade.setText("ควรเฝ้าระวัง");
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.lv2));
            mDetail.setText("ไวรัสโคโรนาสายพันธุ์ใหม่ หรือที่เรียกอีกชื่อหนึ่งว่า COVID-19 | โควิด19 ที่กำลังระบาดอยู่ในขณะนี้ มีความรุนแรงเทียบเท่ากับโรคซาร์สมากที่สุด ทำให้ผู้ป่วยมีอาการปอดอักเสบร");
        }else if (score > 14){
            mGrade.setText("อยู่ในกลุ่มเสี่ยง");
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.lv3));
            mDetail.setText("ไวรัสโคโรนาสายพันธุ์ใหม่ หรือที่เรียกอีกชื่อหนึ่งว่า COVID-19 | โควิด19 ที่กำลังระบาดอยู่ในขณะนี้ มีความรุนแรงเทียบเท่ากับโรคซาร์สมากที่สุด ทำให้ผู้ป่วยมีอาการปอดอักเสบร");
        }else {
            mGrade.setText("ไม่มีความเสี่ยง");
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.lv1));
            mDetail.setText("ไวรัสโคโรนาสายพันธุ์ใหม่ หรือที่เรียกอีกชื่อหนึ่งว่า COVID-19 | โควิด19 ที่กำลังระบาดอยู่ในขณะนี้ มีความรุนแรงเทียบเท่ากับโรคซาร์สมากที่สุด ทำให้ผู้ป่วยมีอาการปอดอักเสบร");
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
