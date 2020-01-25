package dnd;

import java.io.IOException;

public class Battaglia {
	public static void combattimento(Personaggio p1, Personaggio p2) throws InterruptedException {
		int turni = 1;
		do {
			p1.attacca(p2);
			if(p2.hp <= 0) {
				break;
			}
			Thread.sleep(2000);
			p2.attacca(p1);
			Thread.sleep(2000);
			turni++;
		}while(p1.hp > 0 );
		if(p2.hp > p1.hp) {
			System.out.println("Il vincitore è " +p2.nome +"in " +turni +" turni");
		}else {
			System.out.println("Il vincitore è " +p1.nome +"in " +turni +" turni");
		}
	}
	
	
	public static void main (String[] args) throws NumberFormatException, IOException, InterruptedException {
		
		Personaggio p1 = new Personaggio("Paolo", "Chierico", "Umano");
		p1.StampaStatistiche();
		Personaggio p2 = new Personaggio("Marchino", "Ladro", "Guerriero");
		p2.StampaStatistiche();
		System.out.println("Incredibilmente hai trovato un'arma in un forziere");
		p1.spada = new Spada(2, "Excalibur", 2, "Ghiaccio");
		combattimento(p1, p2);
		
	}
}
