package Smart.inheritance;

import Smart.Class.Atributes;

public class SmarPhone extends Atributes {

    int estuches;
    double bateria;


    // Constructor
    public SmarPhone(){

    }

    public SmarPhone(String marca, String modelo, String sistemaOperativo, String color, int numCamaras, int estuches, double bateria) {
        super(marca, modelo, sistemaOperativo, color, numCamaras);
        this.estuches = estuches;
        this.bateria = bateria;
    }

    // 3. Metodos
    public void cantidad(int quantity){
        this.estuches += quantity;
    }
}
