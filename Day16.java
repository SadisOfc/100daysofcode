public class Day16 {
    public enum Weekdays{
        MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY,SATURDAY, SUNDAY
    }
    public static void main(String[] args) {
        Weekdays dias[] = Weekdays.values();
        for(int i=0; i<dias.length;i++){
            System.out.println(dias[i]);
        }
    }
}
