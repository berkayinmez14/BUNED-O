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


public class KisilikTestiSoru6 extends Fragment implements AdapterView.OnItemSelectedListener {

    private Button buttonA6,buttonB6,buttonC6,buttonD6,buttonAltinciSoru;
    private TextView textMesaj6;
    private GifImageView gifImageViewYardimTeklifi;
    private AnimationDrawable animationDrawable;
    private OnOfferHelpSelectedListener listener;

    public KisilikTestiSoru6() {

    }

    public void setOnOfferHelpSelectedListener(OnOfferHelpSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_kisilik_testi_soru6,container,false);
        buttonA6=view.findViewById(R.id.buttonA6);
        buttonB6=view.findViewById(R.id.buttonB6);
        buttonC6=view.findViewById(R.id.buttonC6);
        buttonD6=view.findViewById(R.id.buttonD6);
        textMesaj6=view.findViewById(R.id.textMesaj6);
        buttonAltinciSoru=view.findViewById(R.id.buttonAltinciSoru);
        gifImageViewYardimTeklifi=view.findViewById(R.id.gifImageViewYardimTeklifi);

        buttonA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj6.setText("İnsan yardım almayı zayıflık olara görmemeli");
            }
        });

        buttonB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj6.setText("Bu da bir tercihtir ve saygı duyulması gerekir");
            }
        });

        buttonC6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj6.setText("Biraz olsun insalık ya,senin de bir kalbin var");
            }
        });

        buttonD6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj6.setText("Keşke herkes bu kadar açık olsa");
            }
        });

        buttonAltinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((KisilikTestiActivity) getActivity()).showFragmentKisilikTestiSoru7();
            }
        });

        return  view;
    }
    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedOfferHelp =parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onOfferHelpSelected(selectedOfferHelp);
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnOfferHelpSelectedListener{
        void onOfferHelpSelected(String secenek);
    }
}