package views;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import controllers.FuncionarioController;
import controllers.MarcacaoController;
import models.Funcionario;
import models.Marcacao;

public class CadastrarMarcacoes {
   
	private static Scanner sc = new Scanner(System.in);
	private static Funcionario funcionario;
	private static int pisFuncionario;
	private static Marcacao marcacao;
	
	
	
	public static void renderizar() {
		funcionario = new Funcionario();
		System.out.println("\n".repeat(15));
		System.out.println("\n --Cadastrar Marcações --\n");
		System.out.println("\nDigite o PIS do Funcionario");
		pisFuncionario = sc.nextInt();
		funcionario = FuncionarioController.buscaPis(pisFuncionario);
		if(funcionario != null)    //123
		{
			marcacao = new Marcacao();
						
			marcacao.setFuncionarios(funcionario);
			System.out.println("\n Informe a data da marcação:");
			
			String dataMarcacao = sc.next(); 
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = null;
			try {
				date = formatter.parse(dataMarcacao);
			} catch (ParseException e) {
				e.printStackTrace();
			}
			
			marcacao.setDataMarcacao(dataMarcacao);
			
			
			
			System.out.println("\n Digita a hora de entrada :");
		    marcacao.setEntrada(sc.nextDouble());
			System.out.println("\n Digita a hora saida para o almoço :");
			marcacao.setSaidaAlmoco(sc.nextDouble());
			System.out.println("\n Digita a hora da volta do almoço :");
			marcacao.setVoltaAlmoco(sc.nextDouble());
			System.out.println("\n Digita a hora da saida :");
			marcacao.setSaida(sc.nextDouble());
			System.out.println("--------------------------------------------------------------------");
			
			
			MarcacaoController.cadastrar(marcacao);
		}else
		{
			System.out.println("Funcionario não encontrado");
			System.out.println("--------------------------------------------------------------------");
		}
		
		
	}
	
	

}
