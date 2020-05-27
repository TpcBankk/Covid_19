package com.example.covid_19;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import static com.facebook.FacebookSdk.getApplicationContext;

public class FragmentThird extends Fragment {
    ListView listView;
    String mTitle[] = {"อัพเดทสถานการณ์ 'โควิด-19' จากโคโรนาไวรัส",
            "ศบค. เผยยอดป่วยโควิด-19 วันนี้ จากโคโรนาไวรัส เตรียมผ่อนปรน",
            "ทำไม \"โควิด-19\" ถึงต้อง Lockdown แต่การระบาดไวรัสอื่นถึงไม่ใช้",
            "โควิด-19 อาจระบาด \"แบบฉับพลัน\" ในระลอกที่สอง",
            "แผนที่ อินโฟกราฟิก ผู้เสียชีวิตจากโควิด-19 ทั่วโลกเลย 2.5 แสน",
            "อัปเดตจำนวนผู้ติดเชื้อโควิด-19 ล่าสุด ทะลุ 5,600,000 บราซิลแซงขึ้นที่ 2 โลก อินเดียน่าห่วง!",
            "เศร้า ยอดเหยื่อโควิดสหรัฐฯ ทะลุ 70,000 ศพ อังกฤษดับแซงอิตาลีแล้ว",
            "สำเร็จ! 'อิสราเอล'ทำวัคซีคแอนติบอดีสู้'โควิด-19'",
            "ข่าวโควิด สถานการณ์ COVID-19 ล่าสุด ยอดผู้ติดเชื้อ",
            "ทั่วโลกติดเชื้อถึง 3.7 ล้านคน ยอดรวม 'โควิด-19' ในเอเชียพุ่งเกิน 2.5 แสน",
            "สหรัฐฯ เสียชีวิตจากโควิด-19 ทะลุแสนราย! ทั่วโลกติดเชื้อสะสมกว่า 5.6 ล้านคน",
            "เกาะติด! รายงานสถานการณ์ผู้ติดเชื้อไวรัส COVID-19 ทั่วโลก",
            "สหรัฐชมไทยเก่ง เป็น 1 ใน 5 ประเทศคุมโควิด-19 ได้",
            "โควิด-19 : ผู้ติดเชื้อรายใหม่ 3 ราย อยู่ในศูนย์กักกันของรัฐ",
            "โควิด-19 : ญี่ปุ่นยกเลิกภาวะฉุกเฉินหลังการระบาดเบาบางลง",};
    String mAgency[] = {"ที่มา: กรุงเทพธุรกิจ",
            "ที่มา: ไทยรัฐ",
            "ที่มา: ไทยรัฐ",
            "ที่มา: เดลินิวส์",
            "ที่มา: BBC",
            "ที่มา: Sanook.com",
            "ที่มา: ไทยรัฐ",
            "ที่มา: แนวหน้า",
            "ที่มา: Spring News",
            "ที่มา: bangkokinsight",
            "ที่มา: Sanook.com",
            "ที่มา: แนวหน้า",
            "ที่มา: ไทยรัฐ",
            "ที่มา: BBC",
            "ที่มา: BBC"};
    String mLink[] = {"อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>"};
    int mImages[] = {R.drawable.newss1,
            R.drawable.news1,
            R.drawable.news2,
            R.drawable.newss4,
            R.drawable.news5,
            R.drawable.newss6,
            R.drawable.news7,
            R.drawable.news8,
            R.drawable.news9,
            R.drawable.news10,
            R.drawable.newss11,
            R.drawable.newss12,
            R.drawable.newss13,
            R.drawable.newss14,
            R.drawable.newss15};

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.fragment_third,container,false);
        listView = view.findViewById(R.id.listview);

        MyAdapter adapter = new MyAdapter(getContext(), mTitle, mAgency, mLink, mImages);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if (i == 0){
                    Toast.makeText(getActivity(),"ที่มา: กรุงเทพธุรกิจ",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bangkokbiznews.com/news/detail/882068"));
                    startActivity(browserIntent);
                }
                if (i == 1){
                    Toast.makeText(getActivity(),"ที่มา: ไทยรัฐ",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thairath.co.th/news/politic/1853551"));
                    startActivity(browserIntent);
                }
                if (i == 2){
                    Toast.makeText(getActivity(),"ที่มา: ไทยรัฐ",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thairath.co.th/scoop/1837561"));
                    startActivity(browserIntent);
                }
                if (i == 3){
                    Toast.makeText(getActivity(),"ที่มา: เดลินิวส์",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dailynews.co.th/foreign/776508"));
                    startActivity(browserIntent);
                }
                if (i == 4){
                    Toast.makeText(getActivity(),"ที่มา: BBC",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bbc.com/thai/thailand-52090088"));
                    startActivity(browserIntent);
                }
                if (i == 5){
                    Toast.makeText(getActivity(),"ที่มา: Sanook",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sanook.com/news/8020722/"));
                    startActivity(browserIntent);
                }
                if (i == 6){
                    Toast.makeText(getActivity(),"ที่มา: ไทยรัฐ",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thairath.co.th/news/foreign/1837658"));
                    startActivity(browserIntent);
                }
                if (i == 7){
                    Toast.makeText(getActivity(),"ที่มา: แนวหน้า",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naewna.com/inter/491040"));
                    startActivity(browserIntent);
                }
                if (i == 8){
                    Toast.makeText(getActivity(),"ที่มา: Spring News",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.springnews.co.th/timeline/%E0%B8%82%E0%B9%88%E0%B8%B2%E0%B8%A7%E0%B9%82%E0%B8%84%E0%B8%A7%E0%B8%B4%E0%B8%94%E0%B8%A5%E0%B9%88%E0%B8%B2%E0%B8%AA%E0%B8%B8%E0%B8%94-%E0%B8%AA%E0%B8%96%E0%B8%B2%E0%B8%99%E0%B8%81%E0%B8%B2%E0%B8%A3"));
                    startActivity(browserIntent);
                }
                if (i == 9){
                    Toast.makeText(getActivity(),"ที่มา: bangkokinsight",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thebangkokinsight.com/350478/"));
                    startActivity(browserIntent);
                }
                if (i == 10){
                    Toast.makeText(getActivity(),"ที่มา: Sanook",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.sanook.com/news/8171946/"));
                    startActivity(browserIntent);
                }
                if (i == 11){
                    Toast.makeText(getActivity(),"ที่มา: แนวหน้า",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.naewna.com/inter/495077"));
                    startActivity(browserIntent);
                }
                if (i == 12){
                    Toast.makeText(getActivity(),"ที่มา: ไทยรัฐ",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thairath.co.th/news/local/bangkok/1854178"));
                    startActivity(browserIntent);
                }
                if (i == 13){
                    Toast.makeText(getActivity(),"ที่มา: BBC",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bbc.com/thai/international-52800836"));
                    startActivity(browserIntent);
                }
                if (i == 14){
                    Toast.makeText(getActivity(),"ที่มา: BBC",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bbc.com/thai/international-52792126"));
                    startActivity(browserIntent);
                }
            }
        });

        return view;
    }

    class MyAdapter extends ArrayAdapter<String>{
        Context context;
        String rTitle[];
        String rAgency[];
        String rLink[];
        int rImages[];

        MyAdapter(Context c,String title[],String agency[],String link[],int images[]){
            super(c,R.layout.row,R.id.mainTitle,title);
            this.context = c;
            this.rTitle = title;
            this.rAgency = agency;
            this.rLink = link;
            this.rImages = images;
        }

        @NonNull
        @Override
        public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
            LayoutInflater layoutInflater = (LayoutInflater)getApplicationContext().getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            View row = layoutInflater.inflate(R.layout.row, parent, false);
            ImageView images = row.findViewById(R.id.imagelist);
            TextView myTitle = row.findViewById(R.id.mainTitle);
            TextView myAgency = row.findViewById(R.id.agencyTitle);
            TextView myLink = row.findViewById(R.id.linkTitle);

            images.setImageResource(rImages[position]);
            myTitle.setText(rTitle[position]);
            myAgency.setText(rAgency[position]);
            myLink.setText(rLink[position]);

            return row;
        }
    }
}
