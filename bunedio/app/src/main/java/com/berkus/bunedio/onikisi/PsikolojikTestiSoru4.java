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


public class PsikolojikTestiSoru4 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonPsikolojiA3,buttonPsikolojiB3,buttonPsikolojiC3,buttonPsikolojiD3,buttonPsikolojiBesinciSoru;
    private TextView textPsikolojiMesaj4;
    private ImageView ImageViewUnutamiyorum;
    private OnCantForgetSelectedListener listener;


    public PsikolojikTestiSoru4() {

    }

    public void setOnCantForgetSelectedListener(OnCantForgetSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_psikolojik_testi_soru4,container,false);
        buttonPsikolojiA3=view.findViewById(R.id.buttonPsikolojiA3);
        buttonPsikolojiB3=view.findViewById(R.id.buttonPsikolojiB3);
        buttonPsikolojiC3=view.findViewById(R.id.buttonPsikolojiC3);
        buttonPsikolojiD3=view.findViewById(R.id.buttonPsikolojiD3);
        buttonPsikolojiBesinciSoru=view.findViewById(R.id.buttonPsikolojiBesinciSoru);
        textPsikolojiMesaj4=view.findViewById(R.id.textPsikolojiMesaj4);
        ImageViewUnutamiyorum=view.findViewById(R.id.ImageViewUnutamiyorum);

        buttonPsikolojiA3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj4.setText("Gözlerimde yaş, kalbimde sızı, unutmadım seni\n" +
                        "Unutamadım, unutamadım, ne olur anla beni");
            }
        });

        buttonPsikolojiB3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj4.setText("En zoru bu olsa gerek :( ");
            }
        });

        buttonPsikolojiC3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj4.setText("Ben de Fenerbahçe'yi unutamıyorum");
            }
        });

        buttonPsikolojiD3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textPsikolojiMesaj4.setText("İnsanı yokluktaki sabrı,varlıktaki tavrı belli eder");
            }
        });

        buttonPsikolojiBesinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((PsikolojikTestiActivity) getActivity()).showFragmentPsikolojiTestiSoru5();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedCantForget=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onCantForgetSelected(selectedCantForget);
        }
    }

    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnCantForgetSelectedListener{
        void onCantForgetSelected(String secenek);
    }
}