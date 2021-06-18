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
			int resultadoFE1;
			int resultadoFtS1;
			int resultadoFE2;
			int resultadoFtS2;
			int resultadoDia;
			
			
			marcacao = new Marcacao();	
			
			marcacao.setFuncionarios(funcionario);
			System.out.println("\n Informe a data da marcação:");			
			marcacao.setDataMarcacao(sc.next()); 
			
			SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
			Date date = null;
			try {
				date = formatter.parse(marcacao.getDataMarcacao());
			} catch (ParseException e) {
				e.printStackTrace();
			}
						
			System.out.println("Marcação da data de " + marcacao.getDataMarcacao());
			
			
			  //================================================================================================
			 //Marcação da entrada
	         System.out.print("Informe a hora da entrada para o trabalho \n");    
	         marcacao.setEntrada(sc.next());              
	         
	         String[] resultadoE1 = marcacao.getEntrada().split(":"); 
	         int horaE1 = Integer.parseInt(resultadoE1[0]);
	         int minutoE1 = Integer.parseInt(resultadoE1[1]);
	         
	     //    System.out.println("A hora digitada para entrada 1 é " + horaE1 + ":"+ minutoE1); 
	         //================================================================================================
	         //Marcação de saida para o intervalo
	         System.out.print("Informe a hora de saida para o intervalo \n");    
	         marcacao.setSaidaAlmoco(sc.next());              
	         
	         String[] resultadoS1 = marcacao.getSaidaAlmoco().split(":"); 
	         int horaS1 = Integer.parseInt(resultadoS1[0]);
	         int minutoS1 = Integer.parseInt(resultadoS1[1]);
	       //  System.out.println("A hora digitada para sainda do intervalo é " + horaS1 + ":"+ minutoS1); 
	                      
	                 
	         resultadoFE1 = horaS1 - horaE1;
	         resultadoFtS1 = minutoS1 - minutoE1;  
	         
	      //   System.out.println("Horas trabalhadas periodo da manha: " +  resultadoFE1 +"h"); 
	      
	         
	         
	       //================================================================================================
	         System.out.print("Informe a hora da volta do intervalo \n");    
	         marcacao.setEntrada(sc.next());              
	         
	         String[] resultadoE2 = marcacao.getEntrada().split(":"); 
	         int horaE2 = Integer.parseInt(resultadoE2[0]);
	         int minutoE2 = Integer.parseInt(resultadoE2[1]);
	       //  System.out.println("A hora digitada para volta do intervalo é " + horaE2 + ":"+ minutoE2); 
	         
	       //================================================================================================ 
	         System.out.print("Informe a hora de saida do trabalho \n");    
	         marcacao.setSaidaAlmoco(sc.next());              
	         
	         String[] resultadoS2 = marcacao.getSaidaAlmoco().split(":"); 
	         int horaS2 = Integer.parseInt(resultadoS2[0]);
	         int minutoS2 = Integer.parseInt(resultadoS2[1]);
	        // System.out.println("A hora digitada para sainda do trabalho é " + horaS2 + ":"+ minutoS2); 
	                      
	                 
	         resultadoFE2 = horaS2 - horaE2;
	         resultadoFtS2 = minutoS2 - minutoE2;  
	         
	        //System.out.println("Horas trabalhadas periodo da tarde: " +  resultadoFE2 +"h"); 
	         
	         resultadoDia = resultadoFE1 + resultadoFE2;
	         
	         marcacao.setResultadoDia(resultadoDia);
	         
	         System.out.println("Total de horas trabalhadas no dia é: " + resultadoDia+"h");
			
			
			MarcacaoController.cadastrar(marcacao);
			
		}else
		{
			System.out.println("Funcionario não encontrado");
			System.out.println("--------------------------------------------------------------------");
		}
				
	}
	
	
}
