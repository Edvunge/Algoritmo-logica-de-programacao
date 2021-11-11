package fundamentos_da_programacao_de_computadores;

import java.util.Scanner;

public class Ex009 {
    /*
        9. Faça um programa que calcule e mostre a área de um triângulo. Sabe-se que: Área = (base * altura)/2.
     */
    public static void main(String[] args) {

        double base;
        double altura;


        Scanner input = new Scanner(System.in);

        System.out.println("Digite o valor da altura:");
        altura  = input.nextDouble();

        System.out.println("Digite o valor da base:");
        base  = input.nextDouble();

        double area = ( base * altura )/2;

        System.out.println( " a area do triângulo é: " + area );
    }

}
