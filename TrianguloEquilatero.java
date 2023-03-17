import java.util.*;
import java.lang.*;
public class TrianguloEquilatero {
    public static void main(String[] args) {
        Double lado, perimetro, altura, area;
        Scanner ladoScanner = new Scanner(System.in);
        lado = ladoScanner.nextDouble();

        perimetro = lado * 3;
        altura = Math.sqrt((lado*lado) - Math.pow((lado/2), 2));
        area = (lado*altura)/2;

        System.out.println("El perimetro del triangulo es: " + perimetro);
        System.out.println("La altura del triangulo es: " + altura);
        System.out.println("El area del triangulo es: " + area);
    }
}

/* 19. Dado el valor del lado en un triángulo equilátero, haga un algoritmo que obtenga el
perímetro, el valor de la altura y el área del triángulo. */