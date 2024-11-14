public class Avion extends Transporte{
    String tipo;
    double altitudmaxima;

    public Avion() {
    }


    public Avion(int capacidad, double velocidad, String tipo, double altitudmaxima) {
        super(capacidad, velocidad);
        this.tipo = tipo;
        this.altitudmaxima = altitudmaxima;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getAltitudmaxima() {
        return altitudmaxima;
    }

    public void setAltitudmaxima(double altitudmaxima) {
        this.altitudmaxima = altitudmaxima;
    }

    //Metodo personalizado
    public void darAviso() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Altitudmaxima: " + altitudmaxima);
    }
}
