package Missao1;
/*
 * Autor: Caio Henrique Mota Cuadra
 * Data: 18/08/2025
 */

//INICIO DO PROGRAMA
public class Missao1_DESAFIO2 
{ //inicio da classe principal

	public static void main(String[] args) 
	{ //inicio do metodo principal.
		
		//declara variaveis
		int Trab1B, Prova1B, Trab2B,  Prova2B, Nota1B, Nota2B, Media_Final;
		
		//define valores
		Trab1B = 22;
		Prova1B = 48;
		
		Trab2B = 33;
		Prova2B = 47;
		
		Nota1B = Trab1B + Prova1B;
		Nota2B = Trab2B + Prova2B;
		
		Media_Final = (Nota1B + Nota2B) / 2;
		
		//Mostra o resultado do cálculo
		System.out.println("A média final do aluno é : " + Media_Final);
		System.out.println("DESAFIO 2 CONCLUÍDO! – MÉDIA CALCULADA!");
		
	} //fim do metodo principal.

}//fim da classe principal
//FIM DO PROGRAMA