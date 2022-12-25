import java.util.ArrayList;
import java.util.Scanner;
import cac.covid.Persona;
public class Main {

    public static void main(String[] args) {

        /*

        El gobierno de la Ciudad de Buenos Aires necesita implementar un control de covid en un encuentro de
        programadores. Para esto necesita pedir la temperatura de cada persona  , el nombre y dni. El resultado del control
        debe listar a todas las personas que ingresaron (temperatura menor a 37 grados) y también listar las
        personas que no pudieron ingresar, indicando un mensaje que fue derivado a un hospital. Calcular el número de
        personas que ingresaron y el número de personas que no ingresaron por presentar síntomas de covid. Para
        la.implementacion, crear una clase Persona, crear un ArrayList de personas. La clase Persona  debe estar
        definida dentro de un paquete que se llame cac.covid

        */

        ArrayList<Persona> personasControlCovid = new ArrayList<>();
        int i, personasAceptadas, personasRechazadas, contador;
        i = 0;
        contador = 0;
        personasAceptadas = 0;
        personasRechazadas = 0;
        String agregaPersona;
        Scanner tec = new Scanner(System.in);

        System.out.println("¿Te gustaría agregar personas al control de covid?");
        agregaPersona = tec.nextLine();

        while (!agregaPersona.equalsIgnoreCase("si") && !agregaPersona.equalsIgnoreCase("no")) {
            System.out.println("Respuesta incorrecta. ¿Te gustaría agregar personas al control de covid?. Responde SI o NO"); //se agrega un bucle para chequear la respuesta ingresada
            agregaPersona = tec.nextLine();
        }

        while (agregaPersona.equalsIgnoreCase("si")) {
            Persona personai = new Persona("", "", 0.0); //se crea una persona genérica para poder setear los parámetros

            System.out.println("Introduce el DNI de la persona");
            personai.setDni(tec.next());
            System.out.println("Introduce el Nombre de la persona");
            personai.setNombre(tec.nextLine());
            personai.setNombre(tec.nextLine());
            System.out.println("Introduce la temperatura de la persona en °C");
            personai.setTemperatura(tec.nextDouble());
            personasControlCovid.add(i, personai);
            i++;

            System.out.println("Te gustaría seguir agregando personas?");
            agregaPersona = tec.next();
            while (!agregaPersona.equalsIgnoreCase("si") && !agregaPersona.equalsIgnoreCase("no")) {
                System.out.println("Respuesta incorrecta. ¿Te gustaría agregar personas al control de covid?. Responde SI o NO");
                agregaPersona = tec.next();
            }
            if (agregaPersona.equalsIgnoreCase("no")) {
                break;
            }
        }

        //se agregan personas genéricas para probar
        personasControlCovid.add(new Persona("43563178", "Gerardo David Cordoba", 37.0));
        personasControlCovid.add(new Persona("44978764", "Geronimo Colombres", 35.3));
        personasControlCovid.add(new Persona("44866627", "Milagros D'Amato", 38.2));
        personasControlCovid.add(new Persona("95066249", "Davolio Kimey", 36.9));
        personasControlCovid.add(new Persona("44616920", "Alderete Carla Valentina", 36.3));
        personasControlCovid.add(new Persona("38248644", "Alderete Ricardo Emanuel", 37.7));
        personasControlCovid.add(new Persona("22420798", "Bourdette Cristian Rolando", 35.2));
        personasControlCovid.add(new Persona("37658346", "Castro Luis Emanuel", 36.7));
        personasControlCovid.add(new Persona("38472159 ", "Hernandez José Francisco", 36.4));
        personasControlCovid.add(new Persona("43846449", "Romano Malena Luciana", 36.2));


        personasAceptadas = listadoCovid(personasControlCovid, "Las personas que pudieron ingresar al evento:",37.0,1);
        personasRechazadas = listadoCovid(personasControlCovid, "Las personas que pudieron NO ingresar al evento por tener síntomas compatibles con COVID fueron: ",37.0,2);

        //Mediante los resultados obtenidos se muestra en pantalla quienes ingresaron y quienes no, con la respectiva cantidad de cada uno


        System.out.println(" ");
        System.out.println("La cantidad de personas que ingresaron fueron: " + personasAceptadas);
        System.out.println("La cantidad de personas que no pudieron ingresar " + personasRechazadas);

    }

    static int listadoCovid (ArrayList<Persona> listado, String mensaje, double temperaturaLimite, int tipoListado) {
        int contador;
        contador = 0;
        System.out.println(mensaje);
        for (Persona x : listado) {
            if (tipoListado == 1) {
                if (x.getTemperatura() < temperaturaLimite) {
                    System.out.println("DNI: " + x.getDni() + " - Nombre: " + x.getNombre() + " - Temperatura: " + x.getTemperatura());
                    contador++;
                }
            }
            else {
                    if (x.getTemperatura() >= temperaturaLimite) {
                        contador++;
                        System.out.println("DNI: " + x.getDni() + " - Nombre: " + x.getNombre() + " - Temperatura: " + x.getTemperatura() + " - Fue derivado/a a un hospital");
                    }
            }
        }
        return contador;

    }
}