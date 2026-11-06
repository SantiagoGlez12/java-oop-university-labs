public class Ballena extends AnimalAcuatico{
  private int largo;

  public Ballena(){}

  public void pelearConPinoccio(){
    System.out.println("Estoy peleando con Pinoccio");
  }

  public void setLargo(int largo){
    this.largo = largo;
  }

  public int getLargo(){
    return largo;
  }

}