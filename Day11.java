public class Day11 {
    public static void main(String[] args) {
        String palabra1 = "ABCDEFC";
        String palabra2 = "ACAB";
        String palabra3 = "periquito pinpin";
        String palabra4 = "         brrrr           ";
        System.out.println(palabra1.length());
        System.out.println(palabra2 + " " + palabra3);
        if(palabra1.equals(palabra3)){
            System.out.println("Son la misma mnda");
        }else{
            System.out.println("Son Distintos");
        }
        System.out.println(palabra1.toLowerCase());
        System.out.println(palabra3.toUpperCase());
        System.out.println(palabra4.trim());
        System.out.println(palabra3.substring(0,8));
        String[] subcadenas = palabra3.split(" ");
        for(String i : subcadenas){
            System.out.println(i);
        }
        StringBuilder reversa = new StringBuilder(palabra2);
        System.out.println(reversa.reverse());
        System.out.println(palabra3.contains("pin"));
    }
}
