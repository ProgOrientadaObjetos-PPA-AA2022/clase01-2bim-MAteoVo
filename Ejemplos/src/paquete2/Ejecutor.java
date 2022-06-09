/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete2;
import paquete1.Edificio;
import paquete1.Empresa;
import paquete1.Vehiculo;
/**
 *
 * @author reroes
 */
public class Ejecutor {
    public static void main(String[] args) {
        
        // Crear una arreglo de 4 elementos de tipo Edificio
        Edificio edf1 = new Edificio("Edificio central");
        edf1.establecerCostos(20000);
        Edificio edf2 = new Edificio("Edificio norte");
        edf2.establecerCostos(30000);
        Edificio edf3 = new Edificio("Edificio sur");
        edf3.establecerCostos(10000);
        Edificio edf4 = new Edificio("Edificio secundario");
        edf4.establecerCostos(5000);
        Edificio listaEdificios[] = {edf1, edf2,edf3,edf4};
        Vehiculo ve1 = new Vehiculo("Auto","LBB0011",10000);
        Vehiculo ve2 = new Vehiculo("Camioneta","LCB0011",20000);
        Vehiculo ve3 = new Vehiculo("Auto","LBD0012",6000);
        Vehiculo ve4 = new Vehiculo("Camioneta","LCC0011",10000);
        Vehiculo ve5 = new Vehiculo("Camioneta","LDC0011",25000);
        Vehiculo vehiculos[] = {ve1,ve2,ve3,ve4,ve5};
//        System.out.println(listaEdificios[2].obtenerCosto());
//        double c = listaEdificios[2].obtenerCosto();
//        System.out.println(c);
        // Crear un objeto de tipo Empresa:
        Empresa emp = new Empresa();
        emp.establecerNombre("Empresa de Hojas");
        emp.establecerEdificios(listaEdificios);
        emp.establecerVehiculos(vehiculos);
        emp.establecerCostoVehiculos();
        emp.establecerCostoBienesInmuebles();
        emp.establecerCostoBienes();
//        System.out.printf("%.2f",emp.obtenerCostoBienesInmuebles());
        System.out.printf("%s",emp);
        //  Nombre: Empresa de Hojas
        //  Lista de edificio: edf1, edf2, edf3, edf4
        
        // Imprimir el costo de los bienes inmuebles de la empresa
    }
}
