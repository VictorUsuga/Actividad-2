import java.util.*;

import javax.security.sasl.SaslException;
public class Ejercicio22_Salario {
    public static void main(String[] args) {
        String nombre;
        double salario, Salmensual;
        int horasT;

        Scanner nomScanner = new Scanner(System.in);
        nombre= nomScanner.next();

        Scanner salarioScanner = new Scanner(System.in);
        salario = salarioScanner.nextDouble();

        Scanner horaScanner = new Scanner(System.in);
        horasT= horaScanner.nextInt();

        Salmensual = salario * horasT;

        if (Salmensual>=450.000){
            System.out.println("Empleado: "+ nombre);
            System.out.println("Salario mensual = "+ Salmensual);
        }else{
            System.out.println("Empleado: "+ nombre);
        }

    }
}
/*  Elaborar un algoritmo que entre el nombre de un empleado, su salario básico por hora y el
    número de horas trabajadas en el mes; escriba su nombre y salario mensual si éste es mayor
    de $450.000, de lo contrario escriba sólo el nombre. */