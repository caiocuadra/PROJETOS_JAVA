package Missao1;

/*
 * Autor: Caio Henrique Mota Cuadra
 * Data: 18/08/2025
 */
//INICIO DO PROGRAMA
public class Missao1_principal 
{//inicio da classe principal Missão 1

	public static void main(String[] args) 
	{//inicio do metodo principal Missão 1
		//apresenta o título da missão
		System.out.println("Início Missão 1");
		System.out.println("Autor: Caio Henrique Mota Cuadra");
		System.out.println("Data: 18/08/2025");
		System.out.println("Cálculo da nota bimestral");
		
		//declara variáveis
		int Nota_Trabalho;
		int Nota_Prova;
		int Nota_Bimestre;
		
		//atribui valor às variáveis
		Nota_Trabalho = 22;
		Nota_Prova = 58;
		
		//Realiza a soma (passo 3 da atividade)
		Nota_Bimestre = Nota_Trabalho + Nota_Prova;
		
		//Apresenta o resultado da nota bimestral no console (passo 4 da atividade) 
		System.out.println("A nota bimestral é : " + Nota_Bimestre);

	}//fim do metodo principal Missão 1

}//fim da classe principal Missão 1
//FIM DO PROGRAMA
