import java.util.ArrayList;
public class Tvshow {
    String name;
    String genre;
    ArrayList<Episode> episodes;

    public Tvshow(String name, String genre, ArrayList<Episode> episodes) {
        this.name = name;
        this.genre = genre;
        this.episodes = episodes;
    }

    @Override
    public String toString() {
        return "Tvshow{" +
                "name='" + name + '\'' +
                ", genre='" + genre + '\'' +
                ", episodes=" + episodes +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public ArrayList<Episode> getEpisodes() {
        return episodes;
    }

    public void setEpisodes(ArrayList<Episode> episodes) {
        this.episodes = episodes;
    }
    public void addEpisode(Episode ep){
        this.getEpisodes().add(ep);
    }

    public void deleteEpisode(Episode ep){
        this.getEpisodes().remove(ep);
    }
}
