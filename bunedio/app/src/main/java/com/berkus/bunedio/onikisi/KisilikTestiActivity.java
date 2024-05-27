package com.berkus.bunedio.onikisi;


import android.content.Context;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;


public class KisilikTestiActivity extends AppCompatActivity implements KisilikTestiSoru1.OnGenderSelectedListener,
        KisilikTestiSoru2.OnDiscussionSelectedListener,KisilikTestiSoru3.OnCritiqueSelectedListener,KisilikTestiSoru4.OnSocialSelectedListener,
        KisilikTestiSoru5.OnWatchingFilmSelectedListener,KisilikTestiSoru6.OnOfferHelpSelectedListener,KisilikTestiSoru7.OnCourtSelectedListener{

    private FragmentManager fragmentManager;
    private int currentFragmentId = R.id.fragmentKisilikTestiSoru1;
    private Button buttonIlkSoru,buttonIkinciSoru,buttonUcuncuSoru;
    private LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kisilik_testi);
        fragmentManager = getSupportFragmentManager();
        buttonIlkSoru = findViewById(R.id.buttonIlkSoru);
        buttonIkinciSoru = findViewById(R.id.buttonIkinciSoru);
        buttonUcuncuSoru=findViewById(R.id.buttonUcuncuSoru);
        mainLayout = findViewById(R.id.main);

        buttonIlkSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFragmentKisilikTestiSoru2();
            }
        });

        buttonIkinciSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFragmentKisilikTestiSoru3();
            }
        });

        buttonUcuncuSoru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showFragmentKisilikTestiSoru4();
            }
        });

        if(savedInstanceState == null){
            showFragmentKisilikTestiSoru1();
        }

    }

    public void showFragmentKisilikTestiSoru1(){
        if (currentFragmentId != R.layout.fragment_kisilik_testi_soru1) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            KisilikTestiSoru1 fragment = new KisilikTestiSoru1();
            transaction.replace(R.id.fragmentKisilikTestiSoru1, fragment);
            transaction.commit();
            currentFragmentId = R.id.fragmentKisilikTestiSoru1;
        }

    }

    public void showFragmentKisilikTestiSoru2(){
        if (currentFragmentId != R.id.fragmentKisilikTestiSoru2) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            KisilikTestiSoru2 fragment2 = new KisilikTestiSoru2();
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentKisilikTestiSoru1));
            transaction.replace(R.id.fragmentKisilikTestiSoru2, fragment2);
            transaction.commit();
            currentFragmentId = R.id.fragmentKisilikTestiSoru2;
        }
        LinearLayout buttonIkinciSoruParent = (LinearLayout) buttonIkinciSoru.getParent();
        buttonIkinciSoruParent.removeView(buttonIkinciSoru);

       // mainLayout.removeView(buttonIlkSoru);

        mainLayout.addView(buttonIkinciSoru);

    }

    public void showFragmentKisilikTestiSoru3(){
        if (currentFragmentId != R.id.fragmentKisilikTestiSoru3) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            KisilikTestiSoru3 fragment3 = new KisilikTestiSoru3();
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentKisilikTestiSoru2));
            transaction.replace(R.id.fragmentKisilikTestiSoru3, fragment3);
            transaction.commit();
            currentFragmentId = R.id.fragmentKisilikTestiSoru3;
        }
    }

    public void showFragmentKisilikTestiSoru4(){
        if (currentFragmentId != R.id.fragmentKisilikTestiSoru4) {
            KisilikTestiSoru4 kisilikTestiSoru4 = new KisilikTestiSoru4();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.fragmentKisilikTestiSoru4, kisilikTestiSoru4);
            transaction.remove((fragmentManager.findFragmentById(R.id.fragmentKisilikTestiSoru3)));
            transaction.addToBackStack(null);
            transaction.commit();
            currentFragmentId = R.id.fragmentKisilikTestiSoru4;
        }
    }

    public void showFragmentKisilikTestiSoru5(){
        if(currentFragmentId != R.id.fragmentKisilikTestiSoru5){
            KisilikTestiSoru5 kisilikTestiSoru5 = new KisilikTestiSoru5();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.fragmentKisilikTestiSoru5,kisilikTestiSoru5);
            transaction.remove((fragmentManager.findFragmentById(R.id.fragmentKisilikTestiSoru4)));
            transaction.addToBackStack(null);
            transaction.commit();
            currentFragmentId = R.id.fragmentKisilikTestiSoru5;
        }
    }

    public void showFragmentKisilikTestiSoru6(){
        if(currentFragmentId != R.id.fragmentKisilikTestiSoru6){
            KisilikTestiSoru6 kisilikTestiSoru6 = new KisilikTestiSoru6();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.fragmentKisilikTestiSoru6,kisilikTestiSoru6);
            transaction.remove((fragmentManager.findFragmentById(R.id.fragmentKisilikTestiSoru5)));
            transaction.addToBackStack(null);
            transaction.commit();
            currentFragmentId = R.id.fragmentKisilikTestiSoru6;
        }
    }

    public void showFragmentKisilikTestiSoru7(){
        if(currentFragmentId != R.id.fragmentKisilikTestiSoru7){
            KisilikTestiSoru7 kisilikTestiSoru7 = new KisilikTestiSoru7();
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            transaction.replace(R.id.fragmentKisilikTestiSoru7,kisilikTestiSoru7);
            transaction.remove((fragmentManager.findFragmentById(R.id.fragmentKisilikTestiSoru6)));
            transaction.addToBackStack(null);
            transaction.commit();
            currentFragmentId = R.id.fragmentKisilikTestiSoru7;
        }
    }

    public void onGenderSelected(String cinsiyet) {

        TextView textSecilenCinsiyet = findViewById(R.id.secilenCinsiyet);
        textSecilenCinsiyet.setText("Seçilen cinsiyet: " + cinsiyet);

    }

    public void onDiscussionSelected(String secenek){
        TextView textMesaj = findViewById(R.id.textMesaj);
        textMesaj.setText(""+textMesaj);
    }

    public void onCritiqueSelected(String secenek){
        TextView textMesaj3 = findViewById(R.id.textMesaj3);
        textMesaj3.setText(""+textMesaj3);
    }

    public void onSocialSelected(String secenek){
        TextView textMesaj4 = findViewById(R.id.textMesaj4);
        textMesaj4.setText(""+textMesaj4);
    }

    public void onWatchingFilmSelected(String secenek){
        TextView textMesaj5 = findViewById(R.id.textMesaj5);
        textMesaj5.setText(""+textMesaj5);
    }

    public void onOfferHelpSelected(String secenek){
        TextView textMesaj6 = findViewById(R.id.textMesaj6);
        textMesaj6.setText(""+textMesaj6);
    }

    public void onCourtSelected(String secenek){
        TextView textMesaj7 = findViewById(R.id.textMesaj7);
        textMesaj7.setText(""+textMesaj7);
    }
}