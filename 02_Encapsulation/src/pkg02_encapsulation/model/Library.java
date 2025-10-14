/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02_encapsulation.model;

/**
 *
 * @author chuch
 */
public class Library {
    private Book[] books;
    

    public Library(Book[] books) {
        if (books.length>3) this.books = books;
        else System.out.println("library must register with at least 3 books");
    }

    public Book[] getBooks() {
        return books;
    }
    
    public void showAllBooks(){
        for (Book book : books) {
            System.out.println(book.toString());
        }
    }
    
    private int countBooks(){
        if (books.length==0){
            System.out.println("Received empty array");
            return 0;
        }
        int counter=0;
        for (Book b:books){
            if (b.getTitle()!=null){
                counter++;
            } 
        }
        return counter;
    }
}
