package personnages;

public class Ronin extends Humain{
	
	int honneur=1;

	public Ronin(String nom, String boissonFavorite, int argent) {
		super(nom, boissonFavorite, argent);
		
	}
	
	public void donner(Commercant beneficiaire) {
		int don=this.argent/10;
		perdreArgent(don);
		parler(beneficiaire.getNom()+" prend ces "+don+" sous");
		beneficiaire.recevoir(don);
	}
	
    public void provoquer(Yakuza adversaire) {
		int force =2*honneur;
		
		if (force<adversaire.getReputaion()) {
			honneur--;
			adversaire.gagner(argent);
			perdreArgent(argent);
			parler("J'ai perdu contre ce yakuza, mon honneur et ma bourse ont en pris un coup.");
		} else {
			parler("Je t’ai eu petit yakusa!");
			int argentGagnee=adversaire.perdre();
			honneur++;
			gagnerArgent(argentGagnee);
			

		}
	}

}
