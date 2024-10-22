package personnages;

public class Commercant extends Humain {

	public Commercant(String nom,  int argent) {
		super(nom, "the", argent);
		
	}
	
	public int  seFaireExtorquer() {
		
		
		int somme=argent;
		argent=0;
		parler("J'ai tout perdu! Le monde est trop injuste...");
		return somme;
		
	}
	public void recevoir(int argent) {
		parler(argent+" sous! je te remercie genereux donateur ");
		this.argent=this.argent+argent;
	}
	
	

}
