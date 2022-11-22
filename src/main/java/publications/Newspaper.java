package publications;

import java.time.LocalDate;

//TASK 3: sub-class 3
public class Newspaper extends Publication{

    private String type;

    public Newspaper(String name, LocalDate publicationDate, String publisher, double price, int numOfPages, String type){
        super(name, publicationDate, publisher, price, numOfPages);
        this.type = type;
    }

    //TASK 6: implement abstract method in each of the sub-class
    public String becomeDusty(){
        return "All right but before throwing them away, newspapers are perfect for window cleaning!";
    }

    public String getType(){
        return this.type;
    }

    public void setType(String type){
        this.type = type;
    }

}
