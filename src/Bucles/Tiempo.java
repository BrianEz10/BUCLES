package Bucles;

import java.util.Scanner;

public class Tiempo {

    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);
        String estudiante;
        String salir = "no";

        double estudiar;
        double ejercicioFisico;
        double leer;
        double tiempoLibre;

        double tiempoDedicado;



        System.out.println("¿Eres Estudiante?");
        estudiante = Entrada.nextLine();
        estudiante.toLowerCase();

        while (estudiante.equals("si") ){

            System.out.println("Ingrese las horas que le dedica en un dia a cada actividad ");
            System.out.println("Estudiar");
            estudiar = Entrada.nextDouble();
            System.out.println("Hacer Ejercicio");
            ejercicioFisico = Entrada.nextDouble();
            System.out.println("Leer");
            leer = Entrada.nextDouble();
            System.out.println("Tiempo Libre");
            tiempoLibre = Entrada.nextDouble();

            tiempoDedicado = (double) estudiar+ejercicioFisico+leer+tiempoLibre;

            System.out.println("El tiempo total que le dedica a las actividades que realizas es de "+tiempoDedicado+" horas");

            Entrada.nextLine();

            System.out.println("¿Desea Salir?");
            salir = Entrada.nextLine().toLowerCase();

            if (salir.equals("si")){
                System.out.println("Saliendo del progama");
                break;
            }
            else continue;
        }
    }
}