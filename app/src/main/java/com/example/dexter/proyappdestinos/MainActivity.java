package com.example.dexter.proyappdestinos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListaAdapter adapter;

    String[] titulo = new String[]{
            "Home",
            "Fotos",
            "Contacto",
    };

    int[] imagenes = {
            R.drawable.home,
            R.drawable.fotos,
            R.drawable.contacto
    };

    SearchView buscador;
    ListView lista;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView( R.layout.activity_main);

        lista = (ListView) findViewById(R.id.item_list);



        adapter = new ListaAdapter(this, getDatos());
        lista.setAdapter(adapter);

        buscador.setOnQueryTextListener(new SearchView.OnQueryTextListener() {

            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String query) {
                adapter.getFilter().filter(query);
                return false;
            }
        });


        lista.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "click sobre " + i, Toast.LENGTH_SHORT).show();
            }
        });

        lista.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "click Largo " + i, Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }

    private ArrayList<Datos> getDatos(){
        ArrayList<Datos> Datos = new ArrayList<Datos>();
        Datos d;

        for(Integer i=0;i<titulo.length;i++){
            d = new Datos(titulo[i], imagenes[i]);
            Datos.add(d);

        }
        return Datos;
    }


}



