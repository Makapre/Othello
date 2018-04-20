package spieler.PaPre;

import spieler.Farbe;
import spieler.OthelloSpieler;
import spieler.Zug;
import spieler.ZugException;

public class Spieler implements OthelloSpieler{

	/**
	* Ein neues Spiel ist zu starten. Bringen Sie das
	* Spielbrett in die Ausgangsposition und merken Sie sich
	* Ihre Farbe. Der Parameter bedenkzeitInSekunden gibt an,
	* wie viel Bedenkzeit Ihrer Maschine insgesamt zur
	* Verf�gung steht (f�r alle Z�ge zusammen).
	* @param meineFarbe
	* @param bedenkzeitInSekunden
	*/
	@Override
	public void neuesSpiel(Farbe arg0, int arg1) {
		// TODO Neues Spiel beginnen; 
		//beachten Sie die Anfangsbelegung des Spielbretts!
		
	}
	
	/**
	* Ihr Spieler muss den berechneten Zug als Zug-Objekt
	* zur�ckgeben. Zug-Objekte sind ein Paar (Zeile,Spalte).
	* Das erste Element sitzt oben links und hat den Wert
	* (0,0). Das zweite Element der ersten Zeile
	* dementsprechend (0,1). Das letzte Element unten rechts
	* hat den Wert (7,7). Wenn Sie passen m�ssen, liefern Sie
	* bitte Zug.setPassen() zur�ck. Sollte die Berechnung eines Zuges
	* nicht m�glich sein (z.B. weil der vorhergehende Zug aus
	* Sicht Ihrer Berechnung falsch ist, so werfen Sie bitte
	* eine ZugException. Wenn Sie als Erster ziehen d�rfen,
	* ist vorherigerZug == null
	* In zeitWeiss bzw. zeitSchwarz wird die bislang verbrauchte
	* Zeit des weissen bzw. schwarzen Spielers in ms angegeben.
	*/
	@Override
	public Zug berechneZug(Zug arg0, long arg1, long arg2) throws ZugException {
		// TODO Eigenen Zug berechnen
		return null;
	}

	/**
	* Liefert den Namen Ihres Spielers zur�ck
	*/
	@Override
	public String meinName() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	/**
	 * Konstruktor f�r Othello-Spieler mit Default-Suchtiefe
	 */
	public Spieler() {
		
	}
	
	/**
	 * Einstellung der Suchtiefe ist optional
	 * @param suchtiefe
	 */
	public Spieler(int suchtiefe) {
		this();
		//...
	}
}
