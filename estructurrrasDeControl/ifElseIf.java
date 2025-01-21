

public class ifElseIf{

    @SuppressWarnings("ConvertToStringSwitch")
    public static void main(String[] args) {
        
        String dia = "Martes";

        boolean resultado = dia.equals("Sabado");
        boolean resultadoComparrarNUm = 10 > 5;
        System.out.println(resultado);
        System.out.println(resultadoComparrarNUm);

        if(dia.equals("Lunes")){
            System.out.println(" Es Lunes a empezar la semana");
        } else if(dia.equals("Martes")) {
            System.out.println(" Martes uh");
        } else if(dia.equals("Miercoles")) {
            System.out.println(" Miercoles nah es mitad de semana");
        } else if(dia.equals("Jueves")) {
            System.out.println(" Jueves ya casi viernes");
        } else if(dia.equals("Viernes")) {
            System.out.println(" Viernes de tomar pichar y pelear");
        } else if(dia.equals("Sabado")) {
            System.out.println(" Sabado de ir a la playa");
        } else if(dia.equals("Domingo")) {
            System.out.println(" Domingo de Reflexion");
        }
        
        
    }
}
