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


public class KisilikTestiSoru3 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonA3,buttonB3,buttonC3,buttonD3,buttonUcuncuSoru;
    private TextView textMesaj3;
    private GifImageView gifImageViewElestiri;
    private AnimationDrawable animationDrawable;
    private OnCritiqueSelectedListener listener;


    public KisilikTestiSoru3() {

    }

    public void setOnCritiqueSelectedListener(OnCritiqueSelectedListener listener){
        this.listener=listener;
    }


    @SuppressLint("MissingInflatedId")
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_kisilik_testi_soru3,container,false);
        buttonA3=view.findViewById(R.id.buttonA3);
        buttonB3=view.findViewById(R.id.buttonB3);
        buttonC3=view.findViewById(R.id.buttonC3);
        buttonD3=view.findViewById(R.id.buttonD3);
        buttonUcuncuSoru=view.findViewById(R.id.buttonUcuncuSoru);
        textMesaj3=view.findViewById(R.id.textMesaj3);
        gifImageViewElestiri=view.findViewById(R.id.gifImageViewElestiri);

        buttonA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj3.setText("Sen erdemli bir insansın");
            }
        });

        buttonB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj3.setText("Bu da bir tercih tabii");
            }
        });

        buttonC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj3.setText("Acilen bu huyunu değiştirmelisin bence");
            }
        });

        buttonD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj3.setText("Sen erdemli bir insansın");
            }
        });

        buttonUcuncuSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((KisilikTestiActivity) getActivity()).showFragmentKisilikTestiSoru4();
            }
        });

        return view;
    }
    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedCritique=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onCritiqueSelected(selectedCritique);
        }
    }
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnCritiqueSelectedListener{
        void onCritiqueSelected(String secenek);
    }
}