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


public class YemekTestiSoru5 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonAdana,buttonBeyti,buttonCag,buttonCokertme,buttonYemekAltinciSoru;
    private ImageView imageViewAdana,imageViewBeyti,imageViewCokertme,imageViewCag;
    private TextView textYemekMesaj5;
    private OnKebapSelectedListener listener;

    public YemekTestiSoru5() {

    }

    public void setOnKebapSelectedListener(OnKebapSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_yemek_testi_soru5,container,false);
        buttonAdana=view.findViewById(R.id.buttonAdana);
        buttonBeyti=view.findViewById(R.id.buttonBeyti);
        buttonCag=view.findViewById(R.id.buttonCag);
        buttonCokertme=view.findViewById(R.id.buttonCokertme);
        buttonYemekAltinciSoru=view.findViewById(R.id.buttonYemekAltinciSoru);
        imageViewAdana=view.findViewById(R.id.imageViewAdana);
        imageViewBeyti=view.findViewById(R.id.imageViewBeyti);
        imageViewCokertme=view.findViewById(R.id.imageViewCokertme);
        imageViewCag=view.findViewById(R.id.imageViewCag);
        textYemekMesaj5=view.findViewById(R.id.textYemekMesaj5);

        buttonAdana.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj5.setText("Urfalılar kızmasın dikkat et :)");
            }
        });

        buttonBeyti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj5.setText("Bunu hiç denemedim yorum yok :)");
            }
        });

        buttonCokertme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj5.setText("Dünya'nın en iyi et yemeği seçildi.Ağzının tadını biliyorsun");
            }
        });

        buttonCag.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj5.setText("Çok pahalı bir damak zevki değil mi ");
            }
        });

        buttonYemekAltinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((YemekTestiActivity) getActivity()).showFragmentYemekTestiSoru6();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedKebap=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onKebapSelected(selectedKebap);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnKebapSelectedListener{
        void onKebapSelected(String secenek);
    }
}