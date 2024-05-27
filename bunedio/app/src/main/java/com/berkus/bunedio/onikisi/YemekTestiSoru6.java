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


public class YemekTestiSoru6 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonKumpir,buttonTantuni,buttonKokorec,buttonMidye,buttonYemekYedinciSoru;
    private ImageView imageViewKumpir,imageViewTantuni,imageViewKokorec,imageViewMidye;
    private TextView textYemekMesaj6;
    private OnSokakYemegiSelectedListener listener;

    public YemekTestiSoru6() {

    }

    public void setOnSokakYemegiSelectedListener(OnSokakYemegiSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_yemek_testi_soru6,container,false);
        buttonKumpir=view.findViewById(R.id.buttonKumpir);
        buttonTantuni=view.findViewById(R.id.buttonTantuni);
        buttonKokorec=view.findViewById(R.id.buttonKokorec);
        buttonMidye=view.findViewById(R.id.buttonMidye);
        buttonYemekYedinciSoru=view.findViewById(R.id.buttonYemekYedinciSoru);
        imageViewKumpir=view.findViewById(R.id.imageViewKumpir);
        imageViewTantuni=view.findViewById(R.id.imageViewTantuni);
        imageViewKokorec=view.findViewById(R.id.imageViewKokorec);
        imageViewMidye=view.findViewById(R.id.imageViewMidye);
        textYemekMesaj6=view.findViewById(R.id.textYemekMesaj6);

        buttonKumpir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj6.setText("Bu kadar karışık şeyi nasıl yiyorsun..");
            }
        });

        buttonTantuni.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj6.setText("Koyduğumuz seçenekteki et tantuni bu arada,malum hep tavuk görüyoruz bu ara");
            }
        });

        buttonKokorec.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj6.setText("Birinin midesi sağlammış ...");
            }
        });

        buttonMidye.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj6.setText("Bu tam bir turnusol.Ya çok severyer ya da hiç sevmezler");
            }
        });

        buttonYemekYedinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((YemekTestiActivity) getActivity()).showFragmentYemekTestiSoru7();
            }
        });
        return  view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedSokak=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onSokakYemegiSelected(selectedSokak);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnSokakYemegiSelectedListener{
        void onSokakYemegiSelected(String secenek);
    }
}