package fundamentos_da_programacao_de_computadores;

import java.util.Scanner;

public class Ex004 {
    /*
4. Faça um programa que receba o salário de um funcionário, calcule e mostre o novo salário, sabendo-se
que este sofreu um aumento de 25%.
*/
    public static void main(String[] args) {

        double valorSolario;
        double novoSalario;



       Scanner input = new Scanner(System.in);

       System.out.print("Qual o teu salario:? ");
       valorSolario  = input.nextDouble();

        double aumentoSalario = ( valorSolario * 25 )/100;

               /// desc25 =  salario x 25 / 100

        novoSalario = valorSolario + aumentoSalario;
        System.out.println(" o salario actual será:  " + novoSalario );


    }
}
