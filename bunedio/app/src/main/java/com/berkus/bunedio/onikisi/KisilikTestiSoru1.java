package com.berkus.bunedio.onikisi;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class KisilikTestiSoru1 extends Fragment implements AdapterView.OnItemSelectedListener {
    private ImageView imageErkek,imageKadin;
    private Button buttonKadin,buttonErkek;
    private TextView secilenCinsiyet;
    private OnGenderSelectedListener listener;

    public KisilikTestiSoru1() {

    }

    public void setOnGenderSelectedListener(OnGenderSelectedListener listener) {
        this.listener = listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_kisilik_testi_soru1,container,false);
        imageErkek=view.findViewById(R.id.imageErkek);
        imageKadin=view.findViewById(R.id.imageKadin);
        buttonErkek=view.findViewById(R.id.buttonErkek);
        buttonKadin=view.findViewById(R.id.buttonKadin);
        secilenCinsiyet=view.findViewById(R.id.secilenCinsiyet);

        buttonErkek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secilenCinsiyet.setText("Erkek seçeneğini seçtiniz");
            }
        });

        buttonKadin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                secilenCinsiyet.setText("Kadın seçeneğini seçtiniz");
            }
        });


        return view;
    }



    public void onİtemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedGender=parent.getItemAtPosition(position).toString();
        if(listener != null){
            listener.onGenderSelected(selectedGender);
        }
    }

    @Override
    public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {

    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {
        secilenCinsiyet.setText("Lütfen seçenek seçiniz");
    }

    public interface OnGenderSelectedListener {
        void onGenderSelected(String cinsiyet);
    }
}