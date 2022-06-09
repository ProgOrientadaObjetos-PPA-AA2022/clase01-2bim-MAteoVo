/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete1;

/**
 *
 * @author mateovalarezoojeda
 */
public class Vehiculo {
    private String tipo;
    private String matricula;
    private double valor;
    public Vehiculo(String tip,String ma,double va){
        tipo = tip;
        matricula = ma;
        valor = va;
    }
    public void establecerTipo(String tip){
        tipo = tip;
    }
    public String obtenerTipo(){
        return tipo;
    }
    public void establecerMatricula(String ma){
        matricula = ma;
    }
    public String obtenerMatricula(){
        return matricula;
    }
    public void establecerValor(double va){
        valor = va;
    }
    public double obtenerValor(){
        return valor;
    }
}
