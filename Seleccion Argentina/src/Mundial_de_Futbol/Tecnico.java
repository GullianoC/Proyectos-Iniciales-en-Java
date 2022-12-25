package Mundial_de_Futbol;

import java.util.ArrayList;
import java.util.Date;

public class Tecnico extends Persona {

    private int antiguedad;
    private int torneosGanados;
//    private ArrayList<Colaboradores> colaboradores;


    public Tecnico(String nombre, String apellido, Date fechaNacimiento, int antiguedad, int torneosGanados) {
        super(nombre, apellido, fechaNacimiento);
        this.antiguedad = antiguedad;
        this.torneosGanados = torneosGanados;

    }

    public Tecnico(String nombre, String apellido, int antiguedad, int torneosGanados) {
        super(nombre, apellido);
        this.antiguedad = antiguedad;
        this.torneosGanados = torneosGanados;
    }

    public int getAntiguedad() {
        return antiguedad;
    }

    public void setAntiguedad(int antiguedad) {
        this.antiguedad = antiguedad;
    }

    public int getTorneosGanados() {
        return torneosGanados;
    }

    public void setTorneosGanados(int torneosGanados) {
        this.torneosGanados = torneosGanados;
    }
}
