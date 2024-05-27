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


public class GenelKulturTestiSoru2 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonKulturA2,buttonKulturB2,buttonKulturC2,buttonKulturD2,buttonKulturUcuncuSoru;
    private TextView textKulturMesaj2;
    private GifImageView gifImageViewTurkiye;
    private OnEnAzKomsuSelectedListener listener;

    public GenelKulturTestiSoru2() {

    }

    public void setOnEnAzKomsuSelectedListener(OnEnAzKomsuSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_genel_kultur_testi_soru2,container,false);
        buttonKulturA2=view.findViewById(R.id.buttonKulturA2);
        buttonKulturB2=view.findViewById(R.id.buttonKulturB2);
        buttonKulturC2=view.findViewById(R.id.buttonKulturC2);
        buttonKulturD2=view.findViewById(R.id.buttonKulturD2);
        buttonKulturUcuncuSoru=view.findViewById(R.id.buttonKulturUcuncuSoru);
        textKulturMesaj2=view.findViewById(R.id.textKulturMesaj2);
        gifImageViewTurkiye=view.findViewById(R.id.gifImageViewTurkiye);

        buttonKulturA2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj2.setText("Yanlış cevap!..");
            }
        });

        buttonKulturB2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj2.setText("Doğru cevap! Sadece Gaziantep ile komşudur");
            }
        });

        buttonKulturC2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj2.setText("Ciddi misin ..");
            }
        });

        buttonKulturD2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj2.setText("4 tane komşusu vardı onun ..");
            }
        });

        buttonKulturUcuncuSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((GenelKulturTestiActivity) getActivity()).showFragmentGenelKulturTestiSoru3();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedEnAzKomsu=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onEnAzKomsuSelected(selectedEnAzKomsu);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnEnAzKomsuSelectedListener{
        void onEnAzKomsuSelected(String secenek);
    }
}