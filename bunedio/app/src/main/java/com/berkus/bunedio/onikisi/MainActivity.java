package com.berkus.bunedio.onikisi;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    EditText emailTV ,sifreTV,kullanici_adiTV;
    Button buttonGiris,buttonKayitOl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        emailTV=findViewById(R.id.EmailTV);
        sifreTV=findViewById(R.id.SifreTV);
        kullanici_adiTV=findViewById(R.id.EmailTV);
        buttonGiris=findViewById(R.id.buttonGiris);
        buttonKayitOl=findViewById(R.id.buttonKayitOl);

        buttonGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String kullaniciAdi=emailTV.getText().toString().trim();
                String email = emailTV.getText().toString().trim();
                String sifre=sifreTV.getText().toString().trim();
                if(!TextUtils.isEmpty(kullaniciAdi) && !TextUtils.isEmpty(email) && !TextUtils.isEmpty(sifre)){
                    if(kullaniciAdi.equals(view.findViewById(R.id.editTextKullaniciAdi)) && email.equals(view.findViewById(R.id.editTextEmail)) && sifre.equals(view.findViewById(R.id.editTextSifre))){
                        Intent intentim = new Intent(MainActivity.this,GirisSayfasiActivity.class);
                        startActivity(intentim);
                    }else{
                        Toast.makeText(MainActivity.this, "şifre ya da mail adresi yanlış", Toast.LENGTH_SHORT).show();
                    }
                }else{
                        Toast.makeText(MainActivity.this, "Giriş boş olmaz", Toast.LENGTH_SHORT).show();
                }
            }
        });

        buttonGiris.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this,GirisSayfasiActivity.class);
                startActivity(intent1);
            }
        });

        buttonKayitOl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,KayitOlActivity.class);
                startActivity(intent);
            }
        });

    }
}