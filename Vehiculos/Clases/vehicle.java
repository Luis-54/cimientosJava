package Vehiculos.Clases;


/*
* Clase Base o superClase o clase padre
 */

public class vehicle {
        // 1. Atributos

        protected String modelo;
        protected String fabricante;
        protected Double cc;
        //Double es tipo envoltorio permite poner datos null en la base de datos
        //double es tipo primitivo y no permite el uso de datos null
        protected int year;
        protected boolean sport;
        protected int speed;
        protected   Motor motor; //clase asociada al objeto vehicle


        //2. Constructores
    public vehicle(){
    }

    public vehicle(String modelo, String fabricante, Double cc, int year, boolean sport, int speed, Motor motor) {
        this.modelo = modelo;
        this.fabricante = fabricante;
        this.cc = cc;
        this.year = year;
        this.sport = sport;
        this.speed = speed;
        this.motor = motor;
    }

    public vehicle(String modelo, String fabricante, double cc){//sobreCarga es cuando uso el mismo constructor pero con un atributo diferente
        this.fabricante = fabricante; //se asigna el dato que queremos traer con el constructor
        this.modelo = modelo;
        this.cc = cc;
    }

    //3. Metodos (Comportamiento)
    public void acelerar(int quantity){
        this.speed += quantity;
    }

    //getterr & setter


    //toString


}
