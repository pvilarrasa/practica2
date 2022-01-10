package daaw.practica2.persistence.repo;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import daaw.practica2.persistence.model.Film;

public interface FilmRepository extends MongoRepository<Film, String>{
    @Query("{title:'?0'}")
    Film findByTitle(String title);
    
    @Query("{actores:'?0'}")
    List<Film> findByActor(String actor); 
}
