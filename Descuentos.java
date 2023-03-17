import java.util.*;
public class Descuentos {
    public static void main(String[] args) {
    Double ValorCompra, Descuento=0.0;
    System.out.println("Ingrese valor de compra");
    Scanner valorScanner = new Scanner(System.in);
    ValorCompra = valorScanner.nextDouble();

    String color;
    System.out.println("Ingrese color:\nblanco\nverde\namarillo\nazul\nrojo");
    Scanner colorScanner = new Scanner(System.in);
    color = colorScanner.next();

    if ("blanco".equals(color)){
    } else if ("verde".equals(color)){
        Descuento = ValorCompra * 0.1;

    } else if ("amarillo".equals(color)){
        Descuento = ValorCompra * 0.25;

    } else if("azul".equals(color)){
        Descuento = ValorCompra * 0.5;

    } else {
        Descuento = ValorCompra;
    }
    System.out.println("El precio de su compra es: " + (ValorCompra - Descuento));
    }
}

/* Un almacén efectúa una promoción en la cual se hace un descuento sobre el valor de la
compra total, según el color de la bolita que el cliente saque al pagar en caja. Si la bolita
es blanca no se le hará descuento alguno, si es verde se le hará un 10% de descuento, si es
amarilla un 25%, si es azul un
50% y si es roja un 100%. Hacer un algoritmo para determinar la cantidad final que un
cliente deberá pagar por su compra. Se sabe que sólo hay bolitas de los colores
mencionados. */