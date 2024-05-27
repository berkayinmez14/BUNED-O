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

public class PsikolojikTestiActivity extends AppCompatActivity implements PsikolojikTestiSoru1.OnGenderSelectedListener2,PsikolojikTestiSoru2.OnExcuseSelectedListener,
PsikolojikTestiSoru3.OnComeGoodSelectedListener,PsikolojikTestiSoru4.OnCantForgetSelectedListener,PsikolojikTestiSoru5.OnStressMomentSelectedListener,
PsikolojikTestiSoru6.OnFeelUneasySelectedListener,PsikolojikTestiSoru7.OnFeelAloneSelectedListener{
    private FragmentManager fragmentManager;
    private int currentFragmentId = R.id.fragmentPsikolojiTestiSoru1;
    private LinearLayout mainLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_psikolojik_testi);
        fragmentManager = getSupportFragmentManager();
        mainLayout = findViewById(R.id.main);
        if(savedInstanceState == null){
            showFragmentPsikolojiTestiSoru1();
        }

    }

    public void showFragmentPsikolojiTestiSoru1(){
        if (currentFragmentId != R.layout.fragment_psikolojik_testi_soru1) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            PsikolojikTestiSoru1 fragment = new PsikolojikTestiSoru1();
            transaction.replace(R.id.fragmentPsikolojiTestiSoru1, fragment);
            transaction.commit();
            currentFragmentId = R.id.fragmentPsikolojiTestiSoru1;
        }
    }

    public void showFragmentPsikolojiTestiSoru2(){
        if (currentFragmentId != R.id.fragmentPsikolojiTestiSoru2) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            PsikolojikTestiSoru2 fragment2 = new PsikolojikTestiSoru2();
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentPsikolojiTestiSoru1));
            transaction.replace(R.id.fragmentPsikolojiTestiSoru2, fragment2);
            transaction.commit();
            currentFragmentId = R.id.fragmentPsikolojiTestiSoru2;
        }
    }

    public void showFragmentPsikolojiTestiSoru3(){
        if (currentFragmentId != R.id.fragmentPsikolojiTestiSoru3) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            PsikolojikTestiSoru3 fragment3 = new PsikolojikTestiSoru3();
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentPsikolojiTestiSoru2));
            transaction.replace(R.id.fragmentPsikolojiTestiSoru3, fragment3);
            transaction.commit();
            currentFragmentId = R.id.fragmentPsikolojiTestiSoru3;
        }
    }

    public void showFragmentPsikolojiTestiSoru4(){
        if (currentFragmentId != R.id.fragmentPsikolojiTestiSoru4) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            PsikolojikTestiSoru4 fragment4 = new PsikolojikTestiSoru4();
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentPsikolojiTestiSoru3));
            transaction.replace(R.id.fragmentPsikolojiTestiSoru4, fragment4);
            transaction.commit();
            currentFragmentId = R.id.fragmentPsikolojiTestiSoru4;
        }
    }

    public void showFragmentPsikolojiTestiSoru5(){
        if (currentFragmentId != R.id.fragmentPsikolojiTestiSoru5) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            PsikolojikTestiSoru5 fragment5 = new PsikolojikTestiSoru5();
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentPsikolojiTestiSoru4));
            transaction.replace(R.id.fragmentPsikolojiTestiSoru5, fragment5);
            transaction.commit();
            currentFragmentId = R.id.fragmentPsikolojiTestiSoru5;
        }
    }

    public void showFragmentPsikolojiTestiSoru6(){
        if (currentFragmentId != R.id.fragmentPsikolojiTestiSoru6) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            PsikolojikTestiSoru6 fragment6 = new PsikolojikTestiSoru6();
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentPsikolojiTestiSoru5));
            transaction.replace(R.id.fragmentPsikolojiTestiSoru6, fragment6);
            transaction.commit();
            currentFragmentId = R.id.fragmentPsikolojiTestiSoru6;
        }
    }

    public void showFragmentPsikolojiTestiSoru7(){
        if (currentFragmentId != R.id.fragmentPsikolojiTestiSoru7) {
            FragmentTransaction transaction = fragmentManager.beginTransaction();
            PsikolojikTestiSoru7 fragment7 = new PsikolojikTestiSoru7();
            transaction.remove(fragmentManager.findFragmentById(R.id.fragmentPsikolojiTestiSoru6));
            transaction.replace(R.id.fragmentPsikolojiTestiSoru7, fragment7);
            transaction.commit();
            currentFragmentId = R.id.fragmentPsikolojiTestiSoru7;
        }
    }

    public void onGenderSelected2(String secenek){
        TextView textPsikolojiMesaj1 = findViewById(R.id.textPsikolojiMesaj1);
        textPsikolojiMesaj1.setText(""+textPsikolojiMesaj1);
    }

    public void onExcuseSelected(String secenek){
        TextView textPsikolojiMesaj2 = findViewById(R.id.textPsikolojiMesaj2);
        textPsikolojiMesaj2.setText(""+textPsikolojiMesaj2);
    }

    public void onComeGoodSelected(String secenek){
        TextView textPsikolojiMesaj3 = findViewById(R.id.textPsikolojiMesaj3);
        textPsikolojiMesaj3.setText(""+textPsikolojiMesaj3);
    }

    public void onCantForgetSelected(String secenek){
        TextView textPsikolojiMesaj4 = findViewById(R.id.textPsikolojiMesaj4);
        textPsikolojiMesaj4.setText(""+textPsikolojiMesaj4);
    }

    public void onStressMomentSelected(String secenek){
        TextView textPsikolojiMesaj5 = findViewById(R.id.textPsikolojiMesaj5);
        textPsikolojiMesaj5.setText(""+textPsikolojiMesaj5);
    }

    public void onFeelUneasySelected(String secenek){
        TextView textPsikolojiMesaj6 = findViewById(R.id.textPsikolojiMesaj6);
        textPsikolojiMesaj6.setText(""+textPsikolojiMesaj6);
    }

    public void onFeelAloneSelected(String secenek){
        TextView textPsikolojiMesaj7 = findViewById(R.id.textPsikolojiMesaj7);
        textPsikolojiMesaj7.setText(""+textPsikolojiMesaj7);
    }
}