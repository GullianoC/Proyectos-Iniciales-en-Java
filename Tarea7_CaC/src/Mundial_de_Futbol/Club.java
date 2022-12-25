package Mundial_de_Futbol;

public class Club {

    protected String nombre;
    protected String cancha;
    protected String ciudad;
    protected Pais pais;

    public Club(String nombre, String cancha, String ciudad, Pais pais) {
        this.nombre = nombre;
        this.cancha = cancha;
        this.ciudad = ciudad;
        this.pais = pais;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCancha() {
        return cancha;
    }

    public void setCancha(String cancha) {
        this.cancha = cancha;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public Pais getPais() {
        return pais;
    }

    public void setPais(Pais pais) {
        this.pais = pais;
    }

    @Override
    public String toString() {
        return "Club{" +
                "nombre='" + nombre + '\'' +
                '}';
    }
}
