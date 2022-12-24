package Tarea6_CaC;

import java.util.ArrayList;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {
        /*

        Se debe hacer un array de 5 alumnos que tengan:
        i) DNI
        ii) Nombre
        iii) Apellido
        iv) Nota final
        Y mostrar el promedio obtenido por los alumnos del curso
        */

        float promedio, sumanotas;

        // Se definen los distintos alumnos con sus atributos

        ArrayList<Alumno> listadoAlumnos = new ArrayList<>();
        Alumno alumno1 = new Alumno("38558813", "Casanovas", "Fernando", 7);
        Alumno alumno2 = new Alumno("42180371", "Jerez", "Valentina", 5);
        Alumno alumno3 = new Alumno("37192930", "Cortez", "Samantha", 8);
        Alumno alumno4 = new Alumno("44291039", "Frias Silva", "German", 6);
        Alumno alumno5 = new Alumno("27301985", "Rodriguez", "Andres", 2);

        // Se agregan los alumnos al ArrayList

        Collections.addAll(listadoAlumnos, alumno1, alumno2, alumno3, alumno4, alumno5);

        /*
        Se arma un ciclo para recorrer el ArrayList, estableciendo un contador con sumanotas,
        y luego definiendo la variable promedio tomando como base la dimensión del ArrayList alumno
        */

        sumanotas = 0;
        for (Alumno X: listadoAlumnos)
        { sumanotas += X.getNotaFinal();
            
        }
        promedio = sumanotas/listadoAlumnos.size(); //Aquí se obtiene el promedio de los alumnos

        //Se imprime el resultado final con el promedio de todos los alumnos

        System.out.println("El promedio obtenido por los alumnos del curso es de: " + promedio);

    }
}