/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import model.Empleado;
import model.EmpleadoPorHoras;
import model.EmpleadoTiempoCompleto;

/**
 *
 * @author chuch
 */
public class MainEmpresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empleado[] plantilla = new Empleado[3];
        EmpleadoPorHoras empleado1 = new EmpleadoPorHoras(5, 123, "Pepe", 0);
        EmpleadoTiempoCompleto empleado2 = new EmpleadoTiempoCompleto(3, "Maria", 2000);
        EmpleadoTiempoCompleto empleado3 = new EmpleadoTiempoCompleto(0, "Jose", 1800);
        plantilla[0]=empleado1;
        plantilla[1]=empleado2;
        plantilla[2]=empleado3;
        
        for (Empleado e : plantilla) {
            e.mostrarInfo();
        }
        
        System.out.println(empleado1.calcularSalario());
        System.out.println(empleado2.calcularSalario());
    }   
}
