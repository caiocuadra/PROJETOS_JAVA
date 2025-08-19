package Missao1;

/*
 * Autor: Caio Henrique Mota Cuadra
 * Data: 18/08/2025
 */
//INICIO DO PROGRAMA
public class Missao1_DESAFIO3 
{// inicio da classe principal

	public static void main(String[] args) 
	{// inicio do metodo principal
		//apresenta o título da missão
			System.out.println("Início Missão 1");
			System.out.println("Autor: Caio Henrique Mota Cuadra");
			System.out.println("Data: 18/08/2025");
			System.out.println("MISSÃO 1 - DESAFIO 3 – Conversão de Tipos");
			
			//DECLARANDO VARIAVEIS
			int A, B; //inteiros
			double R1, R2; //decimais
			
			//Atribuição de valores
			A = 7;
			B = 6;
			
			//Calcula a media das variáveis
			R1 = (A + B) / 2;
			R2 = (double) (A + B) / 2;
			
			//Mostra o resultado das médias
			System.out.println("O Resultado sem cast é: " + R1);
			System.out.println("O Resultado com cast é: " + R2);
			System.out.println("DESAFIO 3 CONCLUÍDO!");
	}//fim do metodo principal

}// fim da classe principal
//FIM DO PROGRAMA