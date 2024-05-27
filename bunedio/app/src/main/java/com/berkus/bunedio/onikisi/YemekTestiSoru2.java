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


public class YemekTestiSoru2 extends Fragment implements AdapterView.OnItemSelectedListener {
    private Button buttonKirmiziEtliPizza,buttonTavukEtliPizza,buttonPeynirliPizza,buttonSebzeliPizza,buttonYemekUcuncuSoru;
    private ImageView imageViewKirmiziEtliPizza,imageViewTavukEtliPizza,imageViewPeynirliPizza,imageViewSebzeliPizza;
    private TextView textYemekMesaj2;
    private OnPizzaSelectedListener listener;

    public YemekTestiSoru2() {

    }

   public void setOnPizzaSelectedListener(OnPizzaSelectedListener listener){
        this.listener=listener;
   }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view=inflater.inflate(R.layout.fragment_yemek_testi_soru2,container,false);
        buttonKirmiziEtliPizza=view.findViewById(R.id.buttonKirmiziEtliPizza);
        buttonTavukEtliPizza=view.findViewById(R.id.buttonTavukEtliPizza);
        buttonPeynirliPizza=view.findViewById(R.id.buttonPeynirliPizza);
        buttonSebzeliPizza=view.findViewById(R.id.buttonSebezzeliPizza);
        buttonYemekUcuncuSoru=view.findViewById(R.id.buttonYemekUcuncuSoru);
        imageViewKirmiziEtliPizza=view.findViewById(R.id.imageViewKirmiziEtliPizza);
        imageViewTavukEtliPizza=view.findViewById(R.id.imageViewTavukEtliPizza);
        imageViewPeynirliPizza=view.findViewById(R.id.imageViewPeynirliPizza);
        imageViewSebzeliPizza=view.findViewById(R.id.imageViewSebzeliPizza);
        textYemekMesaj2=view.findViewById(R.id.textYemekMesaj2);

        buttonKirmiziEtliPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj2.setText("Param var diyorsun yani :)");
            }
        });

        buttonTavukEtliPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj2.setText("Tavuk dönerden devam edelim bence..");
            }
        });

        buttonPeynirliPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj2.setText("Bu sanki zevkine yemek gibi bir şey.");
            }
        });

        buttonSebzeliPizza.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textYemekMesaj2.setText("Hemen bu testi terk et !..");
            }
        });

        buttonYemekUcuncuSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((YemekTestiActivity) getActivity()).showFragmentYemekTestiSoru3();
            }
        });
        return view;
    }

    public void onItemSelected(AdapterView<?> parent,View view,int position,long id){
        String selectedPizza=parent.getItemAtPosition(position).toString();
        if (listener!=null){
            listener.onPizzaSelected(selectedPizza);
        }
    }

    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

    public interface OnPizzaSelectedListener{
        void onPizzaSelected(String secenek);
    }
}