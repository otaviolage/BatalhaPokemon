class Main {
  public static void main(String[] args) {
    
    //instanciar pokemons que irão batalhar

    /* TIPOS DE POKEMON:
    - Fogo
    - Água
    - Grama
    - Eletrico

    [digitar exatamente conforme acima]
    */  

    Pokemon meuPokemon = new Pokemon("Charmander", "Fogo", 85);
    Pokemon outroPokemon = new Pokemon("Pikachu", "Eletrico", 85);
    

    //instanciar e iniciar a batalha
    Batalha batalha = new Batalha(meuPokemon, outroPokemon);
  }
}