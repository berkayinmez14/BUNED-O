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


public class YemekTestiSoru3 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonPide,buttonLahmacun,buttonYemekDorduncuSoru;
    private ImageView imageViewPide,imageViewLahmacun;
    private TextView textYemekMesaj3;
    private OnPideLahmSelectedListener listener;

    public YemekTestiSoru3() {

    }

    public void setOnPideLahmSelectedListener(OnPideLahmSelectedListener listener){
        this.listener=listener;
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_yemek_testi_soru3,container,false);
        buttonPide=view.findViewById(R.id.buttonPide);
        buttonLahmacun=view.findViewById(R.id.buttonLahmacun);
        buttonYemekDorduncuSoru=view.findViewById(R.id.buttonYemekDorduncuSoru);
        imageViewPide=view.findViewById(R.id.imageViewPide);
        imageViewLahmacun=view.findViewById(R.id.imageViewLahmacun);
        textYemekMesaj3=view.findViewById(R.id.textYemekMesaj3);

        buttonPide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj3.setText("Her bölgenin pideyi kendisine sahiplenmesine ne diyorsun peki");
            }
        });

        buttonLahmacun.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj3.setText("Bir oturuşta kaç tane yersin diye sorsak peki ?");
            }
        });

        buttonYemekDorduncuSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((YemekTestiActivity) getActivity()).showFragmentYemekTestiSoru4();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedPideLahm=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onPideLahmSelected(selectedPideLahm);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnPideLahmSelectedListener{
        void onPideLahmSelected(String secenek);
    }
}