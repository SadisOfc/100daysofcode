public class Day5 {
    public static void main(String[] args) {
        int mas = 0;
        int menos = 10;
        System.out.println(mas);
        System.out.println(menos);
        for(int i=0; i<5;i++){
            mas++;
            menos--;
            System.out.println("Aumento: " + mas);
            System.out.println("Decremento: " + menos);
        }
        double br = 10;
        double brr = 5;
        double brrr = 92;
        double brrrr = 1;
        br+=brr;
        System.out.println(br);
        brr-=br;
        System.out.println(brr);
        br*=brrr;
        System.out.println(br);
        br/=brrrr;
        System.out.println(br);
        brrrr%=brrr;
        System.out.println(brrrr);
    }
}
