import java.util.Scanner;

import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //Declarar variables
        int edad;
        double salario;
        float promedio;
        char sexo; 
        boolean estado;
        String nombres;

        //entrada de datos por consola
        Scanner entrada = new Scanner(System.in);
        
        System.out.println( "Digite el nombre del estudiante: ");
        nombres = entrada.nextLine(); //Johan Manuel
        System.out.println("Digite la edad: ");
        edad = entrada.nextInt();
        System.out.println("Digite el salario: ");
        salario = entrada.nextDouble();
        System.out.println("Digite el sexo: ");
        sexo = entrada.next().charAt(0); //johan - j
        System.out.println("Digite el estado del estudiante: ");
        estado = entrada.nextBoolean();

        //salida de datos por consola
        System.out.println("El nombre del estudiante es: "+nombres);
        System.out.println("La edad del estudiante es: "+edad);
        System.out.println("El salario del estudiante es: "+salario);
        System.out.println("El sexo del estudiante es: "+sexo);
        System.out.println("El estado del estudiante es: "+estado);









        //entrada de datos por ventana emergente
        nombres = JOptionPane.showInputDialog("Digite el nombre del estudiante: ");
        edad = Integer.parseInt(JOptionPane.showInputDialog("Digite la edad del estudiante: "));
        salario = Double.parseDouble(JOptionPane.showInputDialog("Digite el salario del estudiante: "));
        promedio = Float.parseFloat(JOptionPane.showInputDialog("Digite el promedio del estudiante: "));
        sexo = JOptionPane.showInputDialog("Digite el sexo del estudiante: ").charAt(0);
        estado = Boolean.parseBoolean(JOptionPane.showInputDialog("Digite el estado del estudiante: "));

        //salida de datos por ventana emergente
        JOptionPane.showMessageDialog(null, "Nombre: "+ nombres);
        JOptionPane.showMessageDialog(null, "Edad: "+ edad);





    }
}
