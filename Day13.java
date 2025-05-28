public class Day13{
    public static void main(String[] args) {
        int Array1[] = {
            1,23,3,4,63,3123,4344,33,2123
        };
        int Array2[] = new int[Array1.length];
        for(int i=0; i<Array1.length; i++){
            Array2[i] = Array1[i];
        }
        for(int a: Array2){
            System.out.println(a);
        }
    }
}