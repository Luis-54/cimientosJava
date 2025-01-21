package Smart.Class;

public class Atributes {

    // 1. Atributos.

    protected String marca;
    protected String modelo;
    protected String sistemaOperativo;
    protected String color;
    protected int numCamaras = 0;


    // 2. Constructores

    public Atributes(){

    }

    public Atributes(String marca, String modelo, String sistemaOperativo, String color, int numCamaras) {
        this.marca = marca;
        this.modelo = modelo;
        this.sistemaOperativo = sistemaOperativo;
        this.color = color;
        this.numCamaras = numCamaras;
    }



}
