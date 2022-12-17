/*Fatorial: Faça um programa que calcule o fatorial de um número inteiro 
fornecido pelo usuário.
Ex.: 5! = 5.4.3.2.1=120*/


import java.util.Scanner;
public class Ex6_Fatorial {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);

    System.out.print("Digite o número do FATORIAL que deseja calcular: ");
    int fatorial = scan.nextInt(); //variavel de leitura do usuário
    int printFatorial = 1; //variável que guarda o fatorial de um número

    String fat = ""; /* variável que faz a mpressão do fatorial de acordo com o
                        exercício*/
    
    System.out.print(fatorial + "! = ");
    for (int i = fatorial; i >= 1; i--) {
      
      if (i>1){
        fat = i + "*";
      } else if (i==1){
        fat = "" + i;
      }

      printFatorial *= i;
      System.out.print(fat);
      
    }

    System.out.print(" = " + printFatorial);
    
  }
}
