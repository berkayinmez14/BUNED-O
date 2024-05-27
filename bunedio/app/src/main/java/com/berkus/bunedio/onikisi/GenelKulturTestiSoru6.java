package com.berkus.bunedio.onikisi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;


public class GenelKulturTestiSoru6 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonKulturA6,buttonKulturB6,buttonKulturC6,buttonKulturD6,buttonKulturYedinciSoru;
    private TextView textKulturMesaj6;
    private GifImageView gifImageViewTuring;
    private OnTuringSelectedListener listener;


    public GenelKulturTestiSoru6() {

    }

    public void setOnTuringSelectedListener(OnTuringSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_genel_kultur_testi_soru6,container,false);
        buttonKulturA6=view.findViewById(R.id.buttonKulturA6);
        buttonKulturB6=view.findViewById(R.id.buttonKulturB6);
        buttonKulturC6=view.findViewById(R.id.buttonKulturC6);
        buttonKulturD6=view.findViewById(R.id.buttonKulturD6);
        buttonKulturYedinciSoru=view.findViewById(R.id.buttonKulturYedinciSoru);
        textKulturMesaj6=view.findViewById(R.id.textKulturMesaj6);
        gifImageViewTuring=view.findViewById(R.id.gifImageViewTuring);

        buttonKulturA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj6.setText("Dogru cevap");
            }
        });

        buttonKulturB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj6.setText("Yanlış cevap.Psikolojiyel ilgilenen birine benziyor mu sence bu adam");
            }
        });

        buttonKulturC6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj6.setText("Hatta burçların özelliklerini de bulmuş(!)");
            }
        });

        buttonKulturD6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj6.setText("Yanlış cevap");
            }
        });

        buttonKulturYedinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((GenelKulturTestiActivity) getActivity()).showFragmentGenelKulturTestiSoru7();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedTuring=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onTuringSelected(selectedTuring);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnTuringSelectedListener{
        void onTuringSelected(String secenek);
    }
}