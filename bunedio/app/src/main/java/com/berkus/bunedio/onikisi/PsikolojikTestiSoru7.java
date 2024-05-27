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


public class PsikolojikTestiSoru7 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonPsikolojiA6,buttonPsikolojiB6,buttonPsikolojiC6,buttonPsikolojiD6;
    private TextView textPsikolojiMesaj7;
    private GifImageView gifImageViewTedMosby;
    private AnimationDrawable animationDrawable;
    private OnFeelAloneSelectedListener listener;

    public PsikolojikTestiSoru7() {

    }

    public void setOnFeelAloneSelectedListener(OnFeelAloneSelectedListener listener){
        this.listener=listener;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_psikolojik_testi_soru7,container,false);
        buttonPsikolojiA6=view.findViewById(R.id.buttonPsikolojiA6);
        buttonPsikolojiB6=view.findViewById(R.id.buttonPsikolojiB6);
        buttonPsikolojiC6=view.findViewById(R.id.buttonPsikolojiC6);
        buttonPsikolojiD6=view.findViewById(R.id.buttonPsikolojiD6);
        textPsikolojiMesaj7=view.findViewById(R.id.textPsikolojiMesaj7);
        gifImageViewTedMosby=view.findViewById(R.id.gifImageViewTedMosby);

        buttonPsikolojiA6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj7.setText("Sen galiba biraz gamsızsın");
            }
        });

        buttonPsikolojiB6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj7.setText("Öyle olduğun için olabilir belki ");
            }
        });

        buttonPsikolojiC6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj7.setText("Hissetmediğin zamanlardaki sebebini düşün ve onu hep yanında tutmaya çalış");
            }
        });

        buttonPsikolojiD6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj7.setText("Dünyanın değil evrenin en yalnızı...");
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedFeelAlone=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onFeelAloneSelected(selectedFeelAlone);
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnFeelAloneSelectedListener{
        void onFeelAloneSelected(String secenek);
    }
}