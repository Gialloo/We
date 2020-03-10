package it.giallu.java;

public class Moto extends Veicolo
{
   private int caschi;
   private String tipo;

public Moto(String nome, String marca, double cilindrata, int caschi, String tipo) {
	super(nome, marca, cilindrata);
	this.caschi=caschi;
	this.tipo=tipo;
	

}

public int getCaschi() {
	return caschi;
}

public void setCaschi(int caschi) {
	this.caschi = caschi;
}

public String getTipo() {
	return tipo;
}

public void setTipo(String tipo) {
	this.tipo = tipo;
}
public String toString()
{
	 String stampa=" ";
	 return stampa=this.nome+"\n"+this.marca+"\n"+this.cilindrata+"\n"+this.caschi+"\n"+this.tipo;
}

}
