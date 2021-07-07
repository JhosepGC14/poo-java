//primero los paquetes
package PasoPorReferencia;

//importaciones
import People.Persona;

public class PasoReferencia {
  public static void main(String[] args) {

    Persona persona1 = new Persona();
    persona1.name = "Jhosep";

    System.out.println("Persona 1 nombre : " + persona1.name);

    persona1 = cambiarValor(persona1);

    System.out.println("Persona 1 cambio nombre : " + persona1.name);

  }

  public static Persona cambiarValor(Persona personaArg) {
    if (personaArg == null) {
      System.out.println("Valor de persona invalido : null");
      return null;
    } else {
      personaArg.name = "Geyvi";
      return personaArg;
    }
  }
}
