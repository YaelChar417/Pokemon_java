/*
* Autor: Yael Charles Marin
* Fecha: 24/06/2024
* Descripcion: clase hija de "Pokemon" que además tiene la implementación de la
* interfaz de "IFuego", por lo que además de los atributos y metodos genericos 
* también tiene los metodos de la interfaz y se sobreescribiran los metodos de
* la clase padre.
*/
package main;

public class Fuego extends Pokemon implements IFuego{
    // Constructor vacio
    public Fuego() {
    }
    
    // Constructor que recibe parametros
    public Fuego(int numPokedex, int temporadaAparece, int saludPokemon, 
            String nombrePokemon, String sexoPokemon, double pesoPokemon) {
        super(numPokedex, temporadaAparece, saludPokemon, nombrePokemon, 
                sexoPokemon, pesoPokemon);
    }
    
    /*  Sobreescritua de metodos declarados en la clase Pokemon     */
    
    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando placaje
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    protected void atacarPlacaje() {
        System.out.println("Pokemon: " + getNombrePokemon() + " tipo fuego "
                + "ataco con placaje ");
    }

    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando araniazo
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    protected void atacarAraniazo() {
        System.out.println("Pokemon: " + getNombrePokemon() + " tipo fuego "
                + "ataco con araniazo");
    }

    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando mordisco
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    protected void atacarMordisco() {
        System.out.println("Pokemon: " + getNombrePokemon() + " tipo fuego "
                + "ataco con mordisco");
    }
    
    /*
    * Funcion que imprime los ataques de los pokemon declarados con la clase 
    * Fuego
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void mostrarAtaques(){
        System.out.println("1.- Placaje");
        System.out.println("2.- Araniazo");
        System.out.println("3.- Mordisco");
        System.out.println("4.- Ascuas");
        System.out.println("5.- Punio fuego");
        System.out.println("6.- Pirotecnia");
        System.out.println("7.- Lanzallamas");
    }
    
    /*  Sobreescritura de los metodos declarados en la interfaz IFuego*/
    
    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando punio fuego
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void atacarPunio_fuego() {
        System.out.println("Pokemon: " + getNombrePokemon() + " ataco con "
                + "punio fuego");
    }

    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando ascuas
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void atacarAscuas() {
        System.out.println("Pokemon: " + getNombrePokemon() + " ataco con "
                + "ascuas");
    }

    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando lanzallamas
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void atacarLanzallamas() {
        System.out.println("Pokemon: " + getNombrePokemon() + " ataco con "
                + "lanzallamas");
    }
    
    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando pirotecnia
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void atacarPirotecnia(){
        System.out.println("Pokemon: " + getNombrePokemon() + " ataco con "
                + "pirotecnia");
    }
    
}
