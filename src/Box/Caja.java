package Box;

public class Caja {
  int width;
  int height;
  int depth;

  public Caja() {
    System.out.println("Se ejecuta el constructor vacio.");
  }

  public Caja(int ancho, int alto, int profundidad) {
    System.out.println("Se ejecuta el constructor con parametros.");
    this.width = ancho;
    this.height = alto;
    this.depth = profundidad;
  }

  public void Perimeter() {
    System.out.println("El volumen de la Caja es : " + (this.width * this.height * this.depth));
  }

}
