package DesafioFunciones_III;

public class Alumno {
    private String nombreAlumno;
    private String apellidoAlumno;
    private String dniAlumno;
    private int notaAlumno;


    public Alumno(String apellidoAlumno, String nombreAlumno, int notaAlumno) {
        this.nombreAlumno = nombreAlumno;
        this.apellidoAlumno = apellidoAlumno;
        this.notaAlumno = notaAlumno;
    }

    public Alumno(String apellidoAlumno, String nombreAlumno, String dniAlumno, int notaAlumno) {
        this.apellidoAlumno = apellidoAlumno;
        this.nombreAlumno = nombreAlumno;
        this.dniAlumno = dniAlumno;
        this.notaAlumno = notaAlumno;
    }

    public String getNombreAlumno() {
        return nombreAlumno;
    }

    public void setNombreAlumno(String nombreAlumno) {
        this.nombreAlumno = nombreAlumno;
    }

    public String getApellidoAlumno() {
        return apellidoAlumno;
    }

    public void setApellidoAlumno(String apellidoAlumno) {
        this.apellidoAlumno = apellidoAlumno;
    }

    public String getDniAlumno() {
        return dniAlumno;
    }

    public void setDniAlumno(String dniAlumno) {
        this.dniAlumno = dniAlumno;
    }

    public int getNotaAlumno() {
        return notaAlumno;
    }

    public void setNotaAlumno(int notaAlumno) {
        this.notaAlumno = notaAlumno;
    }
}
