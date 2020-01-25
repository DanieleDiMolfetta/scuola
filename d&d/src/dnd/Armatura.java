package dnd;


import java.io.IOException;


public class Armatura {
	public String nome;
	public int Classe_Armatura;
	
	public Armatura(String n) throws IOException {
		
		nome = n;
		Classe_Armatura = (int) (Math.random()*8+1);
	}
}
