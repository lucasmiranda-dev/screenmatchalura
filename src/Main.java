import br.com.alura.screenmatch.models.Movie;

public class Main {
    public static void main(String[] args) {
        Movie firstMovie = new Movie();
        firstMovie.setName("The Godfather");
        firstMovie.setReleaseYear(1972);
        firstMovie.setLengthInMinutes(175);

        firstMovie.displayTechnicalSheet();
        firstMovie.rating(8);
        firstMovie.rating(5);
        firstMovie.rating(10);
        System.out.println("Total de Avaliações: " + firstMovie.getTotalRating());
    }
}