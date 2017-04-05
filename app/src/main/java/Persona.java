/**
 * Created by android on 04/04/2017.
 */

public class Persona {


    private  String nombre;
    private  String apellido;
    private int edad;
    private  String pasatiempos;

    public Persona(String nombre, String apellido, int edad, String pasatiempos) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.pasatiempos = pasatiempos;
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getPasatiempos() {
        return pasatiempos;
    }



    public void setPasatiempos(String pasatiempos) {
        this.pasatiempos = pasatiempos;
    }


    public void guardar(){

        Datos.Guardar(this);
    }
}
