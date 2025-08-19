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
		System.out.println("Mostra os números pares de 0 a 10, inclusive os extremos.");
		
		//declara a variavel i como 0:
		int i = 0;
		
		//inicia o laço de repetição
		while(i <= 10) 
		{
			if(i%2 == 0) 
			{
				System.out.println(i);
			}
			i++;
		}
		
		System.out.println("MISSÃO 2 - DESAFIO 4 - CONCLUÍDO!");

	}// fim do metodo principal

}// fim da classe principal
//FIM DO PROGRAMA