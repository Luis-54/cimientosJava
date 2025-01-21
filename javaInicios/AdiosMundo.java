package javaInicios;

public class AdiosMundo {

    public static void main(String[] args) {
    
    // Enteros
    int numero1 = 10;
    int numero2 = 20;
    byte numero3 = 30;
    short numero4 = 40;
    long numero5 = 3205291462L;

    // Texto
    String calle = "Calle 123";
    String ciudad = "Ciudad de México";
    String pais = "México";
    String nombre = "Juan";
    String apellido = "Pérez";
    char letra = 'A';
    

    //decimales
    float decimal1 = 10.5f;
    double decimal2 = 20.5;

    // Booleanos
    boolean variable1 = false;
    boolean variable2 = true;


    System.out.println("El total de la suma es : " + (numero1 / numero2) + " " + (numero3 + numero4) + " " + (numero5 / 2));

    System.out.println("Su cliente es" + " "+ nombre +" "+ apellido + " " + pais + " " + calle + " " + ciudad + " " + numero5);

    System.out.println("Su numero es " + decimal1 + " " + decimal2);

    System.out.println("Hola que tal esta bien" + " " + variable1 + " " + variable2);

    System.out.println("Cual es tu letra favorita? " + letra);

    }

}
