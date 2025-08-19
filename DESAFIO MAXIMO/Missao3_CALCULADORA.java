package Missao3;
/*
 * Autor: Caio Henrique Mota Cuadra
 * Data: 19/08/2025
 */
//INICIO DO PROGRAMA
public class Missao3_CALCULADORA 
{//INICIO DA CLASSE CALCULADORA
	private double R;
	
	public double Somar(double n1, double n2) {
        R = n1+n2;
		return R;
    }

    public double Subtrair(double n1, double n2) {
    	R = n1-n2;
    	return R;
    }

    // Método Dividir alterado para evitar divisão por zero
    public double Dividir(double n1, double n2) {
        if (n2 == 0 || n1 == 0) {
            System.out.println("Alerta: Não é possível dividir por zero!");
            return 0;
        } else {
        	R = n1/n2;
            return R;
        }
    }

    public double Multiplicar(double n1, double n2) {
        R = n1*n2;
    	return n1 * n2;
    }

}//FIM DA CLASSE CALCULADORA
//FIM DO PROGRAMA