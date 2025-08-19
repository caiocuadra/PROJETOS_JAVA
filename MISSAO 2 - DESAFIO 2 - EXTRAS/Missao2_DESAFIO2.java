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
		int idade = 30;
		System.out.println("Programa para testar a idade do aluno.");
	//fim bloco 1
		//realiza o teste da condição
		if(idade <= 40) {
			//bloco 2 (deve ser executado caso a condição for verdadeira).
			System.out.println("A idade é menor ou igual a 40 anos!");
		}else {
			//bloco 3 (deve ser executado caso a condição for falsa).
			System.out.println("A idade é maior que 40 anos!");
		}
		
		//inicio bloco 4
		System.out.println("Fim do teste de idade.");
		System.out.println("MISSAO 2 - DESAFIO CONCLUIDO!");
		//fim bloco4
	}//fim metodo principal

}

/*
 * A linha que foi executada foi: 24. Pois, como a variável idade
 * é menor que 40, a Estrutura de controle de Seleção direcionou
 * a execução do programa para a linha 24 que é responsável por
 * dar uma resposta quando a condição do if for falsa (else).
 */
