import java.util.Scanner;

public class ExercicioGeral07 {
    public static void main(String[] args){
        /*
        7) Crie um algoritmo que leia um número real e mostre na tela o seu dobro e a sua terça parte.
        Ex: Digite um número: 3.5 O dobro de 3.5 é 7.0 A terça parte de 3.5 é 1.16666
        */

        Double numberX;
        Double precoDoProduto2;

        Scanner input = new Scanner(System.in);


        System.out.print("introduza um numero para o preço: ");
        numberX  = input.nextDouble();


        Double dobroNumerico = ( numberX * numberX ) / 3;


        System.out.println("o resultado do dobro e: " + dobroNumerico);

    }
}
