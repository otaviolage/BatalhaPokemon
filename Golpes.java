public class Golpes {

  public String golpe;
  public String tipoDoGolpe;
  public int dano;

  public Golpes(String golpe, String tipoDoGolpe, int dano) {
    this.golpe = golpe;
    this.tipoDoGolpe = tipoDoGolpe;
    this.dano = dano;
  }

  public String getGolpe() {
    return this.golpe;
  }

  public String getTipoDoGolpe() {
    return this.tipoDoGolpe;
  }

  public int getDano() {
    if (this.dano <= 0) {
      return 0;
    } else {
      return this.dano;
    }
  }

  public void setDano(int dano) {
    this.dano = dano;
  }
}