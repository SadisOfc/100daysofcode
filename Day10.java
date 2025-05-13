import java.util.Random;
import java.util.Scanner;

public class Day10 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        int num = l.nextInt();
        int contador = 0;
        int suma = 0;
        while(contador != num){
            contador++;
            suma += contador;
            System.out.println(suma);
        }
        System.out.println();

        contador = 0;
        suma = 0;
        do{
            contador++;
            suma += contador;
            System.out.println(suma);
        }while(contador !=num);
        System.out.println();

        contador = 0;
        suma = 0;
        for(int i=0;i<num;i++){
            contador++;
            suma += contador;
            System.out.println(suma);
        }
        l.close();
        System.out.println();
        System.out.println();

        contador = 0;
        suma = 0;
        for(int j=0; j<num;j++){
            contador++;
            if(contador%2!=0){
                continue;
            }
            suma += contador;
            System.out.println(suma);
        }

        Random r = new Random();
        while(true){
            int random = r.nextInt(100)+1;
            System.out.println(random);
            if(random%5==0 && random%7==0){
                System.out.println("Chao prb");
                break;
            }
        }
    }
}
