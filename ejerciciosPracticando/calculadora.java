package ejerciciosPracticando;
import java.util.Scanner;


public class calculadora {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el precio de un articulo");
        double precioArticulo = scanner.nextDouble();
        System.out.print("Ingrese la cantidad de articulos");
        int cantidadArticulos = scanner.nextInt();
        double totalSinDescuento = precioArticulo * cantidadArticulos;


        double porcentajeDescuento = 0.0;
        double montoDescuento = 0.0;

        if (cantidadArticulos > 1 && cantidadArticulos < 5){
            porcentajeDescuento = 0.0;
        }else if (cantidadArticulos >= 6 && cantidadArticulos <= 10){
            porcentajeDescuento = 0.5;
        }else if (cantidadArticulos >= 11 && cantidadArticulos <= 20){
            porcentajeDescuento = 0.10;
        }else{
            porcentajeDescuento = 0.15;
        }

        montoDescuento = totalSinDescuento * porcentajeDescuento;
        double totalConDescuento = totalSinDescuento - montoDescuento;

        System.out.println("Total sin descuento: $" + totalSinDescuento );
        System.out.println("Porcentaje de descuento " + (porcentajeDescuento*100) + "%");
        System.out.println("Monto del descuento: $" + montoDescuento);
        System.out.println("Total con descuento: $" + totalConDescuento);


    }
}
