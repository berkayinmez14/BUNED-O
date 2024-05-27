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

public class YemekTestiActivity extends AppCompatActivity implements YemekTestiSoru1.OnMenemenSelectedListener,YemekTestiSoru2.OnPizzaSelectedListener,
YemekTestiSoru3.OnPideLahmSelectedListener,YemekTestiSoru4.OnPatatesSelectedListener,YemekTestiSoru5.OnKebapSelectedListener,
YemekTestiSoru6.OnSokakYemegiSelectedListener{
    private FragmentManager fragmentManager;
    private int currentFragmentId = R.id.fragmentYemekTestiSoru1;
    private LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_yemek_testi);
        fragmentManager = getSupportFragmentManager();
        mainLayout = findViewById(R.id.main);
        if(savedInstanceState == null){
            showFragmentYemekTestiSoru1();
        }
    }

    public void showFragmentYemekTestiSoru1(){
        if (currentFragmentId != R.layout.fragment_yemek_testi_soru1) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            YemekTestiSoru1 fragment = new YemekTestiSoru1();
            transaction.replace(R.id.fragmentYemekTestiSoru1, fragment);
            transaction.commit();
            currentFragmentId = R.id.fragmentYemekTestiSoru1;
        }
    }

    public void showFragmentYemekTestiSoru2(){
        if (currentFragmentId != R.layout.fragment_yemek_testi_soru2) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            YemekTestiSoru2 fragment2 = new YemekTestiSoru2();
            transaction.replace(R.id.fragmentYemekTestiSoru2, fragment2);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentYemekTestiSoru1));
            transaction.commit();
            currentFragmentId = R.id.fragmentYemekTestiSoru2;
        }
    }

    public void showFragmentYemekTestiSoru3(){
        if (currentFragmentId != R.layout.fragment_yemek_testi_soru3) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            YemekTestiSoru3 fragment3 = new YemekTestiSoru3();
            transaction.replace(R.id.fragmentYemekTestiSoru3, fragment3);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentYemekTestiSoru2));
            transaction.commit();
            currentFragmentId = R.id.fragmentYemekTestiSoru3;
        }
    }

    public void showFragmentYemekTestiSoru4(){
        if (currentFragmentId != R.layout.fragment_yemek_testi_soru4) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            YemekTestiSoru4 fragment4 = new YemekTestiSoru4();
            transaction.replace(R.id.fragmentYemekTestiSoru4, fragment4);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentYemekTestiSoru3));
            transaction.commit();
            currentFragmentId = R.id.fragmentYemekTestiSoru4;
        }
    }

    public void showFragmentYemekTestiSoru5(){
        if (currentFragmentId != R.layout.fragment_yemek_testi_soru5) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            YemekTestiSoru5 fragment5 = new YemekTestiSoru5();
            transaction.replace(R.id.fragmentYemekTestiSoru5, fragment5);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentYemekTestiSoru4));
            transaction.commit();
            currentFragmentId = R.id.fragmentYemekTestiSoru5;
        }
    }

    public void showFragmentYemekTestiSoru6(){
        if (currentFragmentId != R.layout.fragment_yemek_testi_soru6) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            YemekTestiSoru6 fragment6 = new YemekTestiSoru6();
            transaction.replace(R.id.fragmentYemekTestiSoru6, fragment6);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentYemekTestiSoru5));
            transaction.commit();
            currentFragmentId = R.id.fragmentYemekTestiSoru6;
        }
    }

    public void showFragmentYemekTestiSoru7(){
        if (currentFragmentId != R.layout.fragment_yemek_testi_soru7) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            YemekTestiSoru7 fragment7 = new YemekTestiSoru7();
            transaction.replace(R.id.fragmentYemekTestiSoru7, fragment7);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentYemekTestiSoru6));
            transaction.commit();
            currentFragmentId = R.id.fragmentYemekTestiSoru7;
        }
    }

    public void onMenemenSelected(String secenek){
        TextView textYemekMesaj1 = findViewById(R.id.textYemekMesaj1);
        textYemekMesaj1.setText(""+textYemekMesaj1);
    }

    public void onPizzaSelected(String secenek){
        TextView textYemekMesaj2 = findViewById(R.id.textYemekMesaj2);
        textYemekMesaj2.setText(""+textYemekMesaj2);
    }

    public void onPideLahmSelected(String secenek){
        TextView textYemekMesaj3 = findViewById(R.id.textYemekMesaj3);
        textYemekMesaj3.setText(""+textYemekMesaj3);
    }

    public void onPatatesSelected(String secenek){
        TextView textYemekMesaj4 = findViewById(R.id.textYemekMesaj4);
        textYemekMesaj4.setText(""+textYemekMesaj4);
    }

    public void onKebapSelected(String secenek){
        TextView textYemekMesaj5 = findViewById(R.id.textYemekMesaj5);
        textYemekMesaj5.setText(""+textYemekMesaj5);
    }

    public void onSokakYemegiSelected(String secenek){
        TextView textYemekMesaj6 = findViewById(R.id.textYemekMesaj6);
        textYemekMesaj6.setText(""+textYemekMesaj6);
    }

    public void onTatliSelected(String secenek){
        TextView textYemekMesaj7 = findViewById(R.id.textYemekMesaj7);
        textYemekMesaj7.setText(""+textYemekMesaj7);
    }
}