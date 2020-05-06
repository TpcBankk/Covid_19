package com.example.covid_19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class ResultsActivity2 extends AppCompatActivity {

    TextView mGrade, mFinalScore,mDetail;
    Button mRetryButton;
    ImageView mImageView;
    DatabaseReference reff;
    FirebaseAuth fAuth;
    FirebaseUser currentUser;
    Result result;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results2);

        mGrade = (TextView)findViewById(R.id.grade2);
        mRetryButton = (Button)findViewById(R.id.retry2);
        mImageView = (ImageView)findViewById(R.id.imageResult);
        mDetail = (TextView)findViewById(R.id.detail);
        fAuth = FirebaseAuth.getInstance();
        currentUser = fAuth.getCurrentUser();
        result = new Result();
        reff = FirebaseDatabase.getInstance().getReference().child("Result");

        Bundle bundle = getIntent().getExtras();
        final int score = bundle.getInt("finalScore2");


        if ((score >7 && score <=14) ){
            mGrade.setText("ควรเฝ้าระวัง");
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.lv2));
            mDetail.setText("เฟส2 :ผู้ใช้งานอยู่ในระยะควรเฝ้าระวัฃอาการโดยให้ดูและสุขภาพตัวเองและพักผ่อนให้เพียงพอและควรกักตัวเองอยู่ในบ้าน14-27วันเพื่อเฝ้าดูอาการและลดความเสี่ยงในการพบและกระจายเชื้อ");
        }else if (score > 14 ){
            mGrade.setText("อยู่ในกลุ่มเสี่ยง");
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.lv3));
            mDetail.setText("เฟส3 :หากมีอาการดังกล่าว ควรพบแพทย์เพื่อทำการตรวจอย่างละเอียด และเมื่อแพทย์ซักถามควรตอบตามความเป็นจริง ไม่ปิดบัง ไม่บิดเบือนข้อมูลใด ๆ เพราะจะเป็นประโยชน์ต่อการวินิจฉัยโรคอย่างถูกต้องมากที่สุดและ\n" +
                    "หากเพิ่งเดินทางกลับจากพื้นที่เสี่ยง ควรกักตัวเองอยู่แต่ในบ้าน ไม่ออกไปข้างนอกเป็นเวลา 14-27 วัน เพื่อให้ผ่านช่วงเชื้อฟักตัว");
        }else {
            mGrade.setText("ไม่มีความเสี่ยง");
            mImageView.setImageDrawable(getResources().getDrawable(R.drawable.lv1));
            mDetail.setText("เฟส1 : ให้ผู้ใช้งานหลีกเลี่ยงการเดินทางไปในสถานที่เสี่ยงและลดการพบปะผู้คนและทำการกักตัวเองอยู่ในบ้านเป็นเวลา 14-27วันเพื่อลดความเสี่ยงในการออกไปพบเชื่อ");
        }

        mRetryButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ResultsActivity2.this, MainActivity.class));
                ResultsActivity2.this.finish();
                int result2 = score;


                if(result2 >7 && result2 <=14 ){
                    result.setAccount(currentUser.getEmail());
                    result.setResult2(mGrade.getText().toString());
                }
                else if(result2 > 14){
                    result.setAccount(currentUser.getEmail());
                    result.setResult2(mGrade.getText().toString());
                }
                else{
                    result.setAccount(currentUser.getEmail());
                    result.setResult2(mGrade.getText().toString());
                }
                reff.push().setValue(result);
            }
        });
    }
}
