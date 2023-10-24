import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class MovieManagerTest {


    @Test
    public void shouldAddMovie() {
        MovieManager manager = new MovieManager();
        manager.addMovie("Властелин колец");

        String[] actual = manager.findAll();
        String[] expected = {"Властелин колец"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddMovies() {

        MovieManager manager = new MovieManager();

        manager.addMovie("Властелин колец");
        manager.addMovie("Любовь и голуби");
        manager.addMovie("Green mile");

        String[] actual = manager.findAll();
        String[] expected = {"Властелин колец", "Любовь и голуби", "Green mile"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldAddZeroMovie() {

        MovieManager manager = new MovieManager();

        manager.addMovie(null);

        String[] actual = manager.findAll();
        String[] expected = {null};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindAll() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Властелин колец");
        manager.addMovie("Любовь и голуби");
        manager.addMovie("Green mile");
        manager.addMovie("Игры Разума");
        manager.addMovie("Inspections");

        String[] actual = manager.findAll();
        String[] expected = {"Властелин колец", "Любовь и голуби", "Green mile", "Игры Разума", "Inspections"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastDefault() {
        MovieManager manager = new MovieManager();

        manager.addMovie("Властелин колец");
        manager.addMovie("Любовь и голуби");
        manager.addMovie("Green mile");
        manager.addMovie("Игры Разума");
        manager.addMovie("Inspections");

        String[] actual = manager.findLast();
        String[] expected = {"Inspections", "Игры Разума", "Green mile", "Любовь и голуби", "Властелин колец"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastSevenMovies() {
        MovieManager manager = new MovieManager(7);

        manager.addMovie("Властелин колец");
        manager.addMovie("Любовь и голуби");
        manager.addMovie("Green mile");
        manager.addMovie("Игры Разума");
        manager.addMovie("Inspections");
        manager.addMovie("The change");
        manager.addMovie("LOST");

        String[] actual = manager.findLast();
        String[] expected = {"LOST", "The change", "Inspections", "Игры Разума", "Green mile", "Любовь и голуби", "Властелин колец"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastThreeMovies() {
        MovieManager manager = new MovieManager(3);

        manager.addMovie("Властелин колец");
        manager.addMovie("Любовь и голуби");
        manager.addMovie("Green mile");

        String[] actual = manager.findLast();
        String[] expected = {"Green mile", "Любовь и голуби", "Властелин колец"};
        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void shouldFindLastIfNull() {
        MovieManager manager = new MovieManager(3);

        manager.addMovie("Любовь и голуби");
        manager.addMovie("Green mile");

        String[] actual = manager.findLast();
        String[] expected = {"Green mile", "Любовь и голуби"};
        Assertions.assertArrayEquals(expected, actual);
    }
}