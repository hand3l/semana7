//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("---------SIN PARAMETROS----------");
        Auto auto1 = new Auto();
        auto1.mostrarDatos();
        auto1.prenderRadio();
        System.out.println(" ");

        System.out.println("-------CON PARAMETROS PADRE E HIJA---------- ");
        Auto auto2 = new Auto(5, 60.0, "Gasolina",80);
        auto2.mostrarDatos();
        auto2.prenderRadio();
        System.out.println(" ");

        System.out.println("---------ELEMENTOS CLASE PADRE----------");
        Auto auto3 = new Auto(6,100);
        auto3.mostrarDatos();
        auto3.prenderRadio();
        System.out.println(" ");

        System.out.println("----SOLO HIJA Y DESPUES SETEO-----------");
        Auto auto4 = new Auto("Diesel", 200);
        auto4.setCapacidad(8);
        auto4.setVelocidad(90);
        auto4.mostrarDatos();
        auto4.prenderRadio();
        System.out.println(" ");

        System.out.println("---------SIN PARAMETROS----------");
        Bicicleta bicicleta1 = new Bicicleta();
        bicicleta1.mostrarDatos();
        bicicleta1.prenderLuces();
        System.out.println(" ");

        System.out.println("-------CON PARAMETROS------------ ");
        Bicicleta bicicleta2 = new Bicicleta(10, 80.0, "Montañera",24);
        bicicleta2.mostrarDatos();
        bicicleta2.prenderLuces();
        System.out.println(" ");

        System.out.println("---------ELEMENTOS CLASE PADRE----------");
        Avion avion1 = new Avion();
        avion1.mostrarDatos();
        avion1.darAviso();
        System.out.println(" ");

        Avion avion2 = new Avion(4, 60.0, "Militar",45);
        avion2.mostrarDatos();
        avion2.darAviso();

//terminar hacer de todos
    }
}

