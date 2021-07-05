
package Box;

public class PruebaCaja {
  public static void main(String[] args) {

    int x = 10;

    // Example con constructor vacio.
    Caja boxOne = new Caja();
    boxOne.width = 3;
    boxOne.height = 2;
    boxOne.depth = 6;
    boxOne.Perimeter();

    // Example con parametros en el constructor.
    Caja boxTwo = new Caja(3, 2, 6);
    boxTwo.Perimeter();

    // Paso de valores en Java
    System.out.println("Valor en method main : " + x);
    cambioValor(x);
  }

  // Paso por valor en JAVA
  public static void cambioValor(int arg1) {
    System.out.println("valor en method arg1 : " + arg1);
  }
}
