import java.util.*;;

public class PagoTrabajador {
    public static void main(String[] args) {
        String Nombre;
        System.out.println("Nombre del trabajador: ");
        Scanner nombScanner = new Scanner(System.in);
        Nombre = nombScanner.next();

        Double HorasTrabajadas, PrecioHora, HorasExtra;
        System.out.println("Horas trabajadas: ");
        Scanner horasScanner = new Scanner(System.in);
        HorasTrabajadas = horasScanner.nextDouble();
        System.out.println("Valor de hora normal: ");
        Scanner precioScanner = new Scanner(System.in);
        PrecioHora = precioScanner.nextDouble();

        System.out.println("Nombre trabajador: " + Nombre);

        if (HorasTrabajadas <= 40){
            System.out.println("El pago del trabajador es: " + HorasTrabajadas * PrecioHora);
        } else if (HorasTrabajadas <= 48){
            HorasExtra = HorasTrabajadas - 40;
            System.out.println("El pago del trabajador es: " + ((HorasTrabajadas * PrecioHora) + HorasExtra * PrecioHora));
        } else {
            HorasExtra = HorasTrabajadas - 40;
            System.out.println("El pago del trabajador es: " + ((HorasTrabajadas * PrecioHora)+(HorasExtra * PrecioHora)+((HorasExtra-8) * PrecioHora)));
        }

    }
}


/* Determinar la cantidad de dinero recibida por un trabajador por concepto de las horas
semanales trabajadas en una empresa, sabiendo que cuando las horas de trabajo exceden
de 40, el resto se considera horas extras y se pagan al doble de una hora normal, cuando
no exceden de 8; si las horas extras exceden de 8, se pagan las primeras 8 al doble de lo
que se paga una hora normal y el resto al triple. Del trabajador se conocen los siguientes
datos: nombres, número de horas trabajadas en la semana y valor recibido por una hora
normal de trabajo. */