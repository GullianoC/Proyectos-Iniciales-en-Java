import practica.Nota;
import practica.Persona;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        // Crear un Array de Strings que contenga 5 frutas. Luego mostrar por pantalla las frutas;

        ArrayList <String> frutas = new ArrayList<>();

        frutas.add ("naranja");
        frutas.add ("pera");
        frutas.add ("banana");
        frutas.add ("manzana");
        frutas.add ("limon");

        System.out.println("Las frutas son: " + frutas);

        // Crear un Array de personas que tenga como propiedad solo el nombre. Agregar 5 personas y mostrarlas.

        ArrayList <Persona> personas = new ArrayList<>();

        Persona p = new Persona("Juan");
        personas.add(p);

        personas.add(new Persona("Pedro"));
        personas.add(new Persona("Ana"));
        personas.add(new Persona("Ines"));
        personas.add(new Persona("Sol"));

        System.out.println("Las personas son: " + personas);

        // Listar a las personas excepto a la que se llame Ana y Sol.

        for ( Persona pe : personas) {
            if (!pe.getNombre().equals("Ana") && !pe.getNombre().equals("Sol")) {
                System.out.println(pe.getNombre());
            }

        }
        // Hacer un ArrayList de notas y que calcule el promedio de las notas y que el Array tenga 5 notas. No debe permitir notas negativas ni que sean mayores a 10

        ArrayList <Nota> notas = new ArrayList<>();
        Scanner miTeclado = new Scanner (System.in);
        for (int i = 0; i < 5; i++) {
            Nota nota = new Nota(0.0);
            notas.add(i,nota);
            System.out.println("Ingrese una nota");
            nota.setValor(miTeclado.nextDouble());
            while (nota.getValor() < 0 || nota.getValor() > 10) {
                System.out.println("La nota que ingresaste es incorrecta");
                System.out.println("No se pueden ingresar notas negativas, ni mayores a 10");
                nota.setValor(miTeclado.nextDouble());
            }

        }

        System.out.println("Las notas son:" + notas);


        double suma = 0.0;
        for (Nota n : notas) {
            suma += n.getValor();
        }
        
        System.out.println("El promedio es: " + suma/(notas.size()));

    }
}