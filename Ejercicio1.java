package poo;

import java.util.Scanner;

public class Ejercicio1 {
    //polimorfismo: un objeto de la superclase almacena clases hijas. 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Vehiculo misVehiculos[] = new Vehiculo[4];
        Vehiculo m = new VehiculoDeportivo(200, "H67", "Ferrari", "A08");
        for (int i = 0; i < misVehiculos.length; i++) {
            System.out.print("Ingresa matricula auto " + (i + 1) + ": ");
            String matricula = sc.next();
            System.out.print("Ingresa marca: ");
            String marca = sc.next();
            System.out.print("Ingresa modelo: ");
            String modelo = sc.next();
            tipoVehiculo();
            System.out.print("Opcion: ");
            int opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    System.out.print("Ingresa numero de puertas: ");
                    int puertas = sc.nextInt();
                    misVehiculos[i] = new VehiculoTurismo(puertas, matricula, marca, modelo);
                    break;
                case 2:
                    System.out.print("Ingresa cilindraje: ");
                    int cilindraje = sc.nextInt();
                    misVehiculos[i] = new VehiculoDeportivo(cilindraje, matricula, marca, modelo);
                    break;
                case 3:
                    System.out.print("Ingresa carga: ");
                    int carga = sc.nextInt();
                    misVehiculos[i] = new VehiculoFurgoneta(carga, matricula, marca, modelo);
                    break;
                default:
                    System.out.println(" ---------------");
                    misVehiculos[i] = null;
                    break;
            }
            if (misVehiculos[i] != null) {
                System.out.println(misVehiculos[i].mostrarDatos());
            }
        }
    }

    public static void tipoVehiculo() {
        System.out.println("1. Turismo");
        System.out.println("2. Deportivo");
        System.out.println("3. Furgoneta");
    }

}
