// Guest Class 
public class Guest {

    private String name;

    public Guest() {
    }
//Constructor
    public Guest(String name) {

        this.name = name.trim();

    }

    public void addGuest(String name) {
        this.name = name;

    }
//Getter
    public String getName() {
        return name;
    }
//ToString Method for clean display 
    @Override
    public String toString() {
        return String.format("Guest  Name: " + name);
    }
}
