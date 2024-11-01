package Bucles;

import java.util.Scanner;

public class Ventas {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        int ventas;
        int dias = 0;
        int lunes = 0;
        int martes = 0;
        int miercoles = 0;
        int jueves = 0;
        int viernes = 0;
        int sabado = 0;
        int domingo = 0;

        System.out.println("Registro de ventas diarias");
        while (dias < 8) {
            if (dias == 0) {
                System.out.println("Ingrese las ventas del dia de hoy Lunes: ");
                lunes = Entrada.nextInt();
                dias++;
            } else if (dias == 1) {
                System.out.println("Ingrese las ventas del dia de hoy Martes: ");
                martes = Entrada.nextInt();
                dias++;
            } else if (dias == 2) {
                System.out.println("Ingrese las ventas del dia de hoy Miercoles: ");
                miercoles = Entrada.nextInt();
                dias++;
            } else if (dias == 3) {
                System.out.println("Ingrese las ventas del dia de hoy Jueves: ");
                jueves = Entrada.nextInt();
                dias++;
            } else if (dias == 4) {
                System.out.println("Ingrese las ventas del dia de hoy Viernes: ");
                viernes = Entrada.nextInt();
                dias++;
            } else if (dias == 5) {
                System.out.println("Ingrese las ventas del dia de hoy Sabado: ");
                sabado = Entrada.nextInt();
                dias++;
            } else if (dias == 6) {
                System.out.println("Ingrese las ventas del dia de hoy Domingo: ");
                domingo = Entrada.nextInt();
                dias++;
            } else if (dias == 7) {
                ventas = (lunes+martes+miercoles+jueves+viernes+sabado+domingo);
                System.out.println("Total de ventas de esta semana: "+ventas);
                break;
            }
        }
    }
}