package Operations;

public class Aritmetica {
    // Attributes of the class
    int a;
    int b;

    // Constructor
    public Aritmetica() {
        System.out.println("Se ejecuta el primer constructor");
    }

    public Aritmetica(int valor1, int valor2) {
        System.out.println("se ejecuta el segundo constructor");
        this.a = valor1;
        this.b = valor2;
    }

    // Methods of the class
    public void sumar() {
        int result = a + b;
        System.out.println("resulted = " + result);
    }

    public int sumarYresta() {
        return this.a + this.b;
    }

    public int productoConRetorno() {
        return this.a * this.b;
    }

    public int multiplication(int valor1, int valor2) {
        this.a = valor1; // el argumento valor1 se asigna al atributo "a"
        this.b = valor2;

        return this.productoConRetorno();
    }

}
