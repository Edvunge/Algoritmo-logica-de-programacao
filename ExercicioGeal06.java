import java.util.Scanner;

public class ExercicioGeal06 {
    public static void main(String[] args){
        /*
        6) Faça um programa que leia um número inteiro e mostre o seu antecessor e seu sucessor.
        Ex: Digite um número: 9 O antecessor de 9 é 8 O sucessor de 9 é 10
        2

        numero  -  numero_digitado_pelo_usuario

        nunmero + numero_digitado_pelo_usuario

        */

        int numero_digitado_pelo_usuario;
        int antecessor;
        int sucessor;

        Scanner input = new Scanner(System.in);

        System.out.println(" insira um numero qualquer:? ");
        numero_digitado_pelo_usuario = input.nextInt();

        antecessor = numero_digitado_pelo_usuario - 1;
        sucessor = numero_digitado_pelo_usuario + 1;

        System.out.println(" o antecessor é:  " + antecessor );
        System.out.println(" o antecessor é:  " + sucessor );
    }
}
