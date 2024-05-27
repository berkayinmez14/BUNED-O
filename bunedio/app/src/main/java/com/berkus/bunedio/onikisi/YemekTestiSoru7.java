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


public class YemekTestiSoru7 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonBaklava,buttonKadayif,buttonSutlac,buttonKunefe;
    private ImageView imageViewBaklava,imageViewKadayif,imageViewSutlac,imageViewKunefe;
    private TextView textYemekMesaj7;
    private OnTatliSelectedListener listener;

    public YemekTestiSoru7() {

    }

    public void setOnTatliSelectedListener(OnTatliSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_yemek_testi_soru7,container,false);
        buttonBaklava=view.findViewById(R.id.buttonBaklava);
        buttonKadayif=view.findViewById(R.id.buttonKadayif);
        buttonKunefe=view.findViewById(R.id.buttonKunefe);
        buttonSutlac=view.findViewById(R.id.buttonSutlac);
        imageViewBaklava=view.findViewById(R.id.imageViewBaklava);
        imageViewKadayif=view.findViewById(R.id.imageViewKadayif);
        imageViewSutlac=view.findViewById(R.id.imageViewSutlac);
        imageViewKunefe=view.findViewById(R.id.imageViewKunefe);
        textYemekMesaj7=view.findViewById(R.id.textYemekMesaj7);

        buttonBaklava.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj7.setText("Sana o zaman ek soru: Cevizli mi fıstıklı mı?");
            }
        });

        buttonKadayif.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj7.setText("Burma kadayıf bak mutlaka denemelisin..");
            }
        });

        buttonKunefe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj7.setText("Bunu iyi yapan bir yerde yenmesi lazım");
            }
        });

        buttonSutlac.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj7.setText("Dünya'nın en iyi sütlü tatlısıdır,aksini iddia eden testi terk edebilir");
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedTatli=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onTatliSelected(selectedTatli);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnTatliSelectedListener{
        void onTatliSelected(String secenek);
    }
}