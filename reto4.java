import java.util.Scanner;
//lista productos 
public class reto4 {
         
    public static void main(String[] args) {
        Scanner capturar=new Scanner(System.in); 
        System.out.println("Digite 12 productos");
        String [] [] expendedora=new String [3] [3];

        for ( int i=0; i<expendedora.length; i++){ 
            for (int k =0; k< expendedora.length; k++){
                System.out.println("digite el producto: "+i+", "+k+"; ");
                expendedora[i][k]=capturar.nextLine();
            }
        }

        System.out.println();

        for (int j = 0; j < expendedora.length; j++) {
            for (int j2 = 0; j2 < expendedora.length; j2++) {
                
                System.out.print(j);
                System.out.print(j2+"");
                System.out.print(" "+expendedora[j][j2]+"\t");
            }
            System.out.println();
    }capturar.close();
 
    
 }
}