package pokemonsimulator;

public class Batalha {
    
    public static void estrategiaBatalha(Pokemon meuPokemon, Pokemon oponentePokemon)
    {
        System.out.println(".......................");
        System.out.println("...A Batalha começou...");
        
        int levelMeuPokemon;
        int vidaMeuPokemon;
        int ataqueMeuPokemon;
        int defesaMeuPokemon;
        
        levelMeuPokemon = meuPokemon.getlevel();
        vidaMeuPokemon = meuPokemon.getvida();
        ataqueMeuPokemon = meuPokemon.getataque();
        defesaMeuPokemon = meuPokemon.getdefesa();
        
        int levelOponentePokemon;
        int vidaOponentePokemon;
        int ataqueOponentePokemon;
        int defesaOponentePokemon;
        
        levelOponentePokemon = oponentePokemon.getlevel();
        vidaOponentePokemon = oponentePokemon.getvida();
        ataqueOponentePokemon = oponentePokemon.getataque();
        defesaOponentePokemon = oponentePokemon.getdefesa();
        
        do{
            if(levelMeuPokemon > levelOponentePokemon){
                if(ataqueMeuPokemon > defesaOponentePokemon){
                    vidaOponentePokemon = vidaOponentePokemon - 50;
                    System.out.println("Menos 50 vidas oponente");
                }
                else{
                    vidaMeuPokemon = vidaMeuPokemon - 50;
                    System.out.println("Menos 50 vidas sua");
                }
            }
            else{
               if(ataqueOponentePokemon > defesaMeuPokemon){
                   vidaMeuPokemon = vidaMeuPokemon - 50;
                   System.out.println("Menos 50 vidas sua");
               }
               else{
                   vidaOponentePokemon = vidaOponentePokemon - 50;
                   System.out.println("Menos 50 vidas oponente");
               }
            }
        }while(vidaMeuPokemon > 0 && vidaOponentePokemon > 0);
        
        if(vidaMeuPokemon > vidaOponentePokemon){
            System.out.println("Vida oponente = 0");
            System.out.print("VOCÊ GANHOU!!!");
        }
        else{
            System.out.println("Sua vida = 0");
            System.out.print("VOCÊ PERDEU !!!");
        }
    }
}
