package daaw.practica2.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import daaw.practica2.controllers.exception.FilmNotFoundException;
import daaw.practica2.persistence.model.Film;
import daaw.practica2.persistence.repo.FilmRepository;

@RestController
@RequestMapping("/api/peliculas")
public class FilmController {
    
    @Autowired
    private FilmRepository filmRepository;

    @GetMapping
    public Iterable<Film> findAll(){
        return filmRepository.findAll();
    }

    @GetMapping("/{id}")
    public Film findOne(@PathVariable String id){
        return filmRepository.findById(id)
            .orElseThrow(FilmNotFoundException::new);
    }

    @GetMapping("/titulo/{title}")
    public Film findByTitle(@PathVariable String title){
        return filmRepository.findByTitle(title);
    }

    @GetMapping("/actor/{actor}")
    public List<Film> findByActor(@PathVariable String actor){
        return filmRepository.findByActor(actor);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Film create(@RequestBody Film film){
        return filmRepository.save(film);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable String id){
        filmRepository.findById(id)
            .orElseThrow(FilmNotFoundException::new);
        filmRepository.deleteById(id);
    }

    @GetMapping("/test")
    public String test(){
        return "test";
    }

}
