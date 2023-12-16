import java.util.ArrayList;
// Abstract class Content that acts as the parent class of Songs and Podcasts
// Implements comparable so that we can use it to organize the content later on
public abstract class Content implements Comparable<Content>{
    // variables that represent the general attributes of content
    // protected so that the child classes can access them
    protected String title;
    protected String author;
    protected int numStreams;
    

    // Overloaded Constructor that is used to set the title, author, and numStreams of each new content
    public Content(String title, String author, int numStreams){
        this.title = title;
        this.author = author;
        this.numStreams = numStreams;
    }

    // abstract methods play and toString to be implemented in the child classes
    public abstract void play();
    public abstract String toString();

    // using the earlier implemented Comparable interface, writes the compare to method
    // returns negative if the current content list is less than this other one
    // returns positive if opposite
    // returns 0 if they are equal
    public int compareTo(Content other){
        return this.numStreams - other.numStreams;
    }

    // Accessor to get the title of the Content
    public String getTitle(){
        return this.title;
    }

    // Accessor to get the number of streams of the Content
    public int getNumStreams(){
        return this.numStreams;
    }

    // Accessor to get the author of the content
    public String getAuthor(){
        return this.author;
    }

    // Mutator to set/change the title of the Content
    public void setTitle(String title){
        this.title = title;
    }

    // Mutator to set/change the number of streams of the Content
    public void setNumStreams(int numStreams){
        this.numStreams = numStreams;
    }

    // Mutator to set/change the author of the Content
    public void setAuthor(String author){
        this.author = author;
    }
    
}