
import java.util.Scanner;

public class Calculadora_Binaria {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Binary Calculator");
        System.out.println("1. Add");
        System.out.println("2. Subtract");
        System.out.println("3. Binary to Hex and Octal");
        System.out.println("3. Exit");
        System.out.print("Type a number to select an option: ");
        
        int option = scanner.nextInt();
        
        switch (option) {
            case 1 -> {
                System.out.print("Enter first binary number: "); 
                String bin1 = scanner.next();
                System.out.print("Enter second binary number: ");
                String bin2 = scanner.next();
                addBinary(bin1, bin2);
            }
            case 2 -> {
                System.out.print("Enter the binary number to reduce: ");
                String bin1 = scanner.next();
                System.out.print("Enter the binary number to subtract: ");
                String bin2 = scanner.next();
                subtractBinary(bin1, bin2);
            }
            case 3 -> {
                System.out.print("Enter a number for conversion: ");
                String numeroBinario = scanner.next();
                convert(numeroBinario);
            }
            default -> System.out.println("Invalid option. Try again.");
        }

        scanner.close();
    }//End Main

    private static void addBinary(String bin1, String bin2) {
        //convierte una cadena de texto que representa un número binario a su equivalente numérico entero y lo convierte a un numero de tipo float.
        //el método "parseInt", que es 2, indica que la cadena debe interpretarse como un número en base binaria.
        float num1 = Integer.parseInt(bin1, 2);
        float num2 = Integer.parseInt(bin2, 2);
        float add = num1 + num2;
        System.out.println("Result of addition: " + add);
    }//End "addBinary" method

    private static void subtractBinary(String bin1, String bin2) {
        float num1 = Integer.parseInt(bin1, 2);
        float num2 = Integer.parseInt(bin2, 2);
        float subtract = num1 - num2;
        System.out.println("Result of addition: " + subtract);
    }//End "subtractBinary" method

    private static void convert(String numeroBinario) {
        int numero = Integer.parseInt(numeroBinario, 2);
        String hex = Integer.toHexString(numero); // convierte un número entero a una representación en base hexadecimal y el resultado es una cadena de texto.
        String oct = Integer.toOctalString(numero); //convierte un número entero a una representación en base octal y el resultado es una cadena de texto.
        System.out.println("Hexadecimal: " + hex);
        System.out.println("Octal: " + oct);
    }//End "Convert" method
}//End "Calculadora_Binaria" class
