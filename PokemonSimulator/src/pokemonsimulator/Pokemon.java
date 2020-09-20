
package pokemonsimulator;


public class Pokemon {
    
    //Atributos Encapsulados
    private String nome; //nome do pokemon (ex:Pikachu)
    private String tipo; //tipo do pokemon (ex:elétrico)
    private int level;
    private int vida = 200; 
    private int ataque;
    private int defesa;
    
    //Construtor
    public Pokemon(String nome, String tipo, int level){
        this.nome = nome;
        this.tipo = tipo;
        this.level = level;
        calculaAtributos();
        calculaBonus();
    }
    
    //Get
    public int getlevel(){
        return this.level;
    }
    
    public int getvida(){
        return this.vida;
    }
    
    public int getataque(){
        return this.ataque;
    }
    
    public int getdefesa(){
        return this.defesa;
    }
    
    //Set
    public void setNome(String nome){
        this.nome = nome;
    }
    
    //Métodos
    public void imprimirPokemons(){
        System.out.println("Nome: " + nome + " | " +
                           "Tipo: " + tipo + " | " + 
                           "Level: " + level + " | " + 
                           "Vida: " + vida + " | " + 
                           "Ataque: " + ataque + " | " +
                           "Defesa: " + defesa + " | " ); 
    }
    
    public void calculaAtributos(){
        switch(tipo){
            case "Fogo":
                ataque = 70;
                defesa = 30;
            break;
            case "Água":
                ataque = 40; 
                defesa = 60; 
            break; 
            case "Terra": 
                ataque = 50; 
                defesa = 100; 
            break; 
            case "Ar": 
                ataque = 100; 
                defesa = 20; 
            break; 
        }            
    }
        
    public void calculaBonus(){
        ataque = ataque + (level / 3);
        defesa = defesa + (level / 4);
    }
}
    

