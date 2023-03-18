/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.propuesto21;

import java.util.Scanner;

public class Propuesto21 {

    public static void main(String[] args) {
        double perimetro, s, area, lado1, lado2, lado3;
        Scanner entrada = new Scanner (System.in);
        
        System.out.println("Ingrese el primer lado del triangulo");
        lado1 = entrada.nextDouble();
        System.out.println("Ingrese el segundo lado del triangulo");
        lado2 = entrada.nextDouble();
        System.out.println("Ingrese el tercer lado del triangulo");
        lado3 = entrada.nextDouble();
        perimetro = lado1 + lado2 + lado3;
        s  = perimetro/2;
        area = Math.sqrt(s*(s-lado1)*(s-lado2)*(s-lado3));
        System.out.println("El perimetro es: " + perimetro);
        System.out.println("El semiperimetro es: " + s);
        System.out.println("El área es: " + area);
    }
}
