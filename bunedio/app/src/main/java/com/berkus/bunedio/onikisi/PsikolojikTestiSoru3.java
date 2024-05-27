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


public class PsikolojikTestiSoru3 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonPsikolojiA2,buttonPsikolojiB2,buttonPsikolojiC2,buttonPsikolojiD2,buttonPsikolojiDorduncuSoru;
    private TextView textPsikolojiMesaj3;
    private GifImageView gifImageViewTavanaBakma;
    private AnimationDrawable animationDrawable;
    private OnComeGoodSelectedListener listener;

    public PsikolojikTestiSoru3() {

    }

    public void setOnComeGoodSelectedListener(OnComeGoodSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_psikolojik_testi_soru3,container,false);
        buttonPsikolojiA2=view.findViewById(R.id.buttonPsikolojiA2);
        buttonPsikolojiB2=view.findViewById(R.id.buttonPsikolojiB2);
        buttonPsikolojiC2=view.findViewById(R.id.buttonPsikolojiC2);
        buttonPsikolojiD2=view.findViewById(R.id.buttonPsikolojiD2);
        buttonPsikolojiDorduncuSoru=view.findViewById(R.id.buttonPsikolojiDorduncuSoru);
        textPsikolojiMesaj3=view.findViewById(R.id.textPsikolojiMesaj3);
        gifImageViewTavanaBakma=view.findViewById(R.id.gifImageViewTavanaBakma);

        buttonPsikolojiA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj3.setText("Belki de ruhun buna ihtiyacı vardır");
            }
        });

        buttonPsikolojiB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj3.setText("Yalnızlık paylaşılırsa yalnızlıktan çıkar sonuçta değil mi");
            }
        });

        buttonPsikolojiC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj3.setText("İnsan insana iyi gelmeli,gelmeyecekse hiç gelmemeli");
            }
        });
        buttonPsikolojiD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj3.setText("Belki de sorun işindir ha ne dersin");
            }
        });

        buttonPsikolojiDorduncuSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((PsikolojikTestiActivity) getActivity()).showFragmentPsikolojiTestiSoru4();
            }
        });
        return  view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedComeGood=parent.getItemAtPosition(position).toString();
        if (listener!=null){
            listener.onComeGoodSelected(selectedComeGood);
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnComeGoodSelectedListener{
        void onComeGoodSelected(String secenek);
    }
}