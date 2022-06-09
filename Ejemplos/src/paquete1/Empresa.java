/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

/**
 *
 * @author reroes
 */
public class Empresa {
    private String nombre;
    private Edificio [] edificios;
    private Vehiculo[] vehiculos;
    private double costoVehiculos;
    private double costoBienes;
    private double costoBienesInmuebles;
    
    public void establecerNombre(String m){
        nombre = m;
    }
    
    public void establecerEdificios(Edificio[] m){
        edificios = m;
    }
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public Edificio[] obtenerEdificios(){
        return edificios;
    }
    public void establecerVehiculos(Vehiculo[] x){
        vehiculos = x;
    }
    public Vehiculo[] obtenerVehiculos(){
        return vehiculos;
    }
    
    public void establecerCostoVehiculos(){
        for (int i = 0; i < vehiculos.length; i++) {
            costoVehiculos+=vehiculos[i].obtenerValor();
        }
    }
    public double obtenerCostoVehiculos(){
        return costoVehiculos;
    }
    public void establecerCostoBienes(){
        costoBienes = costoBienesInmuebles+costoVehiculos;
    }
    public double obtenerCostoBienes(){
        return costoBienes;
    }
    public void establecerCostoBienesInmuebles(){
        for (int i = 0; i < edificios.length; i++) {
            costoBienesInmuebles+=edificios[i].obtenerCosto();
        }
    }
    public double obtenerCostoBienesInmuebles(){
        return costoBienesInmuebles;
    }
    public String toString(){
        String cadena = String.format("%s\nLista de Edificios\n",nombre);
        for (int i = 0; i < edificios.length; i++) {
            cadena = String.format("%s%d. %s (%.2f)\n",cadena,(i+1),edificios[i].obtenerNombre().toUpperCase(),edificios[i].obtenerCosto());
        }
        cadena = String.format("%sTotal de inmuebles %.2f\n\nLista de Vehiculos\n",cadena,costoBienesInmuebles);
        for (int i = 0; i < vehiculos.length; i++) {
            cadena = String.format("%s%d. %s, %s (%.2f)\n",cadena,(i+1),vehiculos[i].obtenerTipo(),vehiculos[i].obtenerMatricula(),vehiculos[i].obtenerValor());
        }
        cadena = String.format("%sTotal de costo vehiculos: %.2f\n\nTotal de bienes %.2f\n",cadena,costoVehiculos,costoBienes);
        return cadena;
    }
}
