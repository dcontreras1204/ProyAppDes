package com.example.dexter.proyappdestinos;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.SearchView;
import android.widget.Toast;

import java.util.ArrayList;

public class busquedaTurismo1 extends AppCompatActivity {

    ListaAdapter adapter;

    ListView lista1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lista1 = (ListView) findViewById(R.id.ContentListview);

        adapter = new ListaAdapter(this, getDatos());
        lista1.setAdapter(adapter);


        lista1.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                // La posición donde se hace clic en el elemento de lista se obtiene de la
                // la posición de parámetro de la vista de lista de Android
                listaItems.DatosItem item= (listaItems.DatosItem) parent.getItemAtPosition(position);
                Intent intent = new Intent(getApplicationContext(),Main2Activity.class);
                intent.putExtra("idItem",item.getId());
                startActivity(intent);

            }
        });

        lista1.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "click Largo " + i, Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }

    private ArrayList<listaItems.DatosItem> getDatos() {

        return listaItems.ArregloLista();
    }

@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_main, menu);
        MenuItem item = menu.findItem(R.id.menuSearch);
        SearchView searchView = (SearchView)item.getActionView();

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                adapter.getFilter().filter(newText);

                return false;
            }
        });


        return super.onCreateOptionsMenu(menu);
    }

}


