import java.util.Scanner;

/*Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso
o valor seja inválido e continue pedindo até que o usuário informe um valor 
 válido. */

public class Ex2_Nota {
  /**
   * @param args
   */
  public static void main(String[] args) {
    
    Scanner scaner = new Scanner(System.in);
    
    System.out.print("Digite uma nota de zero a dez: ");
    int nota = scaner.nextInt();
   

    while(nota < 0 || nota > 10){
      System.out.print("Nota inválida. \n" + "Digite uma nota válida: ");
      nota = scaner.nextInt();
      
    }
    System.out.println("Nota: " + nota + "\nFim de execução do Programa");
    
  }
}
