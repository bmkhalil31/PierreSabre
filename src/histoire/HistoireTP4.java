package histoire;

import personnages.Commercant;
import personnages.Ronin;
import personnages.Yakuza;

public class HistoireTP4 {
	
	
	
	
	
	
public static void main(String[] args) {
	
//	Commercant marco=new Commercant("marco",20);
//	marco.direBonjour();
//	marco.seFaireExtorquer();
//	marco.recevoir(15);
//	marco.boire();
	
	
//	Commercant marco=new Commercant("marco",15);
//	Yakuza yaku=new Yakuza("Yaku Le Noir", "whisky", 30," Warsong" );
//	yaku.direBonjour();
//	yaku.extorquer(marco);
//	
	
//	Ronin roro=new Ronin("Roro", "shochu", 60);
//	Commercant marco=new Commercant("marco",15);
//	roro.direBonjour();
//	roro.donner(marco);
	
	Ronin roro=new Ronin("Roro", "shochu", 60);
	Yakuza yaku=new Yakuza("Yaku Le Noir", "whisky", 30," Warsong" );
	roro.provoquer(yaku);
	
	
}
}
