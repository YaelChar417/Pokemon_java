/*
* Autor: Yael Charles Marin
* Fecha: 24/06/2024
* Descripcion: clase hija de "Pokemon" que además tiene la implementación de la
* interfaz de "IElectrico", por lo que además de los atributos y metodos 
* genericos también tiene los metodos de la interfaz y se sobreescribiran los 
* metodos de la clase padre.
*/
package main;

public class Electrico extends Pokemon implements IElectrico{
    //Constructor vacio
    public Electrico() {
    }
    
    //Constructor que recibe parametros
    public Electrico(int numPokedex, int temporadaAparece, int saludPokemon, 
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
        System.out.println("Pokemon: " + getNombrePokemon() + " tipo electrico "
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
        System.out.println("Pokemon: " + getNombrePokemon() + " tipo electrico "
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
        System.out.println("Pokemon: " + getNombrePokemon() + " tipo electrico "
                + "ataco con mordisco");
    }
    
    /*
    * Funcion que imprime los ataques de los pokemon declarados por la clase
    * Electrico
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void mostrarAtaques(){
        System.out.println("1.- Placaje");
        System.out.println("2.- Araniazo");
        System.out.println("3.- Mordisco");
        System.out.println("4.- Rayo carga");
        System.out.println("5.- Punio trueno");
        System.out.println("6.- Rayo");
        System.out.println("7.- Impactrueno");
    }
    
    /*  Sobreescritura de los metodos declarados en la interfaz IElectrico  */
    
    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando impactrueno
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void atacarImpactrueno() {
        System.out.println("Pokemon: " + getNombrePokemon() + " ataco con "
                + "impactrueno");
    }

    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando punio trueno
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void atacarPunio_trueno() {
        System.out.println("Pokemon: " + getNombrePokemon() + " ataco con "
                + "punio trueno");
    }
    
    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando rayo
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void atacarRayo() {
        System.out.println("Pokemon: " + getNombrePokemon() + " ataco con "
                + "rayo");
    }

    /*
    * Funcion que usa el getter del nombre para imprimir que el pokemon atacó
    * usando rayo carga
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    @Override
    public void atacarRayo_carga() {
        System.out.println("Pokemon: " + getNombrePokemon() + " ataco con "
                + "rayo carga");
    }
   
}
