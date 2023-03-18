/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resuelto14;

import java.util.Scanner;

public class Resuelto14 {

    public static void main(String[] args) {
        int VD1, VD2, VD3, SALAR, TotalVentas;
        double PORVEN, Salario1, Salario2, Salario3;
        Scanner entrada = new Scanner (System.in);
        System.out.println("Ingrese ventas del departamento 1: ");
        VD1 = entrada.nextInt();
        System.out.println("Ingrese ventas del departamento 2: ");
        VD2 = entrada.nextInt();
        System.out.println("Ingrese ventas del departamento 3: ");
        VD3 = entrada.nextInt();
        System.out.println("Ingrese el salario de los vendedores: ");
        SALAR = entrada.nextInt();
        
        TotalVentas = VD1 + VD2 + VD3;
        PORVEN = TotalVentas*0.33;
        
        if (VD1 > PORVEN) {
            Salario1 = SALAR + 0.2*SALAR;
        } else {
            Salario1 = SALAR;
        } 
        if (VD2 > PORVEN) {
            Salario2 = SALAR + 0.2*SALAR;
        } else {
            Salario2 = SALAR;
        }
        if (VD3 > PORVEN) {
            Salario3 = SALAR + 0.2*SALAR;
        } else {
            Salario3 = SALAR;
        }
        
        System.out.println("Salario vendedor departamento 1: " + Salario1);
        System.out.println("Salario vendedor departamento 2: " + Salario2);
        System.out.println("Salario vendedor departamento 3: " + Salario3);
        
    }
}
