/*Par e Ímpar: Faça um programa que peça N números inteiros. Calcule e mostre a 
quantidade de números pares e a quantidade de números impares. */

import java.util.Scanner;
public class Ex4_ParEImpar {

  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Digite a quantidade de números que você deseja verificar a paridade.");
    int quantidadeNumeros = scan.nextInt();

    int count = 0;
    int pares = 0;
    int impares = 0;
    int numero = 0;

    do{

      System.out.print("Digite um número: ");
      numero = scan.nextInt();
      count++;

      if (numero % 2 == 0) pares++;
      else impares++;

    }while(count<quantidadeNumeros);

    System.out.println("A quantidade de números pares foi: " + pares);
    System.out.println("A quantidade de números impares foi: " + impares);




  }
  
}
