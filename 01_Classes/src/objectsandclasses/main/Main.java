/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package objectsandclasses.main;

import objectsandclasses.model.Order;

/**
 *
 * @author chuch
 */
public class Main {

    public static void main(String[] args) {
        Order o1, o2, o3;
        o1 = new Order("00001", "Keyboard", 4, 50);
        o2 = new Order("00002", "mouse", 2, 20);
        o3 = new Order("00003", "monitor", 3, 60);
        
        o1.showSummary();
        o2.showSummary();
        o3.showSummary();
        
        System.out.println(o1.calculateAmount());
        System.out.println(o2.calculateAmount());
        System.out.println(o3.calculateAmount());
    }
    
}
