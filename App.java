import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese lado del triángulo equilátero: ");
        double lado = scanner.nextDouble();
        double perimetro=3 * lado;
        double altura=(lado * Math.sqrt(3)) / 2;
        double area=(Math.pow(lado, 2) * Math.sqrt(3)) / 4;
        System.out.println("\nResultados:");
        System.out.println("Perímetro del triángulo: " + perimetro);
        System.out.println("Altura del triángulo: " + altura);
        System.out.println("Área del triángulo: " + area);
        scanner.close();
    }
}
