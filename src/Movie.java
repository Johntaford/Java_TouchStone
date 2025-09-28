
public class Movie {

    private String title;
    private String genre;

    public Movie() {
    }

    public Movie(String title, String genre) {

        this.title = title;
        this.genre = genre;

    }

    public void addBook(String title, String genre) {
        this.genre = genre;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    @Override
    public String toString() {
        return String.format("" + title, "\" by " + genre);
    }

}
