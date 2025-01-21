package Vehiculos.Clases;

import Vehiculos.herencia.Camion;
import Vehiculos.herencia.Coche;
import Vehiculos.herencia.Motocicleta;
import Vehiculos.Clases.vehicle;

import java.util.Vector;

public class Main {

    public static void main(String[] args) {

        //clase identificador = new clase();
        //1. Clases y objetos

        //Crear un objeto utilizando el constructor vacio
        vehicle toyotaPrius = new vehicle();

        //Crear un objeto usando el constructor con parametros

        //Viene de la clase Motor
        Motor motorGTI = new Motor("GTI", 190, 459, 6);

        //Viene de la clase Vehiculo
        vehicle fordMondeo = new vehicle("Mondeo", "Ford", 2.1, 2010, false, 0, motorGTI);
        System.out.println(fordMondeo.fabricante);
        System.out.println(fordMondeo.year);
        System.out.println(fordMondeo.speed);
        fordMondeo.acelerar(50);
        System.out.println(fordMondeo.speed);

        //2. herencia
        Motocicleta kawasakiNinja = new Motocicleta("ZX4R","Kawasaki", 400.0, 2019, true, 0, motorGTI, true);
        kawasakiNinja.fabricante = "Kawasaki";
        kawasakiNinja.modelo = "ZX4R";

        System.out.println("fin de programa");

        //3. Polimorfismo
         vehicle vehicle;

         vehicle = new Coche();
         vehicle.acelerar(50);

         vehicle  = new Camion();
        vehicle.acelerar(50);

         vehicle = new Motocicleta();
        vehicle.acelerar(50);

        //4. Clases abstractas: no se instanciar. solo instancia las clases hijas
    }
}
