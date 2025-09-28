// Movie class
public class Movie {

    private String title;
    private String genre;
//Constructor 
    public Movie() {
    }

    public Movie(String title, String genre) {

        this.title = title.trim();
        this.genre = genre.trim();

    }
// Add Movie Method
    public void addMovie(String title, String genre) {
        this.genre = genre;
        this.title = title;
    }
// Getters 
    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }
// To String method
    @Override
    public String toString() {
        return String.format("" + title, "\" by " + genre);
    }

}
