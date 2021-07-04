package Operations;

public class PruebaAritmetica {

  public static void main(String[] args) {

    Aritmetica arithmetical1 = new Aritmetica();
    arithmetical1.a = 5;
    arithmetical1.b = 7;
    arithmetical1.sumar();

    System.out.println(arithmetical1.sumarYresta());

    System.out.println("arithmetical1 multiplication = " + arithmetical1.multiplication(8, 8));

    Aritmetica aritmetica2 = new Aritmetica(8, 7);
    aritmetica2.sumar();

  }
}
