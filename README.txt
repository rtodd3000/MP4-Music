Ryan Todd
2430663
rtodd@chapman.edu
CPSC 231-01
MP4

Driver.java, Playlist.java, Podcast.java, Content.java, Collections.java, Artist.java, Listener.java, Album.java, Account.java, Song.java

Write up:
Class Overview:
Driver.java: The driver has 4 methods including the main method. In the main method, the basic settings of the app are set up,
such as having at least 3 of each objects(playlist, album, song, podcast), as well as a user. Also, songs are added to playlists
and albums for further testing. The second part of the main method is the user interface, where there is a while loop until the user
decides to exit the application. The rest is set up by a switch/case where the different actions are executed based on the number 
entered by the user. The other 3 methods are printMenu(), printPlaylists(), and printAlbums(). The printMenu() is a method where it 
prints out a clean list of the actions the user can execute. The printPlaylists() uses the toString method in the playlist class to 
print all of the existing playlists in an orderly fashion. Lastly the printAlbums() method uses the toString method in the 
album class to print all of the existing albums in an orderly fashion.

Account.java: This is the parent class of Listener and Artist. Contains a default and overloaded constructor, as well as an 
accessor and mutator for the username. This class does not force much to it's child classes, but allows the child class to
access the username member variable.

Listener.java: This is the child class of Account. Contains an overloaded constructor, as well as a private member variable, which 
is an Arraylist of Content, which stores the user's favorite songs and podcasts. This class also contains a favorite() method, which 
adds the entered Content to the favorite ArrayList. Also, there is an toString() method which prints the username of the Listener
in an orderly fashion. Lastly, inculudes accessor and mutator of the favorite Arraylist.

Artist.java: This is the second child class of Account. Only contains an default and overloaded constructor, with no new member variables.

Content.java: This is the parent class of song and podcast. Contains 3 member variables of title, author, and numStreams, with title
being the title of the content, author being the person who made the content, and numStreams the integer representation of the number 
of times the content has been streamed. There is an overloaded constructor for the user to create a content, as well as 2 abstract methods
play() and toString that the child classes must implement. Lastly, the class includes mutators and accessors for title, author, and 
numStreams respectively. 

Song.java: This is the child class of Content. Contains no new member variables, but an overloaded constructor. 
Has the two abstract methods of play() and toString, with play() adding 1 to the numStreams for every time it 
is executed, and printing what song was streamed. The toString() method also prints the Song in an orderly fashion. 

Podcast.java: This is the second child class of Content. Adds one new member variable which is epNum, the number of episodes the 
podcast has uploaded. This class also contains an overloaded constructor, as well as the 2 abstract methods, that do the same thing as 
the play() and toString() method in the Song.java class. 

Collections.java: This is the abstract/parent class for playlist and album. Contains 2 member variables, which are the title of the 
collection, as well as the actual Arraylist for the collection. There is an overloaded constructor, as well as 3 abstract methods 
playlist and album must define in their classes. The 3 are addContent(), removeContent(), and toString(). This class also contains
accessors for both of the member variables, as well as a compareTo() method that compares the size of 2 Arraylists. 

Playlist.java: This is the child class of Collections. Contains the overloaded method, as well as the 3 abstract methods. The addContent()
method adds the given content to the Arraylist, while the removeContent() takes away the given content from the Arraylist. Finally, 
the toString() method prints the playlist in an orderly fashion. There is also another method which is the shuffle() method, where a 
random number is chosen and the song at that value is played. 

Album.java: Ths is the second child class of Collections. Contains another member variable of artist, and also has a overloaded constructor.
This class also has the 3 abstract method, which do the same exact thing as the 3 abstract methods in Playlist.java, with another method 
called play(). This method iterates through the playlist, and calls the play() method from song.java, giving each song a +1 to the 
numStreams value. 


Challenges:
I think the most trouble I had with this assignment was figuring out how to structure the user interface in Driver.
I did not know where to start for a bit and frankly, had to remind myself how to do a lot of things. Once I got the hang of it
however, me and Fumi were able to write it out pretty easily. It's just when you have so many lines of code, it can be hard to keep
track of what you're writing. 

Google drawing of the diagram will be uploaded into canvas

Our code could be expanded immensely by other developers. For instance, we do not use the artist class much
so things such as setting a profile picture, setting their total streams, setting what songs they made, you could do a lot. 
With everything else, you could maybe add a friends feature and a listen along feature to create a social aspect to it.

Only references I used were the other assignments I've done for this class


For how we split up the work, Fumi worked on the Account, Artist, and Listener classes, while I did the rest of the object classes
and set up most of the driver. We met up a lot to work on the driver and test each of our methods and case statements. We split up
which case statements we'd do evenly so that none of us were too stressed on doing too much work.

