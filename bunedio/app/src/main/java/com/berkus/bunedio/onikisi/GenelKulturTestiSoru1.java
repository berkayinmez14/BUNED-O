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


public class GenelKulturTestiSoru1 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonKulturA1,buttonKulturB1,buttonKulturC1,buttonKulturD1,buttonKulturIkinciSoru;
    private TextView textKulturMesaj1;
    private GifImageView gifImageViewAtaturk;
    private OnAtaturkSelectedListener listener;

    public GenelKulturTestiSoru1() {

    }

    public void setOnAtaturkSelectedListener(OnAtaturkSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_genel_kultur_testi_soru1,container,false);
        buttonKulturA1=view.findViewById(R.id.buttonKulturA1);
        buttonKulturB1=view.findViewById(R.id.buttonKulturB1);
        buttonKulturC1=view.findViewById(R.id.buttonKulturC1);
        buttonKulturD1=view.findViewById(R.id.buttonKulturD1);
        buttonKulturIkinciSoru=view.findViewById(R.id.buttonKulturIkinciSoru);
        textKulturMesaj1=view.findViewById(R.id.textKulturMesaj1);
        gifImageViewAtaturk=view.findViewById(R.id.gifImageViewAtaturk);

        buttonKulturA1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj1.setText("Haydi ama bunu bilmen lazım daha ilk soru");
            }
        });

        buttonKulturB1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj1.setText("Haydi ama bunu bilmen lazım daha ilk soru");
            }
        });

        buttonKulturC1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj1.setText("Haydi ama bunu bilmen lazım daha ilk soru");
            }
        });

        buttonKulturD1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj1.setText("İlk soruya güzel bir başlangıç,tebrikler!");
            }
        });

        buttonKulturIkinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((GenelKulturTestiActivity) getActivity()).showFragmentGenelKulturTestiSoru2();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedAtaturk=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onAtaturkSelected(selectedAtaturk);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnAtaturkSelectedListener{
        void onAtaturkSelected(String secenek);
    }
}