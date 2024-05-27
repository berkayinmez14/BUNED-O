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


public class GenelKulturTestiSoru4 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonKulturA4,buttonKulturB4,buttonKulturC4,buttonKulturD4,buttonKulturBesinciSoru;
    private TextView textKulturMesaj4;
    private GifImageView gifImageViewAntibiyotik;
    private OnAntibiyotikSelectedListener listener;

    public GenelKulturTestiSoru4() {

    }

    public void setOnAntibiyotikSelectedListener(OnAntibiyotikSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_genel_kultur_testi_soru4,container,false);
        buttonKulturA4=view.findViewById(R.id.buttonKulturA4);
        buttonKulturB4=view.findViewById(R.id.buttonKulturB4);
        buttonKulturC4=view.findViewById(R.id.buttonKulturC4);
        buttonKulturD4=view.findViewById(R.id.buttonKulturD4);
        buttonKulturBesinciSoru=view.findViewById(R.id.buttonKulturBesinciSoru);
        textKulturMesaj4=view.findViewById(R.id.textKulturMesaj4);
        gifImageViewAntibiyotik=view.findViewById(R.id.gifImageViewAntibiyotik);

        buttonKulturA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj4.setText("2 Nobel Ödülü var kendisinin ama o değil");
            }
        });

        buttonKulturB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj4.setText("Doğru Cevap! Birileri bilim ile ilgili bakıyorum da");
            }
        });

        buttonKulturC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj4.setText("Kendisi çocul felci için aşı bulmuştur,o değil yani");
            }
        });

        buttonKulturD4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj4.setText("O da değil.Soyadından da anlayacağın üzere kendisi pasteurizasyonu bulmuştur");
            }
        });

        buttonKulturBesinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((GenelKulturTestiActivity) getActivity()).showFragmentGenelKulturTestiSoru5();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedAntibiyotik=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onAntibiyotikSelected(selectedAntibiyotik);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }
    public interface OnAntibiyotikSelectedListener{
        void onAntibiyotikSelected(String secenek);
    }
}