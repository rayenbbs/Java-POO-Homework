package Classes;
import java.util.List;
public class Artist {
    private List<Album> albumList;
    private String name;
    private int numberOfAlbums;
    public void addAlbum(Album album) {
        albumList.add(album);
        numberOfAlbums++;
    }
    public void deleteAlbum(Album album) {
        albumList.remove(album);
        numberOfAlbums--;
    }
    public void listAlbums() {
        for (Album album : albumList) {
            album.listSongs();
        }
    }
    public Artist(List<Album> albumList, String name) {
        this.albumList = albumList;
        this.name = name;
        this.numberOfAlbums = 0;
    }

}
