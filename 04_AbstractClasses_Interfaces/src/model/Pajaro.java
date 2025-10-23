/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author chuch
 */
public class Pajaro extends Animal implements Volador{

    public Pajaro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void volar() {
        System.out.println("El pajaro vuela alto");
    }
    
    @Override
    public void hacerSonido() {
        System.out.println("Pio pio");
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Nombre: "+super.getNombre()+"\n Edad: "+super.getEdad()+"\n Animal: Pajaro");
    }
}
