import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro par�metro");
		int parametroUm = Integer.parseInt(terminal.nextLine());
		System.out.println("Digite o segundo par�metro");
		int parametroDois = Integer.parseInt(terminal.nextLine());
		
		try {
			//chamando o m�todo contendo a l�gica de contagem
			contar(parametroUm, parametroDois);
		
		}catch (Exception e) {
			//imprimir a mensagem: O segundo par�metro deve ser maior que o primeiro
			System.out.println("O segundo par�metro deve ser maior que o primeiro");
		}
		
	}
	static void contar(int parametroUm, int parametroDois ) throws ParametrosInvalidosException {
		//validar se parametro Um � MAIOR que parametroDois e lan�ar a exce��o
		if(parametroUm > parametroDois)
	          throw new ParametrosInvalidosException();
		
		int contagem = parametroDois - parametroUm;
		//realizar o for para imprimir os n�meros com base na vari�vel contagem
		for(int i = 1 ; i <= contagem; i ++) {
			  System.out.println(i);
			}
	}
}
