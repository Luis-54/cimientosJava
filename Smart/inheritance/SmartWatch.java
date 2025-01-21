package Smart.inheritance;

import Smart.Class.Atributes;

public class SmartWatch extends Atributes {

    public boolean latidosPorMinuto;
    public boolean presionArterial;
    public boolean oximetria;
    public boolean estress;

    public SmartWatch(){

    }

    public SmartWatch(boolean latidosPorMinuto, boolean presionArterial, boolean oximetria, boolean estress) {
        this.latidosPorMinuto = latidosPorMinuto;
        this.presionArterial = presionArterial;
        this.oximetria = oximetria;
        this.estress = estress;
    }

    public SmartWatch(String marca, String modelo, String sistemaOperativo, String color, int numCamaras, boolean latidosPorMinuto, boolean presionArterial, boolean oximetria, boolean estress) {
        super(marca, modelo, sistemaOperativo, color, numCamaras);
        this.latidosPorMinuto = latidosPorMinuto;
        this.presionArterial = presionArterial;
        this.oximetria = oximetria;
        this.estress = estress;
    }
}
