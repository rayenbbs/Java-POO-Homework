package Classes;
import java.util.List;
public class Album {
    private List<Song> songs;
    private String title;
    private String artist;
    private int yearOfPublication;
    public Album(List<Song> songs, String title, String artist, int yearOfPublication) {
        this.songs = songs;
        this.title = title;
        this.artist = artist;
        this.yearOfPublication = yearOfPublication;
    }
    public List<Song> getSongs() {
        return songs;
    }
    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public int getYearOfPublication() {
        return yearOfPublication;
    }
    public void addSong(Song song) {
        songs.add(song);
    }
    public void removeSong(Song song) {
        songs.remove(song);
    }
    public void listSongs(){
        for (Song song : songs) {
            song.displayInformation();
        }
    }

}
