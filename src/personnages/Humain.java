package personnages;

import java.lang.classfile.instruction.NewMultiArrayInstruction;

public class Humain {
    private static final int MAXCONNAISSANCE=30;
	private String nom;
	private String boissonFavorite;
	protected int argent;
	protected int nbConaissance=0;
	protected Humain[] memoire=new Humain[MAXCONNAISSANCE];
	public Humain(String nom, String boissonFavorite, int argent) {
		this.nom = nom;
		this.boissonFavorite = boissonFavorite;
		this.argent = argent;
	}

	public void direBonjour() {
		parler("Bonjour! je m'appelle " + nom + " et j'aime boire du " + boissonFavorite);

	}

	public void boire() {
		parler("Mmmm, un bon verre de " + boissonFavorite + " ! GLOUPS!");

	}

	protected void parler(String msg) {
		System.out.println("(" + nom + ")-" + msg);

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

	
	public void acheter(String bien, int prix) {

		if (argent >= prix) {

			parler("j'ai " + argent + " sous ma poche. je vais pouvoir m'offrir un " + bien + " à " + prix + " sous");
			perdreArgent(prix);
		} else {
			parler("je n'ai plus que " + argent + " sous en poche. je ne peux meme pas m'offrir un" + bien + " à "
					+ prix + " sous");
		}
	}
	
	public void faireConnaissanceAvec(Humain homme) {
		direBonjour();
		homme.repondre(this);
		memoriser(homme);
	}

	private void memoriser(Humain homme) {
		
		memoire[nbConaissance%MAXCONNAISSANCE]=homme;
		System.out.println(memoire[nbConaissance].getNom());
		nbConaissance++;
		
	}

	private void repondre(Humain homme) {
		direBonjour();
		memoriser(homme);
		
	}
	public void listerConnaissance() {
		String noms="";
		Humain humain;
		int nbIteration;
		if (nbConaissance<=MAXCONNAISSANCE) {
			nbIteration=nbConaissance;
		} else {
           nbIteration=MAXCONNAISSANCE;
		}
		for (int i = 0; i < nbIteration; i++) {
			humain=memoire[i];
			noms+=humain.getNom()+", ";
			
		}		parler("Je connais beaucoup de monde dont : "+noms);
	}

}
