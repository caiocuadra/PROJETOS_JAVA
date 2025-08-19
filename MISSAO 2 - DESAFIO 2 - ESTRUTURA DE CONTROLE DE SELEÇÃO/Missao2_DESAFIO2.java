package Missao2;
/*
 * Autor: Caio Henrique Mota Cuadra
 * Data: 18/08/2025
 */
public class Missao2_DESAFIO2 {

	public static void main(String[] args) 
	{//inicio metodo principal
		
		//inicio do bloco 1
		//apresenta o título da Missão:
		System.out.println("Início da Missão 2");
		//declara e atribui valor a variável idade
		int idade = 15;
		System.out.println("Programa para testar a idade do aluno.");
	//fim bloco 1
		//realiza o teste da condição
		if(idade < 18) {
			//bloco 2 (deve ser executado caso a condição for verdadeira).
			System.out.println("É menor de idade.");
		}else {
			//bloco 3 (deve ser executado caso a condição for falsa).
			System.out.println("É maior de idade.");
		}
		
		//inicio bloco 4
		System.out.println("Fim do teste de idade.");
		System.out.println("MISSAO 2 - DESAFIO CONCLUIDO!");
		//fim bloco4
	}//fim metodo principal

}
