package TareaNotas;

public class Alumno {

    private String DNI;
    private String nombreAlumno;
    private String apellidoAlumno;
    private int notaFinal;

    public Alumno(String DNI, String apellidoAlumno, String nombreAlumno, int notaFinal) {
        this.DNI = DNI;
        this.apellidoAlumno = apellidoAlumno;
        this.nombreAlumno = nombreAlumno;
        this.notaFinal = notaFinal;
    }

    public Alumno(String apellidoAlumno, String nombreAlumno, int notaFinal) {
        this.apellidoAlumno = apellidoAlumno;
        this.nombreAlumno = nombreAlumno;
        this.notaFinal = notaFinal;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
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

    public int getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(int notaFinal) {
        this.notaFinal = notaFinal;
    }

    @Override
    public String toString() {
        return "Alumno{" +
                "DNI='" + DNI + '\'' +
                ", nombreAlumno='" + nombreAlumno + '\'' +
                ", apellidoAlumno='" + apellidoAlumno + '\'' +
                ", notaFinal=" + notaFinal +
                '}';
    }
}
