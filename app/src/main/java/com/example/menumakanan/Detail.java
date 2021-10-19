package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import com.bumptech.glide.Glide;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class Detail extends AppCompatActivity {

    TextView nama;
    TextView desk;
    TextView harga;
    ImageView gambar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        gambar = findViewById(R.id.gambar);
        nama = findViewById(R.id.nama);
        desk = findViewById(R.id.desk);
        harga = findViewById(R.id.harga);

        getIncomingExtra();

    }
    private void  getIncomingExtra() {
        if(getIntent().hasExtra("nama") && getIntent().hasExtra("deskripsi")) {
            String gambar1 = getIntent().getStringExtra("gambar");
            Glide.with(this).load(gambar1).into(gambar);
            String nama = getIntent().getStringExtra("nama");
            String harga = getIntent().getStringExtra("harga");
            String desk = getIntent().getStringExtra("deskripsi");

            setDataActivity(gambar1, nama, harga, desk);
        }
    }
    private void setDataActivity(String gambr, String nam, String harg, String deskr) {
        nama.setText(nam);
        desk.setText(deskr);
        harga.setText(harg);
        gambar.setImageURI(Uri.parse(gambr));
    }
}