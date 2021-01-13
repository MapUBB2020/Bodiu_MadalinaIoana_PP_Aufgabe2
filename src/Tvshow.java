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

    public void deleteEpisode(String name){
        for(int c=0; c<this.getEpisodes().size();c++)
        {
            if(this.getEpisodes().get(c).getTitle().equals(name))
            {
                this.getEpisodes().remove(c);
            }

        }

    }
    public void updateEpisode(Episode ep){
        for(int c=0; c<this.getEpisodes().size();c++)
        {
            if(ep.getTitle().equals(this.getEpisodes().get(c).getTitle()))
            {
                this.getEpisodes().get(c).setDuration(ep.getDuration());
                this.getEpisodes().get(c).setDescription(ep.description);
            }
        }
    }

    public void getAllEpisodes(){
        for(int c=0; c<this.getEpisodes().size();c++) {
            System.out.println(this.getEpisodes().get(c));
        }

    }
}
