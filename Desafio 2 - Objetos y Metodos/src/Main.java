import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     //Vamos a hacer una app que al ingresar dos números, realice sus operaciones básicas
        float num1,num2;
        Scanner tec = new Scanner(System.in);

        System.out.println("A continuacion ingresa dos numeros y podras ver sus operaciones basicas");
        System.out.println("Recuerda que el primer numero ingresado representa el primer término para la suma o resta, mientras que para la division representa al numerador.");
        System.out.println("A continuacion ingresa el primer numero");
        num1 = tec.nextFloat();
        System.out.println("A continuacion ingresa el segundo numero");
        num2 = tec.nextFloat();
        System.out.println("La suma de ambos numeros es: " + (num1+num2));
        System.out.println("La resta de ambos numeros es: " + (num1-num2));
        System.out.println("La multiplicacion de ambos numeros es: " + (num1*num2));
        System.out.println("La division de ambos numeros es: " + (num1/num2));



    }
}