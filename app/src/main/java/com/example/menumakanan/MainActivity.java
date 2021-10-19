package com.example.menumakanan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import android.os.Bundle;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private ArrayList<String> gambar = new ArrayList<>();
    private  ArrayList<String> nama = new ArrayList<>();
    private  ArrayList<String> harga = new ArrayList<>();
    private  ArrayList<String> desk = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getDatafromInternet();
    }
    private void Adapater() {
        RecyclerView recyclerView = findViewById(R.id.menu);
        Adapter adapter = new Adapter(gambar, nama, harga, desk,this);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }

    private void getDatafromInternet() {
        nama.add("Sate Ayam");
        gambar.add("https://rinaresep.com/wp-content/uploads/2021/08/Sate-ayam-kecap.jpg");
        harga.add("Rp. 20.000");
        desk.add("Sate Ayam dengan bumbu kacang spesial");

        nama.add("Nasi Gandul");
        gambar.add("https://cdn0-production-images-kly.akamaized.net/c1aOOch9RmLD88m4IuF42u8zjU4=/1280x720/smart/filters:quality(75):strip_icc():format(jpeg)/kly-media-production/medias/2751403/original/056422200_1552562680-KMJ_1.jpg");
        harga.add("Rp. 12.000");
        desk.add("Nasi dengan sayur gandul khas Pati");

        nama.add("Ayam Bakar");
        gambar.add("https://www.resepistimewa.com/wp-content/uploads/cara-membuat-ayam-bakar-kecap.jpg");
        harga.add("Rp. 25.000");
        desk.add("Ayam bakar dengan bumbu kecap");

        nama.add("Nila Bakar");
        gambar.add("https://4.bp.blogspot.com/-RxAohODihsU/Wb4jCPtbcvI/AAAAAAAAADg/iKvSuPpt8tEh4Fayo9R8ody3lxVURykxgCLcBGAs/s1600/NILA%2BSUBANG%2BGORENG.jpg");
        harga.add("Rp. 32.000");
        desk.add("Nila bakar spesial");

        nama.add("Es Teh");
        gambar.add("https://media.suara.com/pictures/653x366/2015/01/12/o_19bep4ld71e181fnq5jei14l9na.jpg");
        harga.add("Rp. 5.000");
        desk.add("Teh dengan es");


        Adapater();

    }
}