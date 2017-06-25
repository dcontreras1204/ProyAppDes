package com.example.dexter.proyappdestinos;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;


import com.example.dexter.proyappdestinos.ListaItems.*;

/**
 * Created by ADV_USER1 on 24/06/2017.
 */

public class ListaAdapter extends BaseAdapter implements Filterable {

    // Declare Variables
    Context context;
    ArrayList<ListaItems.DatosItem> mDatos;
    LayoutInflater inflater;
    CustomFilter filtro;
    ArrayList<ListaItems.DatosItem> filtroList;

    public ListaAdapter(Context context, ArrayList<ListaItems.DatosItem> Datos) {
        this.context = context;
        this.mDatos = Datos;
        this.filtroList = Datos;
    }

    @Override
    public int getCount() {
        return mDatos.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatos.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mDatos.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        // Declare Variables
        TextView txtTitle;
        ImageView imgImg;

        //http://developer.android.com/intl/es/reference/android/view/LayoutInflater.html
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null){
            view = inflater.inflate(R.layout.item_list_content, parent, false);
        }


        // Locate the TextViews in listview_item.xml
        txtTitle = (TextView) view.findViewById(R.id.tituloLista);
        imgImg = (ImageView) view.findViewById(R.id.iconLista);

        // Capture position and set to the TextViews
        txtTitle.setText(mDatos.get(position).getTitulo());
        imgImg.setImageResource(mDatos.get(position).getImg());

        return view;
    }


    @Override
    public Filter getFilter() {
        if(filtro == null){
            filtro = new CustomFilter();
        }

        return filtro;
    }

    class CustomFilter extends Filter{

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            FilterResults resulst = new FilterResults();
            if(constraint != null && constraint.length()>0){
                //pasamos a mayusculas
                constraint = constraint.toString().toUpperCase();

                ArrayList<ListaItems.DatosItem> filtro = new ArrayList<ListaItems.DatosItem>();

                for(Integer i=0;i<filtroList.size();i++){
                    if(filtroList.get(i).getTitulo().toUpperCase().contains(constraint)){
                        ListaItems.DatosItem d= new ListaItems.DatosItem(filtroList.get(i).getId(),filtroList.get(i).getTitulo(),filtroList.get(i).getImg());

                        filtro.add(d);
                    }
                }
                resulst.count= filtro.size();
                resulst.values = filtro;
            }else{
                resulst.count= filtroList.size();
                resulst.values = filtroList;
            }

            return resulst;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            mDatos = (ArrayList<ListaItems.DatosItem>) results.values;
            notifyDataSetChanged();

        }
    }
}