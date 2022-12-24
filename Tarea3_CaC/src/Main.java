import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*** Ahora se procederá a hacer la tercera tarea del programa Codo a Codo, a continuación se adjuntan los enunciados de los ejercicios
         Ejercicio 1:

         Vamos al cine. todo el quintoto grado y con algunos adultos.
         comprar entradas: y si es un menor , el valor de entrada es 500 y si es mayor es 700
         existe un no seguir compranda entradas.
         resultado:el valor total de costo de las entradas para los menores y
         otro total del costo de las entradas para mayores

         ***/

        //Comenzamos con el Ejercicio 1//
        int entradaMenor, entradaMayor;
        String entrada, correcto;
        Scanner tec = new Scanner(System.in);

        System.out.println("Hola, bienvenido al cine. El precio unitario por entrada es de: $500 para los menores, $700 para los mayores");
        System.out.println("¿Te gustaria comprar entradas para el cine? Responde: SI o NO");
        entrada = tec.next().toUpperCase();
        while (!entrada.equals("SI") | !entrada.equals("NO")) {
            System.out.println("Lo lamentamos, pero la respuesta ingresada es incorrecta, por favor ingresa: SI o NO");
            entrada = tec.next().toUpperCase();
            if (entrada.equals("SI") | entrada.equals("NO")) {
                break;
            }

        }
        while (entrada.equals("SI")) {
            System.out.println("¿Cuantos mayores de edad son?");
            entradaMayor = tec.nextInt();
            System.out.println("¿Cuantos menores de edad son?");
            entradaMenor = tec.nextInt();
            System.out.println("La cantidad de entradas para mayores es de " + entradaMayor + " y la cantidad de entradas para menores es de " + entradaMenor + " . ¿Es correcto? Responde con SI o NO");
            correcto = tec.next().toUpperCase();
            while (!correcto.equals("SI")) {
                System.out.println("¿Cuantos mayores de edad son?");
                entradaMayor = tec.nextInt();
                System.out.println("¿Cuantos menores de edad son?");
                entradaMenor = tec.nextInt();
                System.out.println("La cantidad de entradas para mayores es de " + entradaMayor + " y la cantidad de entradas para menores es de " + entradaMenor + " . ¿Es correcto? Responde con SI o NO");
                correcto = tec.next().toUpperCase();
            }

            System.out.println("El costo total de las entradas para los menores es de: " + 500 * entradaMenor);
            System.out.println("El costo total de las entradas para los mayores es de: " + 700 * entradaMayor);

            System.out.println("¿te gustaria seguir comprando entradas");
            entrada = tec.next().toUpperCase();
            while (!entrada.equals("SI") & !entrada.equals("NO")) {
                System.out.println("La respuesta es incorrecta, por favor ingresa: SI o NO");
                entrada = tec.next().toUpperCase();
            }
        System.out.println("Muchas gracias por su compra");

        }

    }
}
