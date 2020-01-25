package dnd;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Arma {
	public String nome;
	public int danno_base;
	public int magia;
	public String elemento;
	public int danno_elementale;
	
	
	public Arma(String n) {

		nome = n;
		Dado d1 = new Dado(8);
		d1.lanciaDado();
		danno_base = d1.risultato;
		magia = 0;
		elemento = null;
		Dado d2 = new Dado(6);
		d2.lanciaDado();
		ControlloElemento();
		danno_elementale = d2.risultato;
		
	}
	
	public Arma(String n, int m, String e ) throws NumberFormatException {

		nome = n;
		Dado d1 = new Dado(8);
		d1.lanciaDado();
		danno_base = d1.risultato;
		magia = m;
		elemento = e;
		Dado d2 = new Dado(6);
		d2.lanciaDado();
		ControlloElemento();
		danno_elementale = d2.risultato;
		
	}
	
	public Arma() throws NumberFormatException, IOException {
		InputStreamReader input = new InputStreamReader(System.in);
		BufferedReader tastiera = new BufferedReader(input);
		System.out.println("Inserisci il nome dell'arma");
		nome = tastiera.readLine();
		Dado d1 = new Dado(8);
		d1.lanciaDado();
		danno_base = d1.risultato;
		magia = (int) (Math.random()*6);
		System.out.println("Inserisci l'elemento della tua mirabolante arma (premi invio se non ha nessun elemento) ");
		elemento = tastiera.readLine();
		Dado d2 = new Dado(6);
		d2.lanciaDado();
		ControlloElemento();
		danno_elementale = d2.risultato;
		
	}
	
	public int DannoSpada() {
		int danno_spada = danno_base + magia + danno_elementale;
		return danno_spada;
	}
	public void ControlloElemento() {
		if(elemento == "" || elemento == null) {
			danno_elementale = 0;
		}
	}
}
