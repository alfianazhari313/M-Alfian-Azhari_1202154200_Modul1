package com.example.android.malfianazhari_1202154200_modul1;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    TextView tvNamaRestoran;
    TextView tvMenu;
    TextView tvPorsi;
    TextView tvHarga;

    String menu;
    int porsi;
    String nama_restoran;
    int harga;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        tvNamaRestoran = (TextView) findViewById(R.id.tvNamaRestoran);
        tvMenu = (TextView) findViewById(R.id.tvMenu);
        tvHarga = (TextView)findViewById(R.id.tvHarga);
        tvPorsi = (TextView) findViewById(R.id.tvPorsi);

        Intent intent = getIntent();
        menu = intent.getStringExtra("menu");
        porsi = Integer.valueOf(intent.getStringExtra("porsi"));
        nama_restoran = intent.getStringExtra("nama_restoran");

int total;
        if(nama_restoran.equalsIgnoreCase("abnormal")){
            harga = 30000;
            total = harga * porsi;
            if (total <= 65500) {
                Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_SHORT).show();
            }
        } else {
            harga = 50000;
            total = harga * porsi;
            if (total <= 65500) {
                Toast.makeText(this, "Disini aja makan malamnya", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "Jangan disini makan malamnya, uang kamu tidak cukup", Toast.LENGTH_SHORT).show();
            }
        }

        tvNamaRestoran.setText(nama_restoran);
        tvMenu.setText(menu);
        tvPorsi.setText(porsi+"");
        tvHarga.setText(total+"");
    }
}
