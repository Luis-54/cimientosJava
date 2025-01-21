package estructurrasDeControl;

public class Switch{

    public static void main(String[] args) {
        
        String dia = "domingo";

        switch (dia) { //forma 1 del switchcase
            case "lunes":
            System.out.println("Es un dia de la semana");
            break;
            case "martes":
            System.out.println(" Es marte Uh");
            break;
            case "miercoles":
            System.out.println(" Es miercoles Uh");
            break;
            case "jueves":
            System.out.println(" Es jueves Uh");
            break;
            case "viernes":
            System.out.println(" Es viernes waow");
            break;
            case "sabado":
            System.out.println(" Es sabado waow");
            break;
            case "domingo":
            System.out.println(" Es domingo waow");
            break;
        default:
        System.out.println("No es un dia de la semana");
        }

            //forma 2 del switchcase
        switch (dia) {
            case "lunes" -> System.out.println("Es un dia de la semana");
            case "martes" -> System.out.println(" Es marte Uh");
            case "miercoles" -> System.out.println(" Es miercoles Uh");
            case "jueves" -> System.out.println(" Es jueves Uh");
            case "viernes" -> System.out.println(" Es viernes waow");
            case "sabado" -> System.out.println(" Es sabado waow");
            case "domingo" -> System.out.println(" Es domingo waow");
            default -> System.out.println("No es un dia de la semana");
        }

    }

}