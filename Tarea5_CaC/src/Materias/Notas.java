package Materias;

public class Notas {
    private String nombreAsignatura;
    private String notaFinal;


    //Se crean los constructores para notafinal y nombreasignatura


    public Notas(String nombreAsignatura, String notaFinal) {
        this.nombreAsignatura = nombreAsignatura;
        this.notaFinal = notaFinal;

    }

    public String getNombreAsignatura() {
        return nombreAsignatura;
    }

    public void setNombreAsignatura(String nombreAsignatura) {
        this.nombreAsignatura = nombreAsignatura;
    }

    public String getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(String notaFinal) {
        this.notaFinal = notaFinal;
    }
}
