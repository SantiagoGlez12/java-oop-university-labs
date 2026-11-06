public class AnimalAereo extends Animal{
  private int alas;

  public AnimalAereo(){}

  public void volar(){
    System.out.println("estoy volando");
  }

  public void setAlas(int alas){
    this.alas = alas;
  }

  public int getAlas(){
    return alas;
  }
  
  @Override
  public void comer(){
    System.out.println("Estoy comiendo insectos");
  }
}