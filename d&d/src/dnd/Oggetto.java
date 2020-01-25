package dnd;

public class Oggetto {
	
	protected String nome;
	protected float costo;
	protected String rarità;
	
	
	public Oggetto() {
		
		costo = (float) (Math.random()*100+1);
		
		
	}
	
	public Oggetto(String n, float c, String r) {
		nome = n;
		costo = c;
		rarità = r;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public float getCosto() {
		return costo;
	}

	public void setCosto(float costo) {
		this.costo = costo;
	}

	



}
