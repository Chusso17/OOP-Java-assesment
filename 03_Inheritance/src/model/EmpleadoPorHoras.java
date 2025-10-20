/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chuch
 */
public class EmpleadoPorHoras extends Empleado {
    private int horasTrabajadas;
    private double tarifaHora;

    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }

    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }

    public double getTarifaHora() {
        return tarifaHora;
    }

    public void setTarifaHora(double tarifaHora) {
        this.tarifaHora = tarifaHora;
    }

    public EmpleadoPorHoras(int horasTrabajadas, double tarifaHora, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.horasTrabajadas = horasTrabajadas;
        this.tarifaHora = tarifaHora;
    }
    
    @Override
    public double calcularSalario(){
        return this.salarioBase+(this.horasTrabajadas*tarifaHora);
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Nombre del empleado: "+this.nombre+"\nSalario base del empleado: "+this.salarioBase+"\nHoras de trabajo: "+this.horasTrabajadas+"\nCobro por hora: "+this.tarifaHora);
    }
}
