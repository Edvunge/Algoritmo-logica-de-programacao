import java.util.Scanner;

public class ExercicioGeral04 {
    public static void main(String[] args){
     /*
        4) Desenvolva um algoritmo que leia dois números inteiros e mostre o somatório entre eles.
        Ex: Digite um valor: 8
        Digite outro valor: 5
        A soma entre 8 e 5 é igual a 13.
        */

        int number1;
        int number2;
        int somatorio;

        Scanner input = new Scanner(System.in);


        System.out.print("introduza um numero inteiro qualquer:? ");
        number1  = input.nextInt();

        System.out.print("introduza um numero inteiro qualquer:? ");
        number2  = input.nextInt();

        somatorio = number1 + number2;

        System.out.println("o somatorio é " + somatorio);
    }
}
