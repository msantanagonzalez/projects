package com.example.geek_reminder.Core;

/**
 * Created by dario_000 on 05/12/2015.
 */

public class Serie {

    private String nombre;
    private String cat;

    public Serie(String nombre, String cat)
    {
        this.nombre = nombre;
        this.cat = cat;
    }

    public String getNombre() {
        return this.nombre;
    }

    public String getCategoria(){
        return this.cat;
    }

    public void setNombre(String nombre){
        this.nombre=nombre;
    }

    public void setCat(String cat){
        this.cat=cat;
    }




}
