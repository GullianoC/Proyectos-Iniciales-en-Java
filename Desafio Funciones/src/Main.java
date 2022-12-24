import java.util.Scanner;

public class Main {
    
    static double perimetroCirculo() {
        double perimetro, radio;
        Scanner tec = new Scanner(System.in);
        System.out.println("Ingresa el radio del circulo");
        radio = tec.nextDouble();
        perimetro = Math.PI*radio*2;
        System.out.println("El perimetro del circulo es");
        return perimetro;

    }
    static double superficieCirculo() {


    }
    public static void main(String[] args) {
        System.out.println("Hello world!");

    }
}