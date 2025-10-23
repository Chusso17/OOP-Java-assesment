/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;


/**
 *
 * @author chuch
 */
public class Pato extends Animal implements Volador, Nadador {

    public Pato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println("Quack quack");
    }

    @Override
    public void volar() {
        System.out.println("El pato vuela alto en el cielo");
    }

    @Override
    public void nadar() {
        System.out.println("El pato nada por el lago");
    }
    
    @Override
    public void mostrarInfo(){
        System.out.println("Nombre: "+super.getNombre()+"\n Edad: "+super.getEdad()+"\n Animal: Pato");
    }
}
