package cac.covid;

public class Persona {
    protected Double temperatura;
    protected String nombre;
    protected String dni;

    public Persona(String dni, String nombre, Double temperatura) {
        this.dni = dni;
        this.nombre = nombre;
        this.temperatura = temperatura;

    }

    public Double getTemperatura() {
        return temperatura;
    }

    public void setTemperatura(Double temperatura) {
        this.temperatura = temperatura;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    @Override
    public String toString() {
        return "DNI = " + dni + '\'' +
                "; Nombre = " + nombre + '\'';

    }
}
