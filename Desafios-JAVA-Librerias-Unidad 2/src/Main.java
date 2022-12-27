import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*

          Desafio I

          Programar una galleta de la suerte o bola 8 de la suerte donde al ingresar un número de la suerte por teclado, el usuario reciba una frase de buena suerte.
          Las frases estarán almacenadas en un arraylist.
          Se utilizará el método random para llamar un índice cualquiera del arraylist.

          Desafio II

          Realiza una aplicación que nos calcule una ecuación de segundo grado.
          Debes pedir las variables a, b y c por teclado y comprobar la operación en la raíz cuadrada.
          Para la raíz cuadrada usa el método sqlrt de Math.
          El discriminante (b2 - 4ac) puede ser positivo, cero o negativo y esto determina cuántas soluciones (o raíces) existen para la ecuación cuadrática dada.
          Un discriminante positivo indica que la cuadrática tiene dos soluciones reales distintas.
          Un discriminante de cero indica que la cuadrática tiene una solución real repetida.
          Un discriminante negativo indica que ninguna de las soluciones son números reales.
         * Ecuación para hallar las raices -b + √(b2 - 4ac))/2a

         Desafio III

         Crea una aplicación llamada Calculadora, nos pedirá 2 operandos (int) y un signo aritmético (String),
         según este último se realizará la operación correspondiente.
         Al final mostrará el resultado en consola.

         Los signos aritméticos disponibles son:

         +: suma los dos operandos.
         -: resta los operandos.
         *: multiplica los operandos.
         /: divide los operandos, este debe dar un resultado con decimales (double)
         ^:  1º operando como base y 2º como exponente.
         %:  módulo, resto de la división entre num1 y num2.

       */

        System.out.println("Aquí en este algoritmo se construyeron los diferentes tipos de funciones que se requerían según el enunciado");
        opcionesMenu();

        switch (opcionesMenu()) {
            case 1:
                frasesSuerte();
            case 2:
                System.out.println("");
                calculadoraRaicesSegundoGrado();
            case 3:
                calculadoraDosNumeros();

        }


    }
    static String frasesSuerte() {
        ArrayList<String> frases = new ArrayList<>();
        double indiceAzar;
        String eleccion, suerte;
        suerte = " ";
        Scanner ingtec = new Scanner(System.in);
        frases.add(0, "Tendrás un día de alegrías y buenos momentos, disfrútalos como nunca.");
        frases.add(1, "Concéntrate en lo que quieres lograr y ganaras. No lo olvides.");
        frases.add(2, "El cielo sera tu limite, pues grandes acontecimientos te sucederán.");
        frases.add(3, "Te sentirás feliz como un niño y veras al mundo con sus ojos.");
        frases.add(4, "Vivirás tu vejez con comodidades y riquezas materiales.");
        frases.add(5, "Confía en tu suerte, que es mucha y te rodeara de prosperidad.");
        frases.add(6, "No todo el mundo puede recibir las mismas cosas. Se practico.");
        frases.add(7, "Te aguarda una larga y feliz vida.");
        frases.add(8, "Hoy es el momento de explorar: no temas");
        frases.add(9, "Muy pronto seras incluido en muchas reuniones, fiestas y tertulias.");
        System.out.println("A continuación escoge un número del 1 al 10 para ver tu fortuna, o deja todo en manos del azar escribiendo: azar");
        eleccion = ingtec.nextLine();
        while (!eleccion.equalsIgnoreCase("azar") && !eleccion.equalsIgnoreCase("1") && !eleccion.equalsIgnoreCase("2") && !eleccion.equalsIgnoreCase("3") && !eleccion.equalsIgnoreCase("4") && !eleccion.equalsIgnoreCase("5") && !eleccion.equalsIgnoreCase("6") && !eleccion.equalsIgnoreCase("7") && !eleccion.equalsIgnoreCase("8") && !eleccion.equalsIgnoreCase("9") && !eleccion.equalsIgnoreCase("10")) {
            System.out.println("Elección incorrecta, por favor escoge un número del 1 al 10, o escribe la palabra: azar");
            eleccion = ingtec.nextLine();
        }
        if (eleccion.equalsIgnoreCase("azar")) {
            System.out.println("Tu fortuna dice:");
            indiceAzar = Math.random() * 10;
            suerte = frases.get((int) Math.round(indiceAzar));
            return suerte;
        } else if (Integer.parseInt(eleccion) > 0 && Integer.parseInt(eleccion) <= 10) {
            System.out.println("Tu fortuna dice:");
            suerte = frases.get(Integer.parseInt(eleccion) - 1);
            return suerte;
        }
        return suerte;
    }

    static String calculadoraRaicesSegundoGrado() {
        double discriminante, a, b, c;
        boolean continua;
        String solucion;
        Scanner tec = new Scanner(System.in);
        a = 0;
        b = 0;
        c = 0;
        System.out.println("Vamos a hacer una calculadora de raices para un polinomio de segundo grado");
        System.out.println("ax^2 + bx + c = 0 es la ecuación de un polinomio de 2do, con a ≠ 0");
        System.out.println("Escoge el parámetro a");
        do {
            try {
                continua = false;
                a = tec.nextDouble();
                if (a == 0) {
                    continua = true;
                }
            } catch (Exception ex) {
                System.out.println("Recordar que el número escogido tiene que ser una opción válida");
                System.out.println("El parámetro 'a' debe ser de tipo double, y distinto de cero");
                continua = true;
            }
        } while (continua);


        System.out.println("Escoge el parámetro b");
        do {
            try {
                continua = false;
                b = tec.nextDouble();
            } catch (Exception ex) {
                System.out.println("Recordar que el número escogido tiene que ser una opción válida");
                System.out.println("El parámetro 'b' debe ser de tipo double");
                continua = true;
            }
        } while (continua);

        System.out.println("Escoge el parámetro c");
        do {
            try {
                continua = false;
                c = tec.nextDouble();
            } catch (Exception ex) {
                System.out.println("Recordar que el número escogido tiene que ser una opción válida");
                System.out.println("El parámetro 'c' debe ser de tipo double");
                continua = true;
            }
        } while (continua);

        System.out.println("Para este ejercicio, la ecuación de segundo grado queda expresada de la siguiente forma:");
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");

        discriminante = Math.sqrt((Math.pow(b, 2.0) - 4 * a * c));
        if (discriminante > 0) {
            double solucion1, solucion2;
            solucion1 = (-b + discriminante) / 2 * a;
            solucion2 = (-b - discriminante) / 2 * a;
            System.out.println("Tienes dos raices reales y distintas");
            solucion = "X1 = " + solucion1
                    + "X2 = " + solucion2;
            return solucion;
        }
        if (discriminante == 0) {
            System.out.println("Tienes una sola raiz real doble, y repetida");
            solucion = "X1,2 = " + -b / 2 * a;
            return solucion;
        } else {
            solucion = "La solución a la ecuación de segundo grado no está disponible para el conjunto de los reales";
            return solucion;
        }
    }

    static double calculadoraDosNumeros() {
        int num1, num2, resultado;
        double resultadodiv;
        String operacion;
        Scanner tec = new Scanner(System.in);
        System.out.println("A continuación calcularemos una operación aritmética con dos números");
        System.out.println("Ingresa el primer número");
        num1 = tec.nextInt();
        System.out.println("Ingresa la operación a efectuar");
        operacion = tec.next();
        while (!operacion.equalsIgnoreCase("+") && !operacion.equalsIgnoreCase("-") && !operacion.equalsIgnoreCase("*") && !operacion.equalsIgnoreCase("/") && !operacion.equalsIgnoreCase("^") && !operacion.equalsIgnoreCase("%")) {
            System.out.println("La operacion a efectuar es inválida");
            operacion = tec.next();
        }
        System.out.println("Ingresa el segundo número");
        num2 = tec.nextInt();

        if (operacion.equalsIgnoreCase("+")) {
            resultado = num1 + num2;
            System.out.println("El resultado de la operación entre los dos números ingresados es: ");
            return resultado;
        } else if (operacion.equalsIgnoreCase("-")) {
            resultado = num1 - num2;
            System.out.println("El resultado de la operación entre los dos números ingresados es: ");
            return resultado;
        } else if (operacion.equalsIgnoreCase("*")) {
            resultado = num1 * num2;
            System.out.println("El resultado de la operación entre los dos números ingresados es: ");
            return resultado;
        } else if (operacion.equalsIgnoreCase("/")) {
            while (num2 == 0) {
                System.out.println("El segundo número es cero, no es un divisor válido, por favor escoge otro número");
                num2 = tec.nextInt();
            }
            double num1d, num2d;
            num1d = num1;
            num2d = num2;
            resultadodiv = num1d / num2d;
            System.out.println("El resultado de la operación entre los dos números ingresados es: ");
            return resultadodiv;
        } else if (operacion.equalsIgnoreCase("^")) {

            resultado = (int) Math.pow(num1, num2);
            System.out.println("El resultado de la operación entre los dos números ingresados es: ");
            return resultado;
        } else if (operacion.equalsIgnoreCase("%")) {
            resultado = num1 % num2;
            System.out.println("El resultado de la operación entre los dos números ingresados es: ");
            return resultado;
        }
        return (0);

    }
    static int opcionesMenu () {
        int opcionElegida;
        boolean continua;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Opción 1: Galleta de la suerte");
        System.out.println("Opción 2: Calculadora de raíces - ecuación 2do grado");
        System.out.println("Opción 3: Calculadora (dos números):");
        opcionElegida = teclado.nextInt();
        do {
            try {
                continua = false;
                opcionElegida = teclado.nextInt();
            } catch (Exception ex) {
                System.out.println("Recordar que el número escogido tiene que ser una opción válida");
                continua = true;
            }
        } while (continua);

        return opcionElegida;
    }
}
