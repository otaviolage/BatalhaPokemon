public class Pokemon {

  // atributos genéricos de um pokemon
  public String nome;
  public String tipo;
  public int level;
  public int vida = 100;
  public int ataque;
  public int defesa;
  public Golpes golpe1;
  public Golpes golpe2;

  public Pokemon(String nome, String tipo, int level) {
    this.nome = nome;
    this.tipo = tipo;
    this.level = level;

    calculaAtributos();
    calculaBonus();
  };

  public int getVida() {
    return this.vida;
  }

  public void setVida(int vida) {
    this.vida = vida;
  }

  public int getAtaque() {
    return this.ataque;
  }

  public int getDefesa() {
    return this.defesa;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public String getTipo() {
    return this.tipo;
  }

  private void calculaAtributos() {
    switch (tipo) {
    case "Fogo":
      vida = vida - 10;
      ataque = 70;
      defesa = 20;
      golpe1 = new Golpes("Ember", "fogo", 20);
      golpe2 = new Golpes("Flamethrower", "fogo", 45);
      break;

    case "Água":
      vida = vida - 5;
      ataque = 40;
      defesa = 35;
      golpe1 = new Golpes("Water Gun", "Água", 18);
      golpe2 = new Golpes("Hydro Pump ", "Água", 43);
      break;

    case "Grama":
      vida = vida + 20;
      ataque = 35;
      defesa = 40;
      golpe1 = new Golpes("Vine Whip", "Grama", 15);
      golpe2 = new Golpes("Razor Leaf ", "Grama", 38);
      break;

    case "Eletrico":
      vida = vida + 25;
      ataque = 50;
      defesa = 25;
      golpe1 = new Golpes("Thunder Wave ", "Eletrico", 23);
      golpe2 = new Golpes("Thunderbolt ", "Eletrico", 50);
      break;

    }
  }

  private void calculaBonus() {
    vida = vida + (level * 2);
    ataque = ataque + (level * 2);
    defesa = defesa + (level * 2);
  }

  public void imprimePokemon() {
    System.out.println(nome + " | " +
     "Tipo: " + tipo + " | " +
     "Level: " + level + " | " +
     "Vida: " + vida + " | " + 
     "Ataque: " + ataque + " | " + 
     "Defesa: " + defesa);

  }
}
