import java.util.*;
import java.util.stream.Collectors;

public class Main {
    static ArrayList<Tvshow> shows= new ArrayList<>();
    private static Map<String, Integer> sortByValue(Map<String, Integer> unsortMap, final boolean order)
    {
        List<Map.Entry<String, Integer>> list = new LinkedList<>(unsortMap.entrySet());

        // Sorting the list based on values
        list.sort((o1, o2) -> order ? o1.getValue().compareTo(o2.getValue()) == 0
                ? o1.getKey().compareTo(o2.getKey())
                : o1.getValue().compareTo(o2.getValue()) : o2.getValue().compareTo(o1.getValue()) == 0
                ? o2.getKey().compareTo(o1.getKey())
                : o2.getValue().compareTo(o1.getValue()));
        return list.stream().collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (a, b) -> b, LinkedHashMap::new));

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

    public static Map<String, Integer> sortByDuration(String genre){
        Map<String,Integer> genreDuration=new HashMap<String, Integer>(); ;
        for(int c=0; c<shows.size();c++) {
           if(shows.get(c).getGenre().equals((genre)))
           {
               genreDuration.put(shows.get(c).getGenre(),shows.get(c).durationCalculation());
           }
        }
        return sortByValue(genreDuration,true);

    }

    private static void printMap(Map<String, Integer> map)
    {
        map.forEach((key, value) -> System.out.println("Key : " + key + " Value : " + value));
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

                    while(!name.matches("^[a-zA-Z0_]*$"))
                    {
                        System.out.println("Not a valid name! Try again");
                        name = in.nextLine();
                    }



                    System.out.println("Enter genre");
                    String genre=in.nextLine();

                    while(!genre.matches("^[a-zA-Z0_]*$"))
                    {
                        System.out.println("Not a valid genre! Try again");
                        genre = in.nextLine();
                    }




                    addTvshow(name,genre,new ArrayList<Episode>());
                    break;
                case "2":
                    System.out.println("Enter name");
                     name=in.nextLine();
                    while(!name.matches("^[a-zA-Z0_]*$"))
                    {
                        System.out.println("Not a valid name! Try again");
                        name = in.nextLine();
                    }
                    System.out.println("Enter genre");
                     genre=in.nextLine();
                    while(!genre.matches("^[a-zA-Z0_]*$"))
                    {
                        System.out.println("Not a valid genre! Try again");
                        genre = in.nextLine();
                    }


                    updateTvshow(name,genre);
                    break;

                case "3":
                    System.out.println("Enter name");
                    name=in.nextLine();
                    while(!name.matches("^[a-zA-Z0_]*$"))
                    {
                        System.out.println("Not a valid name! Try again");
                        name = in.nextLine();
                    }
                    deleteTvshow(name);
                    break;
                case "4":
                    getAllTvshows();
                    break;
                case "5":
                    System.out.println("Enter name");
                    name=in.nextLine();
                    while(!name.matches("^[a-zA-Z0_]*$"))
                    {
                        System.out.println("Not a valid name! Try again");
                        name = in.nextLine();
                    }
                    System.out.println("Enter description");
                    String description=in.nextLine();
                    while(!description.matches("^[a-zA-Z0_]*$"))
                    {
                        System.out.println("Not a valid description! Try again");
                        description = in.nextLine();
                    }

                    System.out.println("Enter duration");
                    String duration=in.nextLine();
                    int durationINt=Integer.parseInt(duration);

                    while(!duration.matches("^[0-9]*$"))
                    {
                        System.out.println("Not a validduration! Try again");
                        duration = in.nextLine();
                    }

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

                case "9":
                    System.out.println("Enter genre");
                    genre=in.nextLine();

                    printMap(sortByDuration(genre));
                    break;


                default:
                    System.out.println("Invalid option");
            }

        }
    }
}
