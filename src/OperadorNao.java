import java.util.Scanner;

public class OperadorNao {

	public static void main(String[] args) {
		/*Crie um programa que permita que receba o tipo de um usu�rio em uma vari�vel String e caso esse tipo N�O SEJA "administrador", exibir a mensagem: "Aten��o, usu�rio sem poderes administrativos. Algumas tarefas ser�o bloqueadas".*/
		Scanner leitor = new Scanner(System.in);
		String tipoUsuario;
		System.out.println("Por favor, digite seu tipo de usu�rio:");
		tipoUsuario = leitor.next();
		
		if (!tipoUsuario.equals("administrador")) {
			System.out.println("Aten�a�, usuario sem poderes administrativos. Algumas tarefas ser�o bloqueadas");
		}
		
		leitor.close();
		

	}

}
