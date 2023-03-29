import java.util.Scanner;
//multiplos
public class reto1 {
    public static void main(String[] args) {
        int cantidad_de_numeros=0;
        int i=0;
        int valornumero=0;
        int contadormulti=0;  
        int cont=0;
        int multiplicaion=0;
 
        Scanner capturar= new Scanner(System.in);
 
        System.out.println("Digite la cantidad de numeros  que desea saber si es multiplo de 2:\n");
        cantidad_de_numeros =capturar.nextInt();
 
        int num[] =  new int[cantidad_de_numeros];
 
             while(i<cantidad_de_numeros)  {
 
              System.out.println("Digite el numero que desee: \n" + (i+1));
              valornumero = capturar.nextInt();
              num[i]=valornumero;
             i++;
 
         }
         while (contadormulti < cantidad_de_numeros) {
            if (num[contadormulti] % 2 == 0){
                multiplicaion++;
            }
            contadormulti++;
 
         }
         System.out.println("Resultado:\n");
        System.out.println("De los numeros digitados solo " + multiplicaion + " son multiplos de 2");
 
        System.out.println("Esos son: ");
 
         while (cont < cantidad_de_numeros){
            if (num[cont] % 2 == 0){
                System.out.println(num[cont]);
            }
            cont++;
         }
            capturar.close();
 }
  }
   