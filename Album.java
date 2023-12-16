import java.util.ArrayList;
// Album is a child class of Collections
// Represents a list of songs made by an artist
public class Album extends Collections{
    // Artist variable to represent who made the album
    private String artist;
    // Overloaded Constructor to set the album title and artist it's by
    public Album(String title, String artist){
        super(title);
        this.artist = artist;
    }

    // method to add a song or podcast to the album 
    public void addContent(Content content){
        this.contentList.add(content);
    }
    // method to remove a song or podcast from the album
    public void removeContent(Content content){
        this.contentList.remove(content);
    }

    // method to play the album from beginning to end
    public void play(){
        ArrayList<Content> album = getContentList();
        for(Content content : album){
            content.play();
        }
    }

    // String representation of the album, prints out all of its contents and attributes
    public String toString(){
        String thisAlbum = "";
        int numSong = 1;
        thisAlbum += "Album: " + this.title + "\n";
        for (Content s : this.contentList){
            thisAlbum += numSong + ". " + s.title + "\n";
            numSong++;
        }
        return thisAlbum;
    }
    // Accessor to get the artist who made the album
    public String getArtist(){
        return this.artist;
    }
    // Mutator to set that artist who made the album
    public void setArtist(String artist){
        this.artist = artist;
    }
}