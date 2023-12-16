import java.io.*;
import java.util.ArrayList;
import java.util.Collections; 
import java.util.Scanner;
public class Driver{
    public static void main(String[] args){
        /*
        1. Create a listener account

        2. List all Playlists and Albums and their contents

        3. Add songs to an existing playlist
        
        4. Shuffle an existing Playlist or listen to an Album

        5. Add a song or podcast to favorites

        6. Export all of a listener’s favorites out to a file in ascending order by times streamed

        7. Exit
        */
        // This is where all the important lists, scanner, and other things are initialized
        // I made a list for most of the unique objects so that they could be accessed later
        // when the user is running the interface.
        Scanner scnr = new Scanner(System.in);
        ArrayList<Playlist> playlists = new ArrayList<Playlist>();
        ArrayList<Album> albums = new ArrayList<Album>();
        ArrayList<Song> songs = new ArrayList<Song>();
        ArrayList<Podcast> podcasts = new ArrayList<Podcast>();
        ArrayList<Listener> allUsers = new ArrayList<Listener>();
        Listener user = null;
        
        // Here is where I create some default Listeners, Podcasts, Songs, Playlists, Artists, and Albums
        Listener babyboydrake3 = new Listener("babyboydrake3");

        Song notime = new Song("No Time", "Playboi Carti");
        Song top = new Song("Top", "Playboi Carti");
        Song longtime = new Song ("Long Time", "Playboi Carti");
        Song allofthelights = new Song("All of The Lights", "Kanye West");
        Song cometolife = new Song("Come to Life", "Kanye West");
        Song flashinglights = new Song("Flashing Lights", "Kanye West");
        songs.add(notime);
        songs.add(top);
        songs.add(longtime);
        songs.add(allofthelights);
        songs.add(cometolife);
        songs.add(flashinglights);


        Podcast green = new Podcast("Draymond Green Show", "Draymond Green", 20);
        Podcast fumi = new Podcast("Fumi and Friends", "Fumiya Shinagawa", 5);
        Podcast taiwan = new Podcast("Taiwan Superteam", "Dwight Howard", 10);
        podcasts.add(green);
        podcasts.add(fumi);
        podcasts.add(taiwan);

        Playlist playlist1 = new Playlist("Heat");
        playlist1.addContent(allofthelights);
        playlist1.addContent(cometolife);
        playlist1.addContent(flashinglights);
        Playlist playlist2 = new Playlist("Sad");
        playlist2.addContent(top);
        playlist2.addContent(longtime);
        Playlist playlist3 = new Playlist("Night Hours");
        playlist3.addContent(notime);
        playlist3.addContent(taiwan);
        playlists.add(playlist1);
        playlists.add(playlist2);
        playlists.add(playlist3);

        Artist Drake = new Artist("Drake");
        Artist carti = new Artist("Playboi Carti");
        Artist jason = new Artist("jasontheweenie");

        Album dl = new Album("Die Lit", "Playboi Carti");
        dl.addContent(longtime);
        dl.addContent(top);
        dl.addContent(notime);
        Album babyboydrake = new Album("Her Loss", "Drake");
        Album uzi = new Album("Eternal Atake", "Lil Uzi Vert");
        albums.add(dl);

        printPlaylists(playlists);
        printAlbums(albums);
        playlist1.shuffle();
        dl.play();
        cometolife.play();
        cometolife.play();

        // This is where the whole user interface and algorithm is run when the program is executed
        // It will only stop if the user wants to
        while (true){
            // prints the menu from the beginning
            printMenu();
            int userChoice = scnr.nextInt();
            scnr.nextLine();
            // Stops the program is the user chooses 7, which means "EXIT"
            if (userChoice == 7){
                break;
            }
            // or else the case statements will be ran
            else{
                switch(userChoice){
                    // Case 1 is so the user can create an account
                    case 1:
                        System.out.println("What would you like your username to be for this account?");
                        String userName = scnr.nextLine();
                        user = new Listener(userName);
                        allUsers.add(user);
                        break;
                    
                    // case 2 is so the current playlists and albums can be printed out
                    case 2:
                        System.out.println(playlists);
                        System.out.println(albums);
                        break;
                    
                    // case 3 is so the user can add a song to an already existing playlist 
                    case 3:
                        for (Playlist p : playlists){
                            System.out.println(p.getTitle());
                        }
                        System.out.println("Enter the number of the playlist you want to add to: ");
                        int userPlaylist = scnr.nextInt();
                        scnr.nextLine();
                        System.out.println("What song would you like to add?");
                        String userSong = scnr.nextLine();
                        System.out.println("Who is it by?");
                        String userSongAuthor = scnr.nextLine();
                        if (songs.contains(userSong)){
                            int indexSong = songs.indexOf(userSong);
                            playlists.get(userPlaylist).addContent(songs.get(indexSong));
                        }
                        else {
                            Song newSong = new Song(userSong, userSongAuthor);
                            playlists.get(userPlaylist).addContent(newSong);
                        }
                        break;
                        
                    // case 4 allows the user to shuffle a playlist or play an album
                    case 4:
                        System.out.println("Would you like to play a playlist or album?");
                        String choice = scnr.nextLine();
                        if (choice.equals("playlist")){
                            System.out.println(playlists);
                            System.out.println("Which playlist would you like to choose? Enter a # Starting at 0");
                            int userPlaylistShuffle = scnr.nextInt();
                            playlists.get(userPlaylistShuffle).shuffle();
                        }
                        else{
                            System.out.println(albums);
                            System.out.println("Which album would you like to choose? Enter a # Starting at 0");
                            int userAlbum = scnr.nextInt();
                            albums.get(userAlbum).play();
                        }
                        break;


                    // case 5 allows the user to add a song or podcast to their favorites
                    case 5: 
                        System.out.println("Do you want to add a song or a podcast?");
                        String contentChoice = scnr.nextLine();
                        if (contentChoice.equals("song")){
                            System.out.println("Would you like to add any of these songs? enter yes or no.");
                            System.out.println(songs);
                            if(scnr.nextLine().equals("yes")){
                                System.out.println("Which one would you like to add? Pick a # starting from 0");
                                int existingChoice = scnr.nextInt();
                                user.favorite(songs.get(existingChoice));
                            }
                            else{
                                System.out.println("What is the name of it");
                                String songName = scnr.nextLine();
                                System.out.println("Who is it by?");
                                String songAuthor = scnr.nextLine();
                                Song song = new Song(songName, songAuthor);
                                user.favorite(song);
                                songs.add(song);
                            }
                        }
                        else if(contentChoice.equals("podcast")){
                            System.out.println("Would you like to add any of these podcasts? enter yes or no.");
                            System.out.println(podcasts);
                            if (scnr.nextLine().equals("yes")){
                                System.out.println("Which one would you like to add? Pick a # starting from 0");
                                int existingChoice = scnr.nextInt();
                                user.favorite(podcasts.get(existingChoice));
                            }
                            else{
                                System.out.println("What is the name of it");
                                String podName = scnr.nextLine();
                                System.out.println("Who is it by?");
                                String podAuthor = scnr.nextLine();
                                System.out.println("How many episodes does it have?");
                                int epCount = scnr.nextInt();
                                Podcast podcast = new Podcast(podName, podAuthor, epCount);
                                user.favorite(podcast);
                                podcasts.add(podcast);
                            }
                        }
                        else{
                            System.out.println("You entered an invalid type.");
                        }
                        break;
                        
                    // case 6 prints out the user's favorites to a file in ascending order by number of streams
                    // they each have
                    case 6: 
                        PrintWriter writer = null;
                        BufferedReader reader = null;
                        String representation = "";
                        try{
                            ArrayList<Content> userFavs = user.getFavorite();
                            String filePath = "userFavs.txt";
                            Collections.sort(userFavs, Collections.reverseOrder());
                            System.out.println(userFavs);
                            writer = new PrintWriter(new FileWriter(filePath, false));
                            for(Content curContent : userFavs){
                                representation = curContent.toString();
                                writer.write(representation);
                                writer.write(System.lineSeparator());
                            }
                
                            reader = new BufferedReader(new FileReader(filePath));
                            String line;
                            while((line = reader.readLine()) != null){
                                System.out.println(line);
                            }
                            
                
                        }
                        // catch statements that will catch if the list is empty or if a user was never made
                        catch(NullPointerException e){
                            System.out.println("The value of user is still null or there is nothing in your favorites");
                        }
                        catch(FileNotFoundException e){
                            System.out.println("Your file does not exist!");
                        }  
                        catch(IOException e){
                            System.out.println("Error reading or writing to that file");
                        }
                        finally{
                            if(writer != null){
                                writer.close();
                            }
                        }
                        break;
                    
                    
                    // default constructor that tells the user that they did not choose a valid case number
                    default:
                        System.out.println("You entered an invalid choice, try again.");
                        break;  
                }
            }  
            // checks if the user's choice is 7 again to make sure no errors occur
            if (userChoice == 7){
                break;
            }
        }
    }
    // Method to print out the menu interface
    public static void printMenu(){
        System.out.println("-------------- MENU -------------");
        System.out.println("\n1. Create a Listener Account");
        System.out.println("\n2. List all Playlists and Albums and their contents");
        System.out.println("\n3. Add songs to an existing playlist");
        System.out.println("\n4. Shuffle an existing Playlist or listen to an Album");
        System.out.println("\n5. Add a song or podcast to favorites");
        System.out.println("\n6. Export all of a listener's favorites out to a file in ascending order by times streamed");
        System.out.println("\n7. Exit");
        System.out.println("---------------------------------");

    }
    // method to print out all of the existing playlists
    public static void printPlaylists(ArrayList<Playlist> playlists){
        for (Playlist currentPlaylist: playlists){
            System.out.println(currentPlaylist);
        }
    }
    // method to print out all of the existing albums
    public static void printAlbums(ArrayList<Album> albums){
        for (Album currentAlbum: albums){
            System.out.println(currentAlbum);
        }
    }
}