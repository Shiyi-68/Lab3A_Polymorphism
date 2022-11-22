package stores;

import publications.Publication;

import java.util.ArrayList;

public class Store {

    private String name;
    private ArrayList<Publication> publications;

    public Store(String name){
        this.name = name;
        this.publications = new ArrayList<>();
    }

    public String getName(){
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public ArrayList<Publication> getPublications(){
        return publications;
    }

    public void setPublications(ArrayList<Publication> publications){
        this.publications = publications;
    }

    public int countPublications(){
        return this.publications.size();
    }

    public void addPublication(Publication publication){
        this.publications.add(publication);
    }

}
