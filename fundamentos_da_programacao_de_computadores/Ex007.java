package fundamentos_da_programacao_de_computadores;

import java.util.Scanner;
public class Ex007 {
    /*
        7. Faça um programa que receba o salário base de um funcionário, calcule e mostre seu salário a receber,
        sabendo-se que o funcionário tem gratificação de R$ 50 e paga imposto de 10% sobre o salário base.
     */
    public static void main(String[] args) {

        double salarioBase;
        double  calculoImposto;

        Scanner input = new Scanner(System.in);

        System.out.print("introduza o salario de base:? ");
        salarioBase  = input.nextDouble();

        calculoImposto =  ( 123 * 10 ) / 100;
        salarioBase = salarioBase - calculoImposto;

        System.out.println(" o salario com o desconto " + salarioBase);
    }
}
