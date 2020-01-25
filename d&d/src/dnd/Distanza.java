package dnd;

import java.io.IOException;

public class Distanza extends Arma {
	public int range;

	public Distanza(int r) throws NumberFormatException, IOException {
		super();
		range = r;
		
	}
	public void CalcoloDanno() {
		danno_base = danno_base*range/2;
	}
}
