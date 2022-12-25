import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
         /*

         Programar un sistema de créditos que pida el nombre del usuario y su ingreso medio,
         A partir de los datos ingresados  el programa arrojará el máximo crédito disponible.
         Las lineas de crédito son
         Ingresos inferiores a $ 50000 son clase A
         Ingresos entre $50000 y 100000 son clase B
         Ingresos mayores a 100000 son clase C
         En todos los casos el valor de la cuota no debe superar 1/3 del ingreso
         Hasta en 24 cuotas
         Arbitrariamente se impone una tasa de interés simple del 5% mensual, y las lineas de crédito según categoría son las siguientes
         Categoria A: hasta 80.000 , Categoria B: hasta 130.000, Categoria C: hasta 200.000C
         Considerar los casos en que el monto ingresado en la línea de crédito sea superior al disponible según la categoria,
          y aquellos casos donde el ratio cuota/ingreso sea mayor a 1/3 (un tercio).

         */


        float ingreso, monto, cuotaIngreso;
        double cuota, montoTotal;
        int cantidadCuotas;
        String nombre, apellido;
        Scanner tec = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de creditos online, a continuacion podra saber cual es su limite disponible y elegir el importe que desea de credito");
        System.out.println("A continuacion ingrese su nombre completo");
        System.out.println("Ingrese su nombre:");
        nombre = tec.next();
        System.out.println("Ingrese su apellido");
        apellido = tec.next();
        System.out.println("Bienvenido" + apellido + nombre);
        System.out.println("Ingrese su ingreso medio");
        ingreso = tec.nextFloat();
        cuotaIngreso = (float) ((1.0/3.0) * ingreso);

        if (ingreso <= 50000) {
            System.out.println("Tu credito es de clase A con un maximo de $80.000");
            System.out.println("Cuanto dinero deseas pedir prestado?");
            monto = tec.nextFloat();
            System.out.println("Elige la cantidad de cuotas para saldar tu prestamo");
            cantidadCuotas = tec.nextInt();
            montoTotal = monto * (1 + cantidadCuotas * 0.05); //Se define el monto total a pagar contando el interes mensual
            cuota = montoTotal / cantidadCuotas; //Se determina la cuota a pagar

            while (monto > 80000 | cuota > cuotaIngreso | cantidadCuotas > 24) {
                System.out.println("Monto incorrecto (mayor de $80.000), tu cuota mensual excede a 1/3 de tu sueldo o elegiste pagar en mas de 24 cuotas");
                System.out.println("Escoge el monto a pedir prestado");
                monto = tec.nextFloat();
                System.out.println("Escoge la cantidad de cuotas");
                cantidadCuotas = tec.nextInt();
                montoTotal = monto * (1 + cantidadCuotas * 0.05);
                cuota = montoTotal / cantidadCuotas;
            }

            System.out.println("Tu saldo total a pagar contando el interes, en " + cantidadCuotas + " cuotas es de: $" + montoTotal);
            System.out.println("Para cada cuota deberas abonar un total de: $" + cuota);

        } else if (ingreso >= 50000 && ingreso <= 100000) {
            System.out.println("Tu credito es de clase B con un maximo de $130.000");
            System.out.println("Cuanto dinero deseas pedir prestado?");
            monto = tec.nextFloat();
            cantidadCuotas = tec.nextInt();
            montoTotal = monto * (1 + cantidadCuotas * 0.05); //Se define el monto total a pagar contando el interes mensual
            cuota = montoTotal / cantidadCuotas; //Se determina la cuota a pagar

            while (monto > 130000 | cuota > cuotaIngreso | cantidadCuotas > 24) {
                System.out.println("Monto incorrecto (mayor de $130.000), tu cuota mensual excede a 1/3 de tu sueldo o elegiste pagar en mas de 24 cuotas");
                System.out.println("Escoge el monto a pedir prestado");
                monto = tec.nextFloat();
                System.out.println("Escoge la cantidad de cuotas");
                cantidadCuotas = tec.nextInt();
                montoTotal = monto * (1 + cantidadCuotas * 0.05);
                cuota = montoTotal / cantidadCuotas;
            }

            System.out.println("Tu saldo total a pagar contando el interes, en " + cantidadCuotas + " cuotas es de: $" + montoTotal);
            System.out.println("Para cada cuota deberas abonar un total de: $" + cuota);

        } else {

            System.out.println("Tu credito es de clase C con un maximo de $200.000");
            System.out.println("Cuanto dinero deseas pedir prestado?");
            monto = tec.nextFloat();
            cantidadCuotas = tec.nextInt();
            montoTotal = monto * (1 + cantidadCuotas * 0.05); //Se define el monto total a pagar contando el interes mensual
            cuota = montoTotal / cantidadCuotas; //Se determina la cuota a pagar

            while (monto > 200000 | cuota > cuotaIngreso | cantidadCuotas > 24) {
                System.out.println("Monto incorrecto (mayor de $200.000), tu cuota mensual excede a 1/3 de tu sueldo o elegiste pagar en mas de 24 cuotas");
                System.out.println("Escoge el monto a pedir prestado");
                monto = tec.nextFloat();
                System.out.println("Escoge la cantidad de cuotas");
                cantidadCuotas = tec.nextInt();
                montoTotal = monto * (1 + cantidadCuotas * 0.05);
                cuota = montoTotal / cantidadCuotas;
            }

            System.out.println("Tu saldo total a pagar contando el interes, en " + cantidadCuotas + " cuotas es de: $" + montoTotal);
            System.out.println("Para cada cuota deberas abonar un total de: $" + cuota);
        }
    }
}
