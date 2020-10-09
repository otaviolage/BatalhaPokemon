public class Batalha {

  Pokemon[] pokemons = new Pokemon[2]; 
  Golpes[][] golpes = new Golpes[2][2]; 

  public Batalha(Pokemon pokemon1, Pokemon pokemon2) {
    pokemons[0] = pokemon1;
    pokemons[1] = pokemon2;
    golpes[0][0] = pokemons[0].golpe1;
    golpes[0][1] = pokemons[0].golpe2;
    golpes[1][0] = pokemons[1].golpe1;
    golpes[1][1] = pokemons[1].golpe2;
    System.out.println();

    pokemons[0].imprimePokemon();
    pokemons[1].imprimePokemon();
    System.out.println();

    System.out.println("\nA wild " + pokemons[1].getNome() + " appeared\n");
    System.out.println(pokemons[0].getNome() + " eu escolho você!!!\n");
    
    System.out.println("Vida do " + pokemons[0].getNome() + ": " + pokemons[0].getVida());
    System.out.println("Vida do " + pokemons[1].getNome() + ": " + pokemons[1].getVida());
    System.out.println();
    BatalhaPokemon();
  }

  // -------------------------- BATALHA POKEMON!!!!! --------------------------
  int a = 0, b = 1, c = 0; 
  //segundaArray - dos golpes
  int d = 0, contaSegundoCampo = 0;

  private void BatalhaPokemon() {

    do {
      Ataque();

      if (pokemons[b].getVida() <= 0) {
        System.out.println(pokemons[b].getNome() + " morreu\n");
        System.out.println(pokemons[a].getNome() + " venceu a batalha!");
        System.exit(0);
      }

      c = a;
      a = b;
      b = c;

      if(contaSegundoCampo == 0){
        contaSegundoCampo++;
      } else if (contaSegundoCampo == 3) {
        contaSegundoCampo = 0;
        d = 0;
      } else {
        contaSegundoCampo++;
        d = 1;
      };

    } while(pokemons[0].getVida() >= 0 || pokemons[1].getVida() >= 0);

  }
  
  private void Ataque() {
    System.out.println(pokemons[a].getNome() + " ataca com " + golpes[a][d].getGolpe());
      golpes[a][d].setDano(golpes[a][d].getDano() + pokemons[a].getAtaque() - pokemons[b].getDefesa());

      if (golpes[a][d].getDano() == 0){
        System.out.println("[O ataque não foi efetivo...]");
      }

      pokemons[b].setVida((pokemons[b].getVida() - golpes[a][d].getDano()));
      System.out.println(pokemons[b].getNome() + " está com " + pokemons[b].getVida() + " de vida");
      System.out.println();
  }
}
