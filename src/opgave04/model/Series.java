package opgave04.model;

import java.util.ArrayList;

public class Series {
    private String title;
    private ArrayList<String> cast =new ArrayList<>();
    private ArrayList<Episode> episodes = new ArrayList<>();

    public Series(String title,ArrayList<String> cast) {
        this.title=title;
        this.cast = cast;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getCast() {
        return cast;
    }

    public Episode createEpisode(int number,ArrayList<String>guestActors, int lenghtInMinutes){
        Episode episode =new Episode(number,guestActors,lenghtInMinutes);
        episodes.add(episode);
        return episode;
    }
    public int totalLenght(){
        int totalLenght=0;
        for (Episode episode : episodes) {
            totalLenght+=episode.getLenghtInMinutes();
        }
        return totalLenght;
    }

    public ArrayList<String> getGusetActors(){
        ArrayList<String> allGuestActors =new ArrayList<>();
        for (Episode episode : episodes) {
            allGuestActors.addAll(episode.getGuestActors());
        }
        return allGuestActors;
    }
}
