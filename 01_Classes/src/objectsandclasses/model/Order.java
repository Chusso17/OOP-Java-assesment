/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectsandclasses.model;

/**
 *
 * @author chuch
 */
public class Order {
   String code;
   String product;
   int quantity;
   double unitPrice;

    public Order(String code, String product, int quantity, double unitPrice) {
        this.code = code;
        this.product = product;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
    }
   
   public double calculateAmount(){
       return quantity*unitPrice;
   }
   
   public void showSummary(){
       System.out.println("Order: "+this.code);
       System.out.println("Product: "+this.product);
       System.out.println("Quantity: "+this.quantity);
       System.out.println("Unit Price:"+this.unitPrice);
       System.out.println("Total amount: "+calculateAmount());
   }
}
