package Materias;

import java.util.ArrayList;

import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        int cont, continv;
        int suma;
        ArrayList<String> materiasRendidas = new ArrayList<>(); //Se crea la arraylist materiasRendidas tipo String

        //Se asignan 10 notas obtenidas con su respectiva asignatura, al objeto Notas

        Notas nota1 = new Notas("Lengua", "8");
        Notas nota2 = new Notas("Matematica Aplicada", "9");
        Notas nota3 = new Notas("Gestion de Organizaciones", "7");
        Notas nota4 = new Notas("Economia", "6");
        Notas nota5 = new Notas("Informatica", "9");
        Notas nota6 = new Notas("Ingles", "6");

        //Se agregan las notas obtenidas al ArrayList materiasRendidas

        Collections.addAll(materiasRendidas, nota1.getNotaFinal(), nota2.getNotaFinal(), nota3.getNotaFinal(), nota4.getNotaFinal(), nota5.getNotaFinal(), nota6.getNotaFinal());

        //Se imprime la lista original completa
        System.out.println(materiasRendidas);

        /*


        // Ahora se va a intentar mostrar de a 1 elemento
        for (String mostrar: materiasRendidas) {
            System.out.println(Integer.parseInt(mostrar));
        }

        */

        //Apartado (i), se va a mostrar los números en el orden correspondiente al array y luego su posterior suma

        cont = 0;
        suma = 0;
        System.out.println("(i) A continuacion se van a mostrar las notas");

        while (cont<materiasRendidas.size()) {
            System.out.println(materiasRendidas.get(cont));
            suma += Integer.parseInt(materiasRendidas.get(cont));
            cont++;
        }
        System.out.println("La suma de todas las notas es: " + suma);

        // Apartado (ii), se van a mostrar los numeros en el orden inverso del array

        System.out.println(" ");
        System.out.println("(ii) A continuacion, se va a mostrar el orden inverso de las notas");

        // Forma 1

        for (continv = materiasRendidas.size() - 1; continv >= 0; continv--) {
            System.out.println(materiasRendidas.get(continv));
        }


        // Forma 2


        /*
        cont = materiasRendidas.size()-1;

        while ( cont <= materiasRendidas.size() ) {
            System.out.println(materiasRendidas.get(cont));
            cont--;
            if (cont == 0) {
                System.out.println(materiasRendidas.get(cont));
                break;
            }
        }

        */



        //Forma 3

        //Ahora se va a mostrar a la lista pero en orden invertido

        Collections.reverse(materiasRendidas);
        System.out.println(materiasRendidas);




    }


}