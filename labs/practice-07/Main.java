class Main {
  public static void main(String[] args) {
    System.out.println("Hello world!");
    Gerente ger = new Gerente();
    System.out.println(ger);

    ger.setNombre("Romina Perez");
    ger.setNumEmpleado(2365);
    ger.setSueldo(35_000);
    System.out.println(ger);
    System.out.println(ger.getNombre());
    ger.setPresupuesto(90_000);
    System.out.println(ger);

    Gerente ger2 = new Gerente("Samuel Torres", 8367, 15_000, 25_000);
    System.out.println(ger2);

    Ballena ballena1 = new Ballena();
    ballena1.setNombre("Mobby Dick");
    System.out.println(ballena1.getNombre());

    Perro perro1 = new Perro();
    perro1.setNombre("Firulais");
    System.out.println(perro1.getNombre());

    Pajaro pajaro1 = new Pajaro();
    pajaro1.setNombre("Tony");
    System.out.println(pajaro1.getNombre());

  }
}