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


public class KisilikTestiSoru4 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonA4,buttonB4,buttonC4,buttonD4,buttonDorduncuSoru;
    private TextView textMesaj4;
    private GifImageView gifImageViewSosyalEtkilesim;
    private AnimationDrawable animationDrawable;
    private OnSocialSelectedListener listener;

    public KisilikTestiSoru4() {

    }

    public void setOnSocialSelectedListener(OnSocialSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_kisilik_testi_soru4,container,false);
        buttonA4=view.findViewById(R.id.buttonA4);
        buttonB4=view.findViewById(R.id.buttonB4);
        buttonC4=view.findViewById(R.id.buttonC4);
        buttonD4=view.findViewById(R.id.buttonD4);
        buttonDorduncuSoru=view.findViewById(R.id.buttonDorduncuSoru);
        textMesaj4=view.findViewById(R.id.textMesaj4);
        gifImageViewSosyalEtkilesim=view.findViewById(R.id.gifImageViewSosyalEtkilesim);

        buttonA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj4.setText("Güzel bir özellik :)");
            }
        });

        buttonB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj4.setText("Dinliyormuş gibi yapmıyorsundur umarım");
            }
        });

        buttonC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj4.setText("Özel biri yok mu yani hiç");
            }
        });

        buttonD4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textMesaj4.setText("Biraz daha konuşkan olmalısın bence ne kaybedersin ki");
            }
        });

        buttonDorduncuSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((KisilikTestiActivity) getActivity()).showFragmentKisilikTestiSoru5();
            }
        });

        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedSocial=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onSocialSelected(selectedSocial);
        }
    }
    public void onNothingSelected(AdapterView<?> parent) {

    }


    public interface OnSocialSelectedListener{
        void onSocialSelected(String secenek);
    }
}