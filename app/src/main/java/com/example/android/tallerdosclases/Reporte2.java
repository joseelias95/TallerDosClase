package com.example.android.tallerdosclases;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Reporte2 extends AppCompatActivity {
    private TableLayout Tabla;
    private ArrayList<Movil> Moviles;
    private TextView CantidadMovil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reporte2);
        Tabla = (TableLayout)findViewById(R.id.Tabla);
        Moviles = ReporteDos(DbMovil.Obtener());
        CantidadMovil = (TextView) findViewById(R.id.CantidadMovil);
        CantidadMovil.setText(""+Cantidad(DbMovil.Obtener()));
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
    public ArrayList<Movil> ReporteDos(ArrayList<Movil> Moviles){
        ArrayList<Movil> res = new ArrayList<>();
        for (int i = 0; i < Moviles.size() ; i++) {
            if ((Moviles.get(i).getColor().equalsIgnoreCase("Negro")) && (Moviles.get(i).getMarca().equalsIgnoreCase("Apple" ))){
                Movil nuevo = new Movil(Moviles.get(i).getPrecio(),Moviles.get(i).getRam(),Moviles.get(i).getMarca(),Moviles.get(i).getSistemaOperativo(), Moviles.get(i).getColor());
                res.add(nuevo);
            }
        }
        return res;
    }
    public int Cantidad(ArrayList<Movil> Moviles){
        int res = 0;
        for (int i = 0; i < Moviles.size() ; i++) {
            if ((Moviles.get(i).getColor().equalsIgnoreCase("Negro")) && (Moviles.get(i).getMarca().equalsIgnoreCase("Apple" ))){
                res = res + 1;
            }
        }
        return res;
    }
}
