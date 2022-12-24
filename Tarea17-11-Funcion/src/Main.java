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
        personas que ingresaron y el número de personas que no ingresar por presentar síntomas de covid. Para
        la.implementacion, crear una clase Persona, crear un ArrayList de personas. La clase Persona  debe estar
        definida dentro de un paquete que se llame cac.covid

        */
        ArrayList<Persona> personasQueIngresaron = new ArrayList<>();
        ArrayList<Persona> personasQueNoIngresaron = new ArrayList<>();
        tipoPersona(personasQueIngresaron, personasQueNoIngresaron); //se creó una función mediante la cual se determina cuales fueron aceptados y cuales rechazados a la hora de ingresar al predio

        /*

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

        /* Se utiliza esta función para asignar valores aleatorios en el intervalo (36,38), sirve para probar la eficacia de
        for (Persona n: personasControlCovid) {
            n.setTemperatura(Math.random()*(38.0-36.0)+36.0);
        }
        */


        System.out.println("Las personas que ingresaron al predio fueron:");
        for (Persona x : personasQueIngresaron) {
            System.out.println("DNI: " + x.getDni() + " - Nombre: " + x.getNombre());
        }
        System.out.println("Las personas que no pudieron ingresar fueron:");
        for (Persona x : personasQueNoIngresaron) {
            System.out.println("DNI: " + x.getDni() + " - Nombre: " + x.getNombre() + " - Fue derivado a un hospital");
        }

        System.out.println("La cantidad de personas que ingresaron fueron: " + personasQueIngresaron.size());
        System.out.println("La cantidad de personas que no pudieron ingresar por tener síntomas compatibles con COVID fueron: " + personasQueNoIngresaron.size());

    }

    public static ArrayList<ArrayList> tipoPersona(ArrayList<Persona> aceptados, ArrayList<Persona> rechazados) {
        int i, r;
        i = 0;
        r = 0;
        String agregaPersona;
        Scanner tec = new Scanner(System.in);

        System.out.println("¿Te gustaría agregar personas al control de covid?");
        agregaPersona = tec.nextLine();

        while (!agregaPersona.equalsIgnoreCase("si") && !agregaPersona.equalsIgnoreCase("no")) {
            System.out.println("Respuesta incorrecta. ¿Te gustaría agregar personas al control de covid?. Responde SI o NO"); //se agrega un bucle para chequear la respuesta ingresada
            agregaPersona = tec.nextLine();
        }

        while (agregaPersona.equalsIgnoreCase("si")) {
            Persona personai = new Persona("", "", 0.0); //se crea una persona genérica

            System.out.println("Introduce el DNI de la persona");
            personai.setDni(tec.next());
            System.out.println("Introduce el Nombre de la persona");
            personai.setNombre(tec.nextLine());
            personai.setNombre(tec.nextLine());
            System.out.println("Introduce la temperatura de la persona en °C");
            personai.setTemperatura(tec.nextDouble());

            if (personai.getTemperatura() < 37.0) {
                aceptados.add(i, personai);
                i++; // para agregar al contador de aceptados
            } else {
                rechazados.add(r, personai);
                r++; // para agregar al contador de rechazados
            }

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

        ArrayList resultadosTemperatura = new ArrayList(2);
        resultadosTemperatura.add(0, aceptados);
        resultadosTemperatura.add(1, rechazados);
        return resultadosTemperatura;

    }
}