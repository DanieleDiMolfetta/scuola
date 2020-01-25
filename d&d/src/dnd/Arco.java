package dnd;

import java.io.IOException;

public class Arco extends Distanza {

	public Arco() throws NumberFormatException, IOException {
		super(20);
		
		
	}
	public void CalcoloDanno() {
		danno_base = danno_base*range/4;
	}
}
