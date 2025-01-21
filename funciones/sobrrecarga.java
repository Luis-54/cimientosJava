package funciones;

//Sobrecarga permite duplicar un metodo siempre y cuando tenga diferente numero o tipo de parametros
public class sobrrecarga {
    
    public static void main(String[] args) {

        System.out.println("Calculadora de sobrrecarga");

        int result = suma(40, 50);
        System.out.println( " La suma es: " + result );

        int result2 = suma(40, 50, 10);
        System.out.println( " La suma es: " + result2 );

        double result3 = getPriceIva(200, 19);
        System.out.println( " El precio con IVA es: " + result3 );
        
    }

    //Crear una funcion que reciba un precio y devuelva el precio con el iva incluido
    static double getPriceIva (double price, double vatPercentage) {
    return price + (price * vatPercentage / 100);
    }

    static int suma(int a, int b) {
        return a + b;
    }

    static int suma(int a, int b, int c) {
        return a + b + c;
    }
}
