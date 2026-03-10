package be.thomasmore.cinema.repositories;

import be.thomasmore.cinema.model.Movie;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface movieRepository extends CrudRepository<Movie, Integer> { // Extends de basis-interface CrudRepository

    @Query("SELECT m FROM Movie m WHERE " +
            "(:movieName IS NULL OR LOWER(m.movieName) LIKE LOWER(CONCAT('%', :movieName, '%'))) AND " +
            "(:genre IS NULL OR LOWER(m.genre) LIKE LOWER(CONCAT('%', :genre, '%'))) AND " +
            "(:minReleaseYear IS NULL OR m.releaseYear >= :minReleaseYear) AND " +
            "(:maxReleaseYear IS NULL OR m.releaseYear <= :maxReleaseYear) AND " +
            "(:minFreeSeats IS NULL OR m.numberOfFreeSeats >= :minFreeSeats)")
    Iterable<Movie> findByFilters(
            @Param("movieName") String movieName,
            @Param("genre") String genre,
            @Param("minReleaseYear") Integer minReleaseYear,
            @Param("maxReleaseYear") Integer maxReleaseYear,
            @Param("minFreeSeats") Integer minFreeSeats
    );
}
