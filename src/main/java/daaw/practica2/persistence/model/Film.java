package daaw.practica2.persistence.model;

import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("peliculas")
public class Film {
    @Id
    private String id;

    private String title;    
    private String genero;    
    private String year;
    private String[] actores;
    
    
    public Film(String id, String title, String genero, String year, String[] actores) {
        this.id = id;
        this.title = title;
        this.genero = genero;
        this.year = year;
        this.actores = actores;
    }   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String[] getActores() {
        return actores;
    }

    public void setActores(String[] actores) {
        this.actores = actores;
    }

    @Override
    public String toString() {
        return "Film [id=" + id + ", title=" + title + "]";
    }
}
