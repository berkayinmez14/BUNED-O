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


public class AskTestiSoru1 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonErkek3,buttonKadin3,buttonAskIkinciSoru;
    private ImageView imageErkek3,imageKadin3;
    private TextView textAskMesaj1;
    private OnGenderSelectedListener3 listener3;


    public AskTestiSoru1() {

    }

    public void setOnGenderSelectedListener3(OnGenderSelectedListener3 listener3){
        this.listener3=listener3;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_ask_testi_soru1,container,false);
        buttonErkek3=view.findViewById(R.id.buttonErkek3);
        buttonKadin3=view.findViewById(R.id.buttonKadin3);
        buttonAskIkinciSoru=view.findViewById(R.id.buttonAskIkinciSoru);
        imageErkek3=view.findViewById(R.id.imageErkek3);
        imageKadin3=view.findViewById(R.id.imageKadin3);
        textAskMesaj1=view.findViewById(R.id.textAskMesaj1);

        buttonErkek3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj1.setText("Erkek seçeneğini seçtiniz");
            }
        });

        buttonKadin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textAskMesaj1.setText("Kadın seçeneğini seçtiniz");
            }
        });

        buttonAskIkinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((AskTestiActivity) getActivity()).showFragmentAskTestiSoru2();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedGender3=parent.getItemAtPosition(position).toString();
        if(listener3!=null){
            listener3.onGenderSelected3(selectedGender3);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnGenderSelectedListener3 {
        void onGenderSelected3(String secenek);
    }
}