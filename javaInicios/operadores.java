package javaInicios;

public class operadores {
    
    public static void main(String[] args) {
        
        //aritmeticos

        double number1 = 10.000;
        double number2 = 50.000;
        double total = number1 + number2;
        double iva = 19 % 5;
        
        
        System.out.println("Su comprra es de " + (total + iva));

        /*
         * > Mayorr que
         * < Menor que
         * >= Mayor o igual que
         * <= Menor o igual que
         * == Igual que
         */ 

        boolean result = number1 > number2; //false
        System.out.println(result);

        boolean result2 = number1 < number2; //true
        System.out.println(result2);

        /*
         * logicos
         * and &&
         * or ||
         */

         boolean result3 = number1 > number2 && number1 < 100;
         System.out.println(result3);

         int edad = 17;
         boolean carnetJoven = number1 < 15 && edad <= 26;
         System.out.println(carnetJoven);

    }

}
