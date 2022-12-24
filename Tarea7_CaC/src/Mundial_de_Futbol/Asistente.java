package Mundial_de_Futbol;

import java.util.Date;

public class Asistente extends Persona {

    private String funcion;
    private int antiguedad;

    public Asistente(String nombre, String apellido, Date fechaNacimiento, String funcion, int antiguedad) {
        super(nombre, apellido, fechaNacimiento);
        this.funcion = funcion;
        this.antiguedad = antiguedad;

    }

    public String getFuncion() {
        return funcion;
    }

    public void setFuncion(String funcion) {
        this.funcion = funcion;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }
}
