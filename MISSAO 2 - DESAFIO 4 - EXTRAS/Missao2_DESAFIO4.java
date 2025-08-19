package Missao2;
/*
 * Autor: Caio Henrique Mota Cuadra
 * Data: 19/08/2025
 */
//INICIO DO PROGRAMA
public class Missao2_DESAFIO4 
{// inicio da classe principal

	public static void main(String[] args) 
	{// inicio do metodo principal
		System.out.println("MISSÃO 2 - DESAFIO 4 - WHILE");
		System.out.println("Mostra os números IMPARES de 11 a 40, inclusive os extremos.");
		
		//declara a variavel i como 0:
		int i = 11;
		
		//inicia o laço de repetição
		while(i <= 40) 
		{
			if(i%2 != 0) 
			{
				System.out.println(i);
			}
			i = i + 3;
		}
		
		System.out.println("MISSÃO 2 - DESAFIO 4 - CONCLUÍDO!");

	}// fim do metodo principal
	
	/*
	 * R: Como a condição do While leva em consideração
	 * números menores ou iguais a 40, o número (i) 11 entra na condição
	 * e se inicia o loop, onde é verificado se o número (i) é ímpar ou
	 * não, caso for, imprimir na tela o número (i), e a cada laço é 
	 * acrescentado um valor de 3 no número (i)
	 */

}// fim da classe principal
//FIM DO PROGRAMA
