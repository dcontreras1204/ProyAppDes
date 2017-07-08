package com.example.dexter.proyappdestinos;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class HotelesFragment extends Fragment{

    ServiciosAdapter adapter;

    ListView listaHotel;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listaHotel = (ListView) findViewById(R.id.ContentListviewServicios);

        adapter = new ServiciosAdapter(this, getDatosServiciosItem());
        listaHotel.setAdapter(adapter);


        listaHotel.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "click sobre " + i, Toast.LENGTH_SHORT).show();
            }
        });

        listaHotel.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener() {
            @Override
            public boolean onItemLongClick(AdapterView adapterView, View view, int i, long l) {
                Toast.makeText(getApplicationContext(), "click Largo " + i, Toast.LENGTH_SHORT).show();
                return false;
            }
        });

    }

    private ArrayList<ServiciosItems.DatosServiciosItem> getDatosServiciosItem() {

        return ServiciosItems.ArregloListaServicios();
    }

}