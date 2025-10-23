/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

import model.*;

/**
 *
 * @author chuch
 */
public class MainAnimales {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Animal[] animales = new Animal[5];
        Perro perro1 = new Perro("Firulais", 7);
        Gato gato1 = new Gato("Michi", 5);
        Pajaro pajaro1 = new Pajaro("Pollo", 1);
        Pez pez1 = new Pez("Burbuja", 1);
        Pato pato1 = new Pato("Lucas", 2);
        Volador volar1 = new Pajaro("Paloma", 1);
        Nadador nadar1 = new Pez("Nemo",1);
        
        animales[0]=perro1;
        animales[1]=gato1;
        animales[2]=pajaro1;
        animales[3]=pez1;
        animales[4]=pato1;
        
        for (Animal a: animales){
            a.mostrarInfo();
            a.hacerSonido();
        }
        
        volar1.volar();
        nadar1.nadar();
        
        
    }
    
}
