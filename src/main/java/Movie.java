import interfaces.IReceiveRating;

public class Movie implements IReceiveRating {

    private String name;
    private String genre;
    private int length;

    public Movie(String name, String genre, int length){
        this.name = name;
        this.genre = genre;
        this.length = length;
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getGenre(){
        return this.genre;
    }

    public void setGenre(String genre){
        this.genre = genre;
    }

    public int getLength(){
        return this.length;
    }

    public void setLength(int length){
        this.length = length;
    }

    //TASK 7: implement interface on class
    public String receiveRating(int rate){
        return String.format("Average rating of this movie: %s out of 10.", rate);
    }


}
