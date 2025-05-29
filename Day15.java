import java.util.ArrayList;
//import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Day15 {
    public static void main(String[] args) {
        Day15 e = new Day15();
        List<String> weekdays = new ArrayList<>();
        Scanner l = new Scanner(System.in);
        weekdays.add("Monday");
        weekdays.add("Tuesday");
        weekdays.add("Wednesday");
        weekdays.add("Thursday");
        weekdays.add("Friday");
        weekdays.add("Saturday");
        weekdays.add("Sunday");
        e.recorrerLista(weekdays);
    
        weekdays.sort((a,b)->a.compareTo(b));
        e.recorrerLista(weekdays);

        weekdays.sort((a,b)->b.compareTo(a));
        e.recorrerLista(weekdays);
        char brr = l.next().toLowerCase().charAt(0);

        weekdays.removeIf(ai -> ai.toLowerCase().startsWith(String.valueOf(brr)));
        e.recorrerLista(weekdays);
        //También funciona esto
        // Collections.sort(weekdays);
        // e.recorrerLista(weekdays);

        // Collections.reverse(weekdays);
        // e.recorrerLista(weekdays);
        l.close();
    }
    public void recorrerLista(List<String> weekdays){
        for(String a : weekdays){
            System.out.println(a);
        }
        System.out.println();
    }
}
