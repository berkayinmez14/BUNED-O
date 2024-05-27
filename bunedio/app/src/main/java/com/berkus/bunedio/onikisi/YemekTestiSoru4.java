package com.berkus.bunedio.onikisi;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;


public class YemekTestiSoru4 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonKizartma,buttonElmaDilim,buttonKasik,buttonHaslanmis,buttonYemekBesinciSoru;
    private ImageView imageViewKizartma,imageViewElmaDilim,imageViewKasik,imageViewHaslanmis;
    private TextView textYemekMesaj4;
    private OnPatatesSelectedListener listener;

    public YemekTestiSoru4() {

    }

    public void setOnPatatesSelectedListener(OnPatatesSelectedListener listener){
        this.listener=listener;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_yemek_testi_soru4,container,false);
        buttonKizartma=view.findViewById(R.id.buttonKizartma);
        buttonElmaDilim=view.findViewById(R.id.buttonElmaDilim);
        buttonKasik=view.findViewById(R.id.buttonKasik);
        buttonHaslanmis=view.findViewById(R.id.buttonHaslanmis);
        buttonYemekBesinciSoru=view.findViewById(R.id.buttonYemekBesinciSoru);
        imageViewKizartma=view.findViewById(R.id.imageViewKizartma);
        imageViewElmaDilim=view.findViewById(R.id.imageViewElmaDilim);
        imageViewKasik=view.findViewById(R.id.imageViewKasik);
        imageViewHaslanmis=view.findViewById(R.id.imageViewHaslanmis);
        textYemekMesaj4=view.findViewById(R.id.textYemekMesaj4);

        buttonKizartma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj4.setText("Her şeyle de gidiyor valla dünyanın en iyi keşfi");
            }
        });

        buttonElmaDilim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj4.setText("Daha çok patates severim diyorsun yani");
            }
        });

        buttonKasik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj4.setText("Birileri sosu çok seviyor sanırım");
            }
        });

        buttonHaslanmis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj4.setText("Diyette misin :( ");
            }
        });

        buttonYemekBesinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((YemekTestiActivity) getActivity()).showFragmentYemekTestiSoru5();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedPatates=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onPatatesSelected(selectedPatates);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnPatatesSelectedListener{
        void onPatatesSelected(String secenek);
    }
}