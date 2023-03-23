import java.util.Scanner; //Importa classe para utilizar o Scanner


public class Salario //Criação da classe Salario
{
    static float sal_min;       //Variável para salário mínimo
	static float sal_fun;      //Variável para salário do funcionário
	static float sal_min_fun; //Variável para quantos salários mínimos recebe o funcionário
	
	public static void main(String[] args) {
	    
		Scanner valor = new Scanner(System.in); //Criação do Scanner 'valor'
		
		System.out.println("Digite quanto esta o salário mínimo atual: "); 
		sal_min = valor.nextFloat(); //Chama entrada de dados para a variável 'sal_min'
		
		System.out.println("Digite quanto esta o salário do funcionário: ");
		sal_fun = valor.nextFloat(); //Chama entrada de dados para a variável 'sal_fun'
		
		sal_min_fun = sal_fun / sal_min;
		
		System.out.println("O funcionário ganha "+sal_min_fun+" salários mínimos.");
	}
}
