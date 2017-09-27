package com.example.android.tallerdosclases;

import android.content.res.Resources;
import android.nfc.Tag;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class AgregarMovil extends AppCompatActivity {
    private EditText Precio,Ram ,Marca,Color;
    private Spinner SistemaOperativo;
    private Resources resources;
    private String Sistem [];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_agregar_movil);
        resources = this.getResources();
        SistemaOperativo = (Spinner) findViewById(R.id.CmbSistemaOperativo);
        Precio = (EditText)findViewById(R.id.precio);
        Ram = (EditText)findViewById(R.id.Ram);
        Marca = (EditText)findViewById(R.id.Marca);
        Color = (EditText)findViewById(R.id.Color);
        Sistem = resources.getStringArray(R.array.SistemasOperativos);
        ArrayAdapter<String> AdapterSistemaOperativo = new ArrayAdapter<String>(this, android.R.layout.simple_spinner_item, Sistem);
        SistemaOperativo.setAdapter(AdapterSistemaOperativo);

    }

    public void Guardar(View view){
        String marca,color,sistemaoperativo;
        double precio =0;
        int ram=0;
        sistemaoperativo = SistemaOperativo.getSelectedItem().toString();
        precio = Double.parseDouble(Precio.getText().toString());
        marca = Marca.getText().toString();
        color = Color.getText().toString();
        ram = Integer.parseInt(Ram.getText().toString());

        Movil obj = new Movil(precio,ram,marca,sistemaoperativo,color);
        obj.Guardar();
        Toast.makeText(this, resources.getString(R.string.MensajeExitoso), Toast.LENGTH_SHORT).show();
    }

    public void Borrar(View view){
        Precio.setText("");
        Ram.setText("");
        Marca.setText("");
        Color.setText("");
        SistemaOperativo.setSelection(0);
    }
}
