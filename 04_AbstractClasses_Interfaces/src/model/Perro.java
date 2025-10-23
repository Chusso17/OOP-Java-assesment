/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author chuch
 */
public class Perro extends Animal {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau");
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Nombre: "+super.getNombre()+"\n Edad: "+super.getEdad()+"\n Animal: Perro");
    }
}
