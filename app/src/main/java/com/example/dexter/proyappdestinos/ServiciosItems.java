package com.example.dexter.proyappdestinos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by DEXTER ELECTRONICS on 5/07/2017.
 */

public class   ServiciosItems {
    private static final List<ServiciosItems.DatosServiciosItem> ITEMS =  new ArrayList<ServiciosItems.DatosServiciosItem>();

    static{
        addItem(new ServiciosItems.DatosServiciosItem("100","MACHUPICCHU",R.drawable.mapi2,"vivencial"));
        addItem(new ServiciosItems.DatosServiciosItem("200","CHINCHERO",R.drawable.chinchero2,"arqueologico,vivencial"));
        addItem(new ServiciosItems.DatosServiciosItem("300","OLLANTAYTAMBO",R.drawable.ollantaytambo2,"vivencial"));
        addItem(new ServiciosItems.DatosServiciosItem("400","MARAS",R.drawable.mapifond1,"arqueologico"));

    }

    static void addItem( ServiciosItems.DatosServiciosItem item){

        ITEMS.add(item);
    }

    public static ArrayList<ServiciosItems.DatosServiciosItem>  ArregloListaServicios( ){
        ArrayList<ServiciosItems.DatosServiciosItem> d= new ArrayList<ServiciosItems.DatosServiciosItem>();

        for( ServiciosItems.DatosServiciosItem obj:ITEMS) {


            d.add(obj);

        }
        return d;
    }


    public static ArrayList<ServiciosItems.DatosServiciosItem>  ArregloListaFiltroTipoServicio (String FiltroTipoServicio ){
        ArrayList<ServiciosItems.DatosServiciosItem> d= new ArrayList<ServiciosItems.DatosServiciosItem>();

        for( ServiciosItems.DatosServiciosItem obj:ITEMS) {
            if(obj.tipoServicio.contains(FiltroTipoServicio)){
                d.add(obj);
            }


        }
        return d;
    }
    public static ServiciosItems.DatosServiciosItem getDatosServiciosItem(String id ){
        for(ServiciosItems.DatosServiciosItem obj:ITEMS) {
            if(obj.id.equals(id)){
                return obj;

            }


        }
        return ITEMS.get(1);//devuelve primer elemento en caso no tenga coincidencia
    }
    public static ArrayList<ServiciosItems.DatosServiciosItem>  ArregloListaFiltroNombreYTipoTurismo(String FiltroNombre, String tipoServicio){
        ArrayList<ServiciosItems.DatosServiciosItem> d= new ArrayList<ServiciosItems.DatosServiciosItem>();

        for( ServiciosItems.DatosServiciosItem obj:ITEMS) {
            if(obj.titulo.contains(FiltroNombre)&&obj.titulo.contains(tipoServicio)){
                d.add(obj);
            }


        }
        return d;
    }



//******************************

    public static class DatosServiciosItem {
        private String id;
        private String titulo;
        private Integer img;
        private  String tipoServicio;



        public DatosServiciosItem(String  id,String titulo, Integer img, String tiposervicio){
            this.id=id;
            this.titulo= titulo;
            this.img = img;
            this.tipoServicio = tiposervicio;
        }
        public String getId() {
            return this.id;}

        public void setId(String id) {
            this.id = id;
        }

        public String getTitulo() {
            return titulo;
        }

        public void setTitulo(String titulo) {
            this.titulo = titulo;
        }

        public Integer getImg() {
            return img;
        }

        public void setImg(Integer img) {
            this.img= img;
        }

        public String getTipoServicio() {
            return tipoServicio;
        }

        public void setTipoServicio(String tipoServico) {
        }
    }
}

