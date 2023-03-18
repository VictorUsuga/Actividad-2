/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.propuesto24;

import java.util.Scanner;

public class Propuesto24 {

    public static void main(String[] args) {
        float A, B, C;
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A: ");
        A = entrada.nextFloat();
        System.out.println("Ingrese el peso de la esfera B: ");
        B = entrada.nextFloat();
        System.out.println("Ingrese el peso de la esfera C: ");
        C = entrada.nextFloat();
        if (A > B) {
            if (A > C) {
                System.out.println("La esfera con mayor peso es A: " + A);
            } else { 
                System.out.println("La esfera con mayor peso es C: " + C);
            }
        } else if (B > C){
            System.out.println("La esfera con mayor peso es B: " + B);
        } else {
            System.out.println("La esfera con mayor peso es C: " + C);
        }
    
    }
    
}
