package TareaNotas;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    /**
     i) Se debe crear un objeto llamado Alumno el cual tenga:
     DNI
     Nombre del alumno
     Apellido del alumno
     Nota obtenida

     ii) Luego realizar un arraylist donde mediante una función cargarNotas se puedan cargar los datos(del alumno)vía teclado.
     iii) Programar una función que arroje el promedio de las notas cargadas.

     iv) Colocar la función cargaNotas dentro de un bucle while que pregunte si deseo cargar otro dato (O sea si deseas agregar otro alumno, por ende van incluidos todos los demás datos)
     v) Colocar toda la estructura anterior dentro de switch cuyos menúes sean:
     1. Visualizar los datos cargados
     2. Obtener el promedio
     3. Salir

     **/

    static ArrayList<Alumno> cargaDatos(ArrayList datosAlumnos) {
        String infoDNI, agregaAlumnos;
        Scanner tec = new Scanner(System.in);

        int i;
        i = 0;
        while (i >= 0) {
            Alumno alumnoi = new Alumno("00000000", "APELLIDO ALUMNO", "NOMBRE ALUMNO", 0);
            datosAlumnos.add(i, alumnoi);
            System.out.println("Tienes el DNI del Alumno? Responde SI o NO");
            infoDNI = tec.next().toUpperCase();
            while (!infoDNI.equals("SI") && !infoDNI.equals("NO")) {
                System.out.println("Respuesta incorrecta, responde SI o NO");
                infoDNI = tec.next().toUpperCase();
            }
            if (infoDNI.equals("SI")) {
                System.out.println("Introduce el DNI del Alumno");
                alumnoi.setDNI(tec.next());
            } else if (infoDNI.equals("NO")) {
                System.out.println("Se colocó como DNI: Incompleto");
                alumnoi.setDNI("Incompleto");
            }

            System.out.println("Introduce el apellido del Alumno");
            alumnoi.setApellidoAlumno(tec.nextLine());
            alumnoi.setApellidoAlumno(tec.nextLine()); // se agrega esta línea para que no skipee cuando uno ingresa datos

            System.out.println("Introduce el nombre del Alumno");
            alumnoi.setNombreAlumno(tec.nextLine());

            System.out.println("Introduce la nota del Alumno");
            alumnoi.setNotaFinal(tec.nextInt());
            while (tec.nextInt() > 10 || tec.nextInt() < 0) { // se impone una condición para que la nota introducia sea un entero entre 0 y 10
                System.out.println("La nota ingresada es incorrecta, la calificacion final debe ser un número entero entre 0 y 10");
                alumnoi.setNotaFinal(tec.nextInt());
            }
            System.out.println("Te gustaría seguir agregando Alumnos?");
            agregaAlumnos = tec.next().toUpperCase();
            while (!agregaAlumnos.equals("SI") && !agregaAlumnos.equals("NO")) {
                System.out.println("Respuesta incorrecta, responde SI o NO");
                agregaAlumnos = tec.next().toUpperCase();
            }
            i++;
            if (agregaAlumnos.equals("NO")) {
                break;
            }

        }
        return datosAlumnos;

    }
    static double promedio(ArrayList<Alumno> notasAlumnos) {
        double sumanotas, resultado;
        sumanotas = 0;
        for (Alumno x: notasAlumnos) {
            sumanotas += x.getNotaFinal();
        }
        resultado = sumanotas/notasAlumnos.size();
        return resultado;

    }
         public static void main(String[] args) {


             int menu;
             Scanner sc = new Scanner(System.in);
             ArrayList<Alumno> notasAlumnos = new ArrayList<>();
             System.out.println("***Se ejecuta el programa para crear alumnos y agregarlos al ArrayList***");

             System.out.println("A continuacion introduce la informacion requerida");
             cargaDatos(notasAlumnos);
             System.out.println("Luego de haber cargado la información, elige como proceder");
             System.out.println("1. Visualizar los datos cargados (DNI, apellido, nombre, nota)");
             System.out.println("2. Obtener el promedio");
             System.out.println("3. Salir");

             menu = sc.nextInt();
             while (menu != 1 && menu != 2 && menu!= 3) {
                 System.out.println("La opción escogida es incorrecta, por favor escoge otra opción:");
                 System.out.println("1. Visualizar los datos cargados (DNI, apellido, nombre, nota)");
                 System.out.println("2. Obtener el promedio");
                 System.out.println("3. Salir");
                 menu = sc.nextInt();
             }

             switch (menu) {
                 case 1:
                     notasAlumnos.sort(Comparator.comparing(a -> a.getApellidoAlumno()));
                     System.out.println(notasAlumnos);
                     break;
                 case 2:
                     System.out.println("El promedio obtenido por los alumnos en el curso es de:" + promedio(notasAlumnos));
                     break;
                 case 3:
                     System.out.println("Gracias por usar el programa");
                     break;
             }

         }

}