package com.peliculasjz.peliculas;

public class Peliculas {
    private int id;
    private String titulo;
    private int year;
    private String director;
    private String genero;
    private String sinopsis;

    public Peliculas (int id, String titulo, int year, String director, String genero, String sinopsis){
        this.id = id;
        this.titulo = titulo;
        this.year = year;
        this.director = director;
        this.genero = genero;
        this.sinopsis = sinopsis;
    }

    public int getId(){
        return id;
    }
    public String getTitulo(){
        return titulo;
    }
    public int getYear(){
        return year;
    }
    public String getDirector(){
        return director;
    }
    public String getGenero(){
        return genero;
    }
    public String getSinopsis(){
        return sinopsis;
    }
}
