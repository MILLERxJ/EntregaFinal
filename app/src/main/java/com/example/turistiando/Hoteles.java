package com.example.turistiando;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Hoteles extends AppCompatActivity {

    //Atributos de la clase
    ArrayList<Hotel> lista = new ArrayList<>();

    RecyclerView listaLogica;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hoteles);

        listaLogica = findViewById(R.id.reciclar);
        listaLogica.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        crearListaHoteles();
        Adaptador adaptador = new Adaptador(lista);
        listaLogica.setAdapter(adaptador);
    }

    public void crearListaHoteles(){

        lista.add(new Hotel(R.drawable.fotoh0,"Hotel montaña linda","2500000"));
        lista.add(new Hotel(R.drawable.fotoh2,"Hotel paraiso","3000000"));
        lista.add(new Hotel(R.drawable.fotoh3,"Hotel linda sierra","2000000"));
        lista.add(new Hotel(R.drawable.fotoh4,"Inka pasion","3500000"));
    }
}