/*
* Autor: Yael Charles Marin
* Fecha: 24/06/2024
* Descripcion: clase abstracta que nos permita usar polimorfismo con sus metodos
* así como heredar sus atributos a otras clases, haciendo esta una clase padre
* con los atributos y metodos genericos.
*/
package main;

public abstract class Pokemon {
    //Atributos de un Pokemon
    protected int numPokedex, temporadaAparece, saludPokemon;
    protected String nombrePokemon, sexoPokemon;
    protected double pesoPokemon;
    // Constructor vacio
    public Pokemon() {
    }
    // Constructor que recibe parametros
    public Pokemon(int numPokedex, int temporadaAparece, int saludPokemon, 
            String nombrePokemon, String sexoPokemon, double pesoPokemon) {
        this.numPokedex = numPokedex;
        this.temporadaAparece = temporadaAparece;
        this.saludPokemon = saludPokemon;
        this.nombrePokemon = nombrePokemon;
        this.sexoPokemon = sexoPokemon;
        this.pesoPokemon = pesoPokemon;
    }
   
    /*  Declaracion de getters y setters    */
    
    /*Getter y setter para numPokedex*/
    protected int getNumPokedex() {
        return numPokedex;
    }

    protected void setNumPokedex(int numPokedex) {
        this.numPokedex = numPokedex;
    }
    /*Fin del getter y setter para numPokedex*/
    
    /*Getter y setter para temporadaAparece*/
    protected int getTemporadaAparece() {
        return temporadaAparece;
    }

    protected void setTemporadaAparece(int temporadaAparece) {
        this.temporadaAparece = temporadaAparece;
    }
    /*Fin del getter y setter para temporadaAparece*/
    
    /*Getter y setter para nombrePokemon*/
    protected String getNombrePokemon() {
        return nombrePokemon;
    }

    protected void setNombrePokemon(String nombrePokemon) {
        this.nombrePokemon = nombrePokemon;
    }
    /*Fin del getter y setter para nombrePokemon*/
    
    /*Getter y setter para sexoPokemon*/
    protected String getSexoPokemon() {
        return sexoPokemon;
    }

    protected void setSexoPokemon(String sexoPokemon) {
        this.sexoPokemon = sexoPokemon;
    }
    /*Fin del getter y setter para sexoPokemon*/
    
    /*Getter y setter para pesoPokemon*/
    protected double getPesoPokemon() {
        return pesoPokemon;
    }

    protected void setPesoPokemon(double pesoPokemon) {
        this.pesoPokemon = pesoPokemon;
    }
    /*Fin del getter y setter para pesoPokemon*/

    /*Getter y setter para saludPokemon*/
     public int getSaludPokemon() {
        return saludPokemon;
    }
     
    public void setSaludPokemon(int saludPokemon) {    
        this.saludPokemon = saludPokemon;
    }
    /*Fin del getter y setter para saludPokemon*/
    
    /*  Declaracion de metodos abstractos   */
    protected abstract void atacarPlacaje();
    protected abstract void atacarAraniazo();
    protected abstract void atacarMordisco();
    protected abstract void mostrarAtaques();
}
