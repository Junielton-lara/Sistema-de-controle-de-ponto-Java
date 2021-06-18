package controllers;

import java.util.ArrayList;

import models.Marcacao;

public class MarcacaoController {

	private static ArrayList<Marcacao> marcacoes = new ArrayList<Marcacao>();

	public static ArrayList<Marcacao> listarMarcacoes(){
		return marcacoes;
	}
	
	public static boolean cadastrar(Marcacao marcacao){
		
		marcacoes.add(marcacao);
		return true;
		
	}
		public static double calculo() {
			
			double horast =0 ;
			String data;
			
						
			for ( Marcacao Calculo: marcacoes )
				
			{
			double horas = (Calculo.getResultadoDia()); 				
			
	     
			
			horast = horast + horas;
			//data = m.getDataMarcacao();
			
			System.out.print("Horas trabalhadas dias = "+ horast );
			}
			
			return 0;
		
		}
	
}
     
	
	
	
	
