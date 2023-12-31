package Classes;

public class Song {
    private String title;
    private String artist;
    private String album;
    private int duration;

    public Song(String title, String artist, String album, int duration) {
        this.title = title;
        this.artist = artist;
        this.album = album;
        this.duration = duration;
    }

    public String getTitle() {
        return title;
    }
    public String getArtist() {
        return artist;
    }
    public String getAlbum() {
        return album;
    }
    public int getDuration() {
        return duration;
    }

    public void displayInformation() {
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
        System.out.println("Album: " + album);
        System.out.println("Duration: " + duration);
    }
    public void playSong() {
        System.out.println("Playing " + title + " by " + artist);
    }

}
