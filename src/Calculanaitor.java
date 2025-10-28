
public class Calculanaitor {

	public static void main(String[] args) {

        System.out.println("=== Calculadora basica ===");
        int a = 10;
        int b = 5;

        System.out.println("Suma: " + (a + b));
        System.out.println("Resta: " + (a - b));
        System.out.println("Multiplicacion: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Potencia: " + Math.pow(a, b));
        System.out.println("Porcentaje: " + ((a * b) / 100.0));
        System.out.println("Arrel de a " + Math.sqrt(a));
        System.out.println("Arrel de b " + Math.sqrt(b));
    }
}
