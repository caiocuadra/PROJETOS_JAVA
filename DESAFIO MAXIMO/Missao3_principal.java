package Missao3;
/*
 * Autor: Caio Henrique Mota Cuadra
 * Data: 19/08/2025
 */
import java.util.Scanner;

//INICIO DO PROGRAMA
public class Missao3_principal {

    public static void main(String[] args) {
        System.out.println("Início Missão 3");
        double R_SOMA, R_DIVISAO, R_MULTIPLICACAO, R_SUBTRACAO;
        // Cria um objeto Scanner para ler a entrada do usuário
        Scanner leitor = new Scanner(System.in);
        Missao3_CALCULADORA obj_calculadora = new Missao3_CALCULADORA();
        // Operação de Soma
        System.out.println("--- Soma ---");
        System.out.print("Digite o primeiro número para somar: ");
        double num1_soma = leitor.nextDouble();
        System.out.print("Digite o segundo número para somar: ");
        double num2_soma = leitor.nextDouble();
        R_SOMA = obj_calculadora.Somar(num1_soma, num2_soma);
        System.out.println("Resultado da soma: " + R_SOMA);
        /*
         * O valor da variável R_SOMA é calculado na linha 23, que é 
         * R_SOMA = obj_calculadora.Somar(num1_soma, num2_soma);. 
         * A operação de soma é executada quando você pressiona F6 nesta linha durante o processo de depuração. 
         * O resultado retornado pelo método Somar é então armazenado na variável R_SOMA.
         */
        // Operação de Subtração
        System.out.println("\n--- Subtração ---");
        System.out.print("Digite o primeiro número para subtrair: ");
        double num1_sub = leitor.nextDouble();
        System.out.print("Digite o segundo número para subtrair: ");
        double num2_sub = leitor.nextDouble();
        R_SUBTRACAO = obj_calculadora.Subtrair(num1_sub, num2_sub);
        System.out.println("Resultado da subtração: " + R_SUBTRACAO);
        // Operação de Divisão
        System.out.println("\n--- Divisão ---");
        System.out.print("Digite o primeiro número para dividir (numerador): ");
        double num1_div = leitor.nextDouble();
        System.out.print("Digite o segundo número para dividir (denominador): ");
        double num2_div = leitor.nextDouble();
        R_DIVISAO = obj_calculadora.Dividir(num1_div, num2_div);
        System.out.println("Resultado da divisão: " + R_DIVISAO);
        // Operação de Multiplicação
        System.out.println("\n--- Multiplicação ---");
        System.out.print("Digite o primeiro número para multiplicar: ");
        double num1_mult = leitor.nextDouble();
        System.out.print("Digite o segundo número para multiplicar: ");
        double num2_mult = leitor.nextDouble();
        R_MULTIPLICACAO = obj_calculadora.Multiplicar(num1_mult, num2_mult);
        System.out.println("Resultado da multiplicação: " + R_MULTIPLICACAO);
        
        leitor.close();
    }
}
//FIM DO PROGRAMA