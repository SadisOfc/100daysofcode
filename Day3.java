import java.util.Scanner;
public class Day3 {
    public static void main(String[] args) {
        Scanner l =  new Scanner(System.in);
        System.out.println("Int");
        int entero = Integer.parseInt(l.nextLine());
        System.out.println("Double");
        double doblao = Double.parseDouble(l.nextLine());
        System.out.println("Estreñi'o");
        String brr = l.nextLine();
        System.out.println(entero);
        System.out.println(doblao);
        System.out.println(brr);
        l.close();
    }
}
