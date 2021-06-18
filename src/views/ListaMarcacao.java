package views;


import controllers.MarcacaoController;
import models.Marcacao;

public class ListaMarcacao {
	
	public static void renderizar() {
		System.out.println("\n".repeat(2));
		System.out.println("\n-------- RELATORIO DE HORAS TRABALHADAS --------\n");
		for(Marcacao marcacaoCadastrada : MarcacaoController.listarMarcacoes()) {
			
				System.out.println(marcacaoCadastrada);
				System.out.println("\nHoras Trabalhadas: " + MarcacaoController.calculo());	
				System.out.println("--------------------------------------------------------------------");
					
		}	
	}  
	

}
