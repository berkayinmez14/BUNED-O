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


public class AskTestiSoru5 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonAskA4,buttonAskB4,buttonAskC4,buttonAskD4,buttonAskAltinciSoru;
    private TextView textAskMesaj5;
    private GifImageView gifImageViewRuhEsi;
    private AnimationDrawable animationDrawable;
    private OnSoulMateSelectedListener listener;

    public AskTestiSoru5() {

    }

    public void setOnSoulMateSelectedListener(OnSoulMateSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_ask_testi_soru5,container,false);
        buttonAskA4=view.findViewById(R.id.buttonAskA4);
        buttonAskB4=view.findViewById(R.id.buttonAskB4);
        buttonAskC4=view.findViewById(R.id.buttonAskC4);
        buttonAskD4=view.findViewById(R.id.buttonAskD4);
        buttonAskAltinciSoru=view.findViewById(R.id.buttonAskAltinciSoru);
        textAskMesaj5=view.findViewById(R.id.textAskMesaj5);
        gifImageViewRuhEsi=view.findViewById(R.id.gifImageViewRuhEsi);

        buttonAskA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj5.setText("Ben olsam ben de böyle tanımlardım");
            }
        });

        buttonAskB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj5.setText("Kim üzdü seni..");
            }
        });

        buttonAskC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj5.setText("Ten uyumunu niye karıştırdın ki..");
            }
        });

        buttonAskD4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj5.setText("insan sevdiğinde kendini bulur,öyle düşünme");
            }
        });

        buttonAskAltinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AskTestiActivity) getActivity()).showFragmentAskTestiSoru6();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedSoulMate=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onSoulMateSelected(selectedSoulMate);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnSoulMateSelectedListener{
        void onSoulMateSelected(String secenek);
    }
}