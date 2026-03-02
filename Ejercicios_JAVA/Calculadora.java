import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) {
            // 1. Mostrar el menú
            System.out.println("\n--- MI CALCULADORA ---");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Potencia");
            System.out.println("6. Salir");
            System.out.print("Elige una opcion: ");
            opcion = sc.nextInt();

            // 2. Si elige una operacion (del 1 al 5), pedimos los numeros
            if (opcion >= 1 && opcion <= 5) {
                System.out.print("Ingresa el primer numero (a): ");
                double a = sc.nextDouble();
                System.out.print("Ingresa el segundo numero (b): ");
                double b = sc.nextDouble();

                // 3. Ejecutar la operacion segun la opcion
                switch (opcion) {
                    case 1:
                        System.out.println("Resultado: La suma es " + (a + b));
                        break;
                    case 2:
                        System.out.println("Resultado: La resta es " + (a - b));
                        break;
                    case 3:
                        System.out.println("Resultado: La multiplicacion es " + (a * b));
                        break;
                    case 4:
                        if (b == 0) {
                            System.out.println("Error: No puedes dividir por cero.");
                        } else {
                            System.out.println("Resultado: La division es " + (a / b));
                        }
                        break;
                    case 5:
                        System.out.println("Resultado: La potencia es " + Math.pow(a, b));
                        break;
                }
            } else if (opcion == 6) {
                System.out.println("¡Adios! Gracias por usar mi programa.");
            } else {
                System.out.println("Opcion invalida. Intenta de nuevo.");
            }
        }
        sc.close();
    }
}