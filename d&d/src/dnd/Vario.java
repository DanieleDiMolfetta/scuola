package dnd;

public class Vario extends Oggetto{
	private float valore_di_scambio;
	
	public Vario(String n, float c, String r, float vds ) {
		super( n, c, r);
		valore_di_scambio = vds;
		
	}

	public float getValore_di_scambio() {
		return valore_di_scambio;
	}

	public void setValore_di_scambio(float valore_di_scambio) {
		this.valore_di_scambio = valore_di_scambio;
	}
	

}
