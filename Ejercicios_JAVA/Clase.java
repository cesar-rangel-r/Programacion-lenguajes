import java.util.Scanner;

public class Clase {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int contador = 1;       
        int producto = 1;       
        int numeroActual;      

        System.out.println(" Multiplique  3 Números Enteros");

        
        while (contador <= 3) {
            System.out.print("Introduce el número entero #" + contador + ": ");
            
            
            numeroActual = teclado.nextInt();
            
            
            producto = producto * numeroActual;
            
            
            contador++;
        }

    
        System.out.println("\nCálculo finalizado.");
        System.out.println("El resultado de multiplicar los 3 enteros es: " + producto);
        
        teclado.close();
    }
}