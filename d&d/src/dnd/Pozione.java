package dnd;

public class Pozione extends Oggetto{
	private int cura;
	
	public Pozione() {
		super("Pozione");
		cura = 100;
	}

	public int getCura() {
		return cura;
	}

	public void setCura(int cura) {
		this.cura = cura;
	}

	public static void UsaCura(Personaggio p1, Pozione poz1) {
		p1.hp = p1.hp + poz1.cura;
		poz1 = null;
	}
}
