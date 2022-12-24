import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* En este ejercicio de Codo a Codo lo que se va a intentar hacer es crear un algoritmo en la cual se ejecuten las siguientes tareas:
        Ejercicio 1): Ingresar un número del 1 al 10, y que la página muestre los restantes hasta el número 10.
        De momento solo necesitamos que cuente hasta el 10

        Ejercicio 2): Mostrar todos los números pares entre 2 y 50.
         */

        //Aquí se trabaja con el ejercicio 1//
        int num10, i;
        System.out.println("Ingresa un numero del 1 al 10");
        Scanner sc = new Scanner(System.in);
        num10 = sc.nextInt();

        i = 1;
        while (num10 + i <= 10) {
            System.out.println(num10 + i);
            i++;

        }
        //Aquí se trabaja con el ejercicio 2//
        int numpar, contador;
        int division;
        System.out.println("A continuacion se muestran todos los numeros pares del 0 al 50");
        division = 2;
        numpar = 0;
        contador = 1;;
        while (numpar+contador <= 50) {
            if ((numpar+contador)%division == 0) {;
            System.out.println("El número: " + (numpar+contador) + " es un numero par");
            }
            contador++;

        }

    }

}





