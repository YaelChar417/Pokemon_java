/*
* Autor: Yael Charles Marin
* Fecha: 24/06/2024                   
* Descripcion: main del programa donde se instancian los objetos usando la clase
* Abstracta y las interfaces desarrolladas, asimismo se prueban los metodos 
* que se implementan en cada una de estas.
*/
package main;

public class main {
    public static void main(String[] args) {
        //Instancias de un objeto de cada clase.
        Agua poke1 = new Agua(1,1, 200,"Squirtle", "Macho",12.54);
        Electrico poke2 = new Electrico(2,1, 170, "Pikachu", "Hembra", 9.99);
        Fuego poke3 = new Fuego(3,1, 190,"Charmander", "Hembra", 14.2);
        Planta poke4 = new Planta(4,1,220,"Bulbasaur", "Macho", 17.02);
        Agua poke5 = new Agua(304, 3, 568, "Swampert", "Macho", 56);
        Electrico poke6 = new Electrico(444, 3, 497, "Manectric", "Hembra", 38);
        
        // Caso de prueba para la clase Agua e interfaz IAgua:
        poke1.atacarPlacaje(); // metodo generico
        poke1.atacarHidrobomba(); // metodo propio
        System.out.println("---------------------------------------------\n");
        // Caso de prueba para la clase Electrico e interfaz IElectrico:
        poke2.atacarAraniazo(); // metodo generico
        poke2.atacarImpactrueno(); // metodo propio
        System.out.println("---------------------------------------------\n");
        // Caso de prueba para la clase Fuego e interfaz IFuego:
        poke3.atacarMordisco(); // metodo generico
        poke3.atacarLanzallamas(); //metodo propio
        System.out.println("---------------------------------------------\n");
        // Caso de prueba para la clase Planta e interfaz IPlanta:
        poke4.atacarMordisco();
        poke4.atacarHoja_afilada();
        System.out.println("---------------------------------------------\n");
        
        // Instanciamos un objeto de la clase equipo
        Equipo team1 = new Equipo();
        //Agregamos nuestros 6 pokemon al equipo
        team1.agregarPokemon(poke1);
        team1.agregarPokemon(poke2);
        team1.agregarPokemon(poke3);
        team1.agregarPokemon(poke4);
        team1.agregarPokemon(poke5);
        team1.agregarPokemon(poke6);
        team1.agregarPokemon(poke1);
        //mostramos nuestro equipo
        /*DESCOMENTAR PARA USAR
        team1.mostrarEquipo();*/
        //podemos eliminar un miembro del equipo mandandole la posicion.
        team1.quitarEquipo(3);
        team1.quitarEquipo(6);
        team1.mostrarEquipo();
        //podemos sustituir miembros del equipo indicando la posicion y el 
        //miembro nuevo.
        team1.cambiarPokemon(2,poke6);
        team1.mostrarEquipo();
    }
}
