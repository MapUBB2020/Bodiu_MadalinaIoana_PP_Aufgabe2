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
        if(isAlready==false) {

            shows.add(new Tvshow(name, genre, episodes));
        }

    }
    public static  void updateTvshow(String name, String genre){
        boolean isAlready=false;
        for(int c=0; c<shows.size();c++){
            if(name.equals(shows.get(c).getName()))
            {
                isAlready=true;
                shows.get(c).setGenre(genre);


            }
        }
        if(!isAlready)

           System.out.println("Not found");


    }


    public static void deleteTvshow(String name){
        for(int c=0; c<shows.size();c++){
            if(name.equals(shows.get(c).getName()))
            {
                shows.remove((c));
            }
        }


    }
    public static void getAllTvshows(){
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
        System.out.println("4.View tvshows ");
        System.out.println("5.Add episode ");
        System.out.println("6.Update episode");
        System.out.println("7.Remove episode");
        System.out.println("8.View episodes");


    }
    public static void main(String[] args) {
        while (true) {
            printMenu();
            Scanner in = new Scanner(System.in);
            String option = in.nextLine();

            switch(option){
                case "1":
                    System.out.println("Enter name");
                    String name=in.nextLine();
                    System.out.println("Enter genre");
                    String genre=in.nextLine();


                    addTvshow(name,genre,new ArrayList<Episode>());
                    break;
                case "2":
                    System.out.println("Enter name");
                     name=in.nextLine();
                    System.out.println("Enter genre");
                     genre=in.nextLine();


                    updateTvshow(name,genre);
                    break;

                case "3":
                    System.out.println("Enter name");
                    name=in.nextLine();
                    deleteTvshow(name);
                    break;
                case "4":
                    getAllTvshows();
                    break;
                case "5":
                    System.out.println("Enter name");
                    name=in.nextLine();
                    System.out.println("Enter description");
                    String description=in.nextLine();
                    System.out.println("Enter duration");
                    String duration=in.nextLine();
                    int durationINt=Integer.parseInt(duration);
                    System.out.println("Which show?");
                    String show=in.nextLine();

                    for(int s=0;s<shows.size();s++)
                    {
                        if(shows.get(s).getName().equals(show))
                            shows.get(s).addEpisode(new Episode(name,description,durationINt));
                    }
                    break;
                case "6":
                    System.out.println("Enter name");
                    name=in.nextLine();
                    System.out.println("Enter description");
                     description=in.nextLine();
                    System.out.println("Enter duration");
                    duration=in.nextLine();
                    durationINt=Integer.parseInt(duration);
                    System.out.println("Which show?");
                    show=in.nextLine();

                    for(int s=0;s<shows.size();s++)
                    {
                        if(shows.get(s).equals(show))
                            shows.get(s).updateEpisode(new Episode(name,description,durationINt));
                    }
                    break;
                case "7":

                    System.out.println("Enter name");
                    name=in.nextLine();
                    System.out.println("Which show?");
                    show=in.nextLine();

                    for(int s=0;s<shows.size();s++)
                    {
                        if(shows.get(s).equals(show))
                            shows.get(s).deleteEpisode(name);
                    }
                    break;
                case "8":
                    System.out.println("Which show?");
                    show=in.nextLine();
                    for(int s=0;s<shows.size();s++)
                {
                    if(shows.get(s).getName().equals(show))
                        shows.get(s).getAllEpisodes();
                }
                break;


                default:
                    System.out.println("Invalid option");
            }

        }
    }
}
