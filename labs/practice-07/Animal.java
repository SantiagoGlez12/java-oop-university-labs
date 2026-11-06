public class Animal{
  private String nombre;
  private String lugarOrigen;
  private String color;

  public Animal(){}

  public void hacerSonido(String sonido){
    System.out.println("Estoy haciendo un sonido "+sonido);
  }

  public void comer(){
    System.out.println("Estoy comiendo");
  }

  public void setNombre(String nombre){
    this.nombre = nombre;
  }
  public String getNombre(){
    return nombre;
  }

  public void setLugarOrigen(String lugarOrigen){
    this.lugarOrigen = lugarOrigen;
  }

  public String getLugarOrigen(){
    return lugarOrigen;
  }

  public void setColor(String color){
    this.color = color;
  }

  public String getColor(){
    return color;
  }
}