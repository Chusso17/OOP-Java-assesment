/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02_encapsulation.main;

import pkg02_encapsulation.model.Book;
import pkg02_encapsulation.model.Library;

/**
 *
 * @author chuch
 */
public class Main {
    public static void main(String[] args){
    Book book1 = new Book("Don Quixote", "Miguel de Cervantes", 20);
    /*book1.borrowCopy();*/
    Book book2 = new Book("Moby Dick", "Horman Melville", 25);
    Book book3 = new Book("1984", "George Orwell", 10);
    Book[] bookSet = {book1, book2, book3};
    
    Library shelf = new Library(bookSet);
    shelf.showAllBooks();
        for (int i = 0; i < 3; i++) {
            book1.borrowCopy();
        }
        System.out.println("copies: "+book1.getAvailableCopies());
        //book1.availableCopies=9999;
    }
}
