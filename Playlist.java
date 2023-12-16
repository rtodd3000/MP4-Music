import java.util.ArrayList;
// Playlist class that is a child of Collections 
// Is a representation of a playlist a Listener can create
public class Playlist extends Collections{
    
    // Overloaded Constructor to set the title of the created playlist
    public Playlist(String title){
        super(title);
    }

    // method to add songs or podcasts to the playlist
    public void addContent(Content content){
        this.contentList.add(content);
    }
    // method to remove songs or podcasts from the playlist
    public void removeContent(Content content){
        this.contentList.remove(content);
    }

    
    // shuffle method that is used to play a playlist
    public void shuffle(){
        ArrayList<Content> playlist = getContentList();
        if (!playlist.isEmpty()){
            int randomIndex = randy.nextInt(playlist.size());
            Content curContent = playlist.get(randomIndex);
            curContent.play();
        }
    }  
    
    // String representation of the Playlist
    // Prints out each content and its attributes.
    public String toString(){
        String thisPlaylist = "";
        int numSong = 1;
        thisPlaylist += "Playlist: " + this.title + "\n";
        for (Content s : this.contentList){
            thisPlaylist += numSong + ". " + s.title + "\n";
            numSong++;
        }
        return thisPlaylist;
        
    }
}

