package publications;

import java.time.LocalDate;

//TASK 3: sub-class 2
public class Magazine extends Publication{

    private boolean onlineMagazine;

    public Magazine(String name, LocalDate publicationDate, String publisher, double price, int numOfPages, boolean onlineMagazine){
        super(name, publicationDate, publisher, price, numOfPages);
        this.onlineMagazine = onlineMagazine;
    }

    //TASK 6: implement abstract method in each of the sub-class
    public String becomeDusty(){
        return "It's useless now. Throw it away!";
    }

    public boolean getOnlineMagazine(){
        return this.onlineMagazine;
    }

    public void setOnlineMagazine(boolean onlineMagazine){
        this.onlineMagazine = onlineMagazine;
    }



}
