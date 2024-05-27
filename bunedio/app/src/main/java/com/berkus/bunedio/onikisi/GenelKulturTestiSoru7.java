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


public class GenelKulturTestiSoru7 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonKulturA7,buttonKulturB7,buttonKulturC7,buttonKulturD7;
    private TextView textKulturMesaj7;
    private GifImageView gifImageViewSonSoru;
    private OnKorkuSelectedListener listener;

    public GenelKulturTestiSoru7() {

    }

    public void setOnKorkuSelectedListener(OnKorkuSelectedListener listener){
        this.listener=listener;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_genel_kultur_testi_soru7,container,false);
        buttonKulturA7=view.findViewById(R.id.buttonKulturA7);
        buttonKulturB7=view.findViewById(R.id.buttonKulturB7);
        buttonKulturC7=view.findViewById(R.id.buttonKulturC7);
        buttonKulturD7=view.findViewById(R.id.buttonKulturD7);
        textKulturMesaj7=view.findViewById(R.id.textKulturMesaj7);
        gifImageViewSonSoru=view.findViewById(R.id.gifImageViewSonSoru);

        buttonKulturA7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj7.setText("Yanlış cevap,bundan korkan var mıymış harbiden");
            }
        });

        buttonKulturB7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj7.setText("Doğru cevap.Sakın bu kişinin yanında muvaffakiyetsizleştiricileştiriveremeyebileceklerimizdenmişsinizcesine demeyin");
            }
        });

        buttonKulturC7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj7.setText("Yanlış cevap.Şu güzel şeylerden kokrmayın bari");
            }
        });

        buttonKulturD7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textKulturMesaj7.setText("Yanlış cevap.Köpekbalığı korkusu olsa anlamaya çalışacağım hadi");
            }
        });

        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedKorku=parent.getItemAtPosition(position).toString();
        if(listener!=null){
            listener.onKorkuSelected(selectedKorku);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnKorkuSelectedListener{
        void onKorkuSelected(String secenek);
    }
}