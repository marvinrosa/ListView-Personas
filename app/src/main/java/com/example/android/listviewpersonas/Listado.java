package com.example.android.listviewpersonas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TableLayout;
import android.widget.TableRow;
import android.widget.TextView;

import java.util.ArrayList;

public class Listado extends AppCompatActivity {

    private TableLayout tabla;
    private  String aux;
    private ArrayList<Persona> personas; // Recibe

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listado);

        tabla = (TableLayout)findViewById(R.id.tblPersonas);
        personas = Datos.getPersonas();

        for(int i =0; i < personas.size(); i++){

            TableRow fila = new TableRow(this);
            TextView c1 = new TextView(this);
            TextView c2 = new TextView(this);
            TextView c3 = new TextView(this);
            TextView c4 = new TextView(this);

            c1.setText("" + i+1);
            c3.setText(personas.get(i).getNombre());
            c4.setText(personas.get(i).getApellido());
            c4.setText(personas.get(i).getPasatiempos());

            fila.addView(c1);
            fila.addView(c2);
            fila.addView(c3);
            fila.addView(c4);

            tabla.addView(fila);


        }
    }
}
