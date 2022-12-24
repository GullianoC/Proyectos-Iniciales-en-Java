package Mundial_de_Futbol;

import java.util.Date;

public class Medico extends Persona {

    private String especialidad;

    public Medico(String nombre, String apellido, Date fechaNacimiento, String especialidad) {
        super(nombre, apellido, fechaNacimiento);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
