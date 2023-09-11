package LinkedList;

import java.util.LinkedList;

//Create a class to represent a Playlist
class Playlist {
 private LinkedList<Song> songs;

 // Constructor to initialize the LinkedList to store the songs
 public Playlist() {
     songs = new LinkedList<>();
 }

 // Method to add a Song to the playlist
 public void addSong(Song song) {
     songs.add(song);
 }

 // Method to display all the songs in the playlist
 public void displaySongs() {
     for (Song song : songs) {
         System.out.println(song.getName() + "(" + song.getYear() + ")");
     }
 }
}