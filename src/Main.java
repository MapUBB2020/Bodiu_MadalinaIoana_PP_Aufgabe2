import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    static ArrayList<Tvshow> shows= new ArrayList<>();

    public static void addTvshow(String name, String genre, ArrayList<Episode> episodes){
        boolean isAlready=false;
        for(int c=0; c<shows.size();c++){
            if(name.equals(shows.get(c).getName()))
            {
                isAlready=true;
                System.out.println("Show already exists");
                break;
            }
        }
        if(!isAlready)

            shows.add(new Tvshow(name, genre,episodes));

    }
    public static  void updateTvshow(String name, String genre, ArrayList<Episode> episodes){
        boolean isAlready=false;
        for(int c=0; c<shows.size();c++){
            if(name.equals(shows.get(c).getName()))
            {
                isAlready=true;
                shows.get(c).setGenre(genre);
                shows.get(c).setEpisodes(episodes);

            }
        }
        if(!isAlready)

            shows.add(new Tvshow(name, genre,episodes));


    }


    public static void deleteTvshow(String name){
        for(int c=0; c<shows.size();c++){
            if(name.equals(shows.get(c).getName()))
            {
                shows.remove((c));
            }
        }


    }

    public static void addTvshow(String name, String genre, ArrayList<Episode> episodes){
        boolean isAlready=false;
        for(int c=0; c<shows.size();c++){
            if(name.equals(shows.get(c).getName()))
            {
                isAlready=true;
                System.out.println("Show already exists");
                break;
            }
        }
        if(!isAlready)

            shows.add(new Tvshow(name, genre,episodes));

    }
    public static  void updateTvshow(String name, String genre, ArrayList<Episode> episodes){
        boolean isAlready=false;
        for(int c=0; c<shows.size();c++){
            if(name.equals(shows.get(c).getName()))
            {
                isAlready=true;
                shows.get(c).setGenre(genre);
                shows.get(c).setEpisodes(episodes);

            }
        }
        if(!isAlready)

            shows.add(new Tvshow(name, genre,episodes));


    }


    public static void deleteEpisode(Tvshow show,String name){
        for(int c=0; c<shows.size();c++){
            if(show.getName().equals(shows.get(c).getName()))
            {
                shows.get(c).setEpisodes();
            }
        }


    }



    public static void getAllEpisodes(){
        for(int c=0; c<shows.size();c++) {
            System.out.println(shows.get(c));
        }

    }


    public static void printMenu()
    {
        System.out.println("What would you like to do ?");
        System.out.println("1.Add tvshow");
        System.out.println("2.Update tvshow");
        System.out.println("3.Remove tvshow");
        System.out.println("5.View tvshows ");
        System.out.println("6.Add episode");
        System.out.println("2.Update episode");
        System.out.println("3.Remove episode");
        System.out.println("5.View episodes");


    }
    public static void main(String[] args) {
        while (true) {
            printMenu();
            Scanner in = new Scanner(System.in);
            String option = in.nextLine();

            switch(option){
                case "1":
                    break;
                case "2":
                    break;

                case "3":
                    break;
                case "4":
                    break;
                default:
                    System.out.println("Invalid option");
            }

        }
    }
}
