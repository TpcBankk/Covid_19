package com.example.covid_19;

import android.net.Uri;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup comtainer, @Nullable Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.fragment_main,comtainer,false);
        return view;
    }
}
