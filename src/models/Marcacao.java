package models;

import java.sql.Date;

public class Marcacao {
	
	private Funcionario funcionarios;
	private String dataMarcacao;	
	private String Entrada;
	private String SaidaAlmoco;
	private String VoltaAlmoco;
	private String Saida;
	private int resultadoDia;
	
	public int getResultadoDia() {
		return resultadoDia;
	}
	public void setResultadoDia(int resultadoDia) {
		this.resultadoDia = resultadoDia;
	}
	public Funcionario getFuncionarios() {
		return funcionarios;
	}
	public void setFuncionarios(Funcionario funcionarios) {
		this.funcionarios = funcionarios;
	}
	public String getDataMarcacao() {
		return dataMarcacao;
	}
	public void setDataMarcacao(String dataMarcacao) {
		this.dataMarcacao = dataMarcacao;
	}
	public String getEntrada() {
		return Entrada;
	}
	public void setEntrada(String entrada) {
		Entrada = entrada;
	}
	public String getSaidaAlmoco() {
		return SaidaAlmoco;
	}
	public void setSaidaAlmoco(String saidaAlmoco) {
		SaidaAlmoco = saidaAlmoco;
	}
	public String getVoltaAlmoco() {
		return VoltaAlmoco;
	}
	public void setVoltaAlmoco(String voltaAlmoco) {
		VoltaAlmoco = voltaAlmoco;
	}
	public String getSaida() {
		return Saida;
	}
	public void setSaida(String saida) {
		Saida = saida;
	}
	
	

//	
//	@Override
//    public String toString() {
//        return "\n Marcação do dia "+ dataMarcacao+ "\n" + funcionarios+ "\nEntrada: " + entrada+ "\nSaida Para Almoço: "+ saidaAlmoco+
//        		"\nVolta do Almoco:  " + voltaAlmoco + "\nSaida: " + saida;
//    }
	 
	
	
}
