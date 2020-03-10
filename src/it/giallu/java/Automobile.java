package it.giallu.java;

public class Automobile extends Veicolo
{
	private int posti;
	private String modello;

	public Automobile(String nome, String marca, double cilindrata, int posti, String modello) {
		super(nome, marca, cilindrata);
		this.posti=posti;
		this.modello=modello;
		
	}

	public int getPosti() {
		return posti;
	}

	public void setPosti(int posti) {
		this.posti = posti;
	}

	public String getModello() {
		return modello;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}
 
	 public String toString()
	 {
		 String stampa=" ";
		 return stampa=this.nome+"\n"+this.marca+"\n"+this.cilindrata+"\n"+this.posti+"\n"+this.modello;
	 }
	
	

}
