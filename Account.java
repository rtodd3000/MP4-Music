// Account class that represents an account on the app
// is the parent class for Artist and Listener
public class Account{
    //username variable that is shared between all parent and child classes
    protected String username;

    // Default constructor that sets username to just User
    public Account(){
        this.username = "User";
    }
    // Overloaded constructor that sets the username to whatever the user sets it to
    public Account(String username){
        this.username = username;
    }

    //Accessor to get username
    public String getUsername(){
        return this.username;
    }  
    // Mutator to change or set the username
    public void setUsername(String username){
        this.username = username;
    }


}