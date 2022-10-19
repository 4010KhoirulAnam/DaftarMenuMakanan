package com.example.daftarmenumakanan;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class DetailMakanan extends AppCompatActivity {
    ImageView gambarmakanan_masuk;
    TextView namafood_masuk, ketfood_masuk;

    String name_kunci="namamakanan";
    String ket_kunci="keter";
    int imgmakanan;
    String nama_makanan;
    String keter_makanan;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_makanan);
        gambarmakanan_masuk=findViewById(R.id.gambarterima);
        namafood_masuk=findViewById(R.id.nammakanan);
        ketfood_masuk=findViewById(R.id.ketermakanan);

        Bundle bundle=getIntent().getExtras();
        imgmakanan=bundle.getInt(String.valueOf("gambaremakanan"));
        gambarmakanan_masuk.setImageResource(imgmakanan);
        nama_makanan=bundle.getString("namamakanan");
        keter_makanan=bundle.getString("keter");
        namafood_masuk.setText(nama_makanan);
        ketfood_masuk.setText(keter_makanan);


    }
}