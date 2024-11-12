package personnages;

public class Yakuza extends Humain {
	private String clan;
	private int reputation=0;

	
	public Yakuza(String nom, String boissonFavorite, int argent,String clan) {
		super(nom, boissonFavorite, argent);
		this.clan=clan;
		
	}
	
	public void extorquer(Commercant victime) {
		int gain=victime.seFaireExtorquer();
		this.gagnerArgent(gain);
		reputation++;
		parler("Tiens, tiens, ne serait-ce pas un faible marchand qui passe par là ?");
		parler(victime.getNom()+", si tu tiens à la vie donne moi ta bourse !");
		parler("j'ai pique les "+gain+" sous de "+victime.getNom()+", ce qui me fait "+argent+" sous ma poche Hi! Hi!");
		
	}
	
	public int perdre() {
		int argentPerdue=this.argent;
		perdreArgent(argentPerdue);
		this.reputation--;
		parler("J’ai perdu mon duel et mes "+argentPerdue+" sous, snif... J'ai déshonoré le clan de "+this.clan);
		return argentPerdue;
	}
	
	public void gagner(int gain) {
		gagnerArgent(gain);
		reputation++;
		parler("Ce ronin pensait vraiment battre "+getNom()+" du clan de Warsong ? Je l'ai dépouillé de ses "+gain+" sous.");
	}

	public int getReputaion() {
		
		return reputation;
	}

}
