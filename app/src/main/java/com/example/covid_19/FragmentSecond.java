package com.example.covid_19;

import androidx.fragment.app.Fragment;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class FragmentSecond extends Fragment {
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.fragment_second,container,false);
        return view;
    }
}
