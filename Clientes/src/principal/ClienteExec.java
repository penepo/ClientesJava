package principal;

public class ClienteExec {

	public static void main(String[] args) {
		Cliente cliente = new Cliente();
		cliente.nome = "nepomuceno";
		cliente.idade = "16";
		cliente.dataNasc = "13.09.2007";
		cliente.posicao = "oposto";
		System.out.printf("Nome: %s \n Idade %s \n Data de Nascimento: %s \n Posição: %s", 
				cliente.nome, cliente.idade, cliente.dataNasc, cliente.posicao);
	}

}
