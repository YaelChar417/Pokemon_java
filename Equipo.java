/*
* Autor: Yael Charles Marin
* Fecha: 24/06/2024
* Descripcion: la clase Equipo se le agregan seis objetos de Pokemon, los cuales 
* podrás observar sus ataques, cambiar un pokemon por otro y añadir pokemon a tu
* equipo
*/
package main;

public class Equipo {
    //atributo vector para almacenar 6 objetos de Pokemon
    public Pokemon[] equipo = new Pokemon[6];
    //atributo para manejar las posiciones del vector
    private int pokemon_registrados = 0;
    
    //constructor vacio
    public Equipo() {
    }
    
    /*  Declaracion de metodos */
    
    /*
    * Funcion agrega el objeto pokemon al vector del equipo, donde usando un if
    * verifica que no se exceda la longitud del arreglo y si esto no ocurre 
    * agrega el objeto en la posicion definida por el atributo de pokemon 
    * registrados, si si excede el tamaño imprime un mensaje de error
    * 
    * Params: Pokemon, recibe un objeto de la clase pokemon, que al ser padre,
    * este puede ser de cualquiera de sus 4 clases hijas
    * Returns: No retorna parametros
    */
    public void agregarPokemon(Pokemon p1){
        if(pokemon_registrados < equipo.length)
        {
            equipo[pokemon_registrados] = p1;
        pokemon_registrados++;
        }else
        {
            System.out.println("Tienes ya 6 Pokemon en tu equipo, por favor "
                    + "quita alguno...");
        }
    }
    
    /*
    * Funcion que empieza a recorrer el vector equipo desde la posicion que se 
    * desea eliminar, y va hasta el ultimo elemento del arreglo actual, donde la
    * posicion que se desea eliminar se le actualiza por la de la posicion 
    * siguiente y se repite hasta el fin de los pokemon registrados, donde para 
    * finalizar se borra la ultima posicion del arreglo para que no salga repetido
    * y se resta a los pokemon registrados.
    * 
    * Params: int, representa la posicion del arreglo de la cual se desea quitar
    * un objeto
    * Returns: No retorna parametros
    */
    public void quitarEquipo(int num) {
        for (int i = num - 1; i < pokemon_registrados - 1; i++) 
        {
            equipo[i] = equipo[i + 1];
        }
        equipo[pokemon_registrados - 1] = null;
        pokemon_registrados--;
    }
    
    /*
    * Funcion sustituye una posicion en especifico del arreglo por otro objeto
    * 
    * Params: int, Pokemon, el primero representa la posicion que se desea 
    * cambiar y el segundo es el objeto por el cual se cambiara
    * Returns: No retorna parametros
    */
    public void cambiarPokemon(int num, Pokemon p1){
        equipo[num - 1] = p1;
    }
    
    /*
    * Funcion imprime los datos de nombre, sexo y movimientos de los pokemon que
    * esten registrados en el vector de equipo
    * 
    * Params: No recibe parametros
    * Returns: No retorna parametros
    */
    public void mostrarEquipo(){
        for(int i = 0; i < equipo.length; i++)
        {
            if(equipo[i] != null)
            {
                System.out.println("Nombre Pokemon " + (i+1) + ": " 
                    + equipo[i].getNombrePokemon() 
                    + "\nSexo Pokemon " + (i+1) + ": " 
                    + equipo[i].getSexoPokemon() 
                    + "\nMovimientos del Pokemon " + (i+1)); 
                equipo[i].mostrarAtaques();
                System.out.println("---------------------------------------");
            }else
            {
                System.out.println("");
            }
            
        }
    }
    
}
