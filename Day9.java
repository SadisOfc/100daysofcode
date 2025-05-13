import java.util.Scanner;

public class Day9 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        System.out.println("Ingrese el porcentaje");
        int porcentaje = l.nextInt();
        int calificacion = 0;
        if(porcentaje<=20){
            calificacion=1;
        }
        if(porcentaje>20 && porcentaje<=40){
            calificacion=2;
        }
        if(porcentaje>40 && porcentaje<=60){
            calificacion=3;
        }
        if(porcentaje>60 && porcentaje<=80){
            calificacion=4;
        }
        if(porcentaje>80){
            calificacion=5;
        }
        switch (calificacion) {
            case 1:
                System.out.println("Su calificación es F");
                break;
            case 2:
                System.out.println("Su calificación es D");
                break;
            case 3:
                System.out.println("Su calificación es C");
                break;
            case 4:
                System.out.println("Su calificación es B");
                break;
            case 5:
                System.out.println("Su calificación es A");
                break;
        
            default:
            System.out.println("Que puta mierda de nota 🗣️🔥");
            l.close();
                break;
        }
    }
}
