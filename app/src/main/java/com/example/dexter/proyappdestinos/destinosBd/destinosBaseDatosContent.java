package com.example.dexter.proyappdestinos.destinosBd;

import com.example.dexter.proyappdestinos.R;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class destinosBaseDatosContent {

    private static final List<destinosBaseDatos> ITEMS = new ArrayList<>();
    private static final Map<String, destinosBaseDatos> ITEM_MAP = new HashMap<>();

    private static final List<destinosBaseDatos> ITEMSFILTRO = new ArrayList<>();
    private static final Map<String, destinosBaseDatos> ITEM_MAPFILTRO = new HashMap<>();


    static{

        addItem(new destinosBaseDatos("1","titulo 1","bt mas info 1", R.drawable.mapi));
        addItem(new destinosBaseDatos("2","titulo 2","bt mas info 2", R.drawable.ollantaytambo1));
        addItem(new destinosBaseDatos("3","titulo 3","bt mas info 3",R.drawable.chinchero));

    }

    private static void  destinosBaseDatos(String filtroDestinos)
    {
        ITEMSFILTRO.clear();
        ITEM_MAPFILTRO.clear();
        int t = ITEMSFILTRO.size();
        for (destinosBaseDatos obj:ITEMS) {
            ITEMSFILTRO.add(obj);
            ITEM_MAPFILTRO.put(obj.id, obj);
        }
        }


    private static void addItem(destinosBaseDatos item) {

        ITEMS.add(item);
        ITEM_MAP.put(item.id, item);
    }

    public static class destinosBaseDatos {

        public String id;
        public String titulo;
        public String btmasinfo;
        public int image;

        public  destinosBaseDatos(String id, String titulo, String btmasinfo, int image) {
            this.id = id;
            this.titulo = titulo;
            this.btmasinfo = btmasinfo;
            this.image = image;
        }

        @Override
        public String toString() {
            return titulo;
        }
    }
}

