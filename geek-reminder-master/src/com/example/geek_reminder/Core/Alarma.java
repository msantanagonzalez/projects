package com.example.geek_reminder.Core;

/**
 * Created by dario_000 on 05/12/2015.
 */
public class Alarma {

    private String nombreA;
    private String hora;

    public Alarma(String nombreA, String hora)
    {
        this.nombreA = nombreA;
        this.hora = hora;
    }

    public String getNombre() {
        return this.nombreA;
    }

    public String getCategoria(){
        return this.hora;
    }

    public void setNombre(String nombreA){
        this.nombreA=nombreA;
    }

    public void setCat(String hora){
        this.hora=hora;
    }
}
