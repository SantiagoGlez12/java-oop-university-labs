class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");

    Poligono poligono1= new Poligono();
    Triangulo triangulo1 = new Triangulo();
    Cuadrilatero cuadrilatero1 = new Cuadrilatero();

    System.out.println(poligono1);
    System.out.println(triangulo1);
    System.out.println(cuadrilatero1);
    System.out.println(poligono1.area());
    System.out.println(triangulo1.area());
    System.out.println(cuadrilatero1.area());


    System.out.println("********Clase Abstractas*******");

    //PoligonoA pol = new PoligonoA();->No se puede instanciar
    TrianguloA triangulo2 = new TrianguloA();
    CuadrilateroA cuadrilatero2 = new CuadrilateroA();
    System.out.println(triangulo2);
    System.out.println(cuadrilatero2);
    System.out.println(triangulo2.perimetro());
    System.out.println(cuadrilatero2.perimetro());


    System.out.println("********Interfaz*******");
    InstrumentoViento iv = new InstrumentoViento();
    Flauta flauta = new Flauta();
    System.out.println(iv);
    System.out.println(flauta);



    System.out.println("*********Atributos en Interfaces*********");
    System.out.println("El mes "+Meses.NUEVE+" correspone a:");
    System.out.println(Meses.NOMBRES_MESES[Meses.NUEVE]);

    System.out.println("El vlor de pi es: "+Math.PI);
    System.out.println("El vlor de pi es: "+(float)Math.PI);
    System.out.println("El vlor de pi es: "+(int)Math.PI);
  }
}