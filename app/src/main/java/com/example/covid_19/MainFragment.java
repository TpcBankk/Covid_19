package com.example.covid_19;

import android.content.Context;
import android.net.Uri;
import android.view.View;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.os.Bundle;
import android.widget.Button;


import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class MainFragment extends Fragment {
    private onFragmentBtnSelected listener;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle saveInstanceState){
        View view = inflater.inflate(R.layout.fragment_main,container,false);
        Button clickme = view.findViewById(R.id.load);
        clickme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                listener.onButtonSelected();
            }
        });
        return view;
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof onFragmentBtnSelected){

        }else{
            throw new ClassCastException(context.toString() + "Must implement listener");
        }
        listener = (onFragmentBtnSelected) context;
    }

    public interface onFragmentBtnSelected{
        public void onButtonSelected();
    }
}
