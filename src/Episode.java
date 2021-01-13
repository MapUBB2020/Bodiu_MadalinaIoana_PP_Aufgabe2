public class Episode {
    String title;
    String description;
    int duration;

    public Episode(String title, String description, int duration) {
        this.title = title;
        this.description = description;
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Episode{" +
                "title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", duration=" + duration +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }
}
