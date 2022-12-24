package Tarea6_CaC;

public class Alumno {

    private String dni;
    private String apellido;
    private String nombre;
    private Integer notaFinal;

    public Alumno(String dni, String apellido, String nombre, Integer notaFinal) {
        this.dni = dni;
        this.apellido = apellido;
        this.nombre = nombre;
        this.notaFinal = notaFinal;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getNotaFinal() {
        return notaFinal;
    }

    public void setNotaFinal(Integer notaFinal) {
        this.notaFinal = notaFinal;
    }
}
