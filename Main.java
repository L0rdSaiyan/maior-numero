import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		
		Scanner goku = new Scanner(System.in);
		
		int numeros=0, maior=0;
	
		for (int i=5; i>=1 ; i--){
		    
		    System.out.println("Informe o "+i+" número: ");
		    numeros=goku.nextInt();
           if (numeros>=maior){
               maior=numeros;
               
           } 
          }
 	System.out.println("O maior número informado é: "+maior);
    }
}