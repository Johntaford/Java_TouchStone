import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MovieApp {

    // The printMenu() method must be declared inside the class, not inside the main() method.
    public static void printMenu() {
        System.out.println("----MENU----");
        System.out.println("1) Add a Movie");
        System.out.println("2) Add A Guest");
        System.out.println("3) List All Movies");
        System.out.println("4) List All Guest");
        System.out.println("5) Exit");
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        ArrayList<Movie> movies = new ArrayList<>();
        ArrayList<Guest> guests = new ArrayList<>();

        boolean start = true;

        // The try-catch block should enclose the entire while loop to handle exceptions gracefully.
        while (start) {
            try {
                printMenu();
                System.out.println("");
                System.out.println("Enter your choice");
                int choice = scan.nextInt();
                scan.nextLine(); // Consume the newline character

                switch (choice) {
                    case 1:
                        System.out.println("Enter Movie Title: ");
                        String title = scan.nextLine().trim();
                        System.out.println("Enter the Genre");
                        String genre = scan.nextLine().trim();
                        Movie movie = new Movie(title, genre);
                        movies.add(movie);
                        System.out.println("Added...");
                        break;

                    case 2:
                        System.out.println("Guest Name");
                        String name = scan.nextLine().trim();
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

                    case 5: // Changed to case 5 to match your printMenu()
                        start = false;
                        System.out.println("Have a Good Day!");
                        break;
                    default:
                        System.out.println("Invalid Choice. Please enter a number between 1 and 5.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid Input. Please enter a number between 1 and 5.");
                scan.nextLine(); // Consume the invalid input from the scanner
            }
        }
        scan.close();
    }
}