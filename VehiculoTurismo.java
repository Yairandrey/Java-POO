package poo;

public class VehiculoTurismo extends Vehiculo {

    private int numeroPuertas;

    public VehiculoTurismo(int numeroPuertas, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.numeroPuertas = numeroPuertas;
    }

    public int getNumeroPuertas() {
        return numeroPuertas;
    }

    public void setNumeroPuertas(int numeroPuertas) {
        this.numeroPuertas = numeroPuertas;
    }

    @Override
    public String mostrarDatos() {
        return "matricula: " + matricula + "  "
                + "marca: " + marca + " "
                + " modelo: " + modelo + " "
                + "numero de puertas: " + numeroPuertas;
    }
}
