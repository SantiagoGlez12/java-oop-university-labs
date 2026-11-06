public class TrianguloA extends PoligonoA{
  private int alfa, beta, gama;
  private float a, b, c;
  private float base, altura;

  public TrianguloA(){}

  public void setBase(float base){
    this.base = base;
  }

  public float getBase(){
    return base;
  }

  public void setAltura(float altura){
    this.altura=altura;
  }

  public float getAltura(){
    return altura;
  }

  @Override
  public double area(){
    return base*altura/2;
  }

  @Override 
  public double perimetro(){
    return a+b+c;
  }

  @Override
  public String toString(){
    return "TrianguloA{base ="+base+" altura ="+altura+"}";
  }

}