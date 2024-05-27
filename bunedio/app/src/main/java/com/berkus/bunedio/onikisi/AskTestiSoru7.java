package com.berkus.bunedio.onikisi;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;


public class AskTestiSoru7 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonAskA6,buttonAskB6,buttonAskC6,buttonAskD6;
    private TextView textAskMesaj7;
    private ImageView imageViewEvlilik;
    private AnimationDrawable animationDrawable;
    private OnMarriageSelectedListener listener;

    public AskTestiSoru7() {

    }

    public void setOnMarriageSelectedListener(OnMarriageSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_ask_testi_soru7,container,false);
        buttonAskA6=view.findViewById(R.id.buttonAskA6);
        buttonAskB6=view.findViewById(R.id.buttonAskB6);
        buttonAskC6=view.findViewById(R.id.buttonAskC6);
        buttonAskD6=view.findViewById(R.id.buttonAskD6);
        textAskMesaj7=view.findViewById(R.id.textAskMesaj7);
        imageViewEvlilik=view.findViewById(R.id.imageViewEvlilik);

        buttonAskA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj7.setText("Belki de ona hiç aşık olmamışsındır");
            }
        });

        buttonAskB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj7.setText("Doğru kişiyi bulmuşsun :) ");
            }
        });

        buttonAskC6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj7.setText("Sadece biri çabalarsa o ilişki ölmeye mahkumdur");
            }
        });

        buttonAskD6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj7.setText("Buna bir cevabım yok ");
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedMarriage=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onMarriageSelected(selectedMarriage);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnMarriageSelectedListener{
        void onMarriageSelected(String secenek);
    }
}