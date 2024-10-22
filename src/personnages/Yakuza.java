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
		parler("j'ai pique les "+gain+" sous de "+victime.getNom()+", ce qui me fait "+argent+" sous ma poche Hi! Hi!");
		
	}

}