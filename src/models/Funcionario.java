package models;

import java.util.Date;

public class Funcionario {
	
	private String nome;
	private int pis;
	private String dataAdm;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getPis() {
		return pis;
	}
	public void setPis(int pis) {
		this.pis = pis;
	}
	public String getDataAdm() {
		return dataAdm;
	}
	public void setDataAdm(String dataAdm) {
		this.dataAdm = dataAdm;
	}
	
	@Override
	public String toString() {
		return "Funcionário : " + getNome() + " | PIS: " + getPis()+ "| Admissão: " + dataAdm;
	}
	
}
