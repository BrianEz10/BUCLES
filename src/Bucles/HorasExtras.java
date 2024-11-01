package Bucles;

import java.util.Scanner;

public class HorasExtras {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        String empleado1;
        String empleado2;
        String empleado3;
        int i = 0;

        int horasExtras;
        int horasSemanales = 40;


        int horasTrabajadas1;
        int horasTrabajadas2;
        int horasTrabajadas3;


        for (i = 0; i < 3; i++) {
            if (i == 0) {
                System.out.println("Ingrese el nombre del empleado Nª1");
                empleado1 = Entrada.nextLine();
                System.out.println("Ingrese las horas que a trabajado " + empleado1);
                horasTrabajadas1 = Entrada.nextInt();
                Entrada.nextLine();
                i++;
                if (horasTrabajadas1 < horasSemanales) {
                    System.out.println("No has trabajado horas extras");
                } else {
                    horasExtras = horasTrabajadas1 - horasSemanales;
                    System.out.println(empleado1+" a trabajado " + horasExtras + " horas extras");
                }
            }
            if (i == 1) {
                System.out.println("Ingrese el nombre del empleado Nª2");
                empleado2 = Entrada.nextLine();
                System.out.println("Ingrese las horas que a trabajado " + empleado2);
                horasTrabajadas2 = Entrada.nextInt();
                Entrada.nextLine();
                i++;
                if (horasTrabajadas2 < horasSemanales) {
                    System.out.println("No has trabajado horas extras");
                } else {
                    horasExtras = horasTrabajadas2 - horasSemanales;
                    System.out.println(empleado2+" a trabajado " + horasExtras + " horas extras");
                }
            }
            if (i == 2) {
                System.out.println("Ingrese el nombre del empleado Nª3");
                empleado3 = Entrada.nextLine();
                System.out.println("Ingrese las horas que a trabajado " + empleado3);
                horasTrabajadas3 = Entrada.nextInt();
                Entrada.nextLine();
                i++;
                if (horasTrabajadas3 < horasSemanales) {
                    System.out.println("No has trabajado horas extras");
                } else {
                    horasExtras = horasTrabajadas3 - horasSemanales ;
                    System.out.println(empleado3+" a trabajado " + horasExtras + " horas extras");
                }
            }
        }
    }
}