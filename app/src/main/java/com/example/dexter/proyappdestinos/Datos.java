package com.example.dexter.proyappdestinos;

/**
 * Created by ADV_USER1 on 24/06/2017.
 */

public class Datos {
    private String titulo;
    private Integer img;

    public Datos(String titulo, Integer img){
        this.titulo= titulo;
        this.img = img;
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