package fundamentos_da_programacao_de_computadores;

import java.util.Scanner;

public class Ex0010 {
    /*
        10. Faça um programa que calcule e mostre a área de um círculo. Sabe-se que: Área = p * R2
    */
    public static void main(String[] args) {
        double raio;
        double peso;

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da altura:");
        peso  = input.nextDouble();

        System.out.println("Digite o valor do raio:");
        raio  = input.nextDouble();

        double area = peso * ( raio * 2 );


        System.out.println( " qual a area do circulo: " + area );
    }

}
