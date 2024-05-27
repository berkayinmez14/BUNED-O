package com.berkus.bunedio.onikisi;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;


public class KisilikTestiSoru7 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonA7,buttonB7,buttonC7,buttonD7;
    private TextView textMesaj7;
    private GifImageView gifImageViewMahkeme;
    private AnimationDrawable animationDrawable;
    private OnCourtSelectedListener listener;


    public KisilikTestiSoru7() {

    }

    public void setOnCourtSelectedListener(OnCourtSelectedListener listener){
        this.listener=listener;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_kisilik_testi_soru7,container,false);
        buttonA7=view.findViewById(R.id.buttonA7);
        buttonB7=view.findViewById(R.id.buttonB7);
        buttonC7=view.findViewById(R.id.buttonC7);
        buttonD7=view.findViewById(R.id.buttonD7);
        textMesaj7=view.findViewById(R.id.textMesaj7);
        gifImageViewMahkeme=view.findViewById(R.id.gifImageViewMahkeme);

        buttonA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj7.setText("Soğuk kanlı birisin");
            }
        });

        buttonB7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj7.setText("Çözüm bulamayacağın iş yok senin");
            }
        });

        buttonC7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj7.setText("Kendini kaygılı ve yetersiz hissediyorsun");
            }
        });

        buttonD7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj7.setText("Her duruma uyum sağlarsın sen");
            }
        });
        return  view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedCourt = parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onCourtSelected(selectedCourt);
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnCourtSelectedListener{
        void onCourtSelected(String secenek);
    }
}