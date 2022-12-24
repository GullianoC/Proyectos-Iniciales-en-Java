import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        /*
         Ejercicio 3:
         definir en dos variables : nombre de usuario y contraseña.
         van a pedir que ingresen por teclado usuario y contraseña.
         comparar lo que ingresan x teclado con lo que hay en las variables.
         si son correctos los datos, mostrar mensaje ingreso al sistema.
         sino.. volver a pedir el nombre y contraseña.

         Sin embargo la cantidad de intentos es solamente 3, en caso contrario aparece cuenta bloqueada
         */

        //Comenzamos con el ejercicio 3//
        String user, password, user1, password2;
        Scanner tec = new Scanner(System.in);
        int error;

        user = "gulliano";
        password = "Mila2015";
        System.out.println("Bienvenido/a al sitio, a continuación deberás ingresar tu usuario y contraseña");


        System.out.println("Ingresa tu usuario");
        user1 = tec.next().toLowerCase();
        System.out.println("Ingresa tu contraseña");
        password2 = tec.next();
        for (error = 0; error <= 2; error++) {
            if (!user1.equals(user) | !password2.equals(password)) {
                System.out.println("Lo lamentamos, tu usuario o contraseña son incorrectos");
                System.out.println("Este es tu intento número: " + (error+1) + " , si te equivocas 3 veces tu cuenta será bloqueada.");
                System.out.println("Ingresa tu usuario nuevamente:");
                user1 = tec.next().toLowerCase();
                System.out.println("Ingresa tu contraseña nuevamente");
                password2 = tec.next();
                if (error == 2) {
                    System.out.println("Lo sentimos, tu cuenta ha sido bloqueada");
                }
            }

        }
        if (user1.equals(user) & password2.equals(password)) {
            System.out.println("¡Ingreso exitoso!");


        }

    }
}