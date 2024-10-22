package personnages;

import java.security.PublicKey;

public class Humain {
	
	private String nom;
	private String boissonFavorite;
	protected int argent;
	
	
	
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent=argent;
	}
	
	
	public void direBonjour() {
		parler("Bonjour! je m'appelle "+nom+" et j'aime boire du "+boissonFavorite);
		
	}
	
	public void boire() {
		parler("Mmmm, un bon verre de "+boissonFavorite+" ! GLOUPS!");
		
	}
	protected void parler(String msg) {
		System.out.println("("+nom+")-"+msg);
		
	}
	
	protected void gagnerArgent(int gain) {
		argent += gain;
	}
	 
	protected void perdreArgent(int perte) {
		argent -= perte;
	}
	
	public String getNom() {
		return nom;
	}


	public int getArgent() {
		return argent;
	}


	public void achter(String bien ,int prix) {
		
		if(argent>=prix) {
			
			parler("j'ai "+argent+" sous ma poche. je vais pouvoir m'offrir un "+ bien+" à "+prix+" sous");
			perdreArgent(prix);
		}else {
			parler("je n'ai plus que "+argent+" sous en poche. je ne peux meme pas m'offrir un"+ bien+" à "+prix+" sous");
		}
	}

	
	
	

}
