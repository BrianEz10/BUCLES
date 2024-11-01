package Bucles;

import java.util.Scanner;

public class Inventario {
    public static void main(String[] args) {


        Scanner Entrada =new Scanner(System.in);
        String prod1;
        String prod2;
        String prod3;


        int prod1stock = 0;
        int prod2stock = 0;
        int prod3stock = 0;

        System.out.println("Ingrese el nombre de los 3 productos que tiene");
        prod1 = Entrada.nextLine();
        prod2 = Entrada.nextLine();
        prod3 = Entrada.nextLine();

        do {

            if (prod1stock < 5){
                System.out.println("Ingrese el stock que tiene de "+prod1);
                prod1stock = Entrada.nextInt();
            }
            if (prod2stock < 5){
                System.out.println("Ingrese el stock que tiene de "+prod2);
                prod2stock = Entrada.nextInt();
            }
            if (prod3stock < 5){
                System.out.println("Ingrese el stock que tiene de "+prod3);
                prod3stock = Entrada.nextInt();
            }

            if (prod1stock < 5){
                System.out.println("FALTA STOCK DE "+prod1+", el minimo es de 5, Ingrese mas stock");
                prod1stock = Entrada.nextInt();
            } else {
                System.out.println("Ya tiene stock suficiente del producto "+prod1);
            }

            if(prod2stock < 5){
                System.out.println("FALTA DE STOCK DE "+prod2+", el minimo es de 5, Ingrese mas stock");
                prod2stock = Entrada.nextInt();
            } else {
                System.out.println("Ya tiene stock suficiente del producto "+prod2);
            }

            if (prod3stock < 5){
                System.out.println("FALTA DE STOCK DE "+prod3+", el minimo es de 5, Ingrese mas stock");
                prod3stock = Entrada.nextInt();
            } else  {
                System.out.println("Ya tiene stock suficiente del producto "+prod3);
            }
        }while(prod1stock < 5 && prod2stock < 5 && prod3stock < 5);
    }
}