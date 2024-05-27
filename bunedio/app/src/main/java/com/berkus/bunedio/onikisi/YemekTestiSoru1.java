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


public class YemekTestiSoru1 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonSoganli,buttonSogansiz,buttonYemekIkinciSoru;
    private ImageView imageViewMenemen;
    private TextView textYemekMesaj1;
    private OnMenemenSelectedListener listener;


    public YemekTestiSoru1() {

    }

    public void setOnMenemenSelectedListener(OnMenemenSelectedListener listener){
        this.listener=listener;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_yemek_testi_soru1,container,false);
        buttonSoganli=view.findViewById(R.id.buttonSoganli);
        buttonSogansiz=view.findViewById(R.id.buttonSogansiz);
        buttonYemekIkinciSoru=view.findViewById(R.id.buttonYemekIkinciSoru);
        imageViewMenemen=view.findViewById(R.id.imageViewMenemen);
        textYemekMesaj1=view.findViewById(R.id.textYemekMesaj1);

        buttonSoganli.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj1.setText("Bence akşam yemeği gibi oluyor soğan konunca ama zevkler sorgulanmaz");
            }
        });

        buttonSogansiz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj1.setText("%48'lik dilimdesin demek ..");
            }
        });

        buttonYemekIkinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((YemekTestiActivity) getActivity()).showFragmentYemekTestiSoru2();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedMenemen=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onMenemenSelected(selectedMenemen);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnMenemenSelectedListener{
        void onMenemenSelected(String secenek);
    }
}