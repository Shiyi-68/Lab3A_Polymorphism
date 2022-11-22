package publications;

import java.time.LocalDate;

//TASK 3: sub-class 1
public class Book extends Publication{

    private boolean inBestSellerList;
    private boolean haveAudioBookVersion;
    private String description;

    public Book(String name, LocalDate publicationDate, String publisher, double price, int numOfPages, boolean inBestSellerList, boolean haveAudioBookVersion, String description){
        super(name, publicationDate, publisher, price, numOfPages);
        this.inBestSellerList = inBestSellerList;
        this.haveAudioBookVersion = haveAudioBookVersion;
        this.description = description;
    }

    //TASK 6: implement abstract method in each of the sub-class
    public String becomeDusty(){
        return "This book is full of dust, either read it or sell it to someone who would treasure it!";
    }

    //TASK 5: implement method overload
    public String becomeDusty(String description){
        return String.format("%s but end up dusty in your shelf. If you don't read it, why buy it in the first place?", description);
    }

    public boolean getInBestSellerList(){
        return this.inBestSellerList;
    }

    public void setInBestSellerList(boolean inBestSellerList){
        this.inBestSellerList = inBestSellerList;
    }

    public boolean getHaveAudioBookVersion(){
        return this.haveAudioBookVersion;
    }

    public void setHaveAudioBookVersion(boolean haveAudioBookVersion){
        this.haveAudioBookVersion = haveAudioBookVersion;
    }

    public String getDescription(){
        return this.description;
    }

    public void setDescription(String description){
        this.description = description;
    }




}
