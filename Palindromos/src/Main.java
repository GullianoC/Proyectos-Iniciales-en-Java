import java.util.Scanner;


public class Main {
    static void Palindromo() {
        String palabra, palabraInvertida;
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingresa una palabra o frase");
        palabra = tec.nextLine().replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder rev = new StringBuilder(palabra);
        palabraInvertida = rev.reverse().toString();

        if (palabraInvertida.equals(palabra)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es un palindromo");
        }
    }


    public static void main (String[]args){

        System.out.println("Ahora vamos a chequear si la palabra o frase que vas a introducir es palindromo");
        System.out.println(" ");
        Palindromo();


    }

}