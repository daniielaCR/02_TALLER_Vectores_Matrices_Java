import java.util.Scanner;
//
public class reto2 {
    public static void main(String[] args) {
            Scanner capturar = new Scanner(System.in);
            int notas=0;
            int cantidadnotas=0;
            int suma=0; 
            double promedio=0;
     
            System.out.println("Cuantas notas va acalcular");
            cantidadnotas = capturar.nextInt();
     
            int[] not = new int[cantidadnotas];
     
            for(int i=0;i<cantidadnotas;i++){
                System.out.println("Digite cuanto saco en las notas " + (i+1));
                notas = capturar. nextInt();
                not[i]=notas;
                suma=notas+not[i];
            }
            promedio=suma/cantidadnotas;
     
            if(promedio<3){
               System.out.println("Tu promedio es de :  " + promedio + "  reprobaste");
            }
            else if(promedio>3 && promedio<4){
                System.out.println("Tu promedio es de:  " + promedio + "  pasaste por poco");
            }
            else if(promedio>4){
                System.out.println("Tu promedio es de: " + promedio + " pasaste con un excelente promedio");
            }
            capturar.close();
     
    }
    
}
