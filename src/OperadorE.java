import java.util.Scanner;

public class OperadorE {

	public static void main(String[] args) {
		/*Faça um programa que verifique se o usuário digitado é igual a 'administrador' e se a senha digitada é igual a '123'*/
		Scanner leitor = new Scanner(System.in);
		String usuario, senha;
		System.out.println("SISTEMA DE LOGIN");
		System.out.println("Por favor, digite seu username:");
		usuario = leitor.next();
		System.out.println("Por favor, digite sua senha:");
		senha = leitor.next();	

		if (usuario.equalsIgnoreCase("administrador") && senha.equals("123")) {
			System.out.println("Usuario Logado");
		} else {
			System.out.println("Usuario ou senha incorretos");
		}
		
		
		leitor.close();

	}

}
