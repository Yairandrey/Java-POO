
package poo;


public class VehiculoDeportivo extends Vehiculo{
    
    private int cilindraje;

    public VehiculoDeportivo(int clindraje, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.cilindraje = clindraje;
    }

    public int getClindraje() {
        return cilindraje;
    }

    public void setClindraje(int clindraje) {
        this.cilindraje = clindraje;
    }
    
    @Override
    public String mostrarDatos(){
        return "matricula: " + matricula + "  "
                + "marca: " + marca + " "
                + " modelo: " + modelo + " "
                +" cilindraje: "+ cilindraje;
    }
}
