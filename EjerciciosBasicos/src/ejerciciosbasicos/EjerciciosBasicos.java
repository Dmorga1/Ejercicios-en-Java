/*
 * EJERCICIOS BASICOS EN JAVA
 * Todos lo ejercicios estan hechos en funciones para diferenciarlos.
 * En cada uno esta comentado el enunciado del ejercicio y el MAIN
 * correspondiente.
 * 
 */
package ejerciciosbasicos;

import java.util.Scanner;

/**
 *
 * @author Daniel Morales Garcia
 */
public class EjerciciosBasicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        ejercicio8();
    }

    public static void ejercicio1() {
        //Calcular e imprimir la suma de 3 calificaciones.  Pedir los datos al
        //usuario.

        //MAIN
        //ejercicio1();
        Scanner teclado = new Scanner(System.in);
        double calificacion1;
        double calificacion2;
        double calificacion3;
        double sumaCalificaciones;

        System.out.println("Introducir calificacion 1:");
        calificacion1 = teclado.nextDouble();
        System.out.println("Introducir calificacion 2: ");
        calificacion2 = teclado.nextDouble();
        System.out.println("Introducir calificacion 3: ");
        calificacion3 = teclado.nextDouble();
        sumaCalificaciones = calificacion1 + calificacion2 + calificacion3;
        System.out.println("La calificacion total es: " + sumaCalificaciones);
    }

    public static void ejercicio2() {
        //Calcular el salario semanal de un empleado a partir de sus horas
        //semanales trabajadas y de su salario por hora.

        //MAIN
        //ejercicio2();
        Scanner teclado = new Scanner(System.in);
        double horasTrabajadas;
        double salarioPorHora;
        double salarioSemanal;

        System.out.println("Introducir horas trabajadas: ");
        horasTrabajadas = teclado.nextDouble();
        System.out.println("Introducir salario por hora: ");
        salarioPorHora = teclado.nextDouble();
        salarioSemanal = horasTrabajadas * salarioPorHora;
        System.out.println("El salario semanal es de :" + salarioSemanal
                + " euros");
    }

    public static void ejercicio3() {
        //Guillermo tiene N euros.  Luis tiene la mitad de lo que tiene Guillermo
        //Juan tiene la mitad de lo que tienen Luis y Guillermo juntos.  Hacer un
        //programa que imprima cuanto dinero tienen cada uno de ellos y entre
        //todos.

        //MAIN
        //ejercicio3();
        Scanner teclado = new Scanner(System.in);
        double eurosDeGuillermo;
        double eurosDeLuis;
        double eurosDeJuan;
        double eurosTotales;
        System.out.println("Introducir euros de Guillermo: ");
        eurosDeGuillermo = teclado.nextDouble();
        eurosDeLuis = eurosDeGuillermo / 2;
        eurosDeJuan = (eurosDeGuillermo + eurosDeLuis) / 2;
        eurosTotales = eurosDeGuillermo + eurosDeLuis + eurosDeJuan;
        System.out.println("Guillermo tiene : " + eurosDeGuillermo + " euros");
        System.out.println("Luis tiene: " + eurosDeLuis + " euros");
        System.out.println("Juan tiene: " + eurosDeJuan + " euros");
        System.out.println("Entre los tres tienen: " + eurosTotales + " euros");
    }

    public static void ejercicio4() {
        //Una empresa que vende coches usados paga a sus vendedores 1000€
        //mensuales mas una comision de 150€ por cada coche vendido mas el 5%
        //del valor de la vena del coche vendido.  Calcular el salario de un 
        //vendedor de esta empresa.
        //suponemos la venta de un unico vehiculo.

        //MAIN
        //ejercicio4();
        Scanner teclado = new Scanner(System.in);
        double salarioFijo = 1000;
        double comision = 150;
        double valorCoche;
        double porcentajeVenta;
        double salarioTotal;

        System.out.println("Introducir el valor del coche vendido: ");
        valorCoche = teclado.nextDouble();
        porcentajeVenta = valorCoche * 1.05;
        salarioTotal = salarioFijo + comision + porcentajeVenta;
        System.out.println("El salario de un vendedor es de " + salarioTotal
                + " euros");
    }

    public static void ejercicio5() {
        //Un estudiante de informatica obtiene su nota final a partir de la
        //siguiente ponderacion de notas;
        //participacion 10% de la nota final
        //trabajos  25% de la nota final
        //primer examen  25% de la nota final
        //segundo examen 40% de la nota final
        //crear un programa que imprima su nota final

        //MAIN
        //ejercicio5();
        Scanner teclado = new Scanner(System.in);
        double participacion;
        double trabajos;
        double primerExamen;
        double segundoExamen;
        double notaFinal;
        System.out.println("Introducir nota de participacion: ");
        participacion = teclado.nextDouble() * 0.1;
        System.out.println("Introducir nota de trabajos: ");
        trabajos = teclado.nextDouble() * 0.25;
        System.out.println("Introducir nota del primer examen: ");
        primerExamen = teclado.nextDouble() * 0.25;
        System.out.println("Introducir nota del segundo examen: ");
        segundoExamen = teclado.nextDouble() * 0.4;
        notaFinal = participacion + trabajos + primerExamen + segundoExamen;
        System.out.println("La nota final es de: " + notaFinal);
    }

    public static void ejercicio6() {
        //calcular el cuadrado de una suma   (a+b)2 = a2 + b2 + 2ab

        //MAIN
        //ejercicio6();
        Scanner teclado = new Scanner(System.in);
        double a;
        double b;
        double resultado;
        System.out.println("Introducir parametro a: ");
        a = teclado.nextDouble();
        System.out.println("Introducir parametro b: ");
        b = teclado.nextDouble();
        resultado = (a * a) + (b * b) + 2 * (a * b);
        System.out.println("El resultado es de : " + resultado);

    }

    public static void ejercicio7() {
        //Construir un programa que, dado un numero total de horas, devuelva el 
        //numero de semanas, dias y horas equivalentes.  Por ejemplo 1000 horas son
        //5 semanas, 6 dias y 16 horas.

        //MAIN
        //ejercicio7();
        Scanner teclado = new Scanner(System.in);
        int numeroDeHoras = 0;

        System.out.println("Introducir numero de horas: ");
        numeroDeHoras = teclado.nextInt();

        int semanas = numeroDeHoras / 168; //horas por semana
        int dias = numeroDeHoras % 168 / 24;
        int horas = (numeroDeHoras % 168) % 24;

        System.out.println(numeroDeHoras + " horas son: ");
        System.out.println(semanas + " semanas");
        System.out.println(dias + " dias");
        System.out.println(horas + " horas");
    }

    public static void ejercicio8() {
        //construir un programa que calcule e imprima las raices cuadradas de la
        //ecuacion de segundo grado de coeficientes reales

        //MAIN
        //ejercicio8();
        Scanner teclado = new Scanner(System.in);
        System.out.println("a");
        int a = teclado.nextInt();
        System.out.println("b");
        int b = teclado.nextInt();
        System.out.println("c");
        int c = teclado.nextInt();
        double x1;
        double x2;
        
        x1 = (-b + Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        x2 = (-b - Math.sqrt(b * b - 4 * a * c)) / (2 * a);
        System.out.print("Soluciones de la ecuacion de segundo grado: ");
        System.out.println(a + "x2 + " + b + "x + " + c);
        System.out.println("Las soluciones de la ecuacion de 2º grado son: \n"
                             + x1 + "\n" + x2);
    }
}
