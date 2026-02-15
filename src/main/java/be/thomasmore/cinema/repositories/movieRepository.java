package be.thomasmore.cinema.repositories;

import be.thomasmore.cinema.model.Movie;
import org.springframework.data.repository.CrudRepository;

public interface movieRepository extends CrudRepository<Movie, Integer> { // Extends de basis-interface CrudRepository

}
