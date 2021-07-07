//primero los paquetes
package PasoPorReferencia;

//importaciones
import People.Persona;

public class PasoReferencia {
  public static void main(String[] args) {

    Persona persona1 = new Persona();
    persona1.name = "Jhosep";

    System.out.println("Persona 1 nombre : " + persona1.name);

    cambiarValor(persona1);

    System.out.println("Persona 1 cambio nombre : " + persona1.name);

  }

  public static void cambiarValor(Persona personaArg) {
    personaArg.name = "Geyvi";
  }
}
