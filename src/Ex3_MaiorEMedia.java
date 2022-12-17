/*Maior e Média: Faça um programa que leia 5 números e informe o maior número e
 a média desses números. */
import java.util.Scanner;

public class Ex3_MaiorEMedia {
  
  public static void main(String[] args) {

    Scanner scan = new Scanner(System.in);
    int count = 0;
    int maiorNumero = 0;
    int soma = 0;
    float media = 0f;
    int numero = 0;

    do {
      System.out.print("Digite um número: ");
      numero = scan.nextInt();
      if (numero > maiorNumero){
          maiorNumero = numero;
      }
      soma += numero;
      count++;

    }while (count<5);

    media = soma/5;
    System.out.println("O maior número foi: " + maiorNumero);
    System.out.println("E a média dos 5 números digitados foi: "+ media);


    
  }
}
