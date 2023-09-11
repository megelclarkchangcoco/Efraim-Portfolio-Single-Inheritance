package LinkedList;

import java.util.Scanner;

//Main class to manage the playlist
public class PlaylistManager {
 public static void main(String[] args) {
     Playlist playlist = new Playlist(); // Create a new playlist
     Scanner scanner = new Scanner(System.in); // Create a Scanner object to read user input

     while (true) {
         System.out.println("Enter 1 to add a song to the playlist");
         System.out.println("Enter 2 to display the songs in the playlist");
         System.out.println("Enter 3 to exit");

         int choice = scanner.nextInt(); // Read the user's choice

         switch (choice) {
             case 1:
                 System.out.print("Enter the name of the song: ");
                 scanner.nextLine(); // Consume the newline character left by nextInt()
                 String name = scanner.nextLine(); // Read the name of the song

                 System.out.print("Enter the year of the song: ");
                 int year = scanner.nextInt(); // Read the year of the song

                 Song song = new Song(name, year); // Create a new Song object
                 playlist.addSong(song); // Add the song to the playlist

                 System.out.println("Song added to the playlist.");
                 break;

             case 2:
                 System.out.println("Songs in the playlist:");
                 playlist.displaySongs(); // Display all the songs in the playlist
                 break;

             case 3:
                 System.out.println("Exiting the program.");
                 System.exit(0); // Terminate the program

             default:
                 System.out.println("Invalid choice. Please try again.");
                 break;
         }

         System.out.println();
     }
 }
}