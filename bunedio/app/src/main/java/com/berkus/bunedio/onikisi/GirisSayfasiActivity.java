package com.berkus.bunedio.onikisi;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class GirisSayfasiActivity extends AppCompatActivity {
    Button kisilikTesti,psikolojiTesti,askTesti,yemekTesti,genelKulturTesti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giris_sayfasi);
        kisilikTesti=findViewById(R.id.buttonKisilikTesti);
        psikolojiTesti=findViewById(R.id.buttonPsikolojiTesti);
        askTesti=findViewById(R.id.buttonAskTesti);
        yemekTesti=findViewById(R.id.buttonYemekTercihiTesti);
        genelKulturTesti=findViewById(R.id.buttonGenelKulturTesti);

        kisilikTesti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(GirisSayfasiActivity.this,KisilikTestiActivity.class);
                startActivity(intent);
            }
        });

        psikolojiTesti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent2 = new Intent(GirisSayfasiActivity.this,PsikolojikTestiActivity.class);
                startActivity(intent2);
            }
        });

        askTesti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent3 = new Intent(GirisSayfasiActivity.this,AskTestiActivity.class);
                startActivity(intent3);
            }
        });

        yemekTesti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent4 = new Intent(GirisSayfasiActivity.this,YemekTestiActivity.class);
                startActivity(intent4);
            }
        });

        genelKulturTesti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent5 = new Intent(GirisSayfasiActivity.this,GenelKulturTestiActivity.class);
                startActivity(intent5);
            }
        });
    }
}