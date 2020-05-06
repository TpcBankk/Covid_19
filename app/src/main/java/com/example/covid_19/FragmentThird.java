package com.example.covid_19;

import android.content.Context;
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
    String mTitle[] = {"อัพเดทสถานการณ์ 'โควิด-19' จากโคโรนาไวรัส","อัพเดทสถานการณ์ 'โควิด-19' จากโคโรนาไวรัส","อัพเดทสถานการณ์ 'โควิด-19' จากโคโรนาไวรัส","อัพเดทสถานการณ์ 'โควิด-19' จากโคโรนาไวรัส","อัพเดทสถานการณ์ 'โควิด-19' จากโคโรนาไวรัส"};
    String mAgency[] = {"ไทยรัฐ","ไทยรัฐ","ไทยรัฐ","ไทยรัฐ","ไทยรัฐ"};
    String mLink[] = {"https://www.google.com","https://www.bangkokbiznews.com/news/detail/879044","https://www.bangkokbiznews.com/news/detail/879044","https://www.bangkokbiznews.com/news/detail/879044","https://www.bangkokbiznews.com/news/detail/879044"};
    int mImages[] = {R.drawable.updatec,R.drawable.updatec,R.drawable.updatec,R.drawable.updatec,R.drawable.updatec};

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
                    Toast.makeText(getActivity(),"ไทยรัฐ",Toast.LENGTH_SHORT).show();
                }
                if (i == 0){
                    Toast.makeText(getActivity(),"ไทยรัฐ",Toast.LENGTH_SHORT).show();
                }
                if (i == 0){
                    Toast.makeText(getActivity(),"ไทยรัฐ",Toast.LENGTH_SHORT).show();
                }
                if (i == 0){
                    Toast.makeText(getActivity(),"ไทยรัฐ",Toast.LENGTH_SHORT).show();
                }
                if (i == 0){
                    Toast.makeText(getActivity(),"ไทยรัฐ",Toast.LENGTH_SHORT).show();
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
