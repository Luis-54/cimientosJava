package Smart.Class;

import Smart.inheritance.SmarPhone;
import Smart.inheritance.SmartWatch;

public class Main {

    public static void main(String[] args) {


        //Atributes Class
        Atributes Iphone = new Atributes("Ipple", "Iphone 13", "IOS", "Negro", 3);
        System.out.println("Final");

        //Inheritance
        SmarPhone samsung = new SmarPhone();
        samsung.modelo = "S24 Ultra";
        samsung.color = "Negro";

        System.out.println("Samsung");

        SmartWatch xiaomi = new SmartWatch();
        xiaomi.modelo = "Watch 3 Active";
        xiaomi.estress = true;
        xiaomi.latidosPorMinuto = true;
        xiaomi.oximetria = true;
        xiaomi.presionArterial = true;

        System.out.println("El reloj de xiaomi");


    }
}
