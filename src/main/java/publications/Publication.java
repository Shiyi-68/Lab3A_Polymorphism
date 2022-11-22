package publications;

import interfaces.IReceiveRating;

import java.time.LocalDate;
import java.util.Date;

//TASK 2: create an abstract class
public abstract class Publication implements IReceiveRating {

    //properties
    private String name;
    private LocalDate publicationDate;
    private String publisher;
    private double price;
    private int numOfPages;

    //constructor
    public Publication(String name, LocalDate publicationDate, String publisher, double price, int numOfPages){
        this.name = name;
        this.publicationDate = publicationDate;
        this.publisher = publisher;
        this.price = price;
        this.numOfPages = numOfPages;
    }

    //getters & setters
    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public LocalDate getPublicationDate(){
        return this.publicationDate;
    }

    public void setPublicationDate(LocalDate publicationDate){
        this.publicationDate = publicationDate;
    }

    public String getPublisher(){
        return this.publisher;
    }

    public void setPublisher(String publisher){
        this.publisher = publisher;
    }

    public double getPrice(){
        return this.price;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public int getNumOfPages(){
        return this.numOfPages;
    }

    public void setNumOfPages(int numOfPages){
        this.numOfPages = numOfPages;
    }

    //TASK 6: Define an abstract method in the super-class
    public abstract String becomeDusty();

    //TASK 7: implement interface on class
    public String receiveRating(int rate){
        return String.format("Average rating: %s out of 10.", rate);
    }

}
