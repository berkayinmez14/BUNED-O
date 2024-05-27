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


public class KisilikTestiSoru5 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonA5,buttonB5,buttonC5,buttonD5,buttonBesinciSoru;
    private TextView textMesaj5;
    private GifImageView gifImageViewFilmİzleme;
    private AnimationDrawable animationDrawable;
    private OnWatchingFilmSelectedListener listener;

    public KisilikTestiSoru5() {

    }

    public void setOnWatchingFilmSelectedListener(OnWatchingFilmSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_kisilik_testi_soru5,container,false);
        buttonA5=view.findViewById(R.id.buttonA5);
        buttonB5=view.findViewById(R.id.buttonB5);
        buttonC5=view.findViewById(R.id.buttonC5);
        buttonD5=view.findViewById(R.id.buttonD5);
        buttonBesinciSoru=view.findViewById(R.id.buttonBesinciSoru);
        textMesaj5=view.findViewById(R.id.textMesaj5);
        gifImageViewFilmİzleme=view.findViewById(R.id.gifImageViewFilmİzleme);

        buttonA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj5.setText("Sen Nuri Ceylan Bilge filmi izleme bence");
            }
        });

        buttonB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj5.setText("Karakter gelişimini önemsemen güzel ");
            }
        });

        buttonC5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj5.setText("Seninle film izlenir işte");
            }
        });

        buttonD5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj5.setText("O kadar da abartmasak mı");
            }
        });

        buttonBesinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((KisilikTestiActivity) getActivity()).showFragmentKisilikTestiSoru6();
            }
        });
        return view;
    }
    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedWatchingFilm=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onWatchingFilmSelected(selectedWatchingFilm);
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnWatchingFilmSelectedListener{
        void onWatchingFilmSelected(String secenek);
    }
}