package com.example.dexter.proyappdestinos;

import android.widget.Adapter;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by ADV_USER1 on 24/06/2017.
 */
public class ListaItems{
    private static final List<DatosItem> ITEMS =  new ArrayList<DatosItem>();
/*
*
*
*
*     String[] xid = new String[]{
            "1",
            "2",
            "3",
            "4",
            "4",
            "5",
            "6",
            "7",
            "8",
            "9",
            "10",
            "11",
            "12",
            "13",
            "14",
            "15",
            "16",
            "17"
    };

    String[] titulo = new String[]{
            "MACHU PICCHU",
            "CHINCHERO",
            "OLLANTAYTAMBO",
            "MARAS",
            "MORAY",
            "PLAZA DE ARMAS",
            "SACSAYHUAMAN",
            "MERCADO ARTESANAL DE PISAC",
            "VALLE SAGRADO",
            "CAMINO INCA",
            "LA CATEDRAL DEL CUSCO",
            "TAMBOMACHAY",
            "PIQUILLACTA",
            "MUSEO DE ARTE PRE-COLOMBINO",
            "IGLESIA DE LA COMPANIA",
            "PIEDRA DE LOS 12 ANGULOS",
            "HUCH`UY QOSQO",
            "SAN BLAS"
    };

    int[] imagenes = {
            R.drawable.mapi,
            R.drawable.chinchero,
            R.drawable.ollantaytambo1,
            R.drawable.maras,
            R.drawable.moray,
            R.drawable.plazaarmas,
            R.drawable.sacsayhuaman,
            R.drawable.patioturistico,
            R.drawable.vallesagrado,
            R.drawable.caminoinca,
            R.drawable.catedral,
            R.drawable.tambomachay,
            R.drawable.piquillacta,
            R.drawable.museoprecolombino,
            R.drawable.compania,
            R.drawable.doceangulos,
            R.drawable.huchuyqosqo,
            R.drawable.sanblas,
    };

    String[] Btmasinfo = new String[]{
            "CONOCE MACHUPICCHU",
            "CONOCE OLLANTAYTAMBO",
            "CONOCE CHINCHERO AQUI",
            "CONOCE MARAS AQUI",
            "CONOCE MORAY AQUI",
            "CONOCE MAS AQUI",
            "CONOCE SACSAYHUAMAN ",
            "CONOCE MERCADO ARTESANAL DE PISAC",
            "CONOCE VALLE SAGRADO ",
            "CONOCE CAMINO INCA ",
            "CONOCE LA CATEDRAL DEL CUSCO",
            "CONOCE TAMBOMACHAY",
            "CONOCE PIQUILLACTA",
            "CONOCE MUSEO DE ARTE PRE-COLOMBINO",
            "CONOCE IGLESIA DE LA COMPANIA",
            "CONOCE PIEDRA DE LOS 12 ANGULOS",
            "CONOCE HUCH`UY QOSQO",
            "CONOCE SAN BLAS",


    };


* */
    static{
        addItem(new ListaItems.DatosItem("100","MACHUPICCHU",R.drawable.mapi));
        addItem(new ListaItems.DatosItem("200","CHINCHERO",R.drawable.chinchero));
        addItem(new ListaItems.DatosItem("300","OLLANTAYTAMBO",R.drawable.ollantaytambo1));
        addItem(new ListaItems.DatosItem("400","MARAS",R.drawable.maras));

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



    //******************************

    public static class DatosItem {
        private String id;
        private String titulo;
        private Integer img;



        public DatosItem(String  id,String titulo, Integer img){
            this.id=id;
            this.titulo= titulo;
            this.img = img;
        }
        public String getId() {return this.id;}

        public void setId(String id) { this.id = id;
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
    }
}