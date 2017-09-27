package com.example.android.tallerdosclases;

import android.content.Intent;
import android.content.res.Resources;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class Reportes extends AppCompatActivity {
    private ListView LV;
    private Resources resources;
    private String Opc [];
    private Intent In;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reportes);
        LV = (ListView)findViewById(R.id.Reportes);
        resources = this.getResources();
        Opc = getResources().getStringArray(R.array.Reportes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1,Opc);
        LV.setAdapter(adapter);
        LV.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                switch (i){
                    case 0:
                        In =  new Intent(Reportes.this, Reporte1.class);
                        startActivity(In);
                        break;
                    case 1:
                        In =  new Intent(Reportes.this, Reporte2.class);
                        startActivity(In);
                        break;
                    case 2:
                        In =  new Intent(Reportes.this, Reporte3.class);
                        startActivity(In);
                        break;

                }
            }
        });
    }
}
