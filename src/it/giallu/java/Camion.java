package it.giallu.java;

public class Camion extends Veicolo
{
  private int rimorchi;
  private int peso;
public Camion(String nome, String marca, double cilindrata, int rimorchi, int peso) {
	super(nome, marca, cilindrata);
	this.rimorchi=rimorchi;
    this.peso=peso;
}
public int getRimorchi() {
	return rimorchi;
}
public void setRimorchi(int rimorchi) {
	this.rimorchi = rimorchi;
}
public int getPeso() {
	return peso;
}
public void setPeso(int peso) {
	this.peso = peso;
}
public String toString()
{
	 String stampa=" ";
	 return stampa=this.nome+"\n"+this.marca+"\n"+this.cilindrata+"\n"+this.rimorchi+"\n"+this.peso;
}

}
