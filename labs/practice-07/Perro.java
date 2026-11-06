public class Perro extends AnimalAcuatico{
  private String collar;

  public Perro(){}

  public void hacerTrucos(){
    System.out.println("Estoy haciendo trucos");
  }

  public void setCollar(String collar){
    this.collar = collar;
  }

  public String getCollar(){
    return collar;
  }

}