package it.giallu.java;

import java.util.ArrayList;

public class Autostrada 
{
   ArrayList<Veicolo> strada = new ArrayList<Veicolo>();

	   
  
   public void entraInAutostrada(Veicolo veicolo )
   {
	   strada.add(veicolo);
   }
   
   
   public void esciDaAutostrada( Veicolo veicolo )
   {
	   strada.remove(veicolo);
   }
   
   public void stampaArray() 
   {
	   for (Veicolo z:strada)
	   {
		   System.out.println(z);
	   }
    }
   public static void main(String[]args)
   {
	  Autostrada aa=new Autostrada();
	  Automobile a=new Automobile("Gallardo","Lamborghini",3.0,2,"gt");
	  Moto m=new Moto("r1","Yamaha",0.4,2,"4 tempi");
	  Camion c=new Camion("Camion","Iveco",8000,2,4000);
	  aa.entraInAutostrada(a);
	  aa.entraInAutostrada(m);
	  aa.entraInAutostrada(c);
	  aa.esciDaAutostrada(a);
	  aa.stampaArray();
   }
   
 }
  
