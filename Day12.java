public class Day12 {
    public static void main(String[] args) {
        System.out.println("StringBuilder y StringBuffer");
        StringBuffer Sbuffer = new StringBuffer("Hola");
        StringBuilder Sbuilder = new StringBuilder("Hola");
        Sbuffer.append(" Mundirijillo");
        Sbuilder.append(" Mundirijillo");
        System.out.println("StringBuffer: " + Sbuffer);
        System.out.println("StringBuilder: " + Sbuilder);
    }
}
