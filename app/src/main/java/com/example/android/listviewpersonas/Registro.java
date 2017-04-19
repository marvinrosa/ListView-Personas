package com.example.android.listviewpersonas;

import android.content.res.Resources;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.EditText;

public class Registro extends AppCompatActivity {


    private EditText nomb;
    private EditText apell;
    private EditText edad;

    private CheckBox leer, programar, natacion;
    private Resources res;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);



        res = this.getResources();
        nomb = (EditText)findViewById(R.id.txtNombre);
        apell = (EditText)findViewById(R.id.txtApellido);
        edad = (EditText)findViewById(R.id.txtEdad);


        // checkbox

        leer = (CheckBox)findViewById(R.id.chkLeer);
        programar = (CheckBox)findViewById(R.id.chkProgra);
        natacion = (CheckBox)findViewById(R.id.chkNatacion);
    }

    public void registrar (View v){

        String nombre, apellido, aux ="";
        int eda;
        nombre = nomb.getText().toString().trim();
        apellido = apell.getText().toString().trim();
        eda = Integer.parseInt( edad.getText().toString().trim());
        if(leer.isChecked()) aux = res.getString(R.string.str_Leer);
        if(programar.isChecked()) aux = aux + "," + res.getString(R.string.str_Progra);
        if(natacion.isChecked()) aux = aux + "," + res.getString(R.string.str_natacion);


        Persona p = new Persona(nombre,apellido,eda,aux);
        p.guardar();

        new AlertDialog.Builder(this).setMessage(res.getString(R.string.mensaje)).show();

    }


    public void Borrar (View v){
        Limpiar();
    }

    public void Limpiar(){
        nomb.setText("");
        apell.setText("");
        edad.setText("");
        leer.setChecked(true);
        programar.setChecked(false);
        natacion.setChecked(false);

        nomb.requestFocus();

    }
}
