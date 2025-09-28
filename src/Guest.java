
public class Guest {

    private String name;

    public Guest() {
    }

    public Guest(String name) {

        this.name = name.trim();

    }

    public void addGuest(String name) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return String.format("Guest  Name: " + name);
    }
}