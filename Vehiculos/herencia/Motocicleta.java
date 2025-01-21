package Vehiculos.herencia;

/*
 * Clase Hija o deribada o subclase
 */

import Vehiculos.Clases.Motor;
import Vehiculos.Clases.vehicle;

public class Motocicleta extends vehicle {

    boolean baul;

    public Motocicleta(){

    }

    public Motocicleta(String modelo, String fabricante, Double cc, int year, boolean sport, int speed, Motor motor, boolean baul) {
        super(modelo, fabricante, cc, year, sport, speed, motor);
        this.baul = baul;
    }
}
