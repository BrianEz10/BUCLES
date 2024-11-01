package Bucles;

import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {

        Scanner Entrada = new Scanner(System.in);

        int i = 1;
        int empleados;//3 empleados
        int salarioHora = (int) 15.00;

        double empleado1 = 0;
        double empleado2 = 0;
        double empleado3 = 0;


        System.out.println("Empresa");
        System.out.println("Ingrese la cantidad de empleados");
        empleados = Entrada.nextInt();

        for (i = 0;i < empleados; i++){
            if (i == 0){
                System.out.println("Ingrese las horas trabajas por el primer trabajador");
                empleado1 = Entrada.nextInt();
                double salario1 = (empleado1 * salarioHora);
                System.out.println("Sueldo de primer trabajador: "+salario1);
            } else if (i == 1) {
                System.out.println("Ingrese las horas trabajas por el segundo trabajador");
                empleado2 = Entrada.nextInt();
                double salario2 = (empleado2 * salarioHora);
                System.out.println("Sueldo de primer trabajador: "+salario2);
            } else if (i == 2) {
                System.out.println("Ingrese las horas trabajas por el tercer trabajador");
                empleado3 = Entrada.nextInt();
                double salario3 = (empleado3 * salarioHora);
                System.out.println("Sueldo de primer trabajador: "+salario3);
            }
        }
    }
}