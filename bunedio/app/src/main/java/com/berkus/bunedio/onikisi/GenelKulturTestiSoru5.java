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


public class GenelKulturTestiSoru5 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonKulturA5,buttonKulturB5,buttonKulturC5,buttonKulturD5,buttonKulturAltinciSoru;
    private TextView textKulturMesaj5;
    private GifImageView gifImageViewOscar;
    private OnMenOscarSelectedListener listener;

    public GenelKulturTestiSoru5() {

    }

    public void setOnMenOscarSelectedListener(OnMenOscarSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_genel_kultur_testi_soru5,container,false);
        buttonKulturA5=view.findViewById(R.id.buttonKulturA5);
        buttonKulturB5=view.findViewById(R.id.buttonKulturB5);
        buttonKulturC5=view.findViewById(R.id.buttonKulturC5);
        buttonKulturD5=view.findViewById(R.id.buttonKulturD5);
        buttonKulturAltinciSoru=view.findViewById(R.id.buttonKulturAltinciSoru);
        textKulturMesaj5=view.findViewById(R.id.textKulturMesaj5);
        gifImageViewOscar=view.findViewById(R.id.gifImageViewOscar);

        buttonKulturA5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj5.setText("Doğru cevap! Üstelik bu aldığı ilk Oscar ödülüydü");
            }
        });

        buttonKulturB5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj5.setText("Yanlış cevap. Kendisi hala Oscar sahibi değil");
            }
        });

        buttonKulturC5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj5.setText("Yanlış cevap.Ama o kadar ipucu vermiştik gifte..");
            }
        });

        buttonKulturD5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj5.setText("Yanlış cevap");
            }
        });

        buttonKulturAltinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((GenelKulturTestiActivity) getActivity()).showFragmentGenelKulturTestiSoru6();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedMenOscar=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onMenOscarSelected(selectedMenOscar);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnMenOscarSelectedListener{
        void onMenOscarSelected(String secenek);
    }
}