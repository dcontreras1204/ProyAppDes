package com.example.dexter.proyappdestinos;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ADV_USER1 on 24/06/2017.
 */
public class listaItems {
private static final List<DatosItem> ITEMS =  new ArrayList<DatosItem>();

static{
        addItem(new listaItems.DatosItem("100","MACHUPICCHU",R.drawable.mapi,"vivencial"));
        addItem(new listaItems.DatosItem("200","CHINCHERO",R.drawable.chinchero,"arqueologico,vivencial"));
        addItem(new listaItems.DatosItem("300","OLLANTAYTAMBO",R.drawable.ollantaytambo1,"vivencial"));
        addItem(new listaItems.DatosItem("400","MARAS",R.drawable.maras,"arqueologico"));

        }

static void addItem( DatosItem item){

        ITEMS.add(item);
        }

public static ArrayList<DatosItem>  ArregloLista( ){
        ArrayList<DatosItem> d= new ArrayList<DatosItem>();

        for( DatosItem obj:ITEMS) {

        d.add(obj);

        }
        return d;
        }


public static ArrayList<DatosItem>  ArregloListaFiltroTipoTurismo(String FiltroTipoTuris ){
        ArrayList<DatosItem> d= new ArrayList<DatosItem>();

        for( DatosItem obj:ITEMS) {
        if(obj.tipoturis.contains(FiltroTipoTuris)){
        d.add(obj);
        }


        }
        return d;
        }
public static DatosItem getDatosItem(String id ){
        for( DatosItem obj:ITEMS) {
        if(obj.id.equals(id)){
        return obj;

        }


        }
        return ITEMS.get(1);//devuelve primer elemento en caso no tenga coincidencia
        }
public static ArrayList<DatosItem>  ArregloListaFiltroNombreYTipoTurismo(String FiltroNombre,String tipoTurismo){
        ArrayList<DatosItem> d= new ArrayList<DatosItem>();

        for( DatosItem obj:ITEMS) {
        if(obj.titulo.contains(FiltroNombre)&&obj.titulo.contains(tipoTurismo)){
        d.add(obj);
        }


        }
        return d;
        }



//******************************

public static class DatosItem {
    private String id;
    private String titulo;
    private Integer img;
    private  String tipoturis;



    public DatosItem(String  id,String titulo, Integer img, String tipoturis){
        this.id=id;
        this.titulo= titulo;
        this.img = img;
        this.tipoturis = tipoturis;
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

    public String getTipoturis() {
        return tipoturis;
    }

    public void setTipoturis(String tipoturis) {
        this.tipoturis = tipoturis;
    }
}
}