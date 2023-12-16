import java.util.Random;
import java.util.ArrayList;
// Collections is an abstract class that will act as the parent class for Playlist and Album
// Acts as the representation of multiple songs in a single list
public abstract class Collections implements Comparable<Collections>{
    // Represents the title of the collection (ArrayList)
    protected String title;
    // The list of Content is stored in this variable
    protected ArrayList<Content> contentList;

    Random randy = new Random();

    // Overloaded Constructor to set the title of the collections and initalizes the content list
    public Collections(String title){
        this.title = title;
        this.contentList = new ArrayList<Content>();
    }

    // Abstract methods to be implemented in the child classes
    public abstract void addContent(Content content);
    public abstract void removeContent(Content content);
    public abstract String toString();

    // Accessor to get the current content list 
    public ArrayList<Content> getContentList(){
        return this.contentList;
    }

    // Mutator to set the current content list
    public void setContentList(ArrayList<Content> contentList){
        this.contentList = contentList;
    }

    // Accessor to get the title of the list
    public String getTitle(){
        return this.title;
    }

    // Mutator to set or change the title of the list
    public void setTitle(String title){
        this.title = title;
    }
    
    // using the earlier implemented Comparable interface, writes the compare to method
    // returns negative if the current content list is less than this other one
    // returns positive if opposite
    // returns 0 if they are equal
    public int compareTo(Collections o){
        return this.contentList.size() - o.contentList.size();
    }
}