/*
 *  EJERCICIOS DE BUCLES EN JAVA
 * Todos lo ejercicios estan hechos en funciones para diferenciarlos.
 * En cada uno esta comentado el enunciado del ejercicio y el MAIN
 * correspondiente.
 */
package ejerciciosdebucles;

import java.util.Scanner;

/**
 *
 * @author Daniel Morales Garcia
 */
public class EjerciciosDeBucles {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ejercicioE();
    }

    public static void ejercicio1() {
        //Una empresa que vende coches usados paga a sus vendedores 1000€
        //mensuales mas una comision de 150€ por cada coche vendido mas el 5%
        //del valor de la vena del coche vendido.  Calcular el salario de un 
        //vendedor de esta empresa.
        //suponemos la venta de varios vehiculos.

        //MAIN
        //ejercicio1();
        Scanner teclado = new Scanner(System.in);
        double salarioFijo = 1000;
        double comision = 150;
        double cochesVendidos;
        double valorCoche = 0;
        double porcentajeVenta;
        double salarioTotal;
        int contador = 0;
        int suma = 0;
        System.out.println("Introducir coches vendidos: ");
        cochesVendidos = teclado.nextInt();
        while (contador < cochesVendidos) {
            System.out.println("Introducir valor del coche vendido: ");
            contador++;
            valorCoche = teclado.nextDouble();
            suma += valorCoche;
        }
        porcentajeVenta = suma * 5 / 100;
        salarioTotal = salarioFijo + comision + porcentajeVenta;
        System.out.println("El salario de un vendedor es de " + salarioTotal
                + " euros");
    }

    public static void ejercicio2() {
        //Introducir números enteros hasta introducir un 0.

        //MAIN
        //ejercicio2();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir un numero( 0 para salir)");
        int k = teclado.nextInt();
        while (k != 0) {
            System.out.println("Introducir un numero (0 para salir)");
            k = teclado.nextInt();
        }
    }

    public static void ejercicioA() {
        //Hacer un programa que pida un número entero y muestre si es
        //múltiplo de 10

        //MAIN
        //ejercicioA();
        Scanner teclado = new Scanner(System.in);
        int numero;
        System.out.println("Introducir numero entero: ");
        numero = teclado.nextInt();
        if (numero % 10 == 0) {
            System.out.println("El numero ES multiplo de 10");
        } else {
            System.out.println("El numero NO ES multiplo de 10");
        }
    }

    public static void ejercicioB() {
        //Pedir dos números y decir cuál es el mayor de ellos o si son iguales.

        //MAIN
        //ejercicioB();
        Scanner teclado = new Scanner(System.in);
        int numero1;
        int numero2;
        System.out.println("Introducir numero 1: ");
        numero1 = teclado.nextInt();
        System.out.println("Introducir numero 2: ");
        numero2 = teclado.nextInt();
        if (numero1 > numero2) {
            System.out.println(numero1 + " es mayor que " + numero2);
        }
        if (numero2 > numero1) {
            System.out.println(numero2 + " es mayor que " + numero1);
        }
        if (numero1 == numero2) {
            System.out.println("los numeros son iguales ");
        }
    }

    public static void ejercicioC() {
        //Hacer un programa que pida un carácter y nos diga si es Mayúscula o no.
        //Para ello hay que usar un método de la clase Character llamado
        //isUpperCase(‘ ‘). Por ejemplo: if (Character.isUpperCase(letra))

        //MAIN
        //ejercicioC();
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introducir caracter: ");
        char caracter = teclado.nextLine().charAt(0);
        if (Character.isUpperCase(caracter)) {
            System.out.println("El caracter esta en MAYUSCULA");
        } else {
            System.out.println("El caracter esta en minuscula");
        }
    }

    public static void ejercicioD() {
        //En MegaPlaza se hace un 20% de descuento a los clientes cuya compra
        //supere los 300€. ¿Cuál será la cantidad que pagará una persona por
        //su compra?

        //MAIN
        //ejercicioD();
        Scanner teclado = new Scanner(System.in);
        double precioDeCompra;
        double precioConDescuento;
        double totalConDescuento;
        System.out.println("Introducir precio de compra: ");
        precioDeCompra = teclado.nextDouble();
        if (precioDeCompra <= 300) {
            System.out.println("El importe a pagar es de: " + precioDeCompra);
        }
        if (precioDeCompra > 300) {
            precioConDescuento = precioDeCompra * 20 / 100;
            totalConDescuento = precioDeCompra - precioConDescuento;
            System.out.println("El importe a pagar es de: " + totalConDescuento);
        }
    }

    public static void ejercicioE() {
        //Un obrero necesita calcular su salario semanal, el cual se obtiene de la
        //siguiente manera:
        //si trabaja 40 horas o menos se le paga a 16 € la hora
        //si trabaja mas de 40 horas se le paga 16 € hora las 40 primeras y 20 €
        //hora por cada extra.

        //MAIN
        //ejercicioE();
        Scanner teclado = new Scanner(System.in);
        int numeroDeHorasTrabajadas;
        int salarioMinimo = 0;
        int numeroDeHorasExtras;
        int totalHorasTrabajadas = 0;
        int salarioPorHorasExtras = 0;
        int salarioTotal = 0;
        
        System.out.println("introducir numero de horas trabajadas ");
        numeroDeHorasTrabajadas = teclado.nextInt();
        
        if (numeroDeHorasTrabajadas <= 40) {
            salarioMinimo = numeroDeHorasTrabajadas * 16;
            salarioTotal = salarioMinimo + salarioPorHorasExtras;
        }
        
        System.out.println("el salario por " + numeroDeHorasTrabajadas
                + " horas trabajadas es de " + salarioMinimo + " euros");

        if (numeroDeHorasTrabajadas > 40) {
            numeroDeHorasExtras = numeroDeHorasTrabajadas - 40;
            salarioPorHorasExtras = numeroDeHorasExtras * 20;

            System.out.println("el salario por " + numeroDeHorasTrabajadas
                    + " horas trabajadas es de " + salarioPorHorasExtras
                    + " euros");
        }
        
//        System.out.println(salarioMinimo);
    }
}
