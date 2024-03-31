package com.peliculasjz.peliculas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
public class PeliculasController {
    private List<Peliculas> peliculas = new ArrayList<>();

    public PeliculasController(){
        peliculas.add(new Peliculas(1, "Avatar", 2024, "James Cameron", "Ciencia Ficción", "Una aventura épica en un mundo alienígena."));
        peliculas.add(new Peliculas(2, "Inception", 2010, "Christopher Nolan", "Ciencia Ficción", "Un ladrón que roba secretos corporativos a través del uso de la tecnología del sueño."));
        peliculas.add(new Peliculas(3, "Interstellar", 2014, "Christopher Nolan", "Ciencia Ficción", "Una expedición a través de un agujero de gusano en el espacio."));
        peliculas.add(new Peliculas(4, "The Matrix", 1999, "Lana y Lilly Wachowski", "Acción", "Un hacker descubre la realidad oculta detrás de su mundo virtual."));
        peliculas.add(new Peliculas(5, "Gladiator", 2000, "Ridley Scott", "Historia", "La historia de un general romano traicionado que busca venganza."));
        peliculas.add(new Peliculas(6, "Joker", 2019, "Todd Phillips", "Drama", "La historia del origen del icónico villano."));
        peliculas.add(new Peliculas(7, "Parasite", 2019, "Bong Joon Ho", "Drama", "Una crítica social sobre la desigualdad a través de dos familias."));
        peliculas.add(new Peliculas(8, "The Godfather", 1972, "Francis Ford Coppola", "Crimen", "La epopeya de la familia Corleone."));
        peliculas.add(new Peliculas(9, "The Dark Knight", 2008, "Christopher Nolan", "Acción", "Batman debe enfrentarse al Joker."));
        peliculas.add(new Peliculas(10, "Pulp Fiction", 1994, "Quentin Tarantino", "Crimen", "Historias entrelazadas en el inframundo de Los Ángeles."));
        peliculas.add(new Peliculas(11, "Fight Club", 1999, "David Fincher", "Drama", "Un descontento oficinista encuentra su válvula de escape."));
        peliculas.add(new Peliculas(12, "Forrest Gump", 1994, "Robert Zemeckis", "Drama", "La increíble vida de un hombre simple."));
        peliculas.add(new Peliculas(13, "The Shawshank Redemption", 1994, "Frank Darabont", "Drama", "La historia de amistad y esperanza en una prisión."));
        peliculas.add(new Peliculas(14, "Schindler's List", 1993, "Steven Spielberg", "Historia", "Un empresario alemán salva a más de mil judíos durante el Holocausto."));
        peliculas.add(new Peliculas(15, "La La Land", 2016, "Damien Chazelle", "Musical", "La historia de amor entre una aspirante a actriz y un músico de jazz."));
        peliculas.add(new Peliculas(16, "Mad Max: Fury Road", 2015, "George Miller", "Acción", "En un desierto postapocalíptico, Max se une a Furiosa."));
        peliculas.add(new Peliculas(17, "Moonlight", 2016, "Barry Jenkins", "Drama", "La lucha de un joven afroamericano por encontrarse a sí mismo."));
        peliculas.add(new Peliculas(18, "The Grand Budapest Hotel", 2014, "Wes Anderson", "Comedia", "La historia de un conserje y su amigo en un famoso hotel europeo."));
        peliculas.add(new Peliculas(19, "The Lion King", 1994, "Roger Allers y Rob Minkoff", "Animación", "La travesía de Simba para reclamar su reino."));
        peliculas.add(new Peliculas(20, "Toy Story", 1995, "John Lasseter", "Animación", "Las aventuras de un grupo de juguetes que cobran vida."));
    }

    @GetMapping("/peliculas")
    public List<Peliculas> getPeliculas() {
        return peliculas;
    }
    
    @GetMapping("/peliculas/{id}")
    public Peliculas getPeliculaByUd(@PathVariable int id) {
        for (Peliculas pelicula : peliculas){
            if (pelicula.getId() == id){
                //retornar pelicula id correcto
                return pelicula;
            }
        }
        //retornar pelicula sin datos en caso id incorrecto
        return new Peliculas(0, "", 0, "", "", "");
    }
    
}
