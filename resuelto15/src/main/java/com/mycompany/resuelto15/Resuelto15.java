/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.resuelto15;

import java.util.Scanner;

public class Resuelto15 {

    public static void main(String[] args) {
        int A, B, C, D;
        Scanner entrada = new  Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A: ");
        A = entrada.nextInt();
        System.out.println("Ingrese el peso de la esfera B: ");
        B = entrada.nextInt();
        System.out.println("Ingrese el peso de la esfera C: ");
        C = entrada.nextInt();
        System.out.println("Ingrese el peso de la esfera D: ");
        D = entrada.nextInt();
        
        if ((A == B) && (A == C)){
            if (D > A) {
                System.out.println("La esfera D es la diferente y es de mayor peso");
            }
            else {
                System.out.println("La esfera D es la diferente y es de menor peso");
            }   
        }
        else {
            if ((A == B) && (A == D)){
                if (C > A){
                    System.out.println("La esfera C es la diferente y es de mayor peso");
                }
                else {
                    System.out.println("La esfera C es la diferente y es de menor peso");
                }
            }
            else {
                if ((A == C) && (A == D)){
                    if (B > D){
                        System.out.println("La esfera B es la diferente y es de mayor peso");
                    }
                    else {
                        System.out.println("La esfera B es la diferente y es de menor peso");
                    }
                }
                else {
                    if (A > B){
                        System.out.println("La esfera A es la diferente y es de mayor peso");                        
                    }
                    else {
                        System.out.println("La esfera A es la diferente y es de menor peso");
                    }
                }
            }
        }
        
    }
}
