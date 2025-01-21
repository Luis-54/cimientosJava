

public class Functions {
    
    public static void main(String[] args) {
        
        // OptionOne funcion sin parametros y sin tipo de retorno
        ShowMenu();



        // OptionTwo funciona sin parametros y con tipo de retorno
        String menu = GetMenu();
        System.out.println(menu);

        double price = GetPrice();
        System.out.println(price);

        // OptionThree funcion con parametros y sin tipo de retorno
        imprimirSaludoBuenosDias("OpenBootcamp");

        // OptionFour funcion con parametros y con tipo de retorno
        String nombre = "Alan";
        String apellido = "Garcia";
        String saludo = ObtenerSaludo(nombre, apellido);
        System.out.println(saludo);
        
        int resultado = suma(200, 300);
        System.out.println(resultado);

        // OptionFive funcion anonima
        //() --> System.out.println();

        //Crear una funcion que reciba un precio y devuelva el precio con el iva incluido
        double precioIva = getPriceIva(100, 19);
        System.out.println(precioIva);
        
        
    }

        //Metodos para las funciones

        //Crear una funcion que reciba un precio y devuelva el precio con el iva incluido
    static double getPriceIva (double price, double vatPercentage) {
        return price + (price * vatPercentage / 100);
    }

    static int suma(int a, int b) {
        return a + b;
    }

    static String ObtenerSaludo(String nombre, String apellido) {
        return "Buenas tardes " + nombre + " " + apellido;
            
    }

    static void imprimirSaludoBuenosDias(String name){
        System.out.println("Buenos dias " + name);
    }
        
            
    static double GetPrice(){
        return 100.99;
    }
        
        
            // void sin parametros no devuelve nada
    static void ShowMenu(){
        System.out.println("Bienvenidos al E-comerce de Zapatillas");
        System.out.println("1 - Ver zapatillas");
        System.out.println("2 - Comprar zapatillas");
        System.out.println("3 - Salir");
            
    }

    static String GetMenu(){
        return "Bienvenidos al E-comerce de Zapatillas: \n 1 - Ver zapatillas...";


    }



}


