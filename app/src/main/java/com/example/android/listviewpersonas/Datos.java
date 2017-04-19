package com.example.android.listviewpersonas;

import com.example.android.listviewpersonas.Persona;

import java.util.ArrayList;

/**
 * Created by android on 04/04/2017.
 */

public class Datos {

    private static ArrayList<Persona> personas = new ArrayList();

    public static void Guardar(Persona p){
        personas.add(p);
    }


    public static ArrayList<Persona> getPersonas() {
        return personas;
    }


}
