import java.util.Scanner;

public class Day8 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int paroimpar = l.nextInt();
        if(paroimpar%2==0){
            System.out.println("Número par");
        }else{
            System.out.println("Número impar");
        }

        int n1 = l.nextInt();
        int n2 = l.nextInt();
        int n3 = l.nextInt();
        System.out.println(Math.max(Math.max(n1, n2), n3));
        int año = l.nextInt();
        if((año%4==0 && año%100!=0) || (año%400==0)){
            System.out.println("Año bisiesto");
        }else{
            System.out.println("No es un Año bisiesto");
        }
        l.close();
    }
}
