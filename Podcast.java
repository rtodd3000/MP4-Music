import java.util.ArrayList;
// child class of content that represents podcasts
public class Podcast extends Content{
    // has unique variable to represent the episode count
    private int epNum;
    // Overloaded Constructor to set the title, author, and episode # 
    public Podcast(String title, String author, int epNum){
        super(title, author, 0);
        this.epNum = epNum;
    }
    
    // play method to play the Podcast, increments streams by 1 when called
    public void play(){
        numStreams += 1;
        System.out.println("You just streamed podcast: " + this.title);
    }
    // String representation of a Podcast, prints out all general attributes + the episode count
    public String toString(){
        return "Title: " + this.title + "\nArtist: " + this.author + "\nStreams: " + this.numStreams + "\nEpisode Count: " + this.epNum;
    }
    
    // Accessor to get the episode count of the Podcast
    public int getEpNum(){
        return this.epNum;
    }

    // Mutator to set the episode count of the Podcast
    public void setEpNum(int epNum){
        this.epNum = epNum;
    }
}