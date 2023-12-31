package Classes;

import Interfaces.User;

public class FreeUser implements User {
    private String name;
    private String email;
    private String password;

    private String[] playlist;

    public FreeUser(String name, String email, String password, String[] playlist) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.playlist = playlist;
    }

    @Override
    public void listen() {
        System.out.println("FreeUser is listening");
    }

    @Override
    public void addToPlaylist() {
        System.out.println("FreeUser is adding to playlist");
    }
}
