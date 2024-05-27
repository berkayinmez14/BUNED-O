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

public class AskTestiActivity extends AppCompatActivity implements AskTestiSoru1.OnGenderSelectedListener3,AskTestiSoru2.OnCareAboutSelectedListener,
AskTestiSoru3.OnCowardBehlulSelectedListener,AskTestiSoru4.OnKeepSecretSelectedListener,AskTestiSoru5.OnSoulMateSelectedListener,
AskTestiSoru6.OnLDistanceRelatshipSelectedListener,AskTestiSoru7.OnMarriageSelectedListener{
    private FragmentManager fragmentManager;
    private int currentFragmentId = R.id.fragmentAskTestiSoru1;
    private LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ask_testi);
        fragmentManager = getSupportFragmentManager();
        mainLayout = findViewById(R.id.main);
        if(savedInstanceState == null){
            showFragmentAskTestiSoru1();
        }

    }

    public void showFragmentAskTestiSoru1(){
        if (currentFragmentId != R.layout.fragment_ask_testi_soru1) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            AskTestiSoru1 fragment = new AskTestiSoru1();
            transaction.replace(R.id.fragmentAskTestiSoru1, fragment);
            transaction.commit();
            currentFragmentId = R.id.fragmentAskTestiSoru1;
        }
    }

    public void showFragmentAskTestiSoru2(){
        if (currentFragmentId != R.layout.fragment_ask_testi_soru2) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            AskTestiSoru2 fragment2 = new AskTestiSoru2();
            transaction.replace(R.id.fragmentAskTestiSoru2, fragment2);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentAskTestiSoru1));
            transaction.commit();
            currentFragmentId = R.id.fragmentAskTestiSoru2;
        }
    }

    public void showFragmentAskTestiSoru3(){
        if (currentFragmentId != R.layout.fragment_ask_testi_soru3) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            AskTestiSoru3 fragment3 = new AskTestiSoru3();
            transaction.replace(R.id.fragmentAskTestiSoru3, fragment3);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentAskTestiSoru2));
            transaction.commit();
            currentFragmentId = R.id.fragmentAskTestiSoru3;
        }
    }

    public void showFragmentAskTestiSoru4(){
        if (currentFragmentId != R.layout.fragment_ask_testi_soru4) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            AskTestiSoru4 fragment4 = new AskTestiSoru4();
            transaction.replace(R.id.fragmentAskTestiSoru4, fragment4);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentAskTestiSoru3));
            transaction.commit();
            currentFragmentId = R.id.fragmentAskTestiSoru4;
        }
    }

    public void showFragmentAskTestiSoru5(){
        if (currentFragmentId != R.layout.fragment_ask_testi_soru5) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            AskTestiSoru5 fragment5 = new AskTestiSoru5();
            transaction.replace(R.id.fragmentAskTestiSoru5, fragment5);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentAskTestiSoru4));
            transaction.commit();
            currentFragmentId = R.id.fragmentAskTestiSoru5;
        }
    }

    public void showFragmentAskTestiSoru6(){
        if (currentFragmentId != R.layout.fragment_ask_testi_soru6) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            AskTestiSoru6 fragment6 = new AskTestiSoru6();
            transaction.replace(R.id.fragmentAskTestiSoru6, fragment6);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentAskTestiSoru5));
            transaction.commit();
            currentFragmentId = R.id.fragmentAskTestiSoru6;
        }
    }

    public void showFragmentAskTestiSoru7(){
        if (currentFragmentId != R.layout.fragment_ask_testi_soru7) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            AskTestiSoru7 fragment7 = new AskTestiSoru7();
            transaction.replace(R.id.fragmentAskTestiSoru7, fragment7);
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentAskTestiSoru6));
            transaction.commit();
            currentFragmentId = R.id.fragmentAskTestiSoru7;
        }
    }

    public void onGenderSelected3(String secenek){
        TextView textAskMesaj1 = findViewById(R.id.textAskMesaj1);
        textAskMesaj1.setText(""+textAskMesaj1);
    }

    public void onCareAboutSelected(String secenek){
        TextView textAskMesaj2 = findViewById(R.id.textAskMesaj2);
        textAskMesaj2.setText(""+textAskMesaj2);
    }

    public void onCowardBehlulSelected(String secenek){
        TextView textAskMesaj3 = findViewById(R.id.textAskMesaj3);
        textAskMesaj3.setText(""+textAskMesaj3);
    }

    public void onKeepSecretSelected(String secenek){
        TextView textAskMesaj4 = findViewById(R.id.textPsikolojiMesaj4);
        textAskMesaj4.setText(""+textAskMesaj4);
    }

    public void onSoulMateSelected(String secenek){
        TextView textAskMesaj5 = findViewById(R.id.textAskMesaj5);
        textAskMesaj5.setText(""+textAskMesaj5);
    }

    public void onLDistanceRelatshipSelected(String secenek){
        TextView textAskMesaj6 = findViewById(R.id.textAskMesaj6);
        textAskMesaj6.setText(""+textAskMesaj6);
    }

    public void onMarriageSelected(String secenek){
        TextView textAskMesaj7 = findViewById(R.id.textAskMesaj7);
        textAskMesaj7.setText(""+textAskMesaj7);
    }
}