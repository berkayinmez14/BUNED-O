package com.berkus.bunedio.onikisi;

import android.os.Bundle;
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

public class KayitOlActivity extends AppCompatActivity {
    EditText editTextEmail,editTextKullaniciAdi,editTextSifre,editTextİsim;
    Button kayitOlButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kayit_ol);
        editTextEmail=findViewById(R.id.editTextEmail);
        editTextKullaniciAdi=findViewById(R.id.editTextKullaniciAdi);
        editTextSifre=findViewById(R.id.editTextSifre);
        editTextİsim=findViewById(R.id.editTextİsim);
        kayitOlButton=findViewById(R.id.kayitOlButton);

        kayitOlButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email=editTextEmail.getText().toString().trim();
                String kullanici_adi=editTextKullaniciAdi.getText().toString().trim();
                String sifre=editTextSifre.getText().toString().trim();
                String isim=editTextİsim.getText().toString().trim();

                if(email.isEmpty()||kullanici_adi.isEmpty()||sifre.isEmpty()||isim.isEmpty()){
                    Toast.makeText(KayitOlActivity.this,"Lütfen tüm alanları doldurnuz",Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText(KayitOlActivity.this,"Kayıt Başarılı",Toast.LENGTH_SHORT).show();
                }
            }
        });


    }
}