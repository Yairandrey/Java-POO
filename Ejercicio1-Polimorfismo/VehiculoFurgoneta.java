
package poo;

public class VehiculoFurgoneta extends Vehiculo{
    
    private int carga;

    public VehiculoFurgoneta(int carga, String matricula, String marca, String modelo) {
        super(matricula, marca, modelo);
        this.carga = carga;
    }

    public int getCarga() {
        return carga;
    }

    public void setCarga(int carga) {
        this.carga = carga;
    }
    
    @Override
    public String mostrarDatos(){
        return "matricula: " + matricula + "  "
                + "marca: " + marca + " "
                + " modelo: " + modelo+ " "
                + "carga: "+  carga;
    }
    
}
