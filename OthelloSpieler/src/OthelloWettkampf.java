import java.util.ArrayList;
import java.util.List;

import spieler.OthelloSpieler;

public class OthelloWettkampf {

	public static void main(String[] args) {
		List<OthelloSpieler> spieler = new ArrayList<OthelloSpieler>();
		
		spieler.add(new spieler.Referenzspieler(9));
		spieler.add(new spieler.Referenzspieler(1));
		
		new rahmen.OthelloArena(150, spieler, false);
	}

}
