import java.util.Scanner;

public class ExercicioGeral03 {
    public static void main(String[] args){
        /*
        3) Crie um programa que leia o nome e o salário de um funcionário, mostrando no final uma mensagem.
        Ex:
        Nome do Funcionário: Maria do Carmo
        Salário: 1850,45 O funcionário Maria do Carmo tem um salário de R$1850,45 em Junho.
        */

        String nomeUser = "Maria do Carmo";
        Double salarioDoFuncionario;
        int precoDoProduto2;

        Scanner input = new Scanner(System.in);



        System.out.print("introduza o teu salario: ");
        salarioDoFuncionario  = input.nextDouble();

        System.out.println(" o funcionario  "+ nomeUser +" tem um R$"+salarioDoFuncionario + " em junho ");
    }
}
