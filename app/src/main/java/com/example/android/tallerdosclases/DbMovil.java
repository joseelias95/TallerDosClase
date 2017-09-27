package com.example.android.tallerdosclases;

import java.util.ArrayList;

/**
 * Created by Android on 26/09/2017.
 */

public class DbMovil {
    private static ArrayList<Movil> Moviles= new ArrayList<>();

    public static void Guardar(Movil Movil){
        Moviles.add(Movil);
    }

    public static ArrayList<Movil> Obtener(){
        return Moviles;
    }
}
