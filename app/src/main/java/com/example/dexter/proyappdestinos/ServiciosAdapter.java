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

/**
 * Created by DEXTER ELECTRONICS on 5/07/2017.
 */

public class ServiciosAdapter extends BaseAdapter implements Filterable {

    // Declare Variables
    Context context;
    ArrayList<ServiciosItems.DatosServiciosItem> mDatosServicios;
    LayoutInflater inflater;
    CustomFilter filtroServicios;
    ArrayList<ServiciosItems.DatosServiciosItem> filtroList;

    public ServiciosAdapter (Context context, ArrayList<ServiciosItems.DatosServiciosItem> DatosServicios) {
        this.context = context;
        this.mDatosServicios = DatosServicios;
        this.filtroList = DatosServicios;


    }
    @Override
    public int getCount() {
        return mDatosServicios.size();
    }

    @Override
    public Object getItem(int position) {
        return mDatosServicios.get(position);
    }

    @Override
    public long getItemId(int position) {
        return mDatosServicios.indexOf(getItem(position));
    }

    @Override
    public View getView(int position, View view, ViewGroup parent) {
        // Declare Variables
        TextView txtTitle;
        ImageView imgImg;

        //http://developer.android.com/intl/es/reference/android/view/LayoutInflater.html
        inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);

        if(view == null){
            view = inflater.inflate(R.layout.item_list_content_servicios, parent, false);

        }
        txtTitle = (TextView) view.findViewById(R.id.TituloServicios);
        imgImg = (ImageView) view.findViewById(R.id.ImgServicios);

        // Capture position and set to the TextViews
        txtTitle.setText(mDatosServicios.get(position).getTitulo());
        imgImg.setImageResource(mDatosServicios.get(position).getImg());

        return view;
    }


    @Override
    public Filter getFilter() {
        if(filtroServicios == null){
            filtroServicios = new CustomFilter();
        }

        return filtroServicios;
    }

    class CustomFilter extends Filter{

        @Override
        protected FilterResults performFiltering(CharSequence constraint) {

            FilterResults resulst = new FilterResults();
            if(constraint != null && constraint.length()>0){
                //pasamos a mayusculas
                constraint = constraint.toString().toUpperCase();

                ArrayList<ServiciosItems.DatosServiciosItem> filtroServicios = new ArrayList<ServiciosItems.DatosServiciosItem>();

                for(Integer i=0;i<filtroList.size();i++){
                    if(filtroList.get(i).getTitulo().toUpperCase().contains(constraint)){
                        ServiciosItems.DatosServiciosItem s= new ServiciosItems.DatosServiciosItem(filtroList.get(i).getId(),filtroList.get(i).getTitulo(),filtroList.get(i).getImg(),filtroList.get(i).getTipoServicio());

                        filtroServicios.add(s);
                    }
                }
                resulst.count= filtroServicios.size();
                resulst.values = filtroServicios;
            }else{
                resulst.count= filtroList.size();
                resulst.values = filtroList;
            }

            return resulst;
        }

        @Override
        protected void publishResults(CharSequence constraint, FilterResults results) {
            mDatosServicios = (ArrayList<ServiciosItems.DatosServiciosItem>) results.values;
            notifyDataSetChanged();

        }
    }
}


