import java.util.Scanner;
public class Day4 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Número 1");
        int num1 = l.nextInt();
        System.out.println("Número 2");
        int num2 = l.nextInt();
        System.out.println("Suma: " + (num1+num2));
        System.out.println("Resta: " + (num1-num2));
        System.out.println("Multiplicación: " + (num1*num2));
        System.out.println("División: " + (num1/num2));
        System.out.println();
        System.out.println("Área de un Rectángulo");
        double lado1 = l.nextInt();
        double lado2 = l.nextInt();
        System.out.printf("Área: %2.f", lado1*lado2);
        l.close();
    }
}
