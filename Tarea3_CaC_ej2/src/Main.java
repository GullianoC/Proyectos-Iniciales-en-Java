import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /* Ejercicio 2:
         definir en dos variables : nombre de usuario y contraseña.
         van a pedir que ingresen por teclado usuario y contraseña.
         comparar lo que ingresan x teclado con lo que hay en las variables.
         si son correctos los datos, mostrar mensaje ingreso al sistema.
         sino.. volver a pedir el nombre y contraseña.
         */

        //Comenzamos con el ejercicio 2
        String user, password, user1, password2;
        Scanner tec = new Scanner(System.in);

        user = "gulliano";
        password = "Mila2015";
        System.out.println("Bienvenido/a al sitio, a continuación deberás ingresar tu usuario y contraseña");

        System.out.println("Ingresa tu usuario");
        user1 = tec.next().toLowerCase();
        System.out.println("Ingresa tu contraseña");
        password2 = tec.next();

        while (!user1.equals(user) | !password2.equals(password)) {
            System.out.println("Los datos ingresados son incorrectos, vuelve a ingresar tu usuario y contraseña"); //esto solamente pasa si el usuario se confunde al ingresar datos
            System.out.println("Ingresa tu usuario");
            user1 = tec.next().toLowerCase();
            System.out.println("Ingresa tu contraseña");
            password2 = tec.next();
        }
        if (user1.equals(user) & password2.equals(password)) {
            System.out.println("¡Acceso exitoso al sistema!");
    }
}