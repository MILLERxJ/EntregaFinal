package com.example.turistiando;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class Restaurantes extends AppCompatActivity {

    ArrayList<Restaurante> listaR = new ArrayList<>();

    RecyclerView listaLogicaR;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_restaurantes);

        listaLogicaR = findViewById(R.id.reciclando);
        listaLogicaR.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));

        crearListaRestaurantes();
        AdaptadorR adaptadorR = new AdaptadorR(listaR);
        listaLogicaR.setAdapter(adaptadorR);
    }

    public void crearListaRestaurantes(){

        listaR.add(new Restaurante(R.drawable.fotor1,"Restaurante la chismosa","Al drente de la estatua de la paz"));
        listaR.add(new Restaurante(R.drawable.fotor2,"Que berraquera sabor y sazon","Al frente de la estacion de policia de Santa Elena"));
        listaR.add(new Restaurante(R.drawable.fotor3,"La aldea","Al lado de la veterinaria la casa agropecuaria"));
        listaR.add(new Restaurante(R.drawable.fotor4,"Sublime Santa Elena","Al lado de la Ferreteria la gran variedad"));
    }

}
