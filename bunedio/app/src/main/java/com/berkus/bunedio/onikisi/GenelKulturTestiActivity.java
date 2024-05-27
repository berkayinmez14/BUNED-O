package com.berkus.bunedio.onikisi;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

public class GenelKulturTestiActivity extends AppCompatActivity implements GenelKulturTestiSoru1.OnAtaturkSelectedListener,GenelKulturTestiSoru2.OnEnAzKomsuSelectedListener,
GenelKulturTestiSoru3.OnPanamaSelectedListener,GenelKulturTestiSoru4.OnAntibiyotikSelectedListener,GenelKulturTestiSoru5.OnMenOscarSelectedListener,
GenelKulturTestiSoru6.OnTuringSelectedListener,GenelKulturTestiSoru7.OnKorkuSelectedListener{
    private FragmentManager fragmentManager;
    private int currentFragmentId = R.id.fragmentGenelKulturTestiSoru1;
    private LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_genel_kultur_testi);
        fragmentManager = getSupportFragmentManager();
        mainLayout = findViewById(R.id.main);
        if(savedInstanceState == null){
            showFragmentGenelKulturTestiSoru1();
        }
    }

    public void showFragmentGenelKulturTestiSoru1(){
        if (currentFragmentId != R.layout.fragment_genel_kultur_testi_soru1) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            GenelKulturTestiSoru1 fragment = new GenelKulturTestiSoru1();
            transaction.replace(R.id.fragmentGenelKulturTestiSoru1, fragment);
            transaction.commit();
            currentFragmentId = R.id.fragmentGenelKulturTestiSoru1;
        }
    }

    public void showFragmentGenelKulturTestiSoru2(){
        if (currentFragmentId != R.layout.fragment_genel_kultur_testi_soru2) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            GenelKulturTestiSoru2 fragment2 = new GenelKulturTestiSoru2();
            transaction.replace(R.id.fragmentGenelKulturTestiSoru2, fragment2);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentGenelKulturTestiSoru1));
            transaction.commit();
            currentFragmentId = R.id.fragmentGenelKulturTestiSoru2;
        }
    }

    public void showFragmentGenelKulturTestiSoru3(){
        if (currentFragmentId != R.layout.fragment_genel_kultur_testi_soru3) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            GenelKulturTestiSoru3 fragment3 = new GenelKulturTestiSoru3();
            transaction.replace(R.id.fragmentGenelKulturTestiSoru3, fragment3);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentGenelKulturTestiSoru2));
            transaction.commit();
            currentFragmentId = R.id.fragmentGenelKulturTestiSoru3;
        }
    }

    public void showFragmentGenelKulturTestiSoru4(){
        if (currentFragmentId != R.layout.fragment_genel_kultur_testi_soru4) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            GenelKulturTestiSoru4 fragment4 = new GenelKulturTestiSoru4();
            transaction.replace(R.id.fragmentGenelKulturTestiSoru4, fragment4);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentGenelKulturTestiSoru3));
            transaction.commit();
            currentFragmentId = R.id.fragmentGenelKulturTestiSoru4;
        }
    }

    public void showFragmentGenelKulturTestiSoru5(){
        if (currentFragmentId != R.layout.fragment_genel_kultur_testi_soru5) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            GenelKulturTestiSoru5 fragment5 = new GenelKulturTestiSoru5();
            transaction.replace(R.id.fragmentGenelKulturTestiSoru5, fragment5);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentGenelKulturTestiSoru4));
            transaction.commit();
            currentFragmentId = R.id.fragmentGenelKulturTestiSoru5;
        }
    }

    public void showFragmentGenelKulturTestiSoru6(){
        if (currentFragmentId != R.layout.fragment_genel_kultur_testi_soru6) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            GenelKulturTestiSoru6 fragment6 = new GenelKulturTestiSoru6();
            transaction.replace(R.id.fragmentGenelKulturTestiSoru6, fragment6);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentGenelKulturTestiSoru5));
            transaction.commit();
            currentFragmentId = R.id.fragmentGenelKulturTestiSoru6;
        }
    }

    public void showFragmentGenelKulturTestiSoru7(){
        if (currentFragmentId != R.layout.fragment_genel_kultur_testi_soru7) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            GenelKulturTestiSoru7 fragment7 = new GenelKulturTestiSoru7();
            transaction.replace(R.id.fragmentGenelKulturTestiSoru7, fragment7);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentGenelKulturTestiSoru6));
            transaction.commit();
            currentFragmentId = R.id.fragmentGenelKulturTestiSoru7;
        }
    }

    public void onAtaturkSelected(String secenek){
        TextView textKulturMesaj1 = findViewById(R.id.textKulturMesaj1);
        textKulturMesaj1.setText(""+textKulturMesaj1);
    }

    public void onEnAzKomsuSelected(String secenek){
        TextView textKulturMesaj2 = findViewById(R.id.textKulturMesaj2);
        textKulturMesaj2.setText(""+textKulturMesaj2);
    }

    public void onPanamaSelected(String secenek){
        TextView textKulturMesaj3 = findViewById(R.id.textKulturMesaj3);
        textKulturMesaj3.setText(""+textKulturMesaj3);
    }

    public void onAntibiyotikSelected(String secenek){
        TextView textKulturMesaj4 = findViewById(R.id.textKulturMesaj4);
        textKulturMesaj4.setText(""+textKulturMesaj4);
    }

    public void onMenOscarSelected(String secenek){
        TextView textKulturMesaj5 = findViewById(R.id.textKulturMesaj5);
        textKulturMesaj5.setText(""+textKulturMesaj5);
    }

    public void onTuringSelected(String secenek){
        TextView textKulturMesaj6 = findViewById(R.id.textKulturMesaj6);
        textKulturMesaj6.setText(""+textKulturMesaj6);
    }

    public void onKorkuSelected(String secenek){
        TextView textKulturMesaj7 = findViewById(R.id.textKulturMesaj7);
        textKulturMesaj7.setText(""+textKulturMesaj7);
    }
}