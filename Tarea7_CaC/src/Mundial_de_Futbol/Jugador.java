package Mundial_de_Futbol;

import java.util.Date;

public class Jugador extends Persona {

    private Direccion direccion;
    private String posicion;
    private int nroJugador;
    private Club club;
    private String seleccion;


    public Jugador(String nombre, String apellido, Date fechaNacimiento, Direccion direccion, String posicion, int nroJugador, Club club, String seleccion) {
        super(nombre, apellido, fechaNacimiento);
        this.direccion = direccion;
        this.posicion = posicion;
        this.nroJugador = nroJugador;
        this.club = club;
        this.seleccion = seleccion;
    }

    public Jugador(String nombre, String apellido, String posicion, int nroJugador, Club club) {
        super(nombre, apellido);
        this.posicion = posicion;
        this.nroJugador = nroJugador;
        this.seleccion = "Argentina";
        this.club = club;

    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    public int getNroJugador() {
        return nroJugador;
    }

    public void setNroJugador(int nroJugador) {
        this.nroJugador = nroJugador;
    }

    public Club getClub() {
        return club;
    }

    public void setClub(Club club) {
        this.club = club;
    }

    public String getSeleccion() {
        return seleccion;
    }

    public void setSeleccion(String seleccion) {
        this.seleccion = seleccion;
    }

    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", posicion='" + posicion + '\'' +
                ", nroJugador=" + nroJugador +
                ", club=" + club +
                ", seleccion='" + seleccion + '\'' +
                '}';
    }
}
