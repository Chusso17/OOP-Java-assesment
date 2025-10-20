/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chuch
 */
public class Empleado {
    protected String nombre;
    protected double salarioBase;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(double salarioBase) {
        this.salarioBase = salarioBase;
    }

    public Empleado(String nombre, double salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }
    
    public double calcularSalario(){
        return this.salarioBase;
    }
    
    public void mostrarInfo(){
        System.out.println("Nombre del empleado: "+this.nombre+"\nSalario base que cobra: "+this.salarioBase);
    }
}
