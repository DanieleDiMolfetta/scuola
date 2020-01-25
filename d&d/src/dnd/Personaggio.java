package dnd;


import java.io.IOException;


public class Personaggio {
	//attributi base
	public int livello;
	public String nome;
	public String classe;
	public String razza;
	public float hp;
	public int difesa;
	public int TxC;
	public Spada spada;
	public Armatura armatura;
	//statistiche
	public int Forza;
	public int Destrezza;
	public int Costituzione;
	public int Intelligenza; 
	public int Saggezza;
	public int Carisma;
	//modificatori statistiche
	public int modForza;
	public int modDestrezza;
	public int modCostituzione;
	public int modIntelligenza; 
	public int modSaggezza;
	public int modCarisma;
	//inventario
	private Oggetto [] inventario;
	
	
	public int CalcolaStatistiche() {
		Dado d1 = new Dado(8);
		Dado d2 = new Dado(8);
		Dado d3 = new Dado(8);
		d1.lanciaDado();
		d2.lanciaDado();
		d3.lanciaDado();
		int Somma_Dadi = d1.risultato + d2.risultato + d3.risultato;
		return Somma_Dadi;
	}
	
	public void SceltaClasse(int a) {
		switch(a) {
		case 1:
			classe = "Barbaro";
			break;
		case 2:
			classe = "Bardo";
			break;
		case 3:
			classe = "Chierico";
			break;
		case 4:
			classe = "Druido";
			break;
		case 5:
			classe = "Guerriero";
			break;
		case 6:
			classe = "Ladro";
			break;
		case 7:
			classe = "Mago";
			break;
		case 8:
			classe = "Paladino";
			break;
		}
	}
	
	public void SceltaRazza(int b) {
		switch(b) {
		case 1:
			razza = "Umano";
			break;
		case 2:
			razza = "Gnomo";
			break;
		case 3:
			razza = "Nano";
			break;
		case 4:
			razza = "Elfo";
			break;
		case 5:
			razza = "Orco";
			break;
		case 6:
			razza = "Mezz'orco";
			break;
		case 7:
			razza = "Mezz'elfo";
			break;
		case 8:
			razza = "Dragonide";
			break;
		}
	}
	
	
	public Personaggio(String n) throws NumberFormatException, IOException {
		//statistiche e modificatori
		Forza = CalcolaStatistiche();
		modForza = (Forza - 10)/2;
		Destrezza = CalcolaStatistiche();
		modDestrezza = (Destrezza - 10)/2;
		Costituzione = CalcolaStatistiche();
		modCostituzione = (Costituzione -10)/2;
		Intelligenza = CalcolaStatistiche();
		modIntelligenza = (Intelligenza - 10)/2;
		Saggezza = CalcolaStatistiche();
		modSaggezza = (Saggezza - 10)/2;
		Carisma = CalcolaStatistiche();
		modCarisma = (Carisma - 10)/2;
		//attributi base
		nome = n;
		livello = (int) (Math.random()*20+1);
		Dado d4 = new Dado(10);
		d4.lanciaDado();
		hp = (d4.risultato + modCostituzione)*livello;
		
		int a = (int) (Math.random()*8+1);
		SceltaClasse(a);
		
		int b = (int) (Math.random()*8+1);
		SceltaRazza(b);

		spada = new Spada(2, "Spadina scarsina", 0, null);
		armatura = new Armatura("Armaturina caruccina");
		difesa = 10 + modDestrezza + armatura.Classe_Armatura;
		this.inventario = new Oggetto[10+modForza];
		for(int i = 0; i<inventario.length ; i++) {
			this.inventario[i] = new Oggetto();
			
		}
	}
	public Personaggio(String n, String c, String r) throws NumberFormatException, IOException {
		Forza = CalcolaStatistiche();
		modForza = (Forza - 10)/2;
		Destrezza = CalcolaStatistiche();
		modDestrezza = (Destrezza - 10)/2;
		Costituzione = CalcolaStatistiche();
		modCostituzione = (Costituzione -10)/2;
		Intelligenza = CalcolaStatistiche();
		modIntelligenza = (Intelligenza - 10)/2;
		Saggezza = CalcolaStatistiche();
		modSaggezza = (Saggezza - 10)/2;
		Carisma = CalcolaStatistiche();
		modCarisma = (Carisma - 10)/2;
		
		
		nome = n;
		livello = (int) (Math.random()*20+1);
		Dado d4 = new Dado(10);
		d4.lanciaDado();
		hp = (d4.risultato + modCostituzione)*livello;
		razza = r;
		classe = c;
		
		
		spada = new Spada(2, "Spadina scarsina", 0, null);
		armatura = new Armatura("Armaturina carina");
		
		difesa = 10 + modDestrezza + armatura.Classe_Armatura;
	}
	
	
	public void StampaStatistiche() {
		System.out.println("");
		//statistiche personaggino
		System.out.println("Statistiche di "+nome);
		System.out.println("Livello: "+livello);
		System.out.println("Classe: "+classe);
		System.out.println("Razza: "+razza);
		System.out.println("HP: "+hp);
		System.out.println("Difesa: "+difesa);
		System.out.println("Forza: "+Forza);
		System.out.println("Destrezza: "+Destrezza);
		System.out.println("Intelligenza: "+Intelligenza);
		System.out.println("Saggezza: " +Saggezza);
		System.out.println("Carisma: "+Carisma);
		
		//statistiche armina
		System.out.println("Nome dell' arma: " +spada.nome);
		System.out.println("Magia dell'arma: " +spada.magia);
		System.out.println("Elemento dell'arma: " +spada.elemento);
		System.out.println("Danno base dell'arma: " +spada.danno_base);
		System.out.println("Danno elementale dell'arma: " +spada.danno_elementale);
		//statistiche dell'armatura
		System.out.println("Nome dell'armatura: " +armatura.nome);
		System.out.println("Classe dell'armatura: "+armatura.Classe_Armatura);
		System.out.println("");
		
	}
	public void attacca(Personaggio p2) {
		Dado d5 = new Dado(20);
		d5.lanciaDado();
		TxC = d5.risultato + livello + modForza + spada.magia;
		int danno;
		System.out.println("Attacca "+nome);
		if (TxC >= p2.difesa) {
			
			danno = spada.DannoSpada() + modForza;
			System.out.println("Hai fatto "+danno +" di danno");
		}else {
			danno = 0;
			System.out.println("Hai missato il colpo");
		}
		p2.hp -= danno;
		System.out.println("HP rimanenti: "+p2.hp);
		System.out.println("");
	}
}
