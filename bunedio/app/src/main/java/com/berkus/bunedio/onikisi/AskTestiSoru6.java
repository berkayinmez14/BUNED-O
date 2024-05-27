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


public class AskTestiSoru6 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonAskA5,buttonAskB5,buttonAskC5,buttonAskD5,buttonAskYedinciSoru;
    private TextView textAskMesaj6;
    private GifImageView gifImageViewUzunMesafe;
    private AnimationDrawable animationDrawable;
    private OnLDistanceRelatshipSelectedListener listener;

    public AskTestiSoru6() {

    }

    public void setOnLDistanceRelatshipSelectedListener(OnLDistanceRelatshipSelectedListener listener){
        this.listener=listener;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_ask_testi_soru6,container,false);
        buttonAskA5=view.findViewById(R.id.buttonAskA5);
        buttonAskB5=view.findViewById(R.id.buttonAskB5);
        buttonAskC5=view.findViewById(R.id.buttonAskC5);
        buttonAskD5=view.findViewById(R.id.buttonAskD5);
        buttonAskYedinciSoru=view.findViewById(R.id.buttonAskYedinciSoru);
        textAskMesaj6=view.findViewById(R.id.textAskMesaj6);
        gifImageViewUzunMesafe=view.findViewById(R.id.gifImageViewUzunMesafe);

        buttonAskA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj6.setText("İçten içe içini kemiren bir şey olur illa di mi");
            }
        });

        buttonAskB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj6.setText("Sürekli ne yapıyor acaba diye düşünürsün di mi");
            }
        });

        buttonAskC5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj6.setText("Yanımda olmanı çok isteredim ama değilsin, sen oradasın ve orası ne kadar şanslı olduğunu henüz bilmiyor");
            }
        });

        buttonAskD5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj6.setText("Bunu dert etmen bana biraz abartılı geldi");
            }
        });

        buttonAskYedinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AskTestiActivity) getActivity()).showFragmentAskTestiSoru7();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedLongRelationShip=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onLDistanceRelatshipSelected(selectedLongRelationShip);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnLDistanceRelatshipSelectedListener{
        void onLDistanceRelatshipSelected(String secenek);
    }
}