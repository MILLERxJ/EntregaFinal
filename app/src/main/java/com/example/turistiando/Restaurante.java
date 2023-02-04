package com.example.turistiando;

public class Restaurante {

    private int imagen;
    private String nombre;
    private String lugar;

    public Restaurante(int imagen, String nombre, String lugar) {
        this.imagen = imagen;
        this.nombre = nombre;
        this.lugar = lugar;
    }

    public int getImagen() {
        return imagen;
    }

    public void setImagen(int imagen) {
        this.imagen = imagen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getLugar() {
        return lugar;
    }

    public void setLugar(String lugar) {
        this.lugar = lugar;
    }
}
