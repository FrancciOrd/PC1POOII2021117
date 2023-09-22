/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.pc2;

/**
 *
 * @author FRANCHESKA
 */
import java.util.Scanner;

public class PC2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int numero_dias = 0;
        try {
            System.out.print("¿Para cuántos días tienes cifras de ventas? ");
            numero_dias = sc.nextInt();
            if (numero_dias < 1) {
                System.out.println("El número de días debe ser mayor o igual a 1.");
                System.exit(0);
            }
        } catch (Exception e) {
            System.out.println("El valor ingresado no es válido. Intente nuevamente.");
            System.exit(0);
        }
        double ventas_totales = 0;
        for (int i = 1; i <= numero_dias; i++) {
            double ventas_dia = -1;
            do {
                try {
                    System.out.print("Ingrese las ventas para el día " + i + ": ");
                    ventas_dia = sc.nextDouble();
                    if (ventas_dia < 0) {
                        System.out.println("El valor ingresado debe ser mayor o igual a 0.");
                    } else {
                        ventas_totales += ventas_dia;
                    }
                } catch (Exception e) {
                    System.out.println("El valor ingresado no es válido. Intente nuevamente.");
                    sc.nextLine();
                }
            } while (ventas_dia < 0);
        }
        System.out.printf("Las ventas totales son S/ %.2f", ventas_totales);
        sc.close();
        System.exit(0);
    }
}