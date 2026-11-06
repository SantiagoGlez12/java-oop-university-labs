public class Pajaro extends AnimalAcuatico{
  private String pico;

  public Pajaro(){}

  public void recolectarRamas(){
    System.out.println("Estoy recolectando ramas");
  }

  public void setPico(String pico){
    this.pico = pico;
  }

  public String getPico(){
    return pico;
  }

}