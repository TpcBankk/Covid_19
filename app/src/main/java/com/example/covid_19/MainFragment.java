package com.example.covid_19;

import android.Manifest;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.TextView;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class MainFragment extends Fragment {

   ImageButton imageButton1,imageButton2,imageButton3,imageButton4,imageButton5,imageButton6,imageButton7,imageButton8;
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstanceState){
        // Each row in the list stores country name, currency and flag
        View view = inflater.inflate(R.layout.fragment_main,container,false);

        imageButton1 = (ImageButton)view.findViewById(R.id.imageHospitalchula);
        imageButton2 = (ImageButton)view.findViewById(R.id.imageHospitalratvithi);
        imageButton3 = (ImageButton)view.findViewById(R.id.imageHospitalpaolo);
        imageButton4 = (ImageButton)view.findViewById(R.id.imageHospitalrama);
        imageButton5 = (ImageButton)view.findViewById(R.id.imageHospitalbpk);
        imageButton6 = (ImageButton)view.findViewById(R.id.imageHospitalphyathai2);
        imageButton7 = (ImageButton)view.findViewById(R.id.imageHospitalrangsit);
        imageButton8 = (ImageButton)view.findViewById(R.id.imageHospitalsirirat);

        imageButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:026494000"));
                startActivity(callIntent);
            }
        });

        imageButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:023548108"));
                startActivity(callIntent);
            }
        });

        imageButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:022717000"));
                startActivity(callIntent);
            }
        });

        imageButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:022011000"));
                startActivity(callIntent);
            }
        });

        imageButton5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:021099111"));
                startActivity(callIntent);
            }
        });

        imageButton6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:022716700"));
                startActivity(callIntent);
            }
        });

        imageButton7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:029989999"));
                startActivity(callIntent);
            }
        });

        imageButton8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent callIntent = new Intent(Intent.ACTION_DIAL);
                callIntent.setData(Uri.parse("tel:024197000"));
                startActivity(callIntent);
            }
        });
        return view;
    }

}
