package com.example.turistiando;

import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.annotation.NonNull;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Locale;

public class MainActivity extends AppCompatActivity {

    //ATRIBUTOS
    ImageButton botonHoteles;
    ImageButton botonRestaurante;
    TextView textoHotel;
    TextView textoRestaurante;
    View acercaDe;

    //METODOS
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ActionBar barra=getSupportActionBar();

        //Cambiando el color del action bar
        ColorDrawable colorBarra= new ColorDrawable(Color.parseColor("#F80909"));
        barra.setBackgroundDrawable(colorBarra);

        //asociando los botones a eventos de clic (escuchar clic ome)
        botonHoteles = findViewById(R.id.iconoHotel);
        botonRestaurante = findViewById(R.id.iconRestaurant);
        textoHotel = findViewById(R.id.hotelsito);
        textoRestaurante = findViewById(R.id.restaurantico);


        botonHoteles.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentHoteles= new Intent(MainActivity.this,Hoteles.class);
                startActivity(intentHoteles);
            }
        });

        botonRestaurante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentResta= new Intent(MainActivity.this,Restaurantes.class);
                startActivity(intentResta);
            }
        });

    }

    //metodo para cambiar el idioma de mi app
    public void cambiarIdioma(String idioma){

        //configurando el lenguaje del telefono
        Locale lenguaje=new Locale(idioma);
        Locale.setDefault(lenguaje);

        //configracion global en el telefono
        Configuration configuracionTelefono=getResources().getConfiguration();
        configuracionTelefono.locale=lenguaje;

        //ejecutamos la configuracion
        getBaseContext().getResources().updateConfiguration(configuracionTelefono,getBaseContext().getResources().getDisplayMetrics());
    }

    //Cargar el menu xml creado previamente
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu,menu);
        return true;
    }

    //Dar funcionamiento al menu
    public boolean onOptionsItemSelected(MenuItem item) {

        //observamos a que item del menu le damos clic
        int itemSeleccionado=item.getItemId();

        switch(itemSeleccionado){
            case(R.id.opcion1):
                Intent intent0 = new Intent(MainActivity.this, Acercade.class);
                startActivity(intent0);
                break;
            case(R.id.opcion2):
                this.cambiarIdioma("en");
                Intent intent1=new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent1);
                break;
            case(R.id.opcion3):
                this.cambiarIdioma("es");
                Intent intent2=new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent2);
                break;
            case(R.id.opcion4):
                this.cambiarIdioma("it");
                Intent intent3 = new Intent(MainActivity.this,MainActivity.class);
                startActivity(intent3);
                break;
        }
        return super.onOptionsItemSelected(item);
    }
}