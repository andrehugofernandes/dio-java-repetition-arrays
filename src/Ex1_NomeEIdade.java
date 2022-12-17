import java.util.Scanner;

/*Exercício 01 */
/*/ Faça um programa que leia conjuntos de dois valores, o primeiro representando 
o nome do aluno e o segundo representando a sua idade. (Pare o programa inserindo 
o valor 0 no campo nome)*/

public class Ex1_NomeEIdade {
    public static void main(String[] args) throws Exception {
        
        Scanner scaner = new Scanner(System.in);
        String nome;
        int idade;

        while (true){
            System.out.println("Nome:");
            nome = scaner.next();

            if (nome.equals("0")) break;
            
            System.out.println("Idade:");
            idade = scaner.nextInt();
        }

        System.out.println("A condição requerida pelo exercício foi alcançada.");
        System.out.println("Fim do Exercício");
    }
}
