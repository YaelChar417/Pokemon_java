/*
* Autor: Yael Charles Marin
* Fecha: 24/06/2024
* Descripcion: clase hija de "Pokemon" que además tiene la implementación de la
* interfaz de "IPlanta", por lo que además de los atributos y metodos genericos 
* también tiene los metodos de la interfaz y se sobreescribiran los metodos de
* la clase padre.
*/
package main;

public class Planta extends Pokemon implements IPlanta{
    //Constructor vacio
    public Planta() {
    }
    
    //Constructor que recibe parametros
    public Planta(int numPokedex, int temporadaAparece, int saludPokemon, 
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
        System.out.println("Pokemon: " + getNombrePokemon() + " tipo planta "
                + "ataco con placaje ");
    }

    @Override
    protected void atacarAraniazo() {
        System.out.println("Pokemon: " + getNombrePokemon() + " tipo planta "
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
        System.out.println("Pokemon: " + getNombrePokemon() + " tipo planta "
                + "ataco con mordisco");
    }
    
    /*
    * Funcion que imprime los ataques de los pokemon declarados con la clase
    * planta
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void mostrarAtaques(){
        System.out.println("1.- Placaje");
        System.out.println("2.- Araniazo");
        System.out.println("3.- Mordisco");
        System.out.println("4.- Paralizar");
        System.out.println("5.- Drenaje");
        System.out.println("6.- Latigo cepa");
        System.out.println("7.- Hoja afilada");
    }

    /*  Sobreescritura de los metodos declarados en la interfaz IPlanta */
    
    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando paralizar
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void atacarParalizar() {
        System.out.println("Pokemon: " + getNombrePokemon() + " ataco con "
                + "paralizar");
    }

    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando drenaje
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void atacarDrenaje() {
        System.out.println("Pokemon: " + getNombrePokemon() + " ataco con "
                + "drenaje");
    }

    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando hoja afilada
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void atacarHoja_afilada() {
        System.out.println("Pokemon: " + getNombrePokemon() + " ataco con "
                + "hoja afilada");
    }

    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando latigo cepa
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void atacarLatigo_cepa() {
        System.out.println("Pokemon: " + getNombrePokemon() + " ataco con "
                + "latigo cepa");
    }
}
