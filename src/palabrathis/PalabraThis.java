package palabrathis;

public class PalabraThis {
  public static void main(String[] args) {
    Celular celJhosep = new Celular("Android", "Huawei");

    System.out.println("\nCel Jhosep = " + celJhosep);
    System.out.println("Cel Jhosep = " + celJhosep.sistema);
    System.out.println("Cel Jhosep = " + celJhosep.marca);

  }
}

class Celular {
  String sistema;
  String marca;

  Celular(String sistema, String marca) {
    // super(); llamada al constructor de la clase Padre (object)
    this.sistema = sistema;
    this.marca = marca;
    System.out.println("\nObjeto celular usando this : " + this);

    new Imprimir().imprimir(this);
  }
}

class Imprimir {
  public void imprimir(Celular celuarArgs) {
    System.out.println("\nCelular desde imprimir : " + celuarArgs);
    System.out.println("Impresion del objeto actual (this) : " + this);

  }
}
