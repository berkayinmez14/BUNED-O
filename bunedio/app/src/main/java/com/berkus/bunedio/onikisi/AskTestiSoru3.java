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


public class AskTestiSoru3 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonAskA2,buttonAskB2,buttonAskC2,buttonAskD2,buttonAskDorduncuSoru;
    private TextView textAskMesaj3;
    private GifImageView gifImageViewKorkakBehlul;
    private AnimationDrawable animationDrawable;
    private OnCowardBehlulSelectedListener listener;

    public AskTestiSoru3() {

    }

    public void setOnCowardBehlulSelectedListener(OnCowardBehlulSelectedListener listener){
        this.listener=listener;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_ask_testi_soru3,container,false);
        buttonAskA2=view.findViewById(R.id.buttonAskA2);
        buttonAskB2=view.findViewById(R.id.buttonAskB2);
        buttonAskC2=view.findViewById(R.id.buttonAskC2);
        buttonAskD2=view.findViewById(R.id.buttonAskD2);
        buttonAskDorduncuSoru=view.findViewById(R.id.buttonAskDorduncuSoru);
        textAskMesaj3=view.findViewById(R.id.textAskMesaj3);
        gifImageViewKorkakBehlul=view.findViewById(R.id.gifImageViewKorkakBehlul);

        buttonAskA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj3.setText("Hayırdır alttaki adam sen misin?");
            }
        });

        buttonAskB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj3.setText("İlla olacak kavgalar,birbirinizi seviyorsanız üstesinden gelirsiniz");
            }
        });

        buttonAskC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj3.setText("Ne istiyorsunuz abi siz ne istiyorsunuz");
            }
        });

        buttonAskD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj3.setText("Yok olmasından da alışkanlık iyidir bence");
            }
        });

        buttonAskDorduncuSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AskTestiActivity) getActivity()).showFragmentAskTestiSoru4();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedCowardBehlul=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onCowardBehlulSelected(selectedCowardBehlul);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnCowardBehlulSelectedListener{
        void onCowardBehlulSelected(String secenek);
    }
}