package com.berkus.bunedio.onikisi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.TextView;

import pl.droidsonroids.gif.GifImageView;


public class PsikolojikTestiSoru5 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonPsikolojiA4,buttonPsikolojiB4,buttonPsikolojiC4,buttonPsikolojiD4,buttonPsikolojiAltinciSoru;
    private TextView textPsikolojiMesaj5;
    private GifImageView gifImageViewStres;
    private OnStressMomentSelectedListener listener;

    public PsikolojikTestiSoru5() {

    }

    public void setOnStressMomentSelectedListener(OnStressMomentSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_psikolojik_testi_soru5,container,false);
        buttonPsikolojiA4=view.findViewById(R.id.buttonPsikolojiA4);
        buttonPsikolojiB4=view.findViewById(R.id.buttonPsikolojiB4);
        buttonPsikolojiC4=view.findViewById(R.id.buttonPsikolojiC4);
        buttonPsikolojiD4=view.findViewById(R.id.buttonPsikolojiD4);
        buttonPsikolojiAltinciSoru=view.findViewById(R.id.buttonPsikolojiAltinciSoru);
        textPsikolojiMesaj5=view.findViewById(R.id.textPsikolojiMesaj5);
        gifImageViewStres=view.findViewById(R.id.gifImageViewStres);

        buttonPsikolojiA4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj5.setText("Hayırdır sen duygusuz musun");
            }
        });

        buttonPsikolojiB4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj5.setText("Doktor olduğunu düşünsene ben düşünemedim");
            }
        });

        buttonPsikolojiC4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj5.setText("Sende yönetici ruhu var");
            }
        });

        buttonPsikolojiD4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj5.setText("Bir şey yok bir şey yok");
            }
        });

        buttonPsikolojiAltinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((PsikolojikTestiActivity) getActivity()).showFragmentPsikolojiTestiSoru6();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedStressMoment = parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onStressMomentSelected(selectedStressMoment);
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnStressMomentSelectedListener{
        void onStressMomentSelected(String secenek);
    }
}