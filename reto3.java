import java.util.Scanner;
//natacion
public class reto3{
 public static void main(String[] args) {
    Scanner capturar= new Scanner(System.in);  

       String nomcompetidor, ultCompetidor="", primCompetidor="";
       int primerminuto=0;
       int  ultimominutos=0;
       int cantidadcomp;
       int minutosnadador;

       System.out.println("Digite cuantos competidores participaran (máximo 4):\n");
       cantidadcomp =capturar.nextInt();

       String[] nadador = new String[cantidadcomp];
       int[] minutos = new int[cantidadcomp];

          for(int i=0;i<cantidadcomp;i++){
           System.out.println("Ingrese el nombre de uno de los nadadores:\n " + (i+1));
           nomcompetidor =capturar.next();
           nadador[i] =nomcompetidor;
           System.out.println("Digita el tiempo de minutos del nadador:\n ");
           minutosnadador =capturar.nextInt();
           minutos[i] = minutosnadador;
       }

         for(int j=0;j<cantidadcomp;j++){
            if(ultimominutos<minutos[j])
           {
               ultimominutos=minutos[j];
               ultCompetidor = nadador[j];
           }
       }
            primerminuto=ultimominutos;

         for(int n= 0; n<cantidadcomp;n++){
            if(primerminuto>minutos[n])
           {
               primerminuto = minutos[n];
               primCompetidor = nadador[n];
           }   
       }
           System.out.println("Los puestos quedaron en que el primer lugar lo obtuvo "+primCompetidor+ " con " + primerminuto+ " minutos.\n");
           System.out.println("Y de ultimo lugar lo obtuvo "+ultCompetidor+ "  con " + ultimominutos + " minutos.");

       capturar.close();
 }
}