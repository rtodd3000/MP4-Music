// Artists represent the people who make music on the app
// extends account because it is a type of account
public class Artist extends Account{
    // Default Constructor that sets the username to User
    public Artist(){
        super();
    }
    // Overloaded Constructor that sets the username to whatever is chosen
    public Artist(String username){
        super(username);
    }
}