import java.util.*;

import javax.lang.model.util.ElementScanner14;

import java.lang.*;
public class EcuacionGrado2 {
    public static void main(String[] args) {
        Double A, B, C, Discriminante;
        System.out.println("Ingrese parametros A, B, C en respectivo orden: ");

        Scanner aScanner = new Scanner(System.in);
        A = aScanner.nextDouble();

        Scanner bScanner = new Scanner(System.in);
        B = bScanner.nextDouble();

        Scanner cScanner = new Scanner(System.in);
        C = cScanner.nextDouble();

        Discriminante = (Math.pow(B, 2)-4*A*C);

        if (Discriminante < 0){
            System.out.println("La ecuación no tiene solución");
        } else if (Discriminante > 0){
            System.out.println("las soluciones de la ecuación son: ");
            System.out.println("Solución 1: "+ ((-B+Math.sqrt(Discriminante))/(2*A)));
            System.out.println("Solución 1: "+ ((-B-Math.sqrt(Discriminante))/(2*A)));
        } else {
            System.out.println("La solución de la ecuación es: " + -B/2*A);
        }
    }
}

/* Dados los valores A, B y C que son los parámetros de una ecuación de segundo grado,
elaborar un algoritmo para hallar las posibles soluciones de dicha ecuación. */