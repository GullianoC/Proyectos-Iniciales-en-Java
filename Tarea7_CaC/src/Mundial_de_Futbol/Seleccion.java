package Mundial_de_Futbol;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Seleccion {
    private String nombre;
    private ArrayList<Jugador> jugadores;
    private Tecnico tecnico;
    private Pais pais;
    private ArrayList<Asistente> asistentes;
    private ArrayList<Medico> medicos;
    private int ranking;


    public Seleccion(String nombre, ArrayList<Jugador> jugadores, Tecnico tecnico, Pais pais, ArrayList<Asistente> asistentes, ArrayList<Medico> medicos, int ranking) {
        this.nombre = nombre;
        this.jugadores = jugadores;
        this.tecnico = tecnico;
        this.pais = pais;
        this.asistentes = asistentes;
        this.medicos = medicos;
        this.ranking = ranking;
    }

    public Seleccion(String nombre, Tecnico tecnico, Pais pais, ArrayList<Jugador> jugadores, int ranking) {
        this.nombre = nombre;
        this.tecnico = tecnico;
        this.pais = pais;
        this.jugadores = jugadores;
        this.ranking = ranking;

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Jugador> getJugadores() {
        return jugadores;
    }

    public void setJugadores(ArrayList<Jugador> jugadores) {
        this.jugadores = jugadores;
    }

    public Tecnico getTecnico() {
        return tecnico;
    }

    public void setTecnico(Tecnico tecnico) {
        this.tecnico = tecnico;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    public ArrayList<Asistente> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(ArrayList<Asistente> asistentes) {
        this.asistentes = asistentes;
    }

    public ArrayList<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(ArrayList<Medico> medicos) {
        this.medicos = medicos;
    }

    public int getRanking() {
        return ranking;
    }

    public void setRanking(int ranking) {
        this.ranking = ranking;
    }

    @Override
    public String toString() {
        return "Seleccion{" +
                "Nombre de la seleccion='" + nombre + '\'' +
                ", Jugadores=" + jugadores +
                ", Tecnico=" + tecnico +
                ", Pais=" + pais +
                ", Ranking Mundial=" + ranking +
                '}';
    }
}
