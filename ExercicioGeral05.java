import java.util.Scanner;

public class ExercicioGeral05 {
    public static void main(String[] args){
       /*
        5) Faça um programa que leia as duas notas de um aluno em uma matéria e mostre na tela a sua média na disciplina.
        Ex: Nota 1: 4.5 Nota 2: 8.5 A média entre 4.5 e 8.5 é igual a 6.5
        */

       int notaAluno1;
       int notaAluno2;
       int  mediaAluno;


        Scanner input = new Scanner(System.in);

        System.out.print("introduza a primeira nota:? ");
        notaAluno1  = input.nextInt();

        System.out.print("introduza a segunda nota:? ");
        notaAluno2  = input.nextInt();

        mediaAluno = ( notaAluno1 + notaAluno2 ) / 2;

        System.out.println("a sua media é " + mediaAluno);


    }
}
