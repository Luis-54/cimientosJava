package rrepeticion;


public class While {
    
    public static void main(String[] args) {
        
        //Repeteicion Infinita
        //while(true){
            //System.out.println("Hola Mundo!");
        //}

        int contador = 0;

        while(contador <= 10){
            String nombre = "Prueba"; //Solo se ejecuta dentro del bucle
            System.out.println("Hola Mundo!" + contador);
            contador ++;
            if (contador == 5){
                break; //Rompe el ciclo/Bucle
                //continue; Salta a la siguiente iteración no imprime el 5
            }
        }

    }

}
