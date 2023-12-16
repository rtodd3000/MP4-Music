import java.util.ArrayList;
//Listener account that is of type account, represents the user using the app
public class Listener extends Account{
    
    //arraylist that will hold the users favorited songs or podcasts
    private ArrayList<Content> favorites = new ArrayList<Content>();

    // Overloaded constructor so the user can set the username of their listener account
    public Listener(String username){
        super(username);
    }
    // favorite method to let the users favorite songs
    public void favorite(Content fav){
        favorites.add(fav);
    }
    // toString of Listener
    public String toString(){
        return "Username: "  + getUsername();
    }
    // Accessor to get the current Listener's favorited songs
    public ArrayList<Content> getFavorite(){
        return this.favorites;
    }
    // Mutator to set the current Listener's favorite songs 
    public void setFavorite(ArrayList<Content> favs){
        this.favorites = favs;
    }

}   