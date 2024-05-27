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


public class AskTestiSoru4 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonAskA3,buttonAskB3,buttonAskC3,buttonAskD3,buttonAskBesinciSoru;
    private TextView textAskMesaj4;
    private GifImageView gifImageViewAskTestiSoru4;
    private AnimationDrawable animationDrawable;
    private OnKeepSecretSelectedListener listener;

    public AskTestiSoru4() {

    }

    public void setOnKeepSecretSelectedListener(OnKeepSecretSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_ask_testi_soru4,container,false);
        buttonAskA3=view.findViewById(R.id.buttonAskA3);
        buttonAskB3=view.findViewById(R.id.buttonAskB3);
        buttonAskC3=view.findViewById(R.id.buttonAskC3);
        buttonAskD3=view.findViewById(R.id.buttonAskD3);
        buttonAskBesinciSoru=view.findViewById(R.id.buttonAskBesinciSoru);
        textAskMesaj4=view.findViewById(R.id.textAskMesaj4);
        gifImageViewAskTestiSoru4=view.findViewById(R.id.gifImageViewAskTestiSoru4);

        buttonAskA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj4.setText("Bence de her şeyi ona söyleyebilmelisin");
            }
        });

        buttonAskB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj4.setText("Onunla ilgiliyse eğer söylemelisin bence");
            }
        });

        buttonAskC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj4.setText("Bence her şeyi ona söyleyebilmelisin");
            }
        });

        buttonAskD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj4.setText("Hayat arkadaşın olacak belki ...");
            }
        });

        buttonAskBesinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AskTestiActivity) getActivity()).showFragmentAskTestiSoru5();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedKeepSecret = parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onKeepSecretSelected(selectedKeepSecret);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnKeepSecretSelectedListener{
        void onKeepSecretSelected(String secenek);
    }
}