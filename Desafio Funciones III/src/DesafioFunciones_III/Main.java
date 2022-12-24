package DesafioFunciones_III;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static float cargarNotas() {
        int i;
        Alumno alumno1 = new Alumno(; i = 0)



    }

    public static void main(String[] args) {
        String contcargNotas;
        Scanner tec = new Scanner(System.in);
        ArrayList<Alumno> alumnos = new ArrayList<>();

        System.out.println("¿Te gustaría cargar las notas de los alumnos? Responde SI o NO");
        contcargNotas = tec.next().toUpperCase();
        while (contcargNotas != "SI" & contcargNotas != "NO") {
            System.out.println("Lo que ingresaste por teclado es incorrecto, escribe SI o NO")
            contcargNotas = tec.next().toUpperCase();
        }
        if (contcargNotas.equals("SI")) {
            cargarNotas();

            System.out.println("Te gustaría seguir introduciendo alumnos?");
            contcargNotas = tec.next().toUpperCase();

        }







    }
}