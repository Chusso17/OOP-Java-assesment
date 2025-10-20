/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chuch
 */
public class EmpleadoTiempoCompleto extends Empleado {
    private int horasExtra;
    private final double COBRO_HORA_EXTRA=25;

    public int getHorasExtra() {
        return horasExtra;
    }

    public void setHorasExtra(int horasExtra) {
        this.horasExtra = horasExtra;
    }

    public EmpleadoTiempoCompleto(int horasExtra, String nombre, double salarioBase) {
        super(nombre, salarioBase);
        this.horasExtra = horasExtra;
    }
    
    @Override
    public double calcularSalario(){
        return salarioBase+(horasExtra*COBRO_HORA_EXTRA);
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Nombre del empleado: "+this.nombre+"\nSalario base del empleado: "+this.salarioBase+"\nHoras extra trabajadas: "+this.horasExtra);
    }
}
