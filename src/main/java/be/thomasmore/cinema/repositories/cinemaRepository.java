package be.thomasmore.cinema.repositories;

import be.thomasmore.cinema.model.Cinema;
import org.springframework.data.repository.CrudRepository;

public interface cinemaRepository extends CrudRepository<Cinema, Integer> { // Extends de basis-interface CrudRepository

}
