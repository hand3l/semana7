public class Auto extends Transporte{
    String tipo;
    int cilindraje;

//SIN PARAMETROS
    public Auto() {
    }

//PADRE E HIJA
    public Auto(int capacidad, double velocidad, String  tipo, int cilindraje) {
        super(capacidad, velocidad);
        this.tipo = tipo;
        this.cilindraje = cilindraje;
    }

//SOLO PADRE
    public Auto(String tipo, int cilindraje) {
        this.tipo = tipo;
        this.cilindraje = cilindraje;
    }

//SOLO HIJA
    public Auto(int capacidad, double velocidad) {
        super(capacidad, velocidad);
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    //Metododo perzonalizadp
    public void prenderRadio(){
        System.out.println("Tipo: " + tipo);
        System.out.println("Cilindraje: " + cilindraje);
    }

}
