package com.example.android.tallerdosclases;


public class Movil {

    private double Precio;
    private int Ram;
    private String Marca;
    private String SistemaOperativo;
    private String Color;

    public Movil(double precio, int ram, String marca, String sistemaOperativo, String color) {
        Precio = precio;
        Ram = ram;
        Marca = marca;
        SistemaOperativo = sistemaOperativo;
        Color = color;
    }

    @Override
    public String toString() {
        return "Movil{" +
                "Precio=" + Precio +
                ", Ram=" + Ram +
                ", Marca='" + Marca + '\'' +
                ", SistemaOperativo='" + SistemaOperativo + '\'' +
                ", Color='" + Color + '\'' +
                '}';
    }

    public double getPrecio() {
        return Precio;
    }

    public void setPrecio(double precio) {
        Precio = precio;
    }

    public int getRam() {
        return Ram;
    }

    public void setRam(int ram) {
        Ram = ram;
    }

    public String getMarca() {
        return Marca;
    }

    public void setMarca(String marca) {
        Marca = marca;
    }

    public String getSistemaOperativo() {
        return SistemaOperativo;
    }

    public void setSistemaOperativo(String sistemaOperativo) {
        SistemaOperativo = sistemaOperativo;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String color) {
        Color = color;
    }

    public void Guardar(){
        DbMovil.Guardar(this);
    }
}
