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


public class AskTestiSoru2 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonAskA1,buttonAskB1,buttonAskC1,buttonAskD1,buttonAskUcuncuSoru;
    private TextView textAskMesaj2;
    private GifImageView gifImageViewAskTestiSoru2;
    private AnimationDrawable animationDrawable;
    private OnCareAboutSelectedListener listener;

    public AskTestiSoru2() {

    }

    public void setOnCareAboutSelectedListener(OnCareAboutSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_ask_testi_soru2,container,false);
        buttonAskA1=view.findViewById(R.id.buttonAskA1);
        buttonAskB1=view.findViewById(R.id.buttonAskB1);
        buttonAskC1=view.findViewById(R.id.buttonAskC1);
        buttonAskD1=view.findViewById(R.id.buttonAskD1);
        buttonAskUcuncuSoru=view.findViewById(R.id.buttonAskUcuncuSoru);
        textAskMesaj2=view.findViewById(R.id.textAskMesaj2);
        gifImageViewAskTestiSoru2=view.findViewById(R.id.gifImageViewAskTestiSoru2);

        buttonAskA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj2.setText("Bağlanmaktan korkanları çekme tılsımı var sende anladığım kadarıyla");
            }
        });

        buttonAskB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj2.setText("Yani biraz geleceği de düşün bence,nereye gidecek bu ilişki ");
            }
        });

        buttonAskC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj2.setText("Bulursan bizi de haberdar et");
            }
        });

        buttonAskD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj2.setText("Pardon da sen bu ilişkide mutlu musun diye soralım sana");
            }
        });

        buttonAskUcuncuSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AskTestiActivity) getActivity()).showFragmentAskTestiSoru3();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedCareAbout=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onCareAboutSelected(selectedCareAbout);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnCareAboutSelectedListener{
        void onCareAboutSelected(String secenek);
    }
}