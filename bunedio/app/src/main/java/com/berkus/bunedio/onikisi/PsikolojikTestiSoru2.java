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


public class PsikolojikTestiSoru2 extends Fragment  implements AdapterView.OnItemSelectedListener {
    private Button buttonPsikolojiA1,buttonPsikolojiB1,buttonPsikolojiC1,buttonPsikolojiD1,buttonPsikolojiUcuncuSoru;
    private TextView textPsikolojiMesaj2;
    private GifImageView gifImageViewBahene;
    private AnimationDrawable animationDrawable;
    private OnExcuseSelectedListener listener;


    public PsikolojikTestiSoru2() {

    }

    public void setOnExcuseSelectedListener(OnExcuseSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_psikolojik_testi_soru2,container,false);
        buttonPsikolojiA1=view.findViewById(R.id.buttonPsikolojiA1);
        buttonPsikolojiB1=view.findViewById(R.id.buttonPsikolojiB1);
        buttonPsikolojiC1=view.findViewById(R.id.buttonPsikolojiC1);
        buttonPsikolojiD1=view.findViewById(R.id.buttonPsikolojiD1);
        buttonPsikolojiUcuncuSoru=view.findViewById(R.id.buttonPsikolojiUcuncuSoru);
        textPsikolojiMesaj2=view.findViewById(R.id.textPsikolojiMesaj2);
        gifImageViewBahene=view.findViewById(R.id.gifImageViewBahene);

        buttonPsikolojiA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj2.setText("Keşke herkes bunu yapabilecek güçte olsaydı");
            }
        });

        buttonPsikolojiB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj2.setText("Dürüstlük zor bulunuyor günümüzde");
            }
        });

        buttonPsikolojiC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj2.setText("Bir aynaya bakıp kendinle yüzleşmeye ne dersin");
            }
        });

        buttonPsikolojiD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj2.setText("Evhamlı birisin sanırım sen");
            }
        });

        buttonPsikolojiUcuncuSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((PsikolojikTestiActivity) getActivity()).showFragmentPsikolojiTestiSoru3();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedExcuse=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onExcuseSelected(selectedExcuse);
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnExcuseSelectedListener{
        void onExcuseSelected(String secenek);
    }
}