/*
* Autor: Yael Charles Marin
* Fecha: 24/06/2024
* Descripcion: clase hija de "Pokemon" que además tiene la implementación de la
* interfaz de "IAgua", por lo que además de los atributos y metodos genericos 
* también tiene los metodos de la interfaz y se sobreescribiran los metodos de
* la clase padre.
*/
package main;

public class Agua extends Pokemon implements IAgua{
    //Constructor vacio
    public Agua() {
    }
    
    //Constructor con parametros
    public Agua(int numPokedex, int temporadaAparece, int saludPokemon, 
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
    public void atacarPlacaje() {
        System.out.println("Pokemon: " + getNombrePokemon() + " tipo agua "
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
    public void atacarAraniazo() {
        System.out.println("Pokemon: " + getNombrePokemon() + " tipo agua "
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
    public void atacarMordisco() {
        System.out.println("Pokemon: " + getNombrePokemon() + " tipo agua "
                + "ataco con mordisco");
    }
    
    /*
    * Funcion que imprime los ataques de los pokemon declarados por la clase 
    * Agua
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void mostrarAtaques(){
        System.out.println("1.- Placaje");
        System.out.println("2.- Araniazo");
        System.out.println("3.- Mordisco");
        System.out.println("4.- Pistola de agua");
        System.out.println("5.- Burbuja");
        System.out.println("6.- Hidropulso");
        System.out.println("7.- Hidrobomba");
    }
    
    /*  Sobreescritura de los metodos declarados en la interfaz IAgua*/
    
    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando hidrobomba
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void atacarHidrobomba() {
        System.out.println("Pokemon: " + getNombrePokemon() + " ataco con "
                + "hidrobomba");
    }
    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando pistola agua
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void atacarPistola_agua() {
        System.out.println("Pokemon: " + getNombrePokemon() + " ataco con "
                + "pistola de agua");
    }
    
    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando burbuja
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void atacarBurbuja() {
        System.out.println("Pokemon: " + getNombrePokemon() + " ataco con "
                + "burbuja");
    }

    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando hidropulso
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void atacarHidropulso() {
        System.out.println("Pokemon: " + getNombrePokemon() + " ataco con "
                + "hidropulso");
    }
}
