public class Day14 {
    public static void main(String[] args) {
        Day14 e = new Day14();
        int array[][] = {
            {23,45,78,12},
            {56,90,34,67},
            {89,21,43,76}
    };
    //Imprime el Array Bidimensional
   e.imprimirArrayBidimensional(array);
   System.out.println();
   e.imprimirArrays(e.filasMayores(array));
   e.imprimirArrays(e.columnasMayores(array));
   e.imprimirArrayBidimensional(e.arrayInverso(array));
}

///////////////////////////////////////////////////
public int[] filasMayores(int array[][]){
    int arraycito[]= new int[array.length];
    for(int i=0;i<array.length;i++){
        int numero = 0;
        for(int j=0;j<array[i].length;j++){
            if(numero<array[i][j]){
                numero = array[i][j];
            }
            arraycito[i]=numero;
        }
    }
    return arraycito;
}
///////////////////////////////////////////////////
public int[] columnasMayores(int array[][]){
    int arraycito[] = new int[array[0].length];
    for(int i=0; i<array[0].length;i++){
        int numero=0;
        for(int j=0; j<array.length; j++){
            if(numero<array[j][i]){
                numero=array[j][i];
            }
        }
        arraycito[i]=numero;
    }
    return arraycito;
}
///////////////////////////////////////////////////
public int[][] arrayInverso(int array[][]){
    int arraycitoBidimensional[][] = new int[array[0].length][array.length];
    for(int i=0;i<array[0].length;i++){
        for(int j=0;j<array.length;j++){
            arraycitoBidimensional[i][j] = array[j][i];
        }
    }
    return arraycitoBidimensional;
} 
///////////////////////////////////////////////////
public void imprimirArrays(int array[]){
    for(int a=0; a<array.length;a++){
        System.out.println(array[a]);
    }
    System.out.println();
}
///////////////////////////////////////////////////
public void imprimirArrayBidimensional(int array[][]){
     for(int i=0;i<array.length;i++){
        for(int j=0;j<array[i].length;j++){
            System.out.print(array[i][j] + " ");
        }
        System.out.println();
    }
}
}