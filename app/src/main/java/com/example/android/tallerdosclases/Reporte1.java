package com.example.android.tallerdosclases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Reporte1 extends AppCompatActivity {
    private TableLayout Tabla;
    private ArrayList<Movil> Moviles;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte1);
        Tabla = (TableLayout)findViewById(R.id.Tabla);
        Moviles = ReporteUno(DbMovil.Obtener());
        for (int i = 0; i <Moviles.size() ; i++) {
            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3= new TextView(this);
            TextView c4= new TextView(this);
            TextView c5= new TextView(this);
            TextView c6= new TextView(this);
            c1.setText(""+(i+1));
            c2.setText(""+Moviles.get(i).getMarca());
            c3.setText(""+Moviles.get(i).getColor());
            c4.setText(""+Moviles.get(i).getPrecio());
            c5.setText(""+Moviles.get(i).getSistemaOperativo());
            c6.setText(""+Moviles.get(i).getRam());
            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);
            fila.addView(c5);
            fila.addView(c6);

            Tabla.addView(fila);
        }

    }

    public ArrayList<Movil> ReporteUno(ArrayList<Movil> Moviles){
       ArrayList<Movil> res = new ArrayList<>();
        for (int i = 0; i < Moviles.size() ; i++) {
            if ((Moviles.get(i).getColor().equalsIgnoreCase("Negro")) && (Moviles.get(i).getMarca().equalsIgnoreCase("Samsung" ))&& (Moviles.get(i).getSistemaOperativo().equalsIgnoreCase("Android"))){
                Movil nuevo = new Movil(Moviles.get(i).getPrecio(),Moviles.get(i).getRam(),Moviles.get(i).getMarca(),Moviles.get(i).getSistemaOperativo(), Moviles.get(i).getColor());
                res.add(nuevo);
            }
        }
        return res;
    }
}
