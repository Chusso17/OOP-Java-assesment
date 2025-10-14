/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pkg02_encapsulation.model;

/**
 *
 * @author chuch
 */
public class Book {
    private String title;
    private String author;
    private int availableCopies;

    public Book(String title, String author, int availableCopies) {
        this.title = title;
        this.author = author;
        this.availableCopies = availableCopies;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getAvailableCopies() {
        return availableCopies;
    }

    public void setAvailableCopies(int availableCopies) {
        if (availableCopies>0){
            this.availableCopies=availableCopies;
        } else {
            System.out.println("Negative value is not allowed");
        }
    }
    
    public void borrowCopy(){
        availableCopies--;
    }
    
    public void returnCopy(){
        availableCopies++;
    }

    @Override
    public String toString() {
        return "Book{" + "title=" + title + ", author=" + author + ", availableCopies=" + availableCopies + '}';
    }
    
    
}
