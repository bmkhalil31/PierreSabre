package histoire;

import personnages.Commercant;
import personnages.Yakuza;

public class HistoireTP4 {
	
	
	
	
	
	
public static void main(String[] args) {
	
//	Commercant marco=new Commercant("marco",20);
//	marco.direBonjour();
//	marco.seFaireExtorquer();
//	marco.recevoir(15);
//	marco.boire();
	
	
	Commercant marco=new Commercant("marco",15);
	Yakuza yaku=new Yakuza("Yaku Le Noir", "whisky", 30," Warsong" );
	yaku.direBonjour();
	yaku.extorquer(marco);
	
}
}
