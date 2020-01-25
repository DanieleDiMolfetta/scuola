package dnd;

import java.io.IOException;

public class Spada extends Mischia {
	private int tipo;
	
	
	public Spada(int t, String n, int m, String e) throws NumberFormatException, IOException {
		super(n, m, e);
		tipo = t;
	}
	
	public void controlloTipo() {
		if(tipo == 2) {
			danno_base *= 1.5;
		}
	}
	
}
