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


public class GenelKulturTestiSoru3 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonKulturA3,buttonKulturB3,buttonKulturC3,buttonKulturD3,buttonKulturDorduncuSoru;
    private TextView textKulturMesaj3;
    private GifImageView gifImageViewPanama;
    private OnPanamaSelectedListener listener;

    public GenelKulturTestiSoru3() {

    }

    public void setOnPanamaSelectedListener(OnPanamaSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_genel_kultur_testi_soru3,container,false);
        buttonKulturA3=view.findViewById(R.id.buttonKulturA3);
        buttonKulturB3=view.findViewById(R.id.buttonKulturB3);
        buttonKulturC3=view.findViewById(R.id.buttonKulturC3);
        buttonKulturD3=view.findViewById(R.id.buttonKulturD3);
        buttonKulturDorduncuSoru=view.findViewById(R.id.buttonKulturDorduncuSoru);
        textKulturMesaj3=view.findViewById(R.id.textKulturMesaj3);
        gifImageViewPanama=view.findViewById(R.id.gifImageViewPanama);

        buttonKulturA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj3.setText("Maalesef,Kabul ediyorum zor bir soruydu");
            }
        });

        buttonKulturB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj3.setText("Hint Okyanusu'nun nerede olduğu hakkında fikrin var mı?");
            }
        });

        buttonKulturC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj3.setText("Doğru cevap,çok iyisin gerçekten..");
            }
        });

        buttonKulturD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj3.setText("Tekrar dene şansını");
            }
        });

        buttonKulturDorduncuSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((GenelKulturTestiActivity) getActivity()).showFragmentGenelKulturTestiSoru4();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedPanama=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onPanamaSelected(selectedPanama);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnPanamaSelectedListener{
        void onPanamaSelected(String secenek);
    }
}