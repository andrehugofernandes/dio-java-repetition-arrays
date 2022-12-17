import java.util.Scanner;

/*Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número 
inteiro entre 1 a 10. O usuário deve informar de qual numero ele deseja ver a 
tabuada. A saída deve ser conforme o exemplo abaixo: */

public class Ex5_Tabuada {
  public static void main(String[] args) {

    
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite um número de ZERO a 10: ");
    int tabuada = scan.nextInt();

    System.out.println("Tabuada de: "+tabuada);

    for (int i = 1; i < 11; i++) {

      System.out.println(tabuada + " x " + i + " = " + tabuada*i);
      
    }



    
  }
}
