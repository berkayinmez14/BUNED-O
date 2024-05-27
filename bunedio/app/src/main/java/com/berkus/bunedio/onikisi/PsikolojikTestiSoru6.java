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


public class PsikolojikTestiSoru6 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonPsikolojiA5,buttonPsikolojiB5,buttonPsikolojiC5,buttonPsikolojiD5,buttonPsikolojiYedinciSoru;
    private TextView textPsikolojiMesaj6;
    private GifImageView gifImageViewDepresyon;
    private AnimationDrawable animationDrawable;
    private OnFeelUneasySelectedListener listener;

    public PsikolojikTestiSoru6() {

    }

    public void setOnFeelUneasySelectedListener(OnFeelUneasySelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_psikolojik_testi_soru6,container,false);
        buttonPsikolojiA5=view.findViewById(R.id.buttonPsikolojiA5);
        buttonPsikolojiB5=view.findViewById(R.id.buttonPsikolojiB5);
        buttonPsikolojiC5=view.findViewById(R.id.buttonPsikolojiC5);
        buttonPsikolojiD5=view.findViewById(R.id.buttonPsikolojiD5);
        buttonPsikolojiYedinciSoru=view.findViewById(R.id.buttonPsikolojiYedinciSoru);
        textPsikolojiMesaj6=view.findViewById(R.id.textPsikolojiMesaj6);
        gifImageViewDepresyon=view.findViewById(R.id.gifImageViewDepresyon);

        buttonPsikolojiA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj6.setText("Kötü bir geleceği mi tercih edersin yoksa belirsizliği mi");
            }
        });

        buttonPsikolojiB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj6.setText("Sende kesin aileni hayal kırıklığına uğratma korkusu da vardır");
            }
        });

        buttonPsikolojiC5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj6.setText("Yani buna ne desem bilemedim,tek derdin bu olsun");
            }
        });

        buttonPsikolojiD5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj6.setText("Anlıyorum :( ");
            }
        });

        buttonPsikolojiYedinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((PsikolojikTestiActivity) getActivity()).showFragmentPsikolojiTestiSoru7();
            }
        });
        return  view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedFeelUneasy=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onFeelUneasySelected(selectedFeelUneasy);
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnFeelUneasySelectedListener{
        void onFeelUneasySelected(String secenek);
    }
}