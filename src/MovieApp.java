
import java.util.ArrayList;
import java.util.Scanner;

public class MovieApp {

    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);

        ArrayList<Movie> movies = new ArrayList<>();
        ArrayList<Guest> guests = new ArrayList<>();

        boolean start = true;

        while (start) {
            printMenu();
            System.out.println("");
            System.out.println("Enter your choice");
            int choice = scan.nextInt();
            scan.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter Movie Title: ");
                    String title = scan.nextLine();
                    System.out.println("Enter the Genre");
                    String genre = scan.nextLine();
                    Movie movie = new Movie(title, genre);
                    movies.add(movie);
                    System.out.println("Added...");
                    break;

                case 2:
                    System.out.println("Guest Name");
                    String name = scan.nextLine();
                    Guest guest = new Guest(name);
                    guests.add(guest);
                    System.out.println("Guest Added.");
                    break;

                case 3:
                    System.out.println("Listing all Movies");
                    for (Movie m : movies) {
                        System.out.println("Title: " + m.getTitle() + ", Genre: " + m.getGenre());
                    }
                    break;

                case 4:
                    System.out.println("Listing all Guest");
                    for (Guest g : guests) {
                        System.out.println(g);
                    }
                    break;

                case 5:
                    start = false;
                    System.out.println("Have a Good Day!");
                    break;
                default:
                    System.out.println("Invalid Choice.");
            }

        }
        scan.close();

    }

    static void printMenu() {
        System.out.println("----MENU----");
        System.out.println("1) Add a Movie");
        System.out.println("2) Add A Guest");
        System.out.println("3) List All Movies");
        System.out.println("4) List All Guest");
        System.out.println("0) Exit");

    }
}
