package com.example.menumakanan;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.vHolder>{

    private ArrayList<String> gambar = new ArrayList<>();
    private ArrayList<String> nama = new ArrayList<>();
    private ArrayList<String> harga = new ArrayList<>();
    private ArrayList<String> desk = new ArrayList<>();
    private Context context;

    public Adapter(ArrayList<String> gambar, ArrayList<String> nama, ArrayList<String> harga,ArrayList<String> desk, Context context) {
        this.gambar = gambar;
        this.nama = nama;
        this.harga = harga;
        this.desk = desk;
        this.context = context;
    }

    @NonNull
    @Override
    public vHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_list, parent, false);
        vHolder holder = new vHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull vHolder holder, @SuppressLint("RecyclerView") final int position) {
        Glide.with(context).asBitmap().load(gambar.get(position)).into(holder.gambar);
        holder.nama.setText(nama.get(position));
        holder.harga.setText(harga.get(position));

        holder.itemlist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, Detail.class);
                intent.putExtra("gambar", gambar.get(position));
                intent.putExtra("nama", nama.get(position));
                intent.putExtra("harga", harga.get(position));
                intent.putExtra("deskripsi", desk.get(position));

                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {

        return nama.size();
    }

    public class vHolder extends RecyclerView.ViewHolder {
        ImageView gambar;
        TextView nama;
        TextView harga;
        ConstraintLayout itemlist;

        public vHolder(@NonNull View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.gambar);
            nama = itemView.findViewById(R.id.nama);
            harga = itemView.findViewById(R.id.harga);
            itemlist = itemView.findViewById(R.id.itemlist);

        }
    }
}