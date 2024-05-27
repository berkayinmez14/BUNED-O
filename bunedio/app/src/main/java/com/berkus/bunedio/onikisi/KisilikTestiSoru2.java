package com.berkus.bunedio.onikisi;

import android.annotation.SuppressLint;
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


public class KisilikTestiSoru2 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonA,buttonB,buttonC,buttonD,buttonIkinciSoru;
    private TextView textMesaj;
    private GifImageView gifImageViewTartisma;
    private AnimationDrawable animationDrawable;
    private OnDiscussionSelectedListener listener;

    public KisilikTestiSoru2() {

    }

    public void setOnDiscussionSelectedListener(OnDiscussionSelectedListener listener){
        this.listener=listener;
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_kisilik_testi_soru2,container,false);
        buttonA=view.findViewById(R.id.buttonA);
        buttonB=view.findViewById(R.id.buttonB);
        buttonC=view.findViewById(R.id.buttonC);
        buttonD=view.findViewById(R.id.buttonD);
        buttonIkinciSoru=view.findViewById(R.id.buttonIkinciSoru);
        textMesaj=view.findViewById(R.id.textMesaj);
        gifImageViewTartisma=view.findViewById(R.id.gifImageViewTartisma);

        buttonA.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj.setText("Neden sen dinliyorsun ki");
            }
        });

        buttonB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj.setText("Günümüzde böyle bu işler");
            }
        });

        buttonC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj.setText("Sen tam bir tümörsün");
            }
        });

        buttonD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj.setText("Bence yapılması gereken bu");
            }
        });

        buttonIkinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((KisilikTestiActivity) getActivity()).showFragmentKisilikTestiSoru3();
            }
        });

        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedDiscussion=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onDiscussionSelected(selectedDiscussion);
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnDiscussionSelectedListener{
        void onDiscussionSelected(String secenek);
    }
}