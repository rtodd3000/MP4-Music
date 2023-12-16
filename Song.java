// Child class of content that represents a single song
public class Song extends Content{
    
    // Overloaded Constructor that sets the title, author, and numStreams
    // numStreams set to 0
    public Song(String title, String author){
        super(title, author, 0);
    }
    
    
    // play method to play the Song, increments streams by 1 when called
    public void play(){
        numStreams += 1;
        System.out.println("You just streamed " + this.title + " by " + this.author);
    }
    // String representation of a song, prints out all of its attributes
    public String toString(){
        return "Title: " + this.title + "\nArtist: " + this.author + "\nStreams: " + this.numStreams + "\n";
    }


}