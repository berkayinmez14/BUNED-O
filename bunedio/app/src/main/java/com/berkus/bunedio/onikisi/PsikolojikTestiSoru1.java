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


public class PsikolojikTestiSoru1 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonErkek2,buttonKadin2,buttonPsikolojiIkinciSoru;
    private ImageView imageKadin2,imageErkek2;
    private TextView textPsikolojiMesaj1;
    private OnGenderSelectedListener2 listener2;


    public PsikolojikTestiSoru1() {

    }

    public void setOnGenderSelectedListener2(OnGenderSelectedListener2 listener2){
        this.listener2=listener2;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_psikolojik_testi_soru1,container,false);
        buttonErkek2=view.findViewById(R.id.buttonErkek2);
        buttonKadin2=view.findViewById(R.id.buttonKadin2);
        buttonPsikolojiIkinciSoru=view.findViewById(R.id.buttonPsikolojiIkinciSoru);
        imageKadin2=view.findViewById(R.id.imageKadin2);
        imageErkek2=view.findViewById(R.id.imageErkek2);
        textPsikolojiMesaj1=view.findViewById(R.id.textPsikolojiMesaj1);

        buttonErkek2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj1.setText("Erkek seçeneğini seçtiniz");
            }
        });

        buttonKadin2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj1.setText("Kadın seçeneğini seçtiniz");
            }
        });

        buttonPsikolojiIkinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((PsikolojikTestiActivity) getActivity()).showFragmentPsikolojiTestiSoru2();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedGender2=parent.getItemAtPosition(position).toString();
        if(listener2!=null){
            listener2.onGenderSelected2(selectedGender2);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnGenderSelectedListener2 {
        void onGenderSelected2(String secenek);
    }
}