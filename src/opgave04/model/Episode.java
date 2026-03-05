package opgave04.model;

import java.util.ArrayList;

public class Episode {
    private int number = 0;
    private ArrayList<String> guestActors;
    private int lenghtInMinutes=0;

    protected Episode(int number, ArrayList<String> guestActors, int lenghtInMinutes) {
        this.number = number;
        this.guestActors = guestActors;
        this.lenghtInMinutes = lenghtInMinutes;
    }

    public int getNumber() {
        return number;
    }

    public ArrayList<String> getGuestActors() {
        return guestActors;
    }

    public int getLenghtInMinutes() {
        return lenghtInMinutes;
    }
}
