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
            "ศบค. เผยยอดผู้ป่วยโควิด-19 วันนี้ ย้ำมาตรการผ่อนปรน",
            "ทำไม \"โควิด-19\" ถึงต้อง Lockdown แต่การระบาดไวรัสอื่นถึงไม่ใช้",
            "โควิดวันนี้ !!ศบค.แจงติดเชื้อเพิ่ม1ราย เสียชีวิตอีก 1ราย",
            "แผนที่ อินโฟกราฟิก ผู้เสียชีวิตจากโควิด-19 ทั่วโลกเลย 2.5 แสน",
            "ข่าวดี! ไทยพบผู้ติดเชื้อ 'โควิด-19' เพิ่ม 1 ราย ไม่มีผู้เสียชีวิตเพิ่ม",
            "เศร้า ยอดเหยื่อโควิดสหรัฐฯ ทะลุ 70,000 ศพ อังกฤษดับแซงอิตาลีแล้ว",
            "สำเร็จ! 'อิสราเอล'ทำวัคซีคแอนติบอดีสู้'โควิด-19'",
            "ข่าวโควิด สถานการณ์ COVID-19 ล่าสุด ยอดผู้ติดเชื้อ",
            "ทั่วโลกติดเชื้อถึง 3.7 ล้านคน ยอดรวม 'โควิด-19' ในเอเชียพุ่งเกิน 2.5 แสน"};
    String mAgency[] = {"ที่มา: กรุงเทพธุรกิจ",
            "ที่มา: ไทยรัฐ",
            "ที่มา: ไทยรัฐ",
            "ที่มา: เดลินิวส์",
            "ที่มา: BBC",
            "ที่มา: กรุงเทพธุรกิจ",
            "ที่มา: ไทยรัฐ",
            "ที่มา: แนวหน้า",
            "ที่มา: Spring News",
            "ที่มา: bangkokinsight"};
    String mLink[] = {"อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>","อ่านเพิ่มเติม click here>>"};
    int mImages[] = {R.drawable.updatec,
            R.drawable.news1,
            R.drawable.news2,
            R.drawable.news3,
            R.drawable.news5,
            R.drawable.news6,
            R.drawable.news7,
            R.drawable.news8,
            R.drawable.news9,
            R.drawable.news10};

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
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bangkokbiznews.com/news/detail/879044"));
                    startActivity(browserIntent);
                }
                if (i == 1){
                    Toast.makeText(getActivity(),"ที่มา: ไทยรัฐ",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thairath.co.th/news/politic/1837763"));
                    startActivity(browserIntent);
                }
                if (i == 2){
                    Toast.makeText(getActivity(),"ที่มา: ไทยรัฐ",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.thairath.co.th/scoop/1837561"));
                    startActivity(browserIntent);
                }
                if (i == 3){
                    Toast.makeText(getActivity(),"ที่มา: เดลินิวส์",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.dailynews.co.th/politics/772939"));
                    startActivity(browserIntent);
                }
                if (i == 4){
                    Toast.makeText(getActivity(),"ที่มา: BBC",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bbc.com/thai/thailand-52090088"));
                    startActivity(browserIntent);
                }
                if (i == 5){
                    Toast.makeText(getActivity(),"ที่มา: กรุงเทพธุรกิจ",Toast.LENGTH_SHORT).show();
                    Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.bangkokbiznews.com/news/detail/879072"));
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
