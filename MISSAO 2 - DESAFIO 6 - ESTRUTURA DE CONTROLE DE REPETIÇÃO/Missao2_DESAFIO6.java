package Missao2;
/*
 * Autor: Caio Henrique Mota Cuadra
 * Data: 19/08/2025
 */
//INICIO DO PROGRAMA
public class Missao2_DESAFIO6 
{// inicio da classe principal
	public static void main(String args[]) 
	{//inicio do metodo principal
		System.out.println("MISSÃO 2 - DESAFIO 6 - FOR");
		System.out.println("Mostra os números ÍMPARES entre 0 e 10.");
		
		//inicio do laço de repetição for
		for (int i = 0; i < 10; i++) {
			if(i%2 != 0)
			{
				System.out.println(i);
			}
		}
		System.out.println("FIM DO PROGRAMA");
	}// fim do metodo principal
}// fim da classe principal
//FIM DO PROGRAMA
