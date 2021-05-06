package views;

import controllers.FuncionarioController;
import models.Funcionario;

public class ListarFuncionario {
	
	public static void renderizar(){
		System.out.println("\n".repeat(15));
		System.out.println("\n-------- LISTAR FUNCIONARIOS CADASTRADOS --------\n");
		
		for(Funcionario funcionarioCadastrado : FuncionarioController.listar()) {
			System.out.println(funcionarioCadastrado);
			System.out.println("--------------------------------------------------------------------");
		}
	}
	
}
