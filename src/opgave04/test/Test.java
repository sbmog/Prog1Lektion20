package opgave04.test;

import opgave04.model.Series;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> cast = new ArrayList<>();
        cast.add("Jennifor Aniston");
        cast.add("David Schwimmer");
        cast.add("Courtney Cox");
        cast.add("Mathew Perry");
        cast.add("Liza Kudrow");
        cast.add("Matt Blanc");

        ArrayList<String> guestAcors = new ArrayList<>();
        guestAcors.add("Justin Timberlake");
        guestAcors.add("Harrison Ford");
        guestAcors.add("The Rock");

        Series friends = new Series("Friends", cast);
        friends.createEpisode(01, guestAcors, 22);
        friends.createEpisode(02, guestAcors, 23);

        System.out.println(friends.totalLenght());
        System.out.println(friends.getGusetActors());
    }
}
