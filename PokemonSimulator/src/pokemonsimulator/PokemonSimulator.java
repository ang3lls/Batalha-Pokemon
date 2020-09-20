
package pokemonsimulator;

/**
 *
 * @author angelina
 */

public class PokemonSimulator {
    public static void main(String[] args) {
        
        //Instanciando um objeto
        Pokemon meuPokemon = new Pokemon("Charmander", "Fogo", 20);
        Pokemon oponentePokemon = new Pokemon("Squirtle", "Água", 50);
        
        meuPokemon.imprimirPokemons();
        oponentePokemon.imprimirPokemons();
        
        Batalha.estrategiaBatalha(meuPokemon, oponentePokemon);
    }
    
}
