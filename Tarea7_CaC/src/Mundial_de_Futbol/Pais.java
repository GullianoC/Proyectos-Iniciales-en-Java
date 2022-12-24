package Mundial_de_Futbol;

public class Pais {
    private String nombre;
    private String continente;
    protected String capital;
    private int poblacion;

    public Pais(String nombre, String continente, String capital, int poblacion) {
        this.nombre = nombre;
        this.continente = continente;
        this.capital = capital;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public String getCapital() {
        return capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", capital='" + capital + '\'' +
                '}';
    }
}
