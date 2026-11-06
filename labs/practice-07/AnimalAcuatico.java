public class AnimalAcuatico extends Animal{
  private int aletas;

  public AnimalAcuatico(){}

  public void nadar(){
    System.out.println("estoy nadando");
  }

  public void setAletas(int aletas){
    this.aletas = aletas;
  }

  public int getAletas(){
    return aletas;
  }
  
  @Override
  public void comer(){
    System.out.println("Estoy comiendo peces");
  }
}