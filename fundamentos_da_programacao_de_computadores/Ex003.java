package fundamentos_da_programacao_de_computadores;

public class Ex003 {
/*
3. Faça um programa que receba três notas e seus respectivos pesos, calcule e mostre a média ponderada.
 */
    public static void main(String[] args) {

        int nota1 = 12;
        int nota2 = 14;
        int nota3 = 15;
        float peso = 10;

        double mediaPonderada = ( nota1 + nota2 + nota3 ) / peso;

        System.out.println("o resultado da média ponderada: " + mediaPonderada);

    }
}
