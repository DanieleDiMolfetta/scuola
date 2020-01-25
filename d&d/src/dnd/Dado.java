package dnd;

public class Dado {
	public int numFacce;
	public  int risultato;

	public Dado(int nfacce) {
		numFacce = nfacce;
		risultato = 0;
	}

	public void lanciaDado() {
		risultato = (int) (Math.random()*numFacce +1);
		
	}
}
