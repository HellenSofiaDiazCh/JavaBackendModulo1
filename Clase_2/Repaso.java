import java.util.Scanner;

public class Repaso {
    public static void main(String[] args) {
        String nombre = "Hellen";
        int edad = 17;
        Double altura = 1.47;

        System.out.println("Mi nombre es: " + nombre + ", tengo " + edad + " años y mido " + altura + " metros.");

        String nombre2;
        int edad2;
        double altura2;

        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese su nombre:");
        nombre2 = entrada.nextLine();
        System.out.println("Ingrese su edad:");
        edad2 = entrada.nextInt();
        System.out.println("Ingrese su altura:");
        altura2 = entrada.nextDouble();
        System.out.println("Hola, mi nombre es " + nombre2 + ", tengo " + edad2 + " años y mido " + altura2 + " metros.");
    }
}